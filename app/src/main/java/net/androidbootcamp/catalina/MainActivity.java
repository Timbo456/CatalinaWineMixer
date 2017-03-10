package net.androidbootcamp.catalina;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static net.androidbootcamp.catalina.R.string.txtTotal;
import static net.androidbootcamp.catalina.R.string.txtDimes;
import static net.androidbootcamp.catalina.R.string.txtNickles;
import static net.androidbootcamp.catalina.R.string.txtPennies;
import static net.androidbootcamp.catalina.R.string.txtQuarters;

public class MainActivity extends AppCompatActivity {
    double q = .25;
    double d= .1;
    double n= .05;
    double p= .01;
    int Nquarters;
    int Ndimes;
    int Nnickles;
    int Npennies;

    String SavingSpending;


    double t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_main);

        final EditText quarters = (EditText)findViewById(R.id.txtQuarters);
        final EditText nickles = (EditText)findViewById(R.id.txtNickles);
        final EditText dimes = (EditText)findViewById(R.id.txtDimes);
        final EditText pennies = (EditText)findViewById(R.id.txtPennies);
        final Spinner whatyoudoing = (Spinner)findViewById(R.id.txtWhatYouDoing);
        Button calculate = (Button) findViewById(R.id.txtCalculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.txtTotal));
            @Override
            public void onClick(View v) {

                Nquarters = Integer.parseInt(quarters.getText().toString());
                Ndimes = Integer.parseInt(dimes.getText().toString());
                Nnickles = Integer.parseInt(nickles.getText().toString());
                Npennies  = Integer.parseInt(pennies.getText().toString());
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                SavingSpending = whatyoudoing.getSelectedItem().toString();
                t = (( (double)Nquarters * q )+((double)Ndimes * d) + ((double)Nnickles * n)+((double)Npennies * p));
                result.setText("Your will be " + SavingSpending + "  " + t);





            }
        });





    }
}
