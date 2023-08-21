/*
Daytime client program in Java
 */
package Unit6;

import java.net.*; // Import the java.net package, which contains the Socket class
import java.io.*; // Import the java.io package, which contains the InputStream, InputStreamReader, and StringBuilder classes
public class DayTimeClient {
public static void main(String[] args) { // Declare the main method
try { // Start a try-catch block for handling exceptions
Socket socket = new Socket("time.nist.gov", 13); // Create a new Socket object and connect it to the specified hostname and port (13 is the standard Daytime port)
//socket.setSoTimeout(15000); // Set the socket's timeout to 15 seconds (in milliseconds)
InputStream in = socket.getInputStream(); // Get an InputStream object from the socket
StringBuilder time = new StringBuilder(); // Create a new StringBuilder object to store the incoming data
InputStreamReader reader = new InputStreamReader(in, "ASCII"); // Create a new InputStreamReader object to read the data as ASCII characters
for (int c = reader.read(); c != -1; c = reader.read()) { // Start a for loop that reads characters from
//the input stream until the end of the stream is reached
time.append((char) c); // Append each character to the StringBuilder object
}
System.out.println(time); // Print the contents of the StringBuilder object to the console (which should
//contain the current time in the Daytime format)
} catch (IOException ex) { // If an exception is thrown...
System.err.println(ex); // Print the exception to the console
}
}
}