package com.examples.trains;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Map<String,String> DepTrain1 = new HashMap<>();
        final Map<String, String> ArrTrain1 = new HashMap<>();
        final Map<String, String> DepTrain2 = new HashMap<>();
        final Map<String, String> ArrTrain2 = new HashMap<>();
        final Map<String, String> DepTrain3 = new HashMap<>();
        final Map<String, String> ArrTrain3 = new HashMap<>();

        DepTrain1.put("Montpellier", "10h00");
        ArrTrain1.put("Lyon", "13:30");
        DepTrain1.put("Lyon", "14h30");
        ArrTrain1.put("Paris", "16h30");

        DepTrain2.put("Montpellier", "13h00");
        ArrTrain2.put("Lyon", "15h00");
        DepTrain2.put("Lyon", "16h00");
        ArrTrain2.put("Paris", "18h00");

        DepTrain3.put("Montpellier", "18h00");
        ArrTrain3.put("Lyon", "20h30");
        DepTrain3.put("Lyon", "20h35");
        ArrTrain3.put("Paris", "22h00");


        ImageButton b = (ImageButton) findViewById(R.id.rechercher);

        final EditText villeDep =  (EditText) this.findViewById(R.id.dep);
        final EditText villeArr = (EditText) this.findViewById(R.id.arr);

        final EditText dep1 = (EditText) this.findViewById(R.id.Dep1);
        final EditText dep2 = (EditText) this.findViewById(R.id.Dep2);
        final EditText dep3 = (EditText) this.findViewById(R.id.Dep3);

        final EditText arr1 = (EditText) this.findViewById(R.id.Arr1);
        final EditText arr2 = (EditText) this.findViewById(R.id.Arr2);
        final EditText arr3 = (EditText) this.findViewById(R.id.Arr3);



        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                dep1.setText(DepTrain1.get(String.valueOf(villeDep.getText())));
                arr1.setText(ArrTrain1.get(String.valueOf(villeArr.getText())));


                dep2.setText(DepTrain2.get(String.valueOf(villeDep.getText())));
                arr2.setText(ArrTrain2.get(String.valueOf(villeArr.getText())));

                dep3.setText(DepTrain3.get(String.valueOf(villeDep.getText())));
                arr3.setText(ArrTrain3.get(String.valueOf(villeArr.getText())));


            }
        });

    }
}