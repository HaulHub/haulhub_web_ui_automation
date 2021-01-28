package net.haulhub.showcase.cucumber.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class ProjectUtils {

	/**
	 * This method generates a Random String value
	 * @return
	 */
	public static String getRandomNumber(){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100000);
		return Integer.toString(randomInt);
		
	}
	
	/***
	 * This method will upload file for the POI list feature
	 * @param filePath
	 */
	public  void uploadFile(String filePath) {
		try{
			
			//Copy to clipboard
			StringSelection stringSelection= new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			
			//Create a new robot Object
			Robot robot = new Robot();
		
			//Pressing CTRL+V button
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.setAutoDelay(1000);
			
			//Releasing CTRL+V button
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.setAutoDelay(1000);
			
			//Pressing Enter key
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.setAutoDelay(1000);
			
			//Releasing Enter key
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.setAutoDelay(1000);
			
			} catch(Throwable t) {
				t.printStackTrace();
		}
	}
		
		public  void saveFile(){
			try{
				System.out.println(" Save File");
				//Create a new robot Object
				Robot robot = new Robot();
			
				//Pressing CTRL+V button
				
				robot.mouseMove(630, 420); // move mouse point to specific location	
		        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step	
		        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
		        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click	
		        robot.delay(1500);	
		        robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button	
		        Thread.sleep(2000);	
		        robot.keyPress(KeyEvent.VK_ENTER);	

			}catch(Throwable t){
				t.printStackTrace();
			}
	}
		
		public  void OpenFile(){
			try{
				//Create a new robot Object
				Robot robot = new Robot();

			//	robot.mouseMove(630, 420); // move mouse point to specific location	
		        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step	
		        	             
		        robot.keyPress(KeyEvent.VK_ENTER);	

			}catch(Throwable t){
				t.printStackTrace();
			}
		}
}
