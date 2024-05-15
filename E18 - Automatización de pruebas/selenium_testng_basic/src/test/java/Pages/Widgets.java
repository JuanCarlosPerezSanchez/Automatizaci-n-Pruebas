package Pages;

import Utilities.Utils;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




public class Widgets {

  // Clases de utilidades

  // Instanciar acciones/condiciones
  public String testId;

  // Instanciar clases de test

  /**
   * Instanciador de la conexión entre el test y el dispositivo.
   * 
   * @throws Exception
   */
  @BeforeSuite
  public void setup_test() throws Exception {
    Utils.Instanciador_Chrome();
  }

  @AfterMethod
  public void breakup_test() throws Exception {
    Utils.CloseBrowser();
  }

  /**************************************************
   * 
   * 
   * Pruebas
   * 
   * 
   **************************************************/


  // -------------------------------------------------------4-----------------------------------------------------------------------------------------------------------------------------

  /**
   * Verificar el funcionamiento de "Date Picker"
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC04 - Verificar el funcionamiento de \"Date Picker", enabled = false)
  public void Widgets_TC04() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */
    Utils.chromeDriver.findElementByXPath("//li[contains(@class, 'btn btn-light') and @id='item-2' and span[text()='Date Picker']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//input[@id='datePickerMonthYearInput' and @class='react-datepicker-ignore-onclickoutside']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[@id='dateAndTimePickerInput' and @class='react-datepicker-ignore-onclickoutside']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='datePickerContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Date Picker')]/parent::li").contains("active"))
      {
        System.out.println("No hay fallos!!");
      }
    
    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='datePickerMonthYearInput']").click();
    // Thread.sleep(5000);
    
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='datePickerMonthYear']/div[2]/div[2]").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }

    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='datePickerContainer']/h1").click();
    Utils.chromeDriver.findElementByXPath("//*[@id='dateAndTimePickerInput']").click();
    // Thread.sleep(5000);
    
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//div[@class='react-datepicker__month-container']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[3]").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }
  }

  
  // -------------------------------------------------------5-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Slider" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC05 - Verificar el funcionamiento de \"Slider", enabled = true)
  public void Widgets_TC05() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */
    Utils.chromeDriver.findElementByXPath("//li[@id='item-3' and span[@class='text' and text()='Slider']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='sliderContainer']/div[1]/span").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='sliderValue']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/form/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").contains("active"))
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='sliderContainer']/div[1]/span/input").click();
    Thread.sleep(5000);

    //Condición


        // WebElement slider = Utils.chromeDriver.findElement(By.xpath("//*[@id='sliderContainer']/div[1]/span"));
        // int sliderWidth = slider.getSize().getWidth();
        // int range = 100;
        
        // Actions actions = new Actions(Utils.chromeDriver);

        // int steps = 1;
        // int stepSize = sliderWidth / range * steps;

        // for (int i = range; i >= 0; i -=steps) {
        //     actions.clickAndHold(slider).moveByOffset(-stepSize, 0).perform();       -------------->    NO VA
        //     try {
        //         Thread.sleep(500); 
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }

        // for (int i = 0; i >= 50; i +=steps) {
        //   actions.clickAndHold(slider).moveByOffset(stepSize, 0).perform();
        //     try {
        //         Thread.sleep(500); 
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }

        
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }

  
  // -------------------------------------------------------6-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Proggres Bar" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC06 - Verificar el funcionamiento de \"Proggres Bar", enabled = false)
  public void Widgets_TC06() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */

    WebElement ProgressBar = Utils.chromeDriver.findElementByXPath("//li[@id='item-4' and span[@class='text' and text()='Progress Bar']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", ProgressBar);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@id='item-4' and span[@class='text' and text()='Progress Bar']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='progressBarContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='progressBar']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='startStopButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='progressBarContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").contains("active"))
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='startStopButton']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='progressBar']/div").size() > 0 || /* NO SE */
      Utils.chromeDriver.findElementsByXPath("//*[@id='startStopButton']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 3
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='startStopButton']").click();
    // Thread.sleep(5000);

    //Condición
    if(/*Utils.chromeDriver.findElementsByXPath("Barra se detiene estado porcentaje ????????????????").size() > 0 ||*/
      Utils.chromeDriver.findElementsByXPath("//*[@id='startStopButton']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
  

  // -------------------------------------------------------7-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Tabs" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC07 - Verificar el funcionamiento de \"Tabs", enabled = false)
  public void Widgets_TC07() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */

    WebElement Tabs = Utils.chromeDriver.findElementByXPath("//li[@id='item-5' and span[@class='text' and text()='Tabs']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Tabs);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@id='item-5' and span[@class='text' and text()='Tabs']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='tabsContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='demo-tab-more']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//a[@id='demo-tab-origin' and @class='nav-item nav-link' and text()='Origin']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//a[@id='demo-tab-use' and @class='nav-item nav-link' and text()='Use']").size() > 0 ||
      // Utils.chromeDriver.findElementsByXPath("Apartado en base al seleccionado ??????????").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='tabsContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[contains(@class, 'active')][last()]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='tabsContainer']/div[2]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='demo-tab-origin']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='tabsContainer']/div[2]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
  

  // -------------------------------------------------------8-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Tool Tips" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC08 - Verificar el funcionamiento de \"Tool Tips", enabled = false)
  public void Widgets_TC08() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1

    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */
    // Thread.sleep(5000);

    WebElement Tabs = Utils.chromeDriver.findElementByXPath("//li[@id='item-5' and span[@class='text' and text()='Tabs']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Tabs);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@id='item-6' and span[@class='text' and text()='Tool Tips']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='toopTipContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='texToolTopContainer']").size() > 0 ||
      // Utils.chromeDriver.findElementsByCssSelector(".btn-success {color: #fff; background-color: #28a745; border-color: #28a745;}").contains(background-color: #28a745;) ????????????||
      Utils.chromeDriver.findElementsByXPath("//*[@id='toolTipTextField']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@id='item-6' and contains(@class, 'active')]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='texToolTopContainer']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción

    WebElement elmento = Utils.chromeDriver.findElement(By.xpath("//*[@id='toolTipButton']"));
    Actions actions2 = new Actions(Utils.chromeDriver);
    actions2.moveToElement(elmento).perform();

    
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//button[@id='toolTipButton' and @aria-describedby='buttonToolTip']").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }

    //Acción
    
    WebElement elmento1 = Utils.chromeDriver.findElement(By.xpath("//*[@id='toolTipTextField']"));
    Actions actions3 = new Actions(Utils.chromeDriver);
    actions3.moveToElement(elmento1).perform();

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//input[@id='toolTipTextField' and @aria-describedby='textFieldToolTip']").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }

    //Acción
    
    WebElement elmento2 = Utils.chromeDriver.findElement(By.xpath("//*[@id='texToolTopContainer']/a[1]"));
    Actions actions4 = new Actions(Utils.chromeDriver);
    actions4.moveToElement(elmento2).perform();

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//a[@aria-describedby='contraryTexToolTip']").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }
  }
  

  // -------------------------------------------------------9-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Menu" - Menu 1 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC09 - Verificar el funcionamiento de \"Menu - Menu 1", enabled = false)
  public void Widgets_TC09() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */

    WebElement Menu = Utils.chromeDriver.findElementByXPath("//li[@id='item-7' and span[@class='text' and text()='Menu']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Menu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@id='item-7' and span[@class='text' and text()='Menu']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1[text()='Menu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='nav']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@id='item-7' and contains(@class, 'active')]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción

    WebElement elmento3 = Utils.chromeDriver.findElement(By.xpath("//*[@id='nav']/li[1]/a"));
    Actions actions5 = new Actions(Utils.chromeDriver);
    actions5.moveToElement(elmento3).perform();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='nav']/li[1]/a").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
  

  // -------------------------------------------------------10-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Menu" - Menu 2 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC10 - Verificar el funcionamiento de \"Menu - Menu 2", enabled = false)
  public void Widgets_TC10() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */

    WebElement Menu = Utils.chromeDriver.findElementByXPath("//li[@id='item-7' and span[@class='text' and text()='Menu']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Menu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1[text()='Menu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='nav']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@id='item-7' and contains(@class, 'active')]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción

    WebElement elmento3 = Utils.chromeDriver.findElement(By.xpath("//*[@id='nav']/li[1]/a"));
    Actions actions5 = new Actions(Utils.chromeDriver);
    actions5.moveToElement(elmento3).perform();
    // Thread.sleep(5000);


    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='nav']/li[2]/ul/li[1]/a").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='nav']/li[2]/ul/li[2]/a").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
  

  // -------------------------------------------------------11-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Menu" - Menu 3 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC11 - Verificar el funcionamiento de \"Menu - Menu 3", enabled = false)
  public void Widgets_TC11() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */

    WebElement Menu = Utils.chromeDriver.findElementByXPath("//li[@id='item-7' and span[@class='text' and text()='Menu']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Menu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1[text()='Menu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='nav']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@id='item-7' and contains(@class, 'active')]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción

    WebElement elmento3 = Utils.chromeDriver.findElement(By.xpath("//*[@id='nav']/li[3]"));
    Actions actions5 = new Actions(Utils.chromeDriver);
    actions5.moveToElement(elmento3).perform();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='nav']/li[3]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
  

  // -------------------------------------------------------12-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Select Menu" - Select Menu 1 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC12 - Verificar el funcionamiento de \"Select Menu - Select Menu 1", enabled = false)
  public void Widgets_TC12() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */

    WebElement SelectMenu = Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", SelectMenu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='withOptGroup']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectOne']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='cars']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and span/text()='Select Menu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='withOptGroup']/div/div[1]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
  

  // -------------------------------------------------------13-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Select Menu" - Select Menu 2 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC13 - Verificar el funcionamiento de \"Select Menu - Select Menu 2", enabled = false)
  public void Widgets_TC13() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */

    WebElement SelectMenu = Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", SelectMenu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='withOptGroup']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectOne']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='cars']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and span/text()='Select Menu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='selectOne']/div/div[1]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
  

  // -------------------------------------------------------14-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Select Menu" - Select Menu 3 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC14 - Verificar el funcionamiento de \"Select Menu - Select Menu 3", enabled = false)
  public void Widgets_TC14() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */

    WebElement SelectMenu = Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", SelectMenu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='withOptGroup']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectOne']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='cars']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and span/text()='Select Menu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='oldSelectMenu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
}