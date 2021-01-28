package net.haulhub.showcase.cucumber.pages;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
 
public class ParseURLExample {
     
    
	public static void main(String[] args)
	{
    	    Random r = new Random(System.currentTimeMillis());
    	    int number1 = 100000000 + r.nextInt(2000000000);
    	   
    	    System.out.println("the number is" + number1);
   
    	
	}
    }