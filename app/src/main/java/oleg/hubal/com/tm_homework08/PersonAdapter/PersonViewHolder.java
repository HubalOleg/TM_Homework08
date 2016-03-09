package oleg.hubal.com.tm_homework08.PersonAdapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import oleg.hubal.com.tm_homework08.R;


/**
 * Created by User on 09.03.2016.
 */
public class PersonViewHolder extends RecyclerView.ViewHolder {
    private CardView personCard;
    public TextView personName;
    public Button delPerson;

    PersonViewHolder(View itemView) {
        super(itemView);
        personCard = (CardView) itemView.findViewById(R.id.card_view_PC);
        personName = (TextView) itemView.findViewById(R.id.tv_person_name);
        delPerson = (Button) itemView.findViewById(R.id.btn_del_person);
    }
}
