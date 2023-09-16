/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.Url_and_URI;

import java.net.URI;
import java.net.URISyntaxException;

public class URIResolver {
    public static void main(String[] args) throws URISyntaxException {
          URI absoluteUri = new URI("http://www.example.com:30/home.html");
          URI RelativeUri = new URI("/anything/index.html");
          
          URI resolved = absoluteUri.resolve(RelativeUri);
          System.out.println(absoluteUri);
          System.out.println(resolved);
          
          URI absolute = new URI("http://www.example.com/images/logo.png");
            URI top = new URI("http://www.example.com/");
            URI relative = top.relativize(absolute);
            
            System.out.println(absolute);
            System.out.println(relative);

    }
  
    
}
