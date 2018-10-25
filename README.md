# Notation Converter
The Notation Converter is an application that converts from binary,  
octal, decimal, or hexadecimal to binary, octal, decimal, and hexadecimal.  
It can help when you need quick conversions from one base to the others,  
especially when you are dealing with larger numbers.  

***Please Note The Following:***
* ***IMPORTANT: Requires Java 8 and Windows***
  * You can download Java 8 here: [JAVA 8 JRE](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)   

## To Run
### QuickStart
1. **Download Repository**  
2. **Open Repository folder**
3. **Run the first-start.bat file (This step only necessary once.)**
4. **Run the run.bat file (This is how you will access the application  
from now on. After this, Steps 1-3 no longer needed)**  
  
### Manually Start (*If you would rather not use the batch files*)
1. **Download Repository**  
2. **Open command prompt and navigate to repository folder**
3. **Enter the following commands:**
> **cd notationconverter**  
> **javac Conversion.java**  
> **javac TestPanel.java**  
> **javac Main.java**  
> **jar cmvf manifest.mf ../NotationConverter.jar ./\*.java ./\*.class**  
> **cd ..**  
> **java -jar /NotationConverter.jar**  
4. **After doing steps 1-3 the application should have already ran once. The next times  
that you wish to run the application just follow steps 1-2 and enter the following command:**  
> **java -jar /NotationConverter.jar**  

## Using the Application
**What can you do in the application?**
* Enter your number to be converted into the text area (*Note: The number  
actually needs to be apart of the correct base*)
* After you enter a number you must then select the base to convert from  
(*Note: This is still a little buggy. Even if it's the same base as before  
you must repeat this step every time*)  


