package oleg.hubal.com.tm_homework08;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import oleg.hubal.com.tm_homework08.Support.MyValidator;

/**
 * Created by User on 09.03.2016.
 */
public class NewPersonActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText etFirstName, etLastName, etGender;
    private EditText etAge, etPhoneNumber;
    private Button btnCreate;
    private Intent intent;

    private String firstName, lastName, gender, age, phoneNumber;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_person);

        initViews();
    }

    private void initViews() {
        etFirstName = (EditText) findViewById(R.id.et_first_name_ANP);
        etLastName = (EditText) findViewById(R.id.et_last_name_ANP);
        etGender = (EditText) findViewById(R.id.et_gender_ANP);
        etAge = (EditText) findViewById(R.id.et_age_ANP);
        etPhoneNumber = (EditText) findViewById(R.id.et_phone_number_ANP);

        btnCreate = (Button) findViewById(R.id.btn_create);
        btnCreate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        readFields();
        if (!MyValidator.isEmptyNamePhone(this, firstName, phoneNumber)) {
            switch (v.getId()) {
                case R.id.btn_create:
                    putExtras();
                    setResult(RESULT_OK, intent);
                    finish();
                default:
                    setResult(RESULT_CANCELED);
                    break;
            }
        }
    }

    private void putExtras() {
        intent = new Intent();
        intent.putExtra("firstName", firstName);
        intent.putExtra("phoneNumber", lastName);
//        if(!gender.isEmpty())
            intent.putExtra("gender", gender);
//        if(!age.isEmpty())
            intent.putExtra("age", age);
//        if(!lastName.isEmpty())
            intent.putExtra("lastName", lastName);
    }

    private void readFields() {
        firstName = etFirstName.getText().toString();
        lastName = etLastName.getText().toString();
        gender = etGender.getText().toString();
        age = etAge.getText().toString();
        phoneNumber = etPhoneNumber.getText().toString();
    }
}
