/*
WAP that uses the HEAD request method and prints the last time a file(image) on a server
was modified..
 */
package Unit5;

import java.io.*;
import java.net.*;
import java.util.*;
public class LastModified{
public static void main(String[] args) throws UnknownHostException, IOException {
URL u = new URL( "https://southwestern.edu.np/wp-content/uploads/2022/06/IMG_1078-scaled.jpg");
// Put any URL that point to the file and check that file modified date
HttpURLConnection http = (HttpURLConnection) u.openConnection();
http.setRequestMethod("HEAD");
System.out.println(u + " was last modified at " + new Date(http.getLastModified()));
}
}