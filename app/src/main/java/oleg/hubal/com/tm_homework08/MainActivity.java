package oleg.hubal.com.tm_homework08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import oleg.hubal.com.tm_homework08.Models.Person;

public class MainActivity extends AppCompatActivity implements PersonManager {
    private RecyclerView personRecyclerView;
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persons = new ArrayList<>();

        setTestPersons();
        setRecycleView();
    }

    private void setRecycleView() {
        personRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_AM);
        personRecyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        personRecyclerView.setLayoutManager(layoutManager);

        PersonAdapter adapter = new PersonAdapter(persons, this);
        personRecyclerView.setAdapter(adapter);
    }

    private void setTestPersons() {
        persons.add(new Person("Oleg", "123123123"));
        persons.add(new Person("Vanya", "126433423"));
        persons.add(new Person("Igor", "16756643"));
    }
}
