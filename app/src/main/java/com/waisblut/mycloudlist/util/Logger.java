package com.waisblut.mycloudlist.util;

import android.util.Log;

import com.waisblut.mycloudlist.BuildConfig;


public final class Logger {
    //Project Constants
    private final static String TAG = "waisblutApplication";
    private final static String FIREBASE_ID = "GET IT DONE LATER";

    private final static boolean IS_DEBUG = BuildConfig.DEBUG;

    public enum LogType {
        VERBOSE, DEBUG, INFO, WARN, ERROR
    }

    public static String log(LogType type, String s) {
        if (IS_DEBUG) {
            switch (type) {
                case DEBUG:
                    Log.d(TAG, s);
                    break;

                case ERROR:
                    Log.e(TAG, s);
                    break;

                case INFO:
                    Log.i(TAG, s);
                    break;

                case VERBOSE:
                    Log.v(TAG, s);
                    break;

                case WARN:
                    Log.w(TAG, s);
                    break;

                default:
                    break;
            }
        }

        return s;
    }
}
