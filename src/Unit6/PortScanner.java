/*
WAP to scan the running port number from [ 1 to 1024 ] ( low port ) on your local machine,
 */
package Unit6;

import java.net.*; // Import the java.net package, which contains the Socket class
public class PortScanner {
public static void main(String[] args) { // Declare the main method
String host = "localhost"; // Declare a String variable containing the target host (in this case, localhost)
for (int port = 1; port <= 1024; port++) { // Start a for loop that iterates over the range of ports to bescanned (1-1024)
try { // Start a try-catch block for handling exceptions
Socket s = new Socket(host, port); // Attempt to create a new Socket object with the specified host and port
System.out.println("Port " + port + " is open"); // If successful, print a message indicating that the port is open
s.close(); // Close the socket
} catch (Exception ex) { // If an exception is thrown...
// Port is closed or an error occurred
}
}
}
}
