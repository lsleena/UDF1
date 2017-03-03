package com.leena.java;

/**
 * Created by leena on 2/13/17.
 */
public class OverLoading {
    public static void main(String[] args){
   Parent p = new Parent();
   p.substract();
    }
}
class Parent{
    public void add(){

    }
    public void add(int i){

    }
    public void substract(int i){
        System.out.println("In parents");
    }
public void substract(){
    System.out.println("In parents");
}
}
class child extends Parent{

    public void substract(){
        System.out.println("print substract");
    }
    public void substract(int i){
        System.out.println("In parents");
    }
}
