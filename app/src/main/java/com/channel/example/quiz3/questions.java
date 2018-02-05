package com.channel.example.quiz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.channel.example.quiz3.R;

public class questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

    }
    int score=0;
    /**
     *
     * Used when to check answer for Q1
     */
    public void Q1 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        RadioButton R1= (RadioButton) findViewById(R.id.Q1A1);
        boolean a1= R1.isChecked();
        if(a1){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " point in total",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q2
     */
    public void Q2 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        CheckBox R1 = (CheckBox) findViewById(R.id.Q2A1);
        CheckBox R2 = (CheckBox) findViewById(R.id.Q2A2);
        CheckBox R3 = (CheckBox) findViewById(R.id.Q2A3);
        CheckBox R4 = (CheckBox) findViewById(R.id.Q2W);
        boolean a1 = R1.isChecked();
        boolean a2 = R2.isChecked();
        boolean a3 = R3.isChecked();
        boolean a4 = R4.isChecked();

        if((a1 & a2 & a3)== true & a4==false){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total",Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q3
     */
    public void Q3 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        CheckBox R1 = (CheckBox) findViewById(R.id.Q3A1);
        CheckBox R2 = (CheckBox) findViewById(R.id.Q3A2);
        CheckBox R3 = (CheckBox) findViewById(R.id.Q3W1);
        CheckBox R4 = (CheckBox) findViewById(R.id.Q3W2);
        boolean a1 = R1.isChecked();
        boolean a2 = R2.isChecked();
        boolean a3 = R3.isChecked();
        boolean a4 = R4.isChecked();
        if((a1 & a2) == true &  (a3 | a4) == false){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q4
     */
    public void Q4 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        CheckBox R1 = (CheckBox) findViewById(R.id.Q4A1);
        CheckBox R2 = (CheckBox) findViewById(R.id.Q4A2);
        CheckBox R3 = (CheckBox) findViewById(R.id.Q4A3);
        CheckBox R4 = (CheckBox) findViewById(R.id.Q4W);
        boolean a1 = R1.isChecked();
        boolean a2 = R2.isChecked();
        boolean a3 = R3.isChecked();
        boolean a4 = R4.isChecked();
        if((a1 & a2 & a3) == true & a4 == false){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q5
     */
    public void Q5 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        RadioButton R1= (RadioButton) findViewById(R.id.Q5A1);
        boolean a1= R1.isChecked();
        if(a1){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q6
     */
    public void Q6 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        CheckBox R1 = (CheckBox) findViewById(R.id.Q6A1);
        CheckBox R2 = (CheckBox) findViewById(R.id.Q6A2);
        CheckBox R3 = (CheckBox) findViewById(R.id.Q6A3);
        CheckBox R4 = (CheckBox) findViewById(R.id.Q6W);
        boolean a1 = R1.isChecked();
        boolean a2 = R2.isChecked();
        boolean a3 = R3.isChecked();
        boolean a4 = R4.isChecked();
        if((a1 & a2 & a3) == true & a4 == false){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q7
     */
    public void Q7 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        CheckBox R1 = (CheckBox) findViewById(R.id.Q7A1);
        CheckBox R2 = (CheckBox) findViewById(R.id.Q7A2);
        CheckBox R3 = (CheckBox) findViewById(R.id.Q7W1);
        CheckBox R4 = (CheckBox) findViewById(R.id.Q7W2);
        boolean a1 = R1.isChecked();
        boolean a2 = R2.isChecked();
        boolean a3 = R3.isChecked();
        boolean a4 = R4.isChecked();
        if((a1 & a2) == true &  (a3 | a4) == false){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q8
     */
    public void Q8 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        RadioButton R1= (RadioButton) findViewById(R.id.Q8A1);
        boolean a1= R1.isChecked();
        if(a1){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q9
     */
    public void Q9 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        RadioButton R1= (RadioButton) findViewById(R.id.Q9A1);
        boolean a1= R1.isChecked();
        if(a1){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
    /**
     *
     * Used when to check answer for Q10
     */
    public void Q10 (View v){
        //
        EditText editText = (EditText) findViewById(R.id.PlayerName);
        String name = editText.getText().toString();
        CheckBox R1 = (CheckBox) findViewById(R.id.Q10A1);
        CheckBox R2 = (CheckBox) findViewById(R.id.Q10A2);
        CheckBox R3 = (CheckBox) findViewById(R.id.Q10W1);
        CheckBox R4 = (CheckBox) findViewById(R.id.Q10W2);
        boolean a1 = R1.isChecked();
        boolean a2 = R2.isChecked();
        boolean a3 = R3.isChecked();
        boolean a4 = R4.isChecked();
        if((a1 & a2) == true &  (a3 | a4) == false){
            score++;
            Toast.makeText(this,name+" you got this one right! Good Job!"+" You got " + score+ " points in total ",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,name+" Try Again ",Toast.LENGTH_SHORT).show();
        }

    }
}
