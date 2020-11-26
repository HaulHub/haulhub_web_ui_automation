package net.haulhub.showcase.cucumber.pages;


import java.net.MalformedURLException;
import java.net.URL;
 
public class ParseURLExample {
     
    public static void main(String[] args) {
         
        // Create a URL
        try {
        	String envurl = " http://www.javacodegeeks.com:80/category/jvm-languages";
             
            URL url = new URL(envurl);
             
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String portstring = Integer.toString(port);
            String path = url.getPath();
             
            System.out.println("URL created: " + url);
            System.out.println("protocol: " + protocol);
            System.out.println("host: " + host);
            System.out.println("port: " + portstring);
            System.out.println("path: " + path);
             
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
         
    }
 
}