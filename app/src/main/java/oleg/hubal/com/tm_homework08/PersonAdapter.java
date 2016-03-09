package oleg.hubal.com.tm_homework08;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import oleg.hubal.com.tm_homework08.Models.Person;

/**
 * Created by User on 09.03.2016.
 */
public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> implements View.OnClickListener {
    private List<Person> persons;
    private PersonManager personManager;

    public PersonAdapter(List<Person> persons, PersonManager personManager) {
        this.persons = persons;
        this.personManager = personManager;
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.person_card, viewGroup,
                false);
        PersonViewHolder personViewHolder = new PersonViewHolder(v);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(persons.get(i).getFirstName());
    }

    @Override
    public void onClick(View v) {

    }
}
