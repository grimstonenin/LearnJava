package OCJA;

class Base {
    public void test() {
        System.out.println("Base");
    }
}
class Base1 extends Base {
    public void test() {
        System.out.println("Base1");
    }

    public void testBase1(){
        System.out.println("This method is for base1");
    }
}
class Base2 extends Base1 {
    public void test() {
        System.out.println("Base2");
    }


    public void testBase2(){
        System.out.println("This method is for base2");
    }
}
class Test {
    public  static void main(String[] args) {
        Base obj = new Base();
        obj.test();

        Base obj1 = new Base1();
        obj1.test();
        ((Base1)obj1).testBase1();
        ((Base1)obj1).test();

        Base1 obj2 = new Base1();
        //((Base2)obj2).testBase2();

        if(obj2 instanceof Base2){
            System.out.println("OK");
        }else {
            System.out.println("NOK");
        }
    }
}