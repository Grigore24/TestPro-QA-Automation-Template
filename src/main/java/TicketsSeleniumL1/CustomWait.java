package TicketsSeleniumL1;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

public class CustomWait {
    public static void main(String[] args) {
        By homeIconLocator = By.className("home");
        for (int i = 0;  i < 25; i++) {
            try{
               // driver.findElement(homeIconLocator);
                break;
            }catch (NoSuchElementException | ElementClickInterceptedException | StaleElementReferenceException err){
                System.out.println(i);
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){}
            }
            
        }
    }
}
