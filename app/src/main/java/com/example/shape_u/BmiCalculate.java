package com.example.shape_u;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiCalculate extends AppCompatActivity {

    private EditText editText_weight,editText_height;
    private Button button_calculate;
    private TextView textView_result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculate);

        /*getSupportActionBar().hide();*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText_height=findViewById(R.id.et_height);
        editText_weight=findViewById(R.id.et_weight);
        /*textView_result=findViewById(R.id.tv_result);*/
        button_calculate=findViewById(R.id.btn_calculate);



        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bmi();

            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void bmi()
    {
        float weight,height,result;

        weight=Float.parseFloat(editText_weight.getText().toString());
        height=Float.parseFloat(editText_height.getText().toString())/100;

        result=weight/(height*height);
        /* textView_result.setText("" +result);*/

        if(result<=18.8)
        {

            Intent intent = new Intent(BmiCalculate.this, Ok.class);
            startActivity(intent);

            /*LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast,
                    (ViewGroup) findViewById(R.id.toast_layout_root));

            TextView text = (TextView) layout.findViewById(R.id.text);

            Toast toast = new Toast(getApplicationContext());
            text.setText("You are underweight");
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();*/

            //Toast.makeText(getApplicationContext(),"You are underweight",Toast.LENGTH_LONG).show();

        }else if(result>=18.8 && (result<25))
        {

            Intent intent = new Intent(BmiCalculate.this, Standerd.class);
            startActivity(intent);

            /*LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast,
                    (ViewGroup) findViewById(R.id.toast_layout_root));

            TextView text = (TextView) layout.findViewById(R.id.text);

            Toast toast = new Toast(getApplicationContext());
            text.setText("You are normal");
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();*/

            //Toast.makeText(getApplicationContext(),"You are Normal",Toast.LENGTH_SHORT).show();




        }else if(result>25)
        {

            Intent intent = new Intent(BmiCalculate.this, Overwight.class);
            startActivity(intent);


           /* LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast,
                    (ViewGroup) findViewById(R.id.toast_layout_root));

            TextView text = (TextView) layout.findViewById(R.id.text);

            Toast toast = new Toast(getApplicationContext());
            text.setText("You are Overweight");
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();*/

            //Toast.makeText(getApplicationContext(),"You are Overweight",Toast.LENGTH_SHORT).show();

        }



    }

}
