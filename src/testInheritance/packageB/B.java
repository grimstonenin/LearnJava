package testInheritance.packageB;

import testInheritance.packageA.A;

class B extends A{

    int param = 10;

    public void metodaB() {

        System.out.println("In metoda din obiectul B.");
    }

    public static void main(String[] args) {

        B obiectB = new B();

        A obiectA = new A();



        System.out.println(obiectA.param1);


    }
}