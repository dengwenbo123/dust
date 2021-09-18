package com.csgo.dust2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          Button bto=(Button) findViewById(R.id.button);
          bto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Log.i("click","onClick");
        EditText he=(EditText)findViewById(R.id.editTextNumber2) ;
        EditText we=(EditText)findViewById(R.id.editTextNumber) ;
        Float height = Float.valueOf(he.getText().toString());
        Float weight = Float.valueOf(we.getText().toString());
        TextView textView=findViewById(R.id.textView2);
        Float IMP=weight/(height*height);
        BigDecimal b=new BigDecimal(IMP);
        Float IMP_re=b.setScale(2,BigDecimal.ROUND_HALF_UP).floatValue();
        textView.setText(IMP_re.toString());


    }
}