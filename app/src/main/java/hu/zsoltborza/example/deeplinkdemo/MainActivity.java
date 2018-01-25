package hu.zsoltborza.example.deeplinkdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData = findViewById(R.id.tvData);

        if (getIntent() != null) {
            Intent intent = getIntent();
            if (intent.getExtras() != null) {
                Bundle parameters = intent.getExtras();

                String name = parameters.getString("name");
                Integer value = parameters.getInt("value");

                if (name != null && value != 0) {
                    tvData.setText("Parameters - " + " name: " + name + " " + "value: " + value);
                } else {
                    //no extras
                }
            }


        }
    }
}



