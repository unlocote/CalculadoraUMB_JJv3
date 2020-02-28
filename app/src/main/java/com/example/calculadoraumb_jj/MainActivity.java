package com.example.calculadoraumb_jj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView dis;
    public double num1, num2, res;
    int ope;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dis=(TextView)findViewById(R.id.display1);
    }

    public void but1 (View v){
        String cap=dis.getText().toString();
        cap=cap+"1";
        dis.setText(cap);
    }
    public void but2 (View v){
        String cap=dis.getText().toString();
        cap=cap+"2";
        dis.setText(cap);
    }
    public void but3 (View v){
        String cap=dis.getText().toString();
        cap=cap+"3";
        dis.setText(cap);
    }
    public void but4 (View v){
        String cap=dis.getText().toString();
        cap=cap+"4";
        dis.setText(cap);
    }
    public void but5 (View v){
        String cap=dis.getText().toString();
        cap=cap+"5";
        dis.setText(cap);
    }
    public void but6 (View v){
        String cap=dis.getText().toString();
        cap=cap+"6";
        dis.setText(cap);
    }
    public void but7 (View v){
        String cap=dis.getText().toString();
        cap=cap+"7";
        dis.setText(cap);
    }
    public void but8 (View v){
        String cap=dis.getText().toString();
        cap=cap+"8";
        dis.setText(cap);
    }
    public void but9 (View v){
        String cap=dis.getText().toString();
        cap=cap+"9";
        dis.setText(cap);
    }
    public void but0 (View v){
        String cap=dis.getText().toString();
        cap=cap+"0";
        dis.setText(cap);
    }
    public void butpun (View v){
        String cap=dis.getText().toString();
        cap=cap+".";
        dis.setText(cap);
    }

    public void suma (View v){
        try {
            String aux1=dis.getText().toString();
            num1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        dis.setText("");
        ope=1;
    }
    public void resta (View v){
        try {
            String aux1=dis.getText().toString();
            num1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        dis.setText("");
        ope=2;
    }
    public void multiplicacion (View v){
        try {
            String aux1=dis.getText().toString();
            num1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        dis.setText("");
        ope=3;
    }
    public void division (View v){
        try {
            String aux1=dis.getText().toString();
            num1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        dis.setText("");
        ope=4;
    }

    public void igual (View v){
        try {
            String aux2=dis.getText().toString();
            num2=Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){}
        dis.setText("");

        if(ope==1){
            res=num1+num2;
        }else if (ope==2){
            res=num1-num2;
        }else if (ope==3){
            res=num1*num2;
        }else if (ope==4){
            res=num1/num2;
        }
        dis.setText(""+res);
        num1=res;
    }
    public void clear (View v){
        dis.setText("");
        num1=0.0;
        num2=0.0;
        res=0.0;

    }

}
