package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import jnr.netdb.Protocol;
import net.haulhub.showcase.cucumber.pages.HomeDashboardPage;
import net.haulhub.showcase.cucumber.pages.JobSlipFeedPage;
import net.haulhub.showcase.cucumber.pages.JobSlipLoginPage;
import net.haulhub.showcase.cucumber.pages.DelDotDashboardPage;
import net.haulhub.showcase.cucumber.pages.DelDotLoginPage;
import net.haulhub.showcase.cucumber.pages.HomeAdminDashboardPage;
import net.haulhub.showcase.cucumber.pages.LoginPage;
import net.haulhub.showcase.cucumber.pages.LoginadminPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityLoginSteps extends ScenarioSteps {

public LoginPage loginpage;
public LoginadminPage loginadminpage;
public JobSlipLoginPage jobsliploginpage;  
public DelDotLoginPage deldotloginpage;  
/*
	   @Step("Login to the customerLogin Application")
		public HomeDashboardPage Userlogin(String userName, String password) {
		    WebDriver driver = loginpage.getDriver();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    loginpage.open();
		    String envURL = getDriver().getCurrentUrl();
		    System.out.println("the current url is" + envURL);
		    try {
		    	    URL url = new URL(envURL);
		            String protocol = url.getProtocol();
		            String host = url.getHost();
		            int port = url.getPort();
		            String portstring = Integer.toString(port);
		            String path = url.getPath();
		            System.out.println("URL created: " + url);
		            System.out.println("protocol: " + protocol);
		            System.out.println("host: " + host);
		            System.out.println("port: " + port);
		         //   System.out.println("port: " + portstring);
		            System.out.println("path: " + path);
		           String appendurl = protocol.concat("://").concat(host).concat(":").concat(portstring).concat("/customer/login");
		         //   String appendurl = protocol.concat("://").concat(host).concat(":").concat(port).concat("/customer/login");
		            System.out.println("the append url is" + appendurl);
		            getDriver().navigate().to(appendurl);
		            LearningPlatformConstants.environmentURL.set(appendurl);
		   	} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		    return loginpage.customerLogin(userName, password);
		}*/
		
		  @Step("Login to the adminlogin Application")
		public HomeAdminDashboardPage adminlogin(String userName, String password) {
		    WebDriver driver = loginadminpage.getDriver();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   // getDriver().navigate().to("https://testing.haulhub.com/admin/login");
		    loginadminpage.open();
		    String envURL = getDriver().getCurrentUrl();
		    System.out.println("The  get driver url is " + envURL);
		    String newurl =envURL.concat("hh-console/hunter2/login");
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      getDriver().navigate().to(newurl);
		      System.out.println("The new url of the envURL" + newurl);
			LearningPlatformConstants.environmentURL.set(envURL);
			return loginadminpage.adminLogin(userName, password);
		} 
		  
		  @Step("Login to the Userlogin Application")
			public HomeDashboardPage Userlogin(String userName, String password) {
			    WebDriver driver =  loginpage.getDriver();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    loginpage.open();
			    String envURL = getDriver().getCurrentUrl();
			    System.out.println("The  get driver url is " + envURL);
			    String newurl =envURL.concat("customer/login");
			    try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			      getDriver().navigate().to(newurl);
			      System.out.println("The new url of the envURL" + newurl);
				LearningPlatformConstants.environmentURL.set(envURL);
				return loginpage.customerLogin(userName, password);
				
			} 
		  
		  /*This method is use to log in JobSlip user*/
		  @Step("Login to the JobSlip Application")
			public JobSlipFeedPage JobSlipUserlogin(String userName, String password) {
			    WebDriver driver =  jobsliploginpage.getDriver();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    jobsliploginpage.open();
			    String envURL = getDriver().getCurrentUrl();
			    System.out.println("The  get driver url is " + envURL);
			    String newurl =envURL.concat("");
			    try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			      getDriver().navigate().to(newurl);
			      System.out.println("The new url of the envURL" + newurl);
				LearningPlatformConstants.environmentURL.set(envURL);
				return jobsliploginpage.JobSlipUserlogin(userName, password);
				
			} 
		  
		  /*This method is use to log in DelDot Administrator*/
		  @Step("Login to the DelDOT Application")
			public DelDotDashboardPage deldot_administrator_login(String userName, String password) {
			    WebDriver driver =  deldotloginpage.getDriver();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    jobsliploginpage.open();
			    String envURL = getDriver().getCurrentUrl();
			    System.out.println("The  get driver url is " + envURL);
			    String newurl =envURL.concat("");
			    try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			      getDriver().navigate().to(newurl);
			      System.out.println("The new url of the envURL" + newurl);
				LearningPlatformConstants.environmentURL.set(envURL);
				return deldotloginpage.deldot_administrator_login(userName, password);
				
			} 
		  		 
		  
		 /* @Step("Login to the adminlogin Application")
			public HomeAdminDashboardPage adminlogin(String userName, String password) {
			    WebDriver driver = loginadminpage.getDriver();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    loginadminpage.open();
			    String envURL = getDriver().getCurrentUrl();
			    System.out.println("The  get driver url is " + envURL);
			    int index = envURL.indexOf(".com");
				    if (index > 0)
				    	envURL = envURL.substring(0, index);
				    System.out.println("Admin side substring log" + envURL);
				    String newurl =envURL.concat(".com/admin/login");
	                getDriver().navigate().to(newurl);
			    System.out.println("The Details of the input are" + newurl);
			 // getDriver().navigate().to("https://testing.haulhub.com/admin/login");
			  return loginadminpage.adminLogin(userName, password);
			} */
	   
	   /*
		  @Step("Login to the adminlogin Application")
			public HomeAdminDashboardPage adminlogin(String userName, String password) {
			    WebDriver driver = loginadminpage.getDriver();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    loginadminpage.open();
			    String envURL = getDriver().getCurrentUrl();
			    try {
			    	    URL url = new URL(envURL);
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
			            String appendurl = protocol.concat(".//").concat(host).concat(":").concat(portstring).concat("/admin/login");
			            getDriver().navigate().to(appendurl);
			            LearningPlatformConstants.environmentURL.set(appendurl);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			    return loginadminpage.adminLogin(userName, password);
			}*/
		}