package com.example.admin.compositedesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Employee emp1 = new Developer("John",100000);
        Employee emp2 = new Developer("David",150000);
        Employee manager1 = new Manager("Daniel",250000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3 = new Manager("Michal",200000);
        Manager generalManager = new Manager("Mark",5000000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
