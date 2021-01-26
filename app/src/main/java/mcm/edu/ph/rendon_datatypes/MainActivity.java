package mcm.edu.ph.rendon_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);

        String firstName = "Jannella";
        char middleInitial = 'E';
        String lastName = "Rendon";
        int myAge = 18;
        float myDreamTVLGrade = 98.55f;
        double myMoney = 987.65;

        display.setText("My name is "+firstName+ " "
                +middleInitial+ " "
                +lastName+ "\nand my age is "
                +myAge+ ".\nI want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;
    }
}