package testInheritance.packageB;

import testInheritance.packageA.A;

class B extends A{

    int param = 10;

    public void metodaB() {

        System.out.println("In metoda din obiectul B.");
    }

    public static void main(String[] args) {

        int a =1;
        int b =2;



        switch(a){
            default: a=10;
            case 1:{
                a=4;

            }
            case 2:{
                a=5;
                break;
            }
        }

        System.out.println(a);

        a=4;
    }
}