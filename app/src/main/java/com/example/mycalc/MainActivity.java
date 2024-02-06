package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText fe,se;
    TextView tans;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fe= findViewById(R.id.firstNo);
        se= findViewById(R.id.secondNo);
        tans= findViewById(R.id.result);
        add= findViewById(R.id.btnAdd);
        sub= findViewById(R.id.btnSub);
        mul= findViewById(R.id.btnMul);
        div= findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long fv,sv,ans;

                fv=Integer.parseInt(fe.getText().toString());
                sv=Integer.parseInt(se.getText().toString());

                ans=fv+sv;
                tans.setText("Ans is : " + ans);

            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long fv,sv,ans;

                fv=Integer.parseInt(fe.getText().toString());
                sv=Integer.parseInt(se.getText().toString());

                ans=fv-sv;
                tans.setText("Ans is : " + ans);

            }

        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long fv,sv,ans;

                fv=Integer.parseInt(fe.getText().toString());
                sv=Integer.parseInt(se.getText().toString());

                ans=fv*sv;
                tans.setText("Ans is : " + ans);

            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long fv,sv,ans;

                fv=Integer.parseInt(fe.getText().toString());
                sv=Integer.parseInt(se.getText().toString());

                ans=fv/sv;
                tans.setText("Ans is : " + ans);

            }

        });
    }
}