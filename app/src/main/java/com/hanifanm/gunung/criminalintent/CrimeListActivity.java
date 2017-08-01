package com.hanifanm.gunung.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by hanifan on 6/14/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
