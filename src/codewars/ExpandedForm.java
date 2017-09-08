package codewars;

public class ExpandedForm {

    public static String expandedForm(int num)
    {

        StringBuilder result = new StringBuilder();

        int index = 0;

        while(num>0){

            int add = num%10;


            if(add!=0)  result.insert(0,(int)(add*Math.pow(10,index)));
            if(num>=10 & add!=0 ) result.insert(0," + ");

            num = num/10;
            index++;
        }

        return result.toString();
    }

    public static void main(String args[]){
        System.out.println(expandedForm(70304));
    }
}
