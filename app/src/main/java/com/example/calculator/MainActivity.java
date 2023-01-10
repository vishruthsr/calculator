package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button nine,eight,seven,six,five,four,three,two,one,zero,plus,sub,mul,div,equals,clear;
    EditText res;
    String operatorPressed=" ";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nine=findViewById(R.id.nine);
        eight=findViewById(R.id.eight);
        seven=findViewById(R.id.seven);
        six=findViewById(R.id.six);
        five=findViewById(R.id.five);
        four=findViewById(R.id.four);
        three=findViewById(R.id.three);
        two=findViewById(R.id.two);
        one=findViewById(R.id.one);
        zero=findViewById(R.id.zero);
        plus=findViewById(R.id.plus);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        equals=findViewById(R.id.equals);
        res=findViewById(R.id.result);
        clear=findViewById(R.id.clear);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        plus.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        equals.setOnClickListener(this);
        clear.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.nine:res.append("9");break;
            case R.id.eight:res.append("8");break;
            case R.id.seven:res.append("7");break;
            case R.id.six:res.append("6");break;
            case R.id.five:res.append("5");break;
            case R.id.four:res.append("4");break;
            case R.id.three:res.append("3");break;
            case R.id.two:res.append("2");break;
            case R.id.one:res.append("1");break;
            case R.id.zero:res.append("0");break;
            case R.id.clear:res.setText(" ");break;
            case R.id.plus:res.append("+");operatorPressed="+";break;
            case R.id.sub:res.append("-");operatorPressed="-";break;
            case R.id.mul:res.append("*");operatorPressed="*";break;
            case R.id.div:res.append("/");operatorPressed="/";break;
            case R.id.equals:
                double finalRes=compute(res.getText().toString(),operatorPressed);
                res.setText(String.valueOf(finalRes));
        }
    }
    private double compute(String res, String operatorPressed) {
        String mArray[]=res.split("\\+|-|\\*|\\/|\\%");
        double op1=Double.parseDouble(mArray[0]);
        double op2=Double.parseDouble(mArray[1]);
        switch(operatorPressed){
            case"+":return op1+op2;
            case"-":return op1-op2;
            case"*":return op1*op2;
            case"/":return op1/op2;
            case"%":return op1%op2;
        }
        return 0.0;
    }
}