/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.ClientServer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 42424;
        String filePath = "d:\\hello.txt";

        try {
            
            Socket socket = new Socket(serverAddress, serverPort);
             InputStream is = socket.getInputStream();
             FileOutputStream fos = new FileOutputStream(filePath);
             BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] contents = new byte[10000];
            int bytesRead;
            while ((bytesRead = is.read(contents)) != -1) {
                bos.write(contents, 0, bytesRead);
            }
            bos.flush();
            System.out.println("File Saved successfully!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
