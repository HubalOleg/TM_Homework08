package oleg.hubal.com.tm_homework08;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 09.03.2016.
 */

public class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private CardView personCard;
    private PersonManager personManager;

    public TextView personName;
    public Button delPerson;


    PersonViewHolder(View itemView, PersonManager personManager) {
        super(itemView);
        personCard = (CardView) itemView.findViewById(R.id.card_view_PC);
        personName = (TextView) itemView.findViewById(R.id.tv_person_name);
        delPerson = (Button) itemView.findViewById(R.id.btn_del_person);

        this.personManager = personManager;

        itemView.setOnClickListener(this);
        delPerson.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_del_person:
                personManager.delPerson(getAdapterPosition());
                break;
        }
    }
}
