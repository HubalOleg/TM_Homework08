package oleg.hubal.com.tm_homework08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

import oleg.hubal.com.tm_homework08.Models.Person;
import oleg.hubal.com.tm_homework08.Support.Constants;

public class MainActivity extends AppCompatActivity implements PersonManager {
    private RecyclerView personRecyclerView;
    private RecyclerView.Adapter personAdapter;
    private ArrayList<Person> persons;
    private String firstName, lastName, gender, age, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persons = new ArrayList<>();
        setRecycleView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.btn_add:
                Intent intent = new Intent(this, NewPersonActivity.class);
                startActivityForResult(intent, Constants.REQUEST_CODE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void addPerson() {
        Person person = new Person(firstName, phoneNumber);
        person.setLastName(lastName);
        person.setGender(gender);
        person.setAge(age);

        persons.add(person);
        personAdapter.notifyItemInserted(persons.size() - 1);
    }

    @Override
    public void delPerson(int position) {
        persons.remove(position);
        personAdapter.notifyItemRemoved(position);
    }

    @Override
    protected void onActivityResult(int requstCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK) {
            firstName = data.getStringExtra("firstName");
            lastName = data.getStringExtra("lastName");
            gender = data.getStringExtra("gender");
            age = data.getStringExtra("age");
            phoneNumber = data.getStringExtra("phoneNumber");
            addPerson();
        }
    }

    private void setRecycleView() {
        personRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_AM);
        personRecyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        personRecyclerView.setLayoutManager(layoutManager);

        personAdapter = new PersonAdapter(persons, this);
        personRecyclerView.setAdapter(personAdapter);
    }
}
