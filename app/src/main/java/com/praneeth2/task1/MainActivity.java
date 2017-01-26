package com.praneeth2.task1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartActivity = (Button) findViewById(R.id.start_button);

        mStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = MainActivity.this;
                Class destinationActivity = Activity2.class;

                Intent startActivity2 = new Intent(context, destinationActivity);

                startActivity(startActivity2);

            }
        });

    }

}
