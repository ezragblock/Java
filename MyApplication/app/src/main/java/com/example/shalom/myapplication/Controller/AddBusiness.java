package com.example.shalom.myapplication.Controller;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.shalom.myapplication.R;
import com.example.shalom.myapplication.model.datasource.CustomContentProvider;
import com.example.shalom.myapplication.model.entities.Address;
import com.example.shalom.myapplication.model.entities.Business;

public class AddBusiness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_business);
        Button createBusinessBtn = (Button)findViewById(R.id.createBusiness);
        createBusinessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Address address = new Address(
                        ((EditText) findViewById(R.id.state)).getText().toString()
                        ,((EditText) findViewById(R.id.city)).getText().toString()
                        ,((EditText) findViewById(R.id.street)).getText().toString());

                Business newBusiness = new Business(
                        Integer.parseInt(((EditText) findViewById(R.id.ID)).getText().toString())
                        ,((EditText) findViewById(R.id.name)).getText().toString()
                        ,address
                        ,((EditText) findViewById(R.id.telephoneNumber)).getText().toString()
                        ,((EditText) findViewById(R.id.email)).getText().toString()
                        ,((EditText) findViewById(R.id.website)).getText().toString());
                //add to content provider
                ContentValues values = new ContentValues();
                values.put("id",newBusiness.getId());
                values.put("name",newBusiness.getName());
                values.put("state",address.state);
                values.put("city",address.city);
                values.put("street",address.street);
                values.put("telephoneNumber",newBusiness.getTelephoneNumber());
                values.put("email",newBusiness.getEmail());
                values.put("websiteAddress",newBusiness.getWebsiteAddress());
                Uri uri = Uri.parse("content://" + CustomContentProvider.PROVIDER_NAME + "/businesses");
                getContentResolver().insert(uri,values);
            }
        });
    }

}
