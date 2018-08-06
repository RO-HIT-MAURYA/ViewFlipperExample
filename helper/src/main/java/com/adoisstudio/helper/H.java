package com.adoisstudio.helper;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by amitkumar on 05/01/18.
 */

public class H {

    public final static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    //Documents on http://www.adoisstudio.com/android/helper/log
    public static void log(String tag, String msg) {

        if (!Static.show_log)
            return;

        StackTraceElement[] stackTraceElement = Thread.currentThread()
                .getStackTrace();
        int currentIndex = -1;
        for (int i = 0; i < stackTraceElement.length; i++) {
            if (stackTraceElement[i].getMethodName().compareTo("log") == 0) {
                currentIndex = i + 1;
                break;
            }
        }

        String fullClassName = stackTraceElement[currentIndex].getClassName();
        String className = fullClassName.substring(fullClassName
                .lastIndexOf(".") + 1);
        String methodName = stackTraceElement[currentIndex].getMethodName();
        String lineNumber = String
                .valueOf(stackTraceElement[currentIndex].getLineNumber());

        Log.e(tag, msg + " : " + className + "." + methodName + "(" + className + ".java:" + lineNumber + ")");
        //Log.e(tag, msg);
    }//log

    public static double getDouble(String val) {

        try {
            return Double.parseDouble(val);
        } catch (Exception ex) {
            return 0;
        }
    }

    public static void showMessage(Context context, String msg) {
        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 200);
        toast.show();
    }
}
