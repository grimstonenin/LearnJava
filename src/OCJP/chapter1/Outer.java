package OCJP.chapter1;

public class Outer {

   @Override
   public boolean equals(Object o){
       return false;
   }

    public static void main(String[] args){

        String s = null;
        System.out.println(s.isEmpty());

    }
}
