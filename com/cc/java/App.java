package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
       Child child = new Child();
       output(child.sayHello()); // sucht zuerst in Child class und wenn die Methode existiert wird sie ausgeführt
       output(child.sayHello("Holler!")); // wenn keine passende Methode gefunden wird, geht es in der Hirarchie weiter (zur nächsten superClass)
       
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

