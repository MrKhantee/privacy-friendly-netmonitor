package org.secuso.privacyfriendlynetmonitor.Activities.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.secuso.privacyfriendlynetmonitor.fragment.*;

/**
 * Created by tobias on 04.01.18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment_day tab_day = new Fragment_day();
                return tab_day;
            case 1:
                Fragment_week tab_week = new Fragment_week();
                return tab_week;
            case 2:
                Fragment_month tab_month = new Fragment_month();
                return tab_month;
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return mNumOfTabs;
    }
}
