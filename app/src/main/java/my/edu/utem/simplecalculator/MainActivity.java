package my.edu.utem.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   TextView anstext;
   EditText operandOne, operandTwo;
   Double num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anstext=findViewById(R.id.answertext);
        operandOne=findViewById(R.id.operand1);
        operandTwo=findViewById(R.id.operand2);
    }


    public void buttonAdd(View view) {
        num1= Double.parseDouble(operandOne.getText().toString());
        num2= Double.parseDouble(operandTwo.getText().toString());
        anstext.setText(""+(num1+num2));

    }

    public void button_Sub(View view) {
        num1= Double.parseDouble(operandOne.getText().toString());
        num2= Double.parseDouble(operandTwo.getText().toString());
        anstext.setText(""+(num1-num2));
    }

    public void button_Div(View view) {
        num1= Double.parseDouble(operandOne.getText().toString());
        num2= Double.parseDouble(operandTwo.getText().toString());

        if(num2 ==0) {
            Toast.makeText(MainActivity.this,"Number cannot be 0",Toast.LENGTH_LONG).show();
        }
        else{
            anstext.setText(""+(num1/num2));
        }

    }

    public void button_Mul(View view) {
        num1= Double.parseDouble(operandOne.getText().toString());
        num2= Double.parseDouble(operandTwo.getText().toString());
        anstext.setText(""+(num1*num2));
    }
}
