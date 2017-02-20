package com.example.mauricio.calculadora_constraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView salida;
    int operandoA;
    int operandoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salida = (TextView) findViewById(R.id.textView);

    }

    public void onClick7(View view) {
        salida.setText(salida.getText().toString() + "7");
    }

    public void onClick8(View view) {
        salida.setText(salida.getText().toString() + "8");
    }

    public void onClick9(View view) {
        salida.setText(salida.getText().toString() + "9");
    }

    public void onClick4(View view) {
        salida.setText(salida.getText().toString() + "4");
    }

    public void onClick5(View view) {
        salida.setText(salida.getText().toString() + "5");
    }

    public void onClick6(View view) {
        salida.setText(salida.getText().toString() + "6");
    }

    public void onClick1(View view) {
        salida.setText(salida.getText().toString() + "1");
    }

    public void onClick2(View view) {
        salida.setText(salida.getText().toString() + "2");
    }

    public void onClick3(View view) {
        salida.setText(salida.getText().toString() + "3");
    }

    public void onClickPLUS(View view) {
        salida.setText(salida.getText().toString() + "+");
    }

    public void onClick0(View view) {
        salida.setText(salida.getText().toString() + "0");
    }

    public void onClickEQUALS(View view) {
    }

    public void onClickDIV(View view) {
        salida.setText(salida.getText().toString() + "/");
    }

    public void onClickClear(View view) {
        salida.setText("");
    }
}
