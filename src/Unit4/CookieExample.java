
package Unit4;

import java.net.*;
import java.io.*;
import java.util.*;
public class CookieExample {
public static void main(String[] args) {
try {
// Create a CookieManager with a default CookiePolicy
CookieManager cookieManager = new CookieManager();
CookieHandler.setDefault(cookieManager);
// Create a URLConnection and make a request
URL url = new URL("https://example.com/");
URLConnection connection = url.openConnection();
connection.getContent();
// Retrieve cookies from the CookieStore
CookieStore cookieStore = cookieManager.getCookieStore();
List<HttpCookie> cookies = cookieStore.getCookies();
// Print the cookies
for (HttpCookie cookie : cookies) {
System.out.println(cookie.getName() + "=" + cookie.getValue());
}
} catch (IOException e) {
e.printStackTrace();
}
}
}