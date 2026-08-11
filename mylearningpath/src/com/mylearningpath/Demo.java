package com.mylearningpath;

public class Demo {
    static {
        System.out.println("Static Block");
    }

    // Instance Block
    {
        System.out.println("Instance Block");
    }

    Demo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");

        Demo d1 = new Demo();

        Demo d2 = new Demo();
    }

}
		

}
