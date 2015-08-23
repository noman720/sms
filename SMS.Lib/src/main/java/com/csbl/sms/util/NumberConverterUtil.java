
package main.java.com.csbl.sms.util;

public class NumberConverterUtil 
{
    public static String convertWordToNumber(String word)
    {
        if(word.equalsIgnoreCase("One")) {
            return "1";
        }
        if(word.equalsIgnoreCase("Two")) {
            return "2";
        }
        if(word.equalsIgnoreCase("Three")) {
            return "3";
        }
        if(word.equalsIgnoreCase("Four")) {
            return "4";
        }
        if(word.equalsIgnoreCase("Five")) {
            return "5";
        }
        if(word.equalsIgnoreCase("Six")) {
            return "6";
        }
        if(word.equalsIgnoreCase("Seven")) {
            return "7";
        }
        if(word.equalsIgnoreCase("Eight")) {
            return "8";
        }
        if(word.equalsIgnoreCase("Nine")) {
            return "9";
        }
        if(word.equalsIgnoreCase("Ten")) {
            return "10";
        }
        if(word.equalsIgnoreCase("Eleven")) {
            return "11";
        }
        if(word.equalsIgnoreCase("Twelve")) {
            return "12";
        }
        
        return "0";
    }
    
    
    
    public static String getNextClassName(String curClazz)
    {
        if(curClazz.equalsIgnoreCase("One")) {
            return "Two";
        }
        if(curClazz.equalsIgnoreCase("Two")) {
            return "Three";
        }
        if(curClazz.equalsIgnoreCase("Three")) {
            return "Four";
        }
        if(curClazz.equalsIgnoreCase("Four")) {
            return "Five";
        }
        if(curClazz.equalsIgnoreCase("Five")) {
            return "Six";
        }
        if(curClazz.equalsIgnoreCase("Six")) {
            return "Seven";
        }
        if(curClazz.equalsIgnoreCase("Seven")) {
            return "Eight";
        }
        if(curClazz.equalsIgnoreCase("Eight")) {
            return "Nine";
        }
        if(curClazz.equalsIgnoreCase("Nine")) {
            return "Ten";
        }
        if(curClazz.equalsIgnoreCase("Ten")) {
            return "Eleven";
        }
        if(curClazz.equalsIgnoreCase("Eleven")) {
            return "Twelve";
        }
        if(curClazz.equalsIgnoreCase("Twelve")) {
            return "Pass Out";
        }
        
        return "0";
    }
    
}
