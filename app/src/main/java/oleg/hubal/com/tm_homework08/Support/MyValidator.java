package oleg.hubal.com.tm_homework08.Support;

import android.content.Context;
import android.widget.Toast;

import oleg.hubal.com.tm_homework08.R;

/**
 * Created by User on 09.03.2016.
 */
public class MyValidator {

    static public boolean isEmptyNamePhone(Context context ,String name, String phone) {
        if(name.isEmpty() || phone.isEmpty()) {
            Toast.makeText(context, R.string.fields_is_empty, Toast.LENGTH_LONG).show();
            return true;
        } else return false;
    }

}
