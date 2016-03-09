package oleg.hubal.com.tm_homework08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by User on 10.03.2016.
 */
public class ShowPersonActivity extends Activity {

    private TextView tvFirstName, tvLastName, tvGender,
        tvAge, tvPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_person);

        tvFirstName = (TextView) findViewById(R.id.tv_first_name1);
        tvLastName = (TextView) findViewById(R.id.tv_last_name);
        tvGender = (TextView) findViewById(R.id.tv_gender);
        tvAge = (TextView) findViewById(R.id.tv_age);
        tvPhoneNumber = (TextView) findViewById(R.id.tv_phone_number);

        Intent intent = getIntent();
        tvFirstName.setText(intent.getStringExtra("firstName"));
        tvLastName.setText(intent.getStringExtra("lastName"));
        tvGender.setText(intent.getStringExtra("gender"));
        tvAge.setText(intent.getStringExtra("age"));
        tvPhoneNumber.setText(intent.getStringExtra("phoneNumber"));
    }
}
