package services;

import Utils.Base;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;

/**
 * This is a utility class which helps to write UI logs for debug reasons.
 * The logs will be written only if the flag 'UidDebugLog' in the env.properties is set to true.
 */
public class UIDebugLogger {

    public static final String INFO = "Info";
    public static final String WARNING = "Warning";
    public static final String ERROR = "Error";
    private static final String SYMBOL = "\u2666";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static final Logger log4j = Logger.getLogger(UIDebugLogger.class);

    public static final boolean isUiDebugLogEnable = Base.isUiDebugLogEnable;

    public static void fillElementAddActionToLog(String logSevirity, Field field, WebElement element ) throws IllegalArgumentException, IllegalAccessException
    {
        if (isUiDebugLogEnable) {
            String msg = SYMBOL + ANSI_BLUE +  " Insert text:<" + field.get(element).toString() + "> into <" + field + ">" +ANSI_RESET;
            addMsgToLog(logSevirity, msg);
        }
    }


    public static void selectElementfromListAddActionToLog (String logSevirity, Field field, WebElement element ) throws IllegalArgumentException, IllegalAccessException
    {
        if (isUiDebugLogEnable) {
            String msg = SYMBOL + ANSI_BLUE + " select option:<" + field.get(element).toString() + "> in <" + field + ">" +ANSI_RESET;
            addMsgToLog(logSevirity, msg);
        }
    }

    public static void fillTagsAddToActionLog (String logSevirity, String labelName,Field field, WebElement element ) throws IllegalArgumentException, IllegalAccessException
    {
        if (isUiDebugLogEnable) {
            String msg = SYMBOL + ANSI_BLUE +  " Adding Tag: <" + labelName + "> into <" + field + ">" + ANSI_RESET;
            addMsgToLog(logSevirity, msg);
        }
    }

    public static void fillDateElementAddActionToLog (String logSevirity, Field field, WebElement element) throws IllegalArgumentException, IllegalAccessException
    {
        if (isUiDebugLogEnable) {
            String msg = SYMBOL + ANSI_BLUE + " Set Date: <" + field.get(element).toString() + "> into <" + field + ">" +ANSI_RESET;
            addMsgToLog(logSevirity, msg);
        }
    }

    public static void selectImageFromImagesLiberyAddActionToLog(String logSevirity,WebElement element)
    {
        if (isUiDebugLogEnable) {
            String msg = SYMBOL + ANSI_BLUE + " Select image" + ANSI_RESET;
            addMsgToLog(logSevirity, msg);
        }
    }

    public static void clickElementAddActionToLog(String logSevirity, Field field, WebElement element ) throws IllegalArgumentException, IllegalAccessException
    {
        if (isUiDebugLogEnable) {
            String msg = SYMBOL + ANSI_BLUE +  " Click element: <" + field.get(element).toString() + ">" +ANSI_RESET;
            addMsgToLog(logSevirity, msg);
        }
    }



    public static void waitClickElementAddActionToLog(String logSevirity, Field field)
    {
        if (isUiDebugLogEnable) {
            String msg = SYMBOL + ANSI_BLUE +  " Click element: <" + field.toString() + ">" + ANSI_RESET;
            addMsgToLog(logSevirity, msg);
        }
    }


    public static void addMsgToLog(String logSevirity,String msg)
    {
        switch (logSevirity) {

            case INFO:
                log4j.info (msg);
                break;
            case WARNING:
                log4j.warn (msg);
                break;
            case ERROR:
                log4j.error(msg);
                break;
            default:
                log4j.warn ("UNKNOWN MSG LOG SEVIRITY! " + msg);
        }
    }
}
