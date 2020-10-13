package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button addButton;
    private Button subtractButton;
    private Button divideButton;
    private Button multiplyButton;
    private Button clearButton;
    private Button equalButton;
    private TextView equationText;
    private TextView resultText;
    private final char ADDITION = '+';
    private final char SUBTRACT = '-';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';
    private final char EQUAL = '=';
    private double Value1 = Double.NaN;
    private double Value2 ;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    private void bindViews()
    {
        button0 = findViewById(R.id.Number0);
        button1 = findViewById(R.id.Number1);
        button2 = findViewById(R.id.Number2);
        button3 = findViewById(R.id.Number3);
        button4 = findViewById(R.id.Number4);
        button5 = findViewById(R.id.Number5);
        button6 = findViewById(R.id.Number6);
        button7 = findViewById(R.id.Number7);
        button8 = findViewById(R.id.Number8);
        button9 = findViewById(R.id.number9);
        addButton = findViewById(R.id.addition);
        subtractButton = findViewById(R.id.subtract);
        divideButton = findViewById(R.id.divide);
        multiplyButton = findViewById(R.id.multiply);
        clearButton = findViewById(R.id.clearButton);
        equalButton = findViewById(R.id.equal);
        equationText = findViewById(R.id.ProblemText);
        resultText = findViewById(R.id.ResultText);
    }

    public void onClickSubtract(View view)
    {
        compute();
        ACTION = SUBTRACT;
        resultText.setText(String.valueOf(Value1) + "-");
        equationText.setText(null);
    }

    public void onClickEqual(View view)
    {
        compute();
        ACTION = EQUAL;
        resultText.setText(resultText.getText().toString() + String.valueOf(Value2) + "=" + String.valueOf(Value1));
        equationText.setText(null);
    }

    public void onClickClear(View view)
    {
        if(equationText.getText().length() > 0)
        {
            CharSequence equation = equationText.getText().toString();
            equationText.setText(equation.subSequence(0, equation.length()-1));
        }
        else
        {
            Value1 = Double.NaN;
            Value2 = Double.NaN;
            equationText.setText(null);
            resultText.setText(null);
        }
    }

    public void onClickAdd(View view)
    {
        compute();
        ACTION = ADDITION;
        resultText.setText(String.valueOf(Value1) + "+");
        equationText.setText(null);
    }

    public void OnclickMultiply(View view)
    {
        compute();
        ACTION = MULTIPLY;
        resultText.setText(String.valueOf(Value1) + "*");
        equationText.setText(null);
    }

    public void OnclickDivide(View view)
    {
        compute();
        ACTION = DIVIDE;
        resultText.setText(String.valueOf(Value1) + "/");
        equationText.setText(null);
    }

    public void addZero(View view)
    {
        equationText.setText(equationText.getText().toString() + "0");
    }

    public void addOne(View view)
    {
        equationText.setText(equationText.getText().toString() + "1");
    }

    public void addTwo(View view)
    {
        equationText.setText(equationText.getText().toString() + "2");
    }

    public void addThree(View view)
    {
        equationText.setText(equationText.getText().toString() + "3");
    }

    public void addFour(View view)
    {
        equationText.setText(equationText.getText().toString() + "4");
    }

    public void addFive(View view)
    {
        equationText.setText(equationText.getText().toString() + "5");
    }

    public void addSix(View view)
    {
        equationText.setText(equationText.getText().toString() + "6");
    }

    public void addSeven(View view)
    {
        equationText.setText(equationText.getText().toString() + "7");
    }

    public void addEight(View view)
    {
        equationText.setText(equationText.getText().toString() + "8");
    }

    public void addNine(View view)
    {
        equationText.setText(equationText.getText().toString() + "9");
    }

    private void compute()
    {
        if(!Double.isNaN(Value1))
        {
            Value2 = Double.parseDouble(equationText.getText().toString());

            switch(ACTION)
            {
                case ADDITION:
                    Value1 =   Value1 + Value2;
                    break;
                case SUBTRACT:
                    Value1 = Value1 - Value2;
                    break;
                case MULTIPLY:
                    Value1 = Value1 * Value2;
                    break;
                case DIVIDE:
                    Value1 = Value1 / Value2;
                    break;
                case EQUAL:
                    break;

            }
        }
        else
        {
            Value1 = Double.parseDouble(equationText.getText().toString());
        }
    }
}