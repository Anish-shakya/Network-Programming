/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.Url_and_URI;

import java.io.*;
import java.net.*;
public class EncoderTest {
 public static void main(String[] args) {
 try {
String url ="http://www.example.com";

String encoded = URLEncoder.encode(url,"UTF-8");
     System.out.println(encoded);
     
String decoded =URLDecoder.decode(encoded,"UTF-8");
     System.out.println(decoded);

 } catch (Exception ex) {
 throw new RuntimeException("Broken VM does not support UTF-8");
 }
 }
}