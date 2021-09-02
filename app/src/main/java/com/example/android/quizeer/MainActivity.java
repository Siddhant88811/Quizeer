package com.example.android.quizeer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private final String[] Question={" Q.1 ->Java Is Object Oriented Programming Language? ","Q.2 -> Java is Used In Android Development ",
     "Q.3 -> Java Can be Used As Backend Language In Web Development? ","Q.4 -> Does Java is Similar To Python Language? ",
     "Q.5 -> Java Has Collection Framework? ","Q.6 ->Initially Java Was Named as OAK? ","Q.7 -> In Java Strings are Immutable? ","Q.8 -> Java Was Originally Developed by James Gosling? ","Q.9 -> Java Was Released In 1992? ",
     "Q.10 -> Java was originally designed for embedded network applications running on multiple platforms.? "};
     private final boolean[] answer={true,true,true,false,true,true,true,true,true,true};
     private int index=0;
     private int score=0;
     Button yes;
     Button no;
     TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.TRUE);
        no=findViewById(R.id.FALSE);
        question=findViewById(R.id.question);
        question.setText(Question[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=Question.length-1) {
                    if (answer[index]) {
                        score++;
                    }
                    index++;
                    if (index <= Question.length-1) {
                        question.setText(Question[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "YOUR SCORE IS = "+ score + "/"+Question.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "RESTART THE APP TO PLAY AGAIN!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=Question.length-1) {
                    if (!answer[index]) {
                        score++;
                    }
                    index++;
                    if (index <= Question.length-1) {
                        question.setText(Question[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "YOUR SCORE IS = "+ score + "/"+Question.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "RESTART THE APP TO PLAY AGAIN!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}