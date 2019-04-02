package jagriti.android.com.moduleFive;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import jagriti.android.com.R;

public class DatePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
    }

    public void showDates(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }
    public void processDates(int year, int month, int days){
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(days);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +"/" + day_string + "/" + year_string);
        Toast.makeText(this, "Date: " + dateMessage,Toast.LENGTH_SHORT).show();
    }
    public void showTime(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"timePicker");
    }
    public void processTimes(int hour, int min, int sec){
        String hours = Integer.toString(hour);
        String minutes = Integer.toString(min);
        String seconds = Integer.toString(sec);
        String times  = hours+":"+minutes+":"+seconds;
        Toast.makeText(this,"Time - "+times,Toast.LENGTH_SHORT).show();

    }
}
