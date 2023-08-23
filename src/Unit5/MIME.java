/*
WAP in java that guess the MIME types from file extension.
 */
package Unit5;

import java.net.*;
import java.net.URLConnection;
public class MIME{
public static void main(String[] args) {
String contentType1 = URLConnection.guessContentTypeFromName("example.jpg");
System.out.println("First Content type: " + contentType1);
String contentType2 = URLConnection.guessContentTypeFromName("example.txt");
System.out.println("Send Content type: " + contentType2);
String contentType3 = URLConnection.guessContentTypeFromName("example.txt");
System.out.println("Third Content type: " + contentType3);
String contentType4 = URLConnection.guessContentTypeFromName("example.png");
System.out.println("Fourth Content type: " + contentType4);
}
}
