package ru.mirea.rulev.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String text1 = (String) getIntent().getSerializableExtra("key");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.format("«КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ %s ,а текущее время %s",19*19,text1));
    }
}