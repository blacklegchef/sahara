package com.sfit.sahara.mysahara;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class junior_fifth_page_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.junior_fifth_page_home);
        Button exit = (Button) findViewById(R.id.log_out);
        TextView text = (TextView) findViewById(R.id.online_status);
        Integer online = 1;
        exit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SharedPreferences user = getSharedPreferences("UserData", MODE_PRIVATE);
                SharedPreferences.Editor edit=user.edit();
                edit.clear();
                edit.commit();
                startActivity(new Intent( junior_fifth_page_home.this,first_page.class));
            }
        });
        if (online==1)
            text.setText("Current Status: online");
        else
            text.setText("Current Status: offline");
    }

}
