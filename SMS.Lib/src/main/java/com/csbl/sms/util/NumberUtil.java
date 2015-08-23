
package main.java.com.csbl.sms.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class NumberUtil
{
    public static NumberFormat numberFormat = NumberFormat.getInstance();
    public static DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public static String getNumberValueAsString(double value)
    {
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(true);
        return numberFormat.format(value);
    }

    public static double getNumberValueAsDouble(String value)
    {
        double number = 0;
        try
        {
            number = numberFormat.parse(value).doubleValue();
        }
        catch(Exception e)
        {

        }
        return number;
    }
    
    public static double getValueByRounding(double value)
    {
        double number = 0.0;
        try{
            decimalFormat.setMaximumFractionDigits(2);
            decimalFormat.setMinimumFractionDigits(2);
            decimalFormat.setGroupingUsed(true);
            number = decimalFormat.parse(decimalFormat.format(value)).doubleValue();
        }catch(Exception e)
        {
        }
        return number;
    }

    

}
