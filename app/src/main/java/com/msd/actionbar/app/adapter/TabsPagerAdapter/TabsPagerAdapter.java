package com.msd.actionbar.app.adapter.TabsPagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.msd.actionbar.app.BoxFragment;
import com.msd.actionbar.app.OthersFragment;
import com.msd.actionbar.app.WrapsFragment;

/**
 * Created by rajatdeshpande on 3/3/14.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch(index){
            case 0:
                return new OthersFragment();
            case 1:
                return new BoxFragment();
            case 2:
                return new WrapsFragment();
            case 3:
                return new CombosFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
