package com.java8;

@FunctionalInterface
interface Anno_1 {
    void show1();
    static void print() {System.out.println("I am static method"); }
    default void display1(){System.out.println("I am default method"); }
}
@FunctionalInterface
interface Anno_2 {
    //void printNum(int x);
    void printNum(int x,int y);
}
@FunctionalInterface
interface Anno_3 {
    int add(int x, int y);
}
public class L1_Anonymous_to_Lambda {
    public static void main(String[] args) {
        //====================== Lambda Expression ========================
        Anno_1 lam_1 = ()->System.out.println("Hello Anonymous !!");
        lam_1.show1();
        lam_1.display1();
        Anno_1.print();
        /*-----------------------------------------------------------------
        //Anno_2 lam_2 = System.out::println; //We can use this if there is only 1 parameter (Efficient way)
        Anno_2 lam_2 = (a)->System.out.println(a);
        lam_2.printNum(88);*/
        //-----------------------------------------------------------------
        Anno_2 lam_2 = (a,b)->{
            System.out.println("The sum is -> "+(a+b));
            System.out.println("This is Lambda Expression");
        };
        lam_2.printNum(88,42);
        /*-----------------------------------------------------------------
        Anno_3 lam_3 = Integer::sum; // (Efficient way)
        Anno_3 lam_3 = (a,b)->{return(a+b);}; // (Actual way)*/
        Anno_3 lam_3 = (a,b)->(a+b); // (Shortcut way)
        System.out.println(lam_3.add(2,15));
    }
}
