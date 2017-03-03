package com.leena.java;

import java.util.Random;

/**
 * Created by leena on 2/13/17.
 *
 *
 */

class Animal{
    String name;

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }
}
public class String_print {
    static int v;
    public static void main(String[] args){
        Random r = new Random();
        for(int j = 0 ; j<100;j++)
        System.out.println(r.nextInt());
        String Leena  = "Leen asunil patil";
        Animal a = new Animal();
        int z;
        a.setName("Nishant");
        System.out.println(a.getName()+v);

    }
}
