package com.example.admin.compositedesignpattern;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ADMIN on 21-03-2017.
 */

public class Developer implements Employee {
  private String name;
  private double salary;

  public Developer(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  List<Employee> employeeList = new ArrayList<>();

  @Override public void add(Employee emp) {
    employeeList.add(emp);
  }

  @Override public void remove(Employee emp) {
    employeeList.remove(emp);
  }

  @Override public Employee getChild(int i) {
    return employeeList.get(i);
  }

  @Override public String getName() {
    return name;
  }

  @Override public double getSalary() {
    return salary;
  }

  @Override public void print() {
    Log.d("Developer", "-----------");
    Log.d("Developer", "Name: " + getName());
    Log.d("Developer", "Name: " + getName());
    Log.d("Developer", "Salary: " + getSalary());
    Log.d("Developer", "-----------");
  }
}
