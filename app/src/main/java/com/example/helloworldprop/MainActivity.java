package com.example.helloworldprop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumTextEdit);
                EditText SecNumEditText = (EditText) findViewById(R.id.SecNumTextEdit);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(SecNumEditText.getText().toString());
                int result = num1 + num2;
                ResultTextView.setText(result + "");
            }

        });
    }
}
