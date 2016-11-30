package com.example.boom.builderdemo;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.boom.builderdemo.builder.Car;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.tv);
   /*     Car.Builder builder=new Car.Builder(MainActivity.this);
        builder.setColor("red")
                .setKind("suv")
                .setWeight(2000)
                .show(tv);*/
        Car car=new Car();
        car.setColor("red")
                .setKind("suv")
                .setWeight(2000)
                .show(tv);
    }
}
