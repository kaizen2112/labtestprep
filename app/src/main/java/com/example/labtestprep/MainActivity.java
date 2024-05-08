package com.example.labtestprep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView area, peri, showcolor;
    EditText a, b, c, shape, color;
    AppCompatButton colorbutton, shapebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        area = findViewById(R.id.area);
        peri = findViewById(R.id.peri);
        showcolor = findViewById(R.id.showcolor);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        shape = findViewById(R.id.shape);
        color = findViewById(R.id.color);
        colorbutton = findViewById(R.id.colorbutton);
        shapebutton = findViewById(R.id.shapebutton);

        shapebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double aa, bb, cc;
                aa = Double.valueOf(a.getText().toString());
                bb = Double.valueOf(b.getText().toString());
                cc = Double.valueOf(c.getText().toString());

                if (shape.getText().toString().equalsIgnoreCase("Circle")) {
                    Circle c = new Circle(aa);
                    area.setText(Double.toString(c.area()));
                    peri.setText(Double.toString(c.perimeter()));

                } else if (shape.getText().toString().equalsIgnoreCase("Triangle")) {
                    Triangle c = new Triangle(aa, bb, cc);
                    area.setText(Double.toString(c.area()));
                    peri.setText(Double.toString(c.perimeter()));

                } else if (shape.getText().toString().equalsIgnoreCase("Square")) {
                    Square c = new Square(aa);
                    area.setText(Double.toString(c.area()));
                    peri.setText(Double.toString(c.perimeter()));

                }

            }


        });

        colorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (color.getText().toString().equalsIgnoreCase("Red")) {
                    Red r = new Red();
                    showcolor.setText(r.showcolor());
                } else if (color.getText().toString().equalsIgnoreCase("Green")) {
                    Green r = new Green();
                    showcolor.setText(r.showcolor());
                } else if (color.getText().toString().equalsIgnoreCase("Blue")) {
                    Blue r = new Blue();
                    showcolor.setText(r.showcolor());
                }
            }
        });


    }
}