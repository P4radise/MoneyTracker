package com.loftschool.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TempActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText number = (EditText) findViewById(R.id.number);
        final TextView add = (TextView) findViewById(R.id.add);

        TextWatcher collectingTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                add.setEnabled(!TextUtils.isEmpty(name.getText()) && !TextUtils.isEmpty(number.getText()));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        };
        name.addTextChangedListener(collectingTextWatcher);
        number.addTextChangedListener(collectingTextWatcher);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
