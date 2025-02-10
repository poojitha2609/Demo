package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calci c = new Calci();
        System.out.println(c.add(3,4));
        System.out.println(c.sub(3,1));
        System.out.println(c.mul(3,2));
    }
}