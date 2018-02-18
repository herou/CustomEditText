package com.example.eljoprifti;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Eljo on 2/17/2018.
 */

public class EljoPriftiEditText extends android.support.v7.widget.AppCompatEditText{

    static Util util;

    public EljoPriftiEditText(Context context) {
        super(context);
        util = new Util();
    }

    public EljoPriftiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EljoPriftiEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static void init(final EljoPriftiEditText edt,final ViewGroup viewGroup, final int initWidth, final int initHeight, final int transitWidth, final int transitHeight){
        edt.setOnFocusChangeListener(new OnFocusChangeListener() {
            @SuppressLint("NewApi")
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    TransitionManager.beginDelayedTransition(viewGroup);
                    edt.setWidth(util.dpToPx(transitWidth));
                    edt.setHeight(util.dpToPx(transitHeight));
                } else {
                    TransitionManager.beginDelayedTransition(viewGroup);
                    edt.setWidth(util.dpToPx(initWidth));
                    edt.setHeight(util.dpToPx(initHeight));
                }
            }
        });
    }

}
