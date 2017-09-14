package codewars;

public class Persist {

    public static int persistence(long n) {

       int count = 0;



       while (n/10!=0){

           long m = 1;

           for(; n > 0; n=n/10){
                m = m*(n%10);
           }

           n=m;
           count++;

       }



        return count;
    }

    public static void main(String args[]){
        System.out.println(persistence(39));
    }

}
