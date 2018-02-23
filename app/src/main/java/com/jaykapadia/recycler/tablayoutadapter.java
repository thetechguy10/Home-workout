package com.jaykapadia.recycler;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tablayoutadapter extends FragmentStatePagerAdapter {
    public tablayoutadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
                    MondayLoadFragment mon = new MondayLoadFragment();
                    return mon;
           case 1:
                    TuesdayLoadFragment tues = new TuesdayLoadFragment();
                    return tues;
           case 2:
                    WednesdayLoadFragment wed = new WednesdayLoadFragment();
                    return wed;
           case 3:
                    RestLoadFragment res = new RestLoadFragment();
                    return res;
           case 4:
                    FridayLoadFragment fri = new FridayLoadFragment();
                    return fri;
           case 5:
                    SaturdayLoadFragment sat = new SaturdayLoadFragment();
                    return sat;
           case 6:
                    RestLoadFragment res1 = new RestLoadFragment();
                    return res1;

           default: return null;
       }
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Monday";
            case 1:return "Tuesday";
            case 2:return "Wednesdsy";
            case 3:return "Thursday";
            case 4:return "Friday";
            case 5:return "Saturday";
            case 6:return "Sunday";
            default: return null;
        }

    }
}
