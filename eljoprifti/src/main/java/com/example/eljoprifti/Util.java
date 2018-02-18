package com.example.eljoprifti;

import android.content.res.Resources;

/**
 * Created by Eljo on 2/17/2018.
 */

public class Util {

    public Util() {
    }

    public static int dpToPx(int dp)
    {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }
}
