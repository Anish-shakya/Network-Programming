   /*
WAP in java that retrieve specific and arbitrary HTTP header fields.
 */
package Unit5;

import java.io.*;
import java.net.*;
import java.util.Date;
public class HttpHeader {
public static void main(String[] args) {
try {
// Create a URL object and connected to example.com
URL url = new URL("http://www.example.com");
// Create a HttpURLConnection object for the URL
HttpURLConnection connection = (HttpURLConnection) url.openConnection();

// Extract and print the Request Method (GET, POST, etc.)
System.out.println("Request Method: " + connection.getRequestMethod());

// Extract and print the Response Code (e.g. 200 OK, 404 Not Found, etc.)
System.out.println("Response Code: " + connection.getResponseCode());

// Extract and print the Response Message (e.g. OK, Not Found, etc.)
System.out.println("Response Message: " + connection.getResponseMessage());

// Extract and print the Content Type of the response
System.out.println("Content Type: " + connection.getContentType());

// Extract and print the Content Length of the response
System.out.println("Content Length: " + connection.getContentLength());

// Extract and print the Date of the response as a java.util.Date object
System.out.println("Date: " + new java.util.Date(connection.getDate()));

// Extract and print the Last Modified date of the resource as a java.util.Date object
System.out.println("Last Modified: " + new java.util.Date(connection.getLastModified()));


// Extract and print the Expiration date of the resource as a java.util.Date object, or "not specified" if no expiration date is set
long expiration = connection.getExpiration();
if (expiration == 0) {
System.out.println("Expiration: not specified");
} else {
System.out.println("Expiration: " + new java.util.Date(expiration));
}




    System.out.println("##############################################################");
// Extract and print additional headers using a loop
System.out.println("Additional headers:");
for (int i = 1; ; i++) {
// Get the header name at index i
String headerName = connection.getHeaderFieldKey(i);
// Get the header value at index i
String headerValue = connection.getHeaderField(i);

// If both header name and value are null, stop the loop
if (headerName == null && headerValue == null) {
break;
}
// Otherwise, print the header name and value
System.out.println(headerName + ": " + headerValue);
}
} catch (IOException ex) {
// If an I/O error occurs, print an error message to the console
System.err.println(ex);
}
}
}
