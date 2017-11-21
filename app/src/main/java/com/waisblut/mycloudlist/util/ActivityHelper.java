package com.waisblut.mycloudlist.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.waisblut.mycloudlist.R;

public class ActivityHelper extends AppCompatActivity {

    public static void setFragment(FragmentManager fm, int from, android.support.v4.app.Fragment to) {
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(from, to);
        fragmentTransaction.commit();
    }

    public static void useSnackBar(View v, String message, int lenght) {
        Snackbar snackbar = Snackbar
                .make(v, message, Snackbar.LENGTH_LONG);

        snackbar.show();
    }

    public static void useToast(Context context, String message, int lenght) {
        Toast.makeText(context, message, lenght).show();
    }

    public static void setFullscreen(AppCompatActivity a) {
        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
        hideKeyboard(a);
        a.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setPortraitScreen(a);
    }

    public static void setPortraitScreen(AppCompatActivity a) {
        a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public static AnimationDrawable setBGAnimation(RelativeLayout relativeLayout, int i) {
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(i);
        animationDrawable.setExitFadeDuration(i);

        return animationDrawable;
    }

    public static void hideKeyboard(Activity a) {
        //InputMethodManager inputManager = (InputMethodManager)
        //        a.getSystemService(Context.INPUT_METHOD_SERVICE);

        a.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    public static void setActionBarTitle(FragmentActivity a, String s) {
        a.getActionBar().setTitle(s);
    }

    public static void animate(Context c, AnimationSet a, int duration, int animationId) {
        Animation animation = AnimationUtils.loadAnimation(c, animationId);
        animation.setDuration(duration);
        a.addAnimation(animation);
    }

    public static void setUpFabAnimation(Context c, FloatingActionButton fab) {
        fab.setAlpha(0f);

        AnimationSet a = new AnimationSet(true);

        //ActivityHelper.animate(c, a, 1000, R.anim.roll);
        //ActivityHelper.animate(c, a, 1500, R.anim.fade_in);
        //ActivityHelper.animate(c, a, 1000, R.anim.slide);

        fab.startAnimation(a);
        fab.animate().alpha(1.0f);
    }
}
