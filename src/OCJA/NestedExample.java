package OCJA;

public class NestedExample {

    public class A{
        private int x = 0;

        public class B{
            private int x = 10;

            public class C{
                private int x = 20;

                public void allTheX(){
                    System.out.println(x);
                    System.out.println(this.x);
                    System.out.println(B.this.x);
                    System.out.println(A.this.x);

                }
            }
        }
    }

    public static void main(String[] args){
        NestedExample.A.B.C c = new NestedExample().new A().new B().new C();
        c.allTheX();
    }
}
