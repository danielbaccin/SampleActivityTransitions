package br.com.kenuiapps.sampleactivitytransitions.ui.fragment;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * Created by daniel on 07/08/15.
 */
public class SearchFragment extends Fragment {

    public static SearchFragment newInstance(){
        return new SearchFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
