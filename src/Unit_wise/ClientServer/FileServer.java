/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.ClientServer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) {
        int serverPort = 42424;
        String filePath = "d:\\FileServer.txt";

        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
             Socket socket = serverSocket.accept();
             FileInputStream fis = new FileInputStream(filePath);
             BufferedInputStream bis = new BufferedInputStream(fis);
             OutputStream os = socket.getOutputStream(); 

            byte[] contents = new byte[10000];
            int bytesRead;
            while ((bytesRead = bis.read(contents)) != -1) {
                os.write(contents, 0, bytesRead);
            }
            os.flush();
            System.out.println("File Sent Successfully!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
