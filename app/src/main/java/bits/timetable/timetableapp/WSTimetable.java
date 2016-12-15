package bits.timetable.timetableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class WSTimetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wstimetable);

        Spinner dropdown1 = (Spinner)findViewById(R.id.spinner1);
        String[] items1 = new String[]{"WS 1", "WS 2", "WS 3","WS 4","WS 5","WS 6","WS 7","WS 8","WS 9","WS 10","WS 11","WS 12","WS 13","WS 14","WS 15","WS 16","WS 17","WS 18","WS 19","WS 20","WS 21","WS 22","WS 23","WS 24"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        dropdown1.setAdapter(adapter1);


    }
}
