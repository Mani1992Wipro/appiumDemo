package com.hdfc.driverPackage;

/*import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td.test.framework.CommonLib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileAction extends TestRunner{

    public void findElementByXpathAndClick(String xpath) throws IOException {
    try {
    	((AppiumDriver) GetDriver()).findElementByXPath(xpath).click();
    
    	} catch (IllegalArgumentException e) {    throw e;
    	} catch (NoSuchElementException n) {
    	 ;
    	    throw n;
    	} catch (Exception e) {
    
    	    throw e;
    	}
    }

    *//**
     * This method will clear the username field text area.
     * 
     * @param objElement
     *            The MobileElement on which the click action has to be
     *            performed.
     * @param text
     *            The text to be updated in report.
     * 
     * @throws Exception
     *             In case an exception occurs while clicking over the element.
     * @throws IllegalArgumentException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     *//*
    public void FuncClearUsername(MobileElement objElement, String text)
	    throws InterruptedException, IOException, NoSuchElementException {
	try {
	    WebDriverWait wait = new WebDriverWait(MobileDriver, 10L);
	    wait.until(ExpectedConditions.elementToBeClickable(objElement));
	    objElement.clear();
	    objElement.click();
	   
	} catch (IllegalArgumentException e) {
	  
	    throw e;
	} catch (NoSuchElementException n) {
	    
	    throw n;
	} catch (Exception e) {
	  ;
	    throw e;
	}

    }

    *//**
     * This method will look for an element on the screen to be clickable within
     * the given timeout and then click over the element.
     * 
     * @param objElement
     *            The MobileElement on which the click action has to be
     *            performed.
     * @throws Exception
     *             In case an exception occurs while clicking over the element.
     * @throws IllegalArgumentException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     *//*
    public void FuncClick(MobileElement objElement, String text)
	    throws InterruptedException, IOException, NoSuchElementException {
	try {

	    WebDriverWait wait = new WebDriverWait(GetDriver(), 10L);
	    wait.until(ExpectedConditions.visibilityOf(objElement));

	    objElement.click();

	    
	} catch (IllegalArgumentException e) {
	  
	    throw e;
	} catch (NoSuchElementException n) {
	 
	    throw n;
	} catch (Exception e) {
	
	    throw e;
	}
    }




    *//**
     * This method will click on the back button on the screen. If in any
     * application, it will navigate to the previous page.
     * 
     * @throws IOException
     *             If there is problem while reporting..
     *//*
    public void FuncClickBackButton() throws IOException {
	try {
	    ((AppiumDriver) GetDriver()).navigate().back();


	} catch (IllegalArgumentException e) {


	    throw e;
	} catch (NoSuchElementException n) {

;
	    throw n;
	} catch (Exception e) {


	    throw e;
	}
    }

    *//**
     * This method will click over a particular coordinate the number of times
     * it has been specified with a delay of 80 ms between each click.
     * 
     * @param x
     *            The abscissa of the click coordinates.
     * @param y
     *            The ordinates of the click coordinates.
     * @param clickCount
     *            The number of times to be clicked.
     * @throws Exception
     *             If an exception occurs while clicking over the element or if
     *             there is a problem in reporting the event.
     *//*
    public void FuncClickCoordinates(int x, int y, int clickCount) throws Exception {
	try {
	    int i = 0;
	    TouchAction action = new TouchAction(((MobileDriver) GetDriver()));
	    while (i < clickCount) {
		action.tap(x, y).perform();

		i++;
		Thread.sleep(80);
	    }


	} catch (IllegalArgumentException e) {


	    throw e;
	} catch (NoSuchElementException n) {

	    throw n;
	} catch (Exception e) {


		    + "</b> occured while trying click over coordinates '(" + x + "," + y + ")'.");
	    throw e;
	}
   }

    *//**
     * This method will look for an element on the screen to be clickable within
     * the given timeout and then click over the element.
     * 
     * @param objElement
     *            The MobileElement on which the click action has to be
     *            performed.
     * @throws Exception
     *             In case an exception occurs while clicking over the element.
     * @throws IllegalArgumentException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     *//*
    public void FuncClickTap(MobileElement objElement, String text)
	    throws InterruptedException, IOException, NoSuchElementException {
	try {

	    WebDriverWait wait = new WebDriverWait(GetDriver(), 5L);
	    wait.until(ExpectedConditions.elementToBeClickable(objElement));
	    objElement.tap(1, 2000);


	} catch (IllegalArgumentException e) {


	    throw e;
	} catch (NoSuchElementException n) {


	    throw n;
	} catch (Exception e) {

;
	    throw e;
	}
    }

    *//**
     * This method will close the application which had been specified in the
     * capabilities.
     * 
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public void FuncCloseApp() throws IOException {
	try {
	    ((AppiumDriver) GetDriver()).closeApp();


	} catch (IllegalArgumentException e) {


	    throw e;
	} catch (Exception e) {


	    throw e;
	}
    }

    *//**
     * This method will long press over the fromElement and then drag and drop
     * it to the toElement.
     * 
     * @param fromElement
     *            The element that has to be dragged.
     * @param toElement
     *            The element to which the dragged element has to be dropped.
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public void FuncDragElementToElement(MobileElement fromElement, MobileElement toElement) throws IOException {
	try {
	    new TouchAction(((MobileDriver) GetDriver())).longPress(fromElement).moveTo(toElement).release().perform();


	} catch (IllegalArgumentException e) {


	    throw e;
	} catch (Exception e) {




	    throw e;
	}
    }

    *//**
     * This method will long press over the first coordinate sets and then move
     * second set of coordinates and the release. This can also be used to swipe
     * from one coordinates set to another.
     * 
     * @param X1
     *            The abscissa for the starting coordinates.
     * @param Y1
     *            The ordinate for the ending coordinates.
     * @param xOffSet
     *            The abscissa for the ending coordinates.
     * @param yOffSet
     *            The ordinate for the ending coordinates.
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public void FuncDragUsingCoordinates(int X1, int Y1, int xOffSet, int yOffSet) throws IOException {
	try {
	    new TouchAction(((MobileDriver) GetDriver())).longPress(X1, Y1).waitAction(200).moveTo(xOffSet, yOffSet)
		    .waitAction(200).release().perform();
	    GetReporting().FuncReport("Pass", "Successfully dragged from (" + X1 + "," + Y1 + ") to (" + X1 + xOffSet
		    + "," + Y1 + yOffSet + ").");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception <b>- " + e.toString() + "</b> occured while trying to drag from (" + X1 + "," + Y1
			    + ") to (" + X1 + xOffSet + "," + Y1 + yOffSet + ").");
	    throw e;
	}
    }

    public void FuncElementSwipeWhileNotFound(int x, int y, int width, int hieght, MobileElement swipeForElement,
	    int maxSwipes, String direction) {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), 1L);
	    wait.until(ExpectedConditions.elementToBeClickable(swipeForElement));
	int locationX = x;
	int locationY = y;
	int dimensionX = width;
	int dimensionY = hieght;

	int startx, starty, endx, endy;
	if (direction.equalsIgnoreCase("up")) {
	    startx = locationX + dimensionX / 2;
	    endx = startx;
	    starty = locationY + dimensionY - 5;
	    endy = locationY + 10;
	} else {
	    startx = locationX + dimensionX / 2;
	    endx = startx;
	    starty = locationY + dimensionY - 10;
	    endy = locationY + 10;
	}

	boolean elementFound = false;
	for (int i = 1; i <= maxSwipes; i++) {
	    try {
		elementFound = swipeForElement.isDisplayed();
		swipeForElement.click();
		if (elementFound)
		    break;
		else
		    throw new NoSuchElementException("");
	    } catch (NoSuchElementException e) {
		
		((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy, 3000);
	    }

	}
    }

    *//**
     * This function will swipe within a given element to find the element that
     * has bee specified. It will swipe only within the particular element you
     * have specified.
     * 
     * @param swipeWithinElement
     *            The element within which elementToFind is located. We need to
     *            swipe within this element. Please also make sure that the
     *            element is swipeable, otherwise it will throw an error.
     * @param elementToFind
     *            The element that has to be found with the swipes.
     * @param maxSwipes
     *            The maximum number of times you want to swipe until the
     *            element has been found.
     * @param direction
     *            The direction of swipe. It is either 'up', 'down', 'left' or
     *            'right'. If the direction is something else, an
     *            IllegalArgumentException is thrown and the test will fail.
     * @param clickOnElement
     *            A boolean value specifying weather you want to click on the
     *            element after it has been found.
     * 
     * @throws IOException
     *             If some error comes in reporting.
     *//*
    public void FuncElementSwipeWhileNotFound(MobileElement swipeWithinElement, MobileElement elementToFind,
	    int maxSwipes, String direction, boolean clickOnElement) throws IOException {
	try {
	    Dimension dimensionOfSwipingElement = swipeWithinElement.getSize();
	    Point locationOfSwipingElement = swipeWithinElement.getLocation();
	    int startx, starty, endx, endy;
	    if (direction.equalsIgnoreCase("down")) {
		startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
		;
		starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height - 20;
		endx = startx;
		endy = locationOfSwipingElement.getY() + 20;
	    } else if (direction.equalsIgnoreCase("up")) {
		startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
		starty = locationOfSwipingElement.getY() + 20;
		endx = startx;
		endy = locationOfSwipingElement.getY() + dimensionOfSwipingElement.getHeight() - 20;
	    } else if (direction.equalsIgnoreCase("right")) {
		startx = locationOfSwipingElement.getX() + 10;
		starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
		endx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
		endy = starty;
	    } else if (direction.equalsIgnoreCase("left")) {
		startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
		starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
		endx = locationOfSwipingElement.getX() + 10;
		endy = starty;
	    } else {
		throw new IllegalArgumentException("The direction given is '" + direction
			+ "' is wrong. Please give either 'up', 'down', 'left' or 'right'.");
	    }

	    for (int i = 0; i < maxSwipes; i++) {
		boolean elementFound = false;
		try {
		    elementFound = elementToFind.isDisplayed();
		} catch (NoSuchElementException e) {
		    ((MobileDriver) GetDriver()).swipe(startx, starty, endx, endy, 3000);
		}
		if (elementFound) {
		    if (clickOnElement)
			elementToFind.click();
		    break;
		}
	    }
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "Error occured in swipeWhileNotFound. \n" + e.toString());
	    throw e;
	} catch (NoSuchElementException e) {
	    GetReporting().FuncReport("Fail",
		    "Could not find element: '" + elementToFind.toString() + "' in '" + maxSwipes + "' swipes.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception '" + e.toString() + "' occurred while trying to use swipeWhileNotFound.");
	    throw e;
	}
    }

    *//**
     * This function will swipe within a given element to find the text that has
     * bee specified. It will swipe only within the particular element you have
     * specified.
     * 
     * @param swipeWithinElement
     *            The element within which elementToFind is located. We need to
     *            swipe within this element. Please also make sure that the
     *            element is swipeable, otherwise it will throw an error.
     * @param elementToFind
     *            The element that has to be found with the swipes.
     * @param maxSwipes
     *            The maximum number of times you want to swipe until the
     *            element has been found.
     * @param direction
     *            The direction of swipe. It is either 'up', 'down', 'left' or
     *            'right'. If the direction is something else, an
     *            IllegalArgumentException is thrown and the test will fail.
     * @param clickOnElement
     *            A boolean value specifying weather you want to click on the
     *            element after it has been found.
     * 
     * @throws IOException
     *             If some error comes in reporting.
     *//*
    public void FuncElementSwipeWhileNotFound(MobileElement swipeWithinElement, String xpathOfElement, int maxSwipes,
	    String direction, boolean clickOnElement) throws IOException {
	try {
	    Dimension dimensionOfSwipingElement = swipeWithinElement.getSize();
	    Point locationOfSwipingElement = swipeWithinElement.getLocation();
	    int startx, starty, endx, endy;
	    if (direction.equalsIgnoreCase("down")) {
		startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
		;
		starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height - 20;
		endx = startx;
		endy = locationOfSwipingElement.getY() + 20;
	    } else if (direction.equalsIgnoreCase("up")) {
		startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
		starty = locationOfSwipingElement.getY() + 20;
		endx = startx;
		endy = locationOfSwipingElement.getY() + dimensionOfSwipingElement.getHeight() - 20;
	    } else if (direction.equalsIgnoreCase("right")) {
		startx = locationOfSwipingElement.getX() + 10;
		starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
		endx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
		endy = starty;
	    } else if (direction.equalsIgnoreCase("left")) {
		startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
		starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
		endx = locationOfSwipingElement.getX() + 10;
		endy = starty;
	    } else {
		throw new IllegalArgumentException("The direction given is '" + direction
			+ "' is wrong. Please give either 'up', 'down', 'left' or 'right'.");
	    }

	    for (int i = 0; i < maxSwipes; i++) {
		boolean elementFound = false;
		WebElement elementToFind = null;
		try {
		    elementToFind = ((AppiumDriver<WebElement>) GetDriver()).findElement(By.xpath(xpathOfElement));
		    elementFound = elementToFind.isDisplayed();

		} catch (NoSuchElementException e) {
		    ((MobileDriver) GetDriver()).swipe(startx, starty, endx, endy, 3000);
		}
		if (elementFound) {
		    if (clickOnElement)
			elementToFind.click();
		    break;
		}
	    }
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "Error occured in swipeWhileNotFound. \n" + e.toString());
	    throw e;
	} catch (NoSuchElementException e) {
	    GetReporting().FuncReport("Fail",
		    "Could not find element: '" + xpathOfElement + "' in '" + maxSwipes + "' swipes.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception '" + e.toString() + "' occurred while trying to use swipeWhileNotFound.");
	    throw e;
	}
    }

    *//**
     * This method will return the text of the element which has been specified
     * and print it in the report as well.
     * 
     * @param objElement
     *            The element for which the text is to be printed in the report.
     * @return The String value of the Text in the element.
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public String FuncGetText(MobileElement objElement) throws IOException {
	String textToReturn = null;
	try {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), 10L);
	    wait.until(ExpectedConditions.visibilityOf(objElement));
	    textToReturn = objElement.getText();
	    GetReporting().FuncReport("Pass",
		    "Text of the element " + objElement.getTagName() + " is '" + textToReturn + "'.");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException");
	    throw e;
	} catch (NoSuchElementException n) {
	    GetReporting().FuncReport("Fail", "Element not displayed" + objElement.getTagName());
	    throw n;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "The element <b>- " + objElement.getTagName() + "</b> not present in current page");
	    throw e;
	} finally {
	    return textToReturn;
	}
    }

    *//**
     * This will look for an element and return the text of that element to the
     * report. This function doesn't return the text.
     * 
     * @param objElement
     *            The element for which the text is to be printed in the report.
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public void FuncGetTextToReport(MobileElement objElement) throws IOException {
	try {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), 10L);
	    wait.until(ExpectedConditions.visibilityOf(objElement));
	    String textOfElement = objElement.getText();
	    GetReporting().FuncReport("Pass",
		    "Text of the element " + objElement.getTagName() + " is '" + textOfElement + "'.");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException");
	    throw e;
	} catch (NoSuchElementException n) {
	    GetReporting().FuncReport("Fail", "Element not displayed" + objElement.getTagName());
	    throw n;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "The element <b>- " + objElement.getTagName() + "</b> not present in current page");
	    throw e;
	}
    }

    *//**
     * This method will close the keyboard if it is open. <br>
     * <p>
     * <b> Please use this method only when the keyboard is open as it used
     * navigate.back in the backend and will navigate to the previous page if
     * the keyboard is not open. </b>
     * </p>
     * 
     * @throws IOException
     *//*
    public void FuncHideKeyboard() throws IOException {
	try {
	    ((AppiumDriver) GetDriver()).navigate().back();
	    GetReporting().FuncReport("Pass", "Keyboard has been closed.");
	} catch (WebDriverException e) {
	    GetReporting().FuncReport("Fail", "WebDriverException occured while while closing keyboard.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "Exception '" + e.toString() + "' occurred while closing keyboard.");
	    throw e;
	}
    }

    *//**
     * This function will launch the application incase it is not launched.
     * Essentially Appium launches the application initially on its own. Please
     * use this method only after closing the application otherwise it will give
     * you an exception.
     * 
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public void FuncLaunchApp() throws IOException {
	try {
	    ((AppiumDriver) GetDriver()).launchApp();
	    GetReporting().FuncReport("Pass", "Successfully launched the applicaiton");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception <b>- " + e.toString() + "</b> occured while trying launch the application.");
	    throw e;
	}
    }

    *//**
     * This method will can be used in case FuncSwipeAndScroll is throwing any
     * exception.
     * 
     * @param elementToFind
     * @param clickYorN
     * @throws Exception
     *//*
    public void FunCnewSwipe(MobileElement elementToFind, boolean clickYorN, int swipes) throws Exception {

	Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
	int startx = size.width;
	int starty = size.height;
	boolean flag = true;
	int count = 0;
	try {
	    while (flag && count < swipes) {

		try {
		    if (elementToFind.isDisplayed()) {

			flag = false;
		    } else {
			
			((MobileDriver) GetDriver()).swipe(startx / 2, starty - starty / 4, startx / 2, starty / 4,
				600);
			count++;
		    }
		} catch (Exception e) {
			System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		    ((MobileDriver) GetDriver()).swipe(startx / 2, starty - starty / 4, startx / 2, starty / 4, 600);
		    count++;
		}

	    }

	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
	    throw e;
	} catch (NoSuchElementException n) {
	    GetReporting().FuncReport("Fail", "Element not displayed");
	    throw n;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
			    "Exception <b>- " + e.toString() + "</b> occured while trying launch the application.");
		    throw e;
	}
	if (clickYorN) {
	    elementToFind.click();
	}

    }

    *//**
     * This method will pinch over the device depending on the value of the
     * boolean inside.
     * 
     * @param inside
     *            true if you want to zoom out and false if you want to zoom in.
     * @param X1
     *            The stating ordinate of the pinch.
     * @param Y1
     *            The starting abscissa of the pinch.
     * @param radius
     *            The radius in pixels for the pinch to be performed.
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public void FuncPinch(boolean inside, int X1, int Y1, int radius) throws IOException {
	try {
	    TouchAction action1 = null;
	    TouchAction action2 = null;
	    if (inside) {
		action1 = new TouchAction(((MobileDriver) GetDriver())).longPress(X1, Y1 + radius).moveTo(0, -radius)
			.release();
		action2 = new TouchAction(((MobileDriver) GetDriver())).longPress(X1, Y1 - radius).moveTo(0, radius)
			.release();
	    } else {
		action1 = new TouchAction(((MobileDriver) GetDriver())).longPress(X1, Y1).moveTo(0, radius).release();
		action2 = new TouchAction(((MobileDriver) GetDriver())).longPress(X1, Y1).moveTo(0, -radius).release();
	    }
	    MultiTouchAction pinching = new MultiTouchAction(((MobileDriver) GetDriver()));
	    pinching.add(action1).add(action2).perform();
	    GetReporting().FuncReport("Pass", "Pinch is successful.");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
	    throw e;
	} catch (NoSuchElementException n) {
	    GetReporting().FuncReport("Fail", "Element not displayed");
	    throw n;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception <b>- " + e.toString() + "</b> occured while executing pinch command.");
	    throw e;
	}
    }

    *//**
     * This method will reset the application Which means that it will clear the
     * application data and the application cache files.
     * 
     * @throws Exception
     *             If there is problem while reporting.
     * 
     * @throws IllegalArgumentException
     *             If there is problem while reporting.
     *//*
    public void FuncResetApplicaiton() throws IOException {
	try {
	    ((AppiumDriver) GetDriver()).resetApp();
	    GetReporting().FuncReport("Pass", "The application has been successfully reset.");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception '" + e.toString() + "' occurred while resetting the application.");
	    throw e;
	}
    }

    *//**
     * This method will run the currently running app in background
     * 
     * @param timeout
     *            The seconds for which the app will be running in background .
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     *//*
    public void FuncRunAppInBackground(int timeout) throws IOException {
	try {
	    ((InteractsWithApps) GetDriver()).runAppInBackground(timeout);
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "<b>- " + "</b> Error in running app in background.");
	    throw e;
	}
    }

    *//**
     * This function will return the int array of the screen size as (x,y).
     * 
     * @return The screensize int array.
     * @throws IOException
     *             if there is a problem in reporting.
     *//*
    public int[] FuncScreenSize() throws IOException {
	try {
	    Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
	    int x = size.width;
	    int y = size.height;
	    int[] returnVal = { x, y };
	    return returnVal;
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "Exception <b>- " + e.toString() + "</b> occured while GET screen size.");
	    throw e;
	}
    }

    *//**
     * This method will click particular element from the table.
     * 
     * @param The
     *            element which has to be identified
     * 
     * @param Text
     *            to print in report
     * 
     * @return boolean
     * 
     *         true if element is displayed or false
     * 
     *//*

    public void FuncSelectElementInTable(String element, String cellAddress1, String cellAddress2, String valueToSelect)
	    throws Exception {
	try {
	    MobileElement dropdown = (MobileElement) ((AppiumDriver) GetDriver()).findElement(By.xpath(element));
	    for (int i = 1; i < 100; i++) {
		String Firstpart = cellAddress1;
		String Secondpart = cellAddress2;
		String Finalpart = Firstpart + i + Secondpart;

		MobileElement options = dropdown.findElement(By.xpath(Finalpart));

		if (options.getText().contains(valueToSelect)) {
		    options.click();

		    GetReporting().FuncReport("Pass", "The element <b>  " + valueToSelect + " </b> Clicked");
		    break;
		}
	    }
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException");
	    throw e;
	} catch (NoSuchElementException n) {
	    GetReporting().FuncReport("Fail", "Element not displayed" + valueToSelect);
	    throw n;

	} catch (Exception n) {
	    GetReporting().FuncReport("Fail", "Exception");
	    throw n;
	}
   }

    *//**
     * Forcefully send character sequence by opening up the keyboard even if you
     * are not on any text element.
     * 
     * @param charctersToSend
     *            The character sequence to send.
     * @throws IOException
     *             If there is a problem while reporting
     *//*
    public void FuncSendKeys(CharSequence charctersToSend) throws IOException {
	try {
	    ((AppiumDriver) GetDriver()).getKeyboard().sendKeys(charctersToSend);
	    GetReporting().FuncReport("Pass", "Character seuence '" + charctersToSend + "' sent successfully.");
	} catch (WebDriverException e) {
	    GetReporting().FuncReport("Fail", "WebDriverException occured while sending the key events.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "Exception '" + e.toString() + "' occurred while sending key events.");
	    throw e;
	}
    }

    *//**
     * This method will send a text or type some text to the element that has
     * been specified in the objElement.
     * 
     * @param objElement
     *            The Mobile element to which we want to send the text.
     * @param sTextToSend
     *            The text that has t be sent to the element.
     * @throws InterruptedException
     *             In case there is an error while executing the command.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws TimeoutException
     *             In case the element is not found within the specified
     *             timeout.
     *//*
    public void FuncSendKeys(MobileElement objElement, String sTextToSend)
	    throws InterruptedException, IOException, TimeoutException {
	try {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), 10L);
	    wait.until(ExpectedConditions.elementToBeClickable(objElement));
	    objElement.clear();
	    objElement.sendKeys(new CharSequence[] { sTextToSend });
	    GetReporting().FuncReport("Pass", sTextToSend + " Entered");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
	    throw e;
	} catch (TimeoutException e) {
	    GetReporting().FuncReport("Fail", "<b>- " + objElement.toString() + "</b> Time Out waiting for element");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "<b>- " + objElement.toString() + "</b> not present in current page");
	    throw e;
	}
    }

    *//**
     * Force change the Orientation of the device to Landscape.
     * 
     * @throws IOException
     *             If there is a problem while reporting
     *//*
    public void FuncSetLandscapeOrientation() throws IOException {
	try {
	    ((AppiumDriver) GetDriver()).rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
	    GetReporting().FuncReport("Pass", "Device Orientation has been set to Landscape");
	} catch (WebDriverException e) {
	    GetReporting().FuncReport("Fail", "WebDriverException occured while changing orientation to landscape.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception '" + e.toString() + "' occurred while changing orientation to Landscape.");
	    throw e;
	}
    }

    *//**
     * This method will set the device location to a specific location that is
     * specified in the method. For android make sure that in developer setting,
     * mock location has been checked for API level>21, otherwise it will throw
     * an exception. This will work only on iOS emulators and not on real iOS
     * devices until the device is jailbroken which is not recommended.
     * 
     * @param latitude
     *            The latitude..
     * @param longitude
     *            The longitude.
     * @param altitude
     *            The altitude.
     * @throws IOException
     *             If there is a problem while reporting.
     *//*
    public void FuncSetLocation(double latitude, double longitude, double altitude) throws IOException {
	try {
	    Location locationToSet = new Location(latitude, longitude, altitude);
	    ((AppiumDriver) GetDriver()).setLocation(locationToSet);
	} catch (WebDriverException e) {
	    GetReporting().FuncReport("Fail",
		    "WebDriverException '" + e.toString() + "' occurred while setting Location.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "Exception '" + e.toString() + "' occurred while setting Location.");
	    throw e;
	}

    }

    *//**
     * Force change the Orientation of the device to Potrait.
     * 
     * @throws IOException
     *             If there is a problem while reporting
     *//*
    public void FuncSetPotraitOrientation() throws IOException {
	try {
	    ((AppiumDriver) GetDriver()).rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
	    GetReporting().FuncReport("Pass", "Device Orientation has been set to Potrait");
	} catch (WebDriverException e) {
	    GetReporting().FuncReport("Fail", "WebDriverException occured while chenging orientation to Potrait.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception '" + e.toString() + "' occurred while changing orientation to Potrait.");
	    throw e;
	}
    }

    public void FunCSwipeandScroll(MobileElement elementToFind, boolean clickYorN) throws Exception {
	try{
	Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
	int startx = size.width;
	int starty = size.height;
	while (!elementToFind.isDisplayed()) {
	    ((MobileDriver) GetDriver()).swipe(startx / 2, starty - starty / 4, startx / 2, starty / 4, 600);
	    GetReporting().FuncReport("Pass", "Swipe done");
	}
	if (clickYorN) {
	    elementToFind.tap(1, 3000);
	}
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException");
	    throw e;
	} catch (NoSuchElementException n) {
	    GetReporting().FuncReport("Fail", "Element not displayed");
	    throw n;

	} catch (Exception n) {
	    GetReporting().FuncReport("Fail", "Exception");
	    throw n;
	}
   }

    *//**
     * This function will swipe through the screen until an element is found on
     * the screen and click over it if the clickOnElement parameter is given as
     * true.
     * 
     * @param elementToFind
     *            The element that has to be found with the swipes.
     * @param maxSwipes
     *            The maximum number of times you want to swipe until the
     *            element has been found.
     * @param direction
     *            The direction of swipe. It is either 'up', 'down', 'left' or
     *            'right'. If the direction is something else, an
     *            IllegalArgumentException is thrown and the test will fail.
     * @param offset
     *            The offset for the swipe. It will be useful in devices in
     *            which the back home buttons are present on the screen itself,
     *            eg in motorola devices. You need to give offset so that the
     *            swipe starts above it.
     * @param clickOnElement
     *            A boolean value specifying weather you want to click on the
     *            element after it has been found.
     * 
     * @throws IOException
     *             If some error comes in reporting.
     *//*
    public void FuncSwipeScreenWhileNotFound(MobileElement elementToFind, int maxSwipes, String direction, int offset,
	    boolean clickOnElement) throws IOException {
	try {
	    int startx, starty, endx, endy;
	    Dimension screenDimensions = ((AppiumDriver) GetDriver()).manage().window().getSize();
	    if (direction.equalsIgnoreCase("down")) {
		startx = screenDimensions.width / 2;
		starty = screenDimensions.height - 20 - offset;
		endx = startx;
		endy = 20;
	    } else if (direction.equalsIgnoreCase("up")) {
		startx = screenDimensions.width / 2;
		starty = 20 + offset;
		endx = startx;
		endy = screenDimensions.height - 20;
	    } else if (direction.equalsIgnoreCase("right")) {
		startx = 10 + offset;
		starty = screenDimensions.height / 2;
		endx = screenDimensions.width - 10;
		endy = starty;
	    } else if (direction.equalsIgnoreCase("left")) {
		startx = screenDimensions.width - 10 - offset;
		starty = screenDimensions.height / 2;
		endx = 10;
		endy = starty;
	    } else {
		throw new IllegalArgumentException("The direction given is '" + direction
			+ "' is wrong. Please give either 'up', 'down', 'left' or 'right'.");
	    }
	    for (int i = 0; i < maxSwipes; i++) {
		boolean elementFound = false;
		try {
		    elementFound = elementToFind.isDisplayed();
		} catch (NoSuchElementException e) {
		    ((MobileDriver) GetDriver()).swipe(startx, starty, endx, endy, 3000);
		}
		if (elementFound) {
		    if (clickOnElement)
			elementToFind.click();
		    break;
		}
	    }
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "Error occured in swipeWhileNotFound. \n" + e.toString());
	    throw e;
	} catch (NoSuchElementException e) {
	    GetReporting().FuncReport("Fail",
		    "Could not find element: '" + elementToFind.toString() + "' in '" + maxSwipes + "' swipes.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail",
		    "Exception '" + e.toString() + "' occurred while trying to use swipeWhileNotFound.");
	    throw e;
	}
    }

    *//**
     * Switch from one iFrame to another. It is to be used only for website
     * testing in case the website is using iframes.
     * 
     * @param iFrameXPath
     *            The xPath to locate the iFrame.
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public void FuncSwitchFrame(String iFrameXPath) throws IOException {
	try {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), 10L);
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(iFrameXPath)));
	    ((AppiumDriver) GetDriver()).switchTo().frame(iFrameXPath);
	    GetReporting().FuncReport("Pass", "Switched to new iFrame. '" + iFrameXPath + "'.");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException");
	    throw e;
	} catch (NoSuchElementException n) {
	    GetReporting().FuncReport("Fail", "iPframe '" + iFrameXPath + "' is not present.");
	    throw n;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "The iFrame <b>- " + iFrameXPath + "</b> not present in current page");
	    throw e;
	}
    }

    *//**
     * This method will swipe either up, Down, left or Right according to the
     * direction specified. This method takes the size of the screen and uses
     * the swipe function present in the Appium driver to swipe on the screen
     * with a particular timeout. There is one more method to implement swipe
     * using touch actions, which is not put up here.
     * 
     * @param Direction
     *            The direction we need to swipe in.
     * @param swipeTime
     *            The swipe time, ie the time for which the driver is supposed
     *            to swipe.
     * @param Offset
     *            The offset for the driver, eg. If you want to swipe 'up', then
     *            the offset is the number of pixels you want to leave from the
     *            bottom of the screen t start the swipe.
     * @throws IOException
     *             If there is problem while reporting.
     *//*
    public void FunctionSwipe(String Direction, int swipeTime, int Offset) throws IOException {
	try {

	    Dimension size;
	    size = ((AppiumDriver) GetDriver()).manage().window().getSize();
	    int starty = (int) (size.height * 0.80);
	    int endy = (int) (size.height * 0.20);
	    int startx = size.width / 2;
	    if (Direction.equalsIgnoreCase("Up")) {
		((MobileDriver) GetDriver()).swipe(startx, starty - Offset, startx, endy, swipeTime);
	    } else if (Direction.equalsIgnoreCase("Down")) {
		((MobileDriver) GetDriver()).swipe(startx, endy + Offset, startx, starty, swipeTime);
	    } else if (Direction.equalsIgnoreCase("Right")) {
		starty = size.height / 2;
		endy = size.height / 2;
		startx = (int) (size.width * 0.10);
		int endx = (int) (size.width * 0.90);
		((MobileDriver) GetDriver()).swipe(startx + Offset, starty, endx, endy, swipeTime);
	    } else if (Direction.equalsIgnoreCase("Left")) {
		starty = size.height / 2;
		endy = size.height / 2;
		startx = (int) (size.width * 0.90);
		int endx = (int) (size.width * 0.10);
		((MobileDriver) GetDriver()).swipe(startx - Offset, starty, endx, endy, swipeTime);
	    }
	    GetReporting().FuncReport("Pass", "Swipe <b> " + Direction + " </b> Successful");

	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "<b>- " + "</b> not present in current page");
	    throw e;
	}

    }

    *//**
     * This function waits for an element to appear in the screen. It waits
     * until the element is visible on the screen within the given timeout.
     * 
     * @param objElement
     *            The element to wait for.
     * @param timeout
     *            The timeout in seconds for which you want to wait for the
     *            element to be visible on the screen.
     * @throws IOException
     *             If there is problem while reporting
     *             .
     *//*
    public void FuncWaitForElement(MobileElement objElement, long timeout, String text) throws IOException {
	try {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), timeout);
	    wait.until(ExpectedConditions.visibilityOf(objElement));
	    GetReporting().FuncReport("Pass", "The element '" + text + "' is found on the screen.");
	} catch (NoSuchElementException e) {
	    GetReporting().FuncReport("Fail", "The element '" + text + "' is not found.");
	    throw e;
	} catch (TimeoutException e) {
	    GetReporting().FuncReport("Fail",
		    "The element '" + text + "' is not found withing the given timeout of '" + timeout + " seconds.'");
	    throw e;
	} catch (WebDriverException e) {
	    GetReporting().FuncReport("Fail", "A WebDriverEception has occurred. Please check connection.");
	    throw e;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "Exception '" + text + "' occurred while waiting for element.");
	    throw e;
	}
    }

    *//**
     * This method will return the text associated with the mobile element.
     * 
     * @param The
     *            element whose text has to be retrieved.
     * 
     * @return String The text that is associated with the mobile element
     * 
     *//*
    public String getText(MobileElement objElement) {
	return objElement.getText();

    }

    public void quitDriver() {

	((AppiumDriver) GetDriver()).quit();

    }

    *//**
     * This method will verify the text of the element is same as the expected
     * text
     * 
     * @param The
     *            element which has to be identified
     * 
     * @param The
     *            expected text
     * 
     * @return boolean
     * 
     *         true if element is displayed or false
     * 
     *//*
    public boolean verifyElement(MobileElement mobileElement, String text) {
	String elementText = mobileElement.getText();
	WebDriverWait wait = new WebDriverWait(GetDriver(), 10L);
	wait.until(ExpectedConditions.elementToBeClickable(mobileElement));

	if (elementText.equalsIgnoreCase(text)) {
	    try {
		GetReporting().FuncReport("Pass", "The text '" + text + "' is verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return true;
	} else {
	    try {
		GetReporting().FuncReport("Fail", "The text '" + text + "' is not verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return false;
	}
    }

    *//**
     * This method will verify the element is displayed on the screen.
     * 
     * @param The
     *            element which has to be identified
     * 
     * @param Text
     *            to print in report
     * 
     * @return boolean
     * 
     *         true if element is displayed or false
     * 
     *//*
    public void verifyElementIsDisplayed(MobileElement mobileElement, String expectedText) throws IOException {
	try {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), 7L);
	    wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
	    mobileElement.isDisplayed();
	    GetReporting().FuncReport("Pass", "The '" + expectedText + "' is verified");
	} catch (IllegalArgumentException e) {
	    GetReporting().FuncReport("Fail", "IllegalArgumentException");
	    throw e;
	} catch (NoSuchElementException n) {
	    GetReporting().FuncReport("Fail", "Element not displayed" + expectedText);
	    throw n;
	} catch (Exception e) {
	    GetReporting().FuncReport("Fail", "The element <b>- " + expectedText + "</b> not present in current page");
	    throw e;
	}
    }

    public boolean verifyElementNotPresent(MobileElement mobileElement, String expectedText) {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), 7L);
	    wait.until(ExpectedConditions.elementToBeClickable(mobileElement));

	if (mobileElement.isDisplayed() == true) {
	    try {
		GetReporting().FuncReport("Fail", "The '" + expectedText + "' is verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return true;
	} else {
	    try {
		GetReporting().FuncReport("Pass", "The '" + expectedText + "' is not verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return false;
	}

    }

    *//**
     * This method will verify the text contained in another String.
     * 
     *
     * @param objElement
     *            The MobileElement on which the click action has to be
     *            performed.
     * @throws Exception
     *             In case an exception occurs while clicking over the element.
     *             In case the element is not found over the screen.
     *//*
    public void verifyElementTextContains(MobileElement objElement, String text) throws IOException {
	try {

	    if (objElement.getAttribute("label").contains(text)) {

		GetReporting().FuncReport("Pass", "Element contains text " + text);

	    }

	} catch (IOException e) {
	    GetReporting().FuncReport("Fail", "IOException Exception occurred");
	    throw e;
	}
    }

    *//**
     * verify login for 5 times
     * 
     * @param The
     *            element which has to be identified
     * 
     * @return void
     * @throws IOException
     * 
     *//*
    public boolean verifyLoginErrorOccured(String mobileElement) throws InterruptedException, IOException {
	try {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), 20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobileElement)));

	    GetReporting().FuncReport("Pass",
		    "Your login information does not match what we have on file message is shown");

	    return true;
	} catch (NoSuchElementException e) {
	    return false;
	}

    }

    public boolean verifySymbol(String text, String delimiter) {
	if (text.startsWith(delimiter)) {
	    try {
		GetReporting().FuncReport("Pass", "The symbol'" + delimiter + "' is verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return true;
	} else {
	    try {
		GetReporting().FuncReport("Fail", "The symbol'" + delimiter + "' is not verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return false;
	}

    }

    *//**
     * 
     * THis method will return true if element contains some part of expected
     * text.
     * 
     * @param retrivedText
     * @param expectedText
     * @return
     *//*

    public boolean verifyTextContains(MobileElement mobileElement, String expectedText) {

	String retrivedText = mobileElement.getText();

	if (retrivedText.contains(expectedText)) {
	    try {
		GetReporting().FuncReport("Pass", "The text '" + expectedText + "' is verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return true;
	} else {
	    try {
		GetReporting().FuncReport("Fail", "The text '" + expectedText + "' is not verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return false;
	}
    }

    public boolean verifyTextEquality(String text1, String text2) {
	if (text1.equalsIgnoreCase(text2)) {
	    try {
		GetReporting().FuncReport("Pass", "The text is verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return true;
	} else {
	    try {
		GetReporting().FuncReport("Fail", "The text is not verified");
	    } catch (IOException e) {
	    	System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	    }
	    return false;
	}

    }

    *//**
     * This method will wait for the element to appear on the screen.
     * 
     * @param The
     *            element which has to be identified
     * 
     * @return void
     * @throws IOException
     * 
     *//*
    public void waitForElementToAppear(String locater, String text) throws InterruptedException, IOException {
	long timeoutInSeconds = 660;
	try {
	    WebDriverWait wait = new WebDriverWait(GetDriver(), timeoutInSeconds);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locater)));
	    GetReporting().FuncReport("Pass", "The text '" + text + "' is visible");
	} catch (NoSuchElementException e) {
	    GetReporting().FuncReport("Fail", "The text '" + text + "' has not appeared");
	} catch (IOException e) {
	    GetReporting().FuncReport("Fail", "The text '" + text + "' has not appeared");
	    e.printStackTrace();
	}
    }

    *//**
     * This method will wait for the element to disappear from the screen.
     * 
     * @param The
     *            element which has to disappear
     * 
     * @return void
     * 
     *//*
    public void waitForElementToDisappear(String xpath) throws InterruptedException {
	long timeoutInSeconds = 5;
	boolean flag = false;
	while (flag == false) {
	    try {
		WebDriverWait wait = new WebDriverWait(GetDriver(), timeoutInSeconds);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
		
		flag = true;
	    } catch (Exception e) {
	
		flag = false;
	    }
	}
    }

    *//**
     * This method will wait for the element to disappear from the screen.
     * 
     * @param The
     *            element which has to disappear
     * 
     * @return void
     * 
     *//*
    public void waitForElementToVanish(MobileElement elementToVanish) {
	try {
	    int count = 1;
	    boolean isElementDisplayed = elementToVanish.isDisplayed();
	    while (count <= 10) {
		if (isElementDisplayed) {
		    try {
			Thread.sleep(1000);
			count++;

			if (!elementToVanish.isDisplayed())
			    break;
		    } catch (NoSuchElementException e) {
			break;
		    }
		}
	    }
	} catch (Exception e) {
		System.out.print("Exception from Method " + this.getClass().toString());
	}
    }

    *//**
	 * This method will verify the Element present using XPATH.
	 * 
	 *
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             In case the element is not found over the screen.
	 *//*
	public MobileElement verifyElementUsingXPath(String objElement, String text) throws IOException {
		try {

			MobileElement objMobileElement = (MobileElement) ((AppiumDriver) GetDriver())
					.findElement(By.xpath(objElement));
			verifyElementIsDisplayed(objMobileElement, text);
			return objMobileElement;
		} catch (IOException e) {
			GetReporting().FuncReport("Fail", "IOException Exception occurred");
			return null;
		}
	}
	*//**
     * This method will convert the String to mobileElement and do swipe function
     * 
     * @param The
     *            element which has to disappear
     * 
     * @return void
     * 	
     *//*
    public void changeToMobileElementAndSwipe(String element,boolean clickable) {
    	try {
    			MobileElement elementVal = (MobileElement) ((AppiumDriver) GetDriver())
    						.findElement(By.xpath(element));
    			FunCSwipeandScroll(elementVal,clickable);
   
    		} catch (Exception e) {
    			System.out.print("Exception from Method " + this.getClass().toString());
    		}
    }
    
	*//**
	 * This method will click on allow button.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 *//*
	public void FuncClickAllow() {
		if (((AndroidDriver) GetDriver()).currentActivity().contains("GrantPermissionsActivity")) {
			GetDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			GetDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		}
	}

}


*/