package br.com.kenuiapps.sampleactivitytransitions.ui.fragment;

import android.app.Fragment;

import br.com.kenuiapps.sampleactivitytransitions.interfaces.OnSearchListener;

/**
 * Created by daniel on 07/08/15.
 */
public class ContactFragment extends Fragment implements OnSearchListener {

    public static ContactFragment newInstance() {
        return new ContactFragment();
    }

    @Override
    public void showSearch() {

    }

    @Override
    public void hideSearch() {

    }

    @Override
    public void changedSearch(CharSequence text) {

    }
}
