package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    boolean hod = false;

    int a1 = -1;
    int a2 = -1;
    int a3 = -1;
    int b1 = -1;
    int b2 = -1;
    int b3 = -1;
    int c1 = -1;
    int c2 = -1;
    int c3 = -1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1Click);
        btn2 = findViewById(R.id.btn2Click);
        btn3 = findViewById(R.id.btn3Click);
        btn4 = findViewById(R.id.btn4Click);
        btn5 = findViewById(R.id.btn5Click);
        btn6 = findViewById(R.id.btn6Click);
        btn7 = findViewById(R.id.btn7Click);
        btn8 = findViewById(R.id.btn8Click);
        btn9 = findViewById(R.id.btn9Click);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn1.setText("X");
                    a1 = 1;
                }
                else
                {
                    btn1.setText("O");
                    a1 = 0;
                }
                btn1.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 == 0 && c2 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn2.setText("X");
                    a2 = 1;
                }
                else
                {
                    btn2.setText("O");
                    a2 = 0;
                }
                btn2.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 == 0 && c2 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn3.setText("X");
                    a3 = 1;
                }
                else
                {
                    btn3.setText("O");
                    a3 = 0;
                }
                btn3.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 == 0 && c2 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn4.setText("X");
                    b1 = 1;
                }
                else
                {
                    btn4.setText("O");
                    b1 = 0;
                }
                btn4.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0)
                        || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 == 0 && c2 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn5.setText("X");
                    b2 = 1;
                }
                else
                {
                    btn5.setText("O");
                    b2 = 0;
                }
                btn5.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 == 0 && c2 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn6.setText("X");
                    b3 = 1;
                }
                else
                {
                    btn6.setText("O");
                    b3 = 0;
                }
                btn6.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 ==
                        0 && c2 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn7.setText("X");
                    c1 = 1;
                }
                else
                {
                    btn7.setText("O");
                    c1 = 0;
                }
                btn7.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 == 0 && c2 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn8.setText("X");
                    c2 = 1;
                }
                else
                {
                    btn8.setText("O");
                    c2 = 0;
                }
                btn8.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 == 0 && c2 == 0 && c3 == 0))
                {
                    Intent intent
                            = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hod == false) {
                    btn9.setText("X");
                    c3 = 1;
                }
                else
                {
                    btn9.setText("O");
                    c3 = 0;
                }
                btn9.setClickable(false);
                if(hod == false) {
                    hod = true;
                }
                else
                    hod = false;
                if((a1 == 1 && a2 == 1 && a3 == 1) || (b1 == 1 && b2 == 1 && b3 == 1) || (c1 == 1 && c2 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b1 == 1 && c1 == 1) || (a2 == 1 && b2 == 1 && c2 == 1) || (a3 == 1 && b3 == 1 && c3 == 1))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }
                else if((a1 == 1 && b2 == 1 && c3 == 1) || (c1 == 1 && b2 == 1 && a3 == 1) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили Х");
                    startActivity(intent);
                }

                else if((a1 == 0 && a2 == 0 && a3 == 0) || (b1 == 0 && b2 == 0 && b3 == 0) || (c1 == 0 && c2 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0) || (a3 == 0 && b3 == 0 && c3 == 0))
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }
                else if((a1 == 0 && b2 == 0 && c3 == 0) || (c1 == 0 && b2 == 0 && a3 == 0) )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Победили O");
                    startActivity(intent);
                }

                else if(a1 != -1 && a2 != -1 && a3 != -1 && b1 != -1 && b2 != -1 && b3 != -1 && c1 != -1 && c2 != -1 && c3 != -1 )
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Value","Ничья");
                    startActivity(intent);
                }
            }
        });
    }
}