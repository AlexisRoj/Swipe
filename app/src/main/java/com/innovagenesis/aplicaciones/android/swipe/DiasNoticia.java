package com.innovagenesis.aplicaciones.android.swipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Alexis on 3/10/2016.
 */

public class DiasNoticia extends FragmentPagerAdapter {
    public DiasNoticia(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new ProgramacionAyer();
        }
        if (position == 1){
            return new ProgramacionHoy();
        }
        else{
            return new ProgramacionManana();
        }

    }
}
