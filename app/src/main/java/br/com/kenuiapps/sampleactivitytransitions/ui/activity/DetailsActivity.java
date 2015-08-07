package br.com.kenuiapps.sampleactivitytransitions.ui.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import br.com.kenuiapps.sampleactivitytransitions.R;
import br.com.kenuiapps.sampleactivitytransitions.model.Constant;
import br.com.kenuiapps.sampleactivitytransitions.model.Contact;

/**
 * Created by daniel on 07/08/15.
 */
public class DetailsActivity  extends AppCompatActivity {

    private Contact mContact;
    private TextView mName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_detail);

        mContact = Contact.getItem(getIntent().getIntExtra(Constant.ID, 0));

        mName = (TextView) findViewById(R.id.DETAILS_name);
        mName.setText(mContact.get(Contact.Field.NAME));

    }
}
