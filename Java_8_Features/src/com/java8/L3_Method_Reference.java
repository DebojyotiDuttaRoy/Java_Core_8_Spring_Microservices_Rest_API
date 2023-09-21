package com.java8;

interface DoubleColon{
    void show();
}
class UdDC{
    public void display() {
        System.out.println("Hi,\nWe are Understanding Double colon.");
    }
}
public class L3_Method_Reference {
    public static void displayStatic(){
    System.out.println("Hi,\nWe are Understanding Method Reference in Static context.");
    }
    public static void main(String[] args) {
        DoubleColon dc1 = L3_Method_Reference::displayStatic; 	//DoubleColon dc1 = Main::display;
        dc1.show();
        /*------------------------------------------------------------------------
        UdDC ob = new UdDC();
        DoubleColon dc2 = ob::display;*/
        DoubleColon dc2 = new UdDC()::display;  // (Shortcut way)
        dc2.show();
    }
}