package com.arthur.lib;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * 日志打印
 *
 * @author XGY
 * @date 2019/1/31 14:48
 */
public class LogUtils {

    /**
     * DES: TAG
     */
    private static final String TAG = "LogUtils";

    /**
     * DES: 错误
     * TIME: 2019/1/31 14:49
     */
    public static void e(@NonNull String msg){
        // DES: 打印
        Log.e(TAG, msg);
    }

    /**
     * DES: debug
     * TIME: 2019/1/31 14:50
     */
    public static void d(@NonNull String msg){
        // DES: 打印
        Log.d(TAG, msg);
    }
}
