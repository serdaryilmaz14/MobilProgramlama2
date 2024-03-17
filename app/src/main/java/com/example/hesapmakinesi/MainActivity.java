package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected EditText islemEditText;
    protected TextView sonucTextView;

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,
            button9,buttonTopla,buttonCikar,buttonCarp,buttonBol,buttonSil,
            buttonEsittir,buttonNokta,buttonYuzde;
    float deger1,deger2;
    boolean Toplama,Cikarma,Carpma,Bolme,Yuzde;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 =findViewById(R.id.button0);
        button1 =findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);
        button3 =findViewById(R.id.button3);
        button4 =findViewById(R.id.button4);
        button5 =findViewById(R.id.button5);
        button6 =findViewById(R.id.button6);
        button7 =findViewById(R.id.button7);
        button8 =findViewById(R.id.button8);
        button9 =findViewById(R.id.button9);

        buttonTopla=findViewById(R.id.buttonTopla);
        buttonCikar=findViewById(R.id.buttonCikar);
        buttonCarp =findViewById(R.id.buttonCarp);
        buttonBol= findViewById(R.id.buttonbol);
        buttonNokta=findViewById(R.id.buttonNokta);
        buttonYuzde=findViewById(R.id.buttonYuzde);
        buttonSil = findViewById(R.id.buttonSil);
        buttonEsittir= findViewById(R.id.buttonEsittir);


        islemEditText=findViewById(R.id.Islem);
        sonucTextView=findViewById(R.id.Sonuc);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"0");
                sonucTextView.setText(sonucTextView.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"1");
                sonucTextView.setText(sonucTextView.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"2");
                sonucTextView.setText(sonucTextView.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"3");
                sonucTextView.setText(sonucTextView.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"4");
                sonucTextView.setText(sonucTextView.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"5");
                sonucTextView.setText(sonucTextView.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"6");
                sonucTextView.setText(sonucTextView.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"7");
                sonucTextView.setText(sonucTextView.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"8");
                sonucTextView.setText(sonucTextView.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+"9");
                sonucTextView.setText(sonucTextView.getText()+"9");
            }
        });
        buttonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (islemEditText == null){
                    islemEditText.setText("");

                }else {
                    sonucTextView.setText(sonucTextView.getText()+"+");
                    deger1 = Float.parseFloat(islemEditText.getText()+"");
                    Toplama = true;
                    islemEditText.setText(null);

                }
            }
        });
        buttonCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucTextView.setText(sonucTextView.getText()+"-");
                deger1 = Float.parseFloat(islemEditText.getText() + "");
                Cikarma = true ;
                islemEditText.setText(null);
            }
        });
        buttonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucTextView.setText(sonucTextView.getText()+"*");
                deger1 = Float.parseFloat(islemEditText.getText() + "");
                Carpma  = true ;
                islemEditText.setText(null);
            }
        });

        buttonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucTextView.setText(sonucTextView.getText()+"/");
                deger1 = Float.parseFloat(islemEditText.getText()+"");
                Bolme = true ;
                islemEditText.setText(null);
            }
        });
        buttonYuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonucTextView.setText(sonucTextView.getText()+"%");
                deger1=Float.parseFloat(islemEditText.getText()+"");
                Yuzde = true ;
                islemEditText.setText(null);

            }
        });

        buttonEsittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger2 = Float.parseFloat(islemEditText.getText() + "");

                if (Toplama == true){

                    islemEditText.setText(deger1 + deger2 +"");
                    Toplama=false;
                }


                if (Cikarma == true){
                    islemEditText.setText(deger1 - deger2+"");
                    Cikarma=false;
                }

                if (Carpma == true){
                    islemEditText.setText(deger1 * deger2+"");
                    Carpma =false;
                }

                if (Bolme == true){
                    islemEditText.setText(deger1 / deger2+"");
                    Bolme=false;
                }
                if (Yuzde == true){
                    islemEditText.setText((deger1/100)*deger2+"");
                    Yuzde=false;
                }
            }
        });


        buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText("");
                sonucTextView.setText("");
            }
        });

        buttonNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEditText.setText(islemEditText.getText()+".");
                sonucTextView.setText(sonucTextView.getText()+".");
            }
        });



    }
}