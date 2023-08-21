//WAP to block all cookies from government sites and allow others (cookies policy)
package Lab8;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;

public class NoGovCookie implements CookiePolicy{
    @Override
    public boolean shouldAccept(URI uri, HttpCookie cookie){
        if(uri.getAuthority().endsWith(".gov") && cookie.getDomain().endsWith(".gov")){
            return false;
        }
        else{
            return true; // if from other domain except gov_save_cookies
        }
    }
    public static void main(String[] args) {
        NoGovCookie c1 = new NoGovCookie();
    }
}