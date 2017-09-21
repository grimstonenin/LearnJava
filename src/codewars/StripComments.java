package codewars;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {

        String result = "";

        String patternForSymbols = "(";

        for(String s:commentSymbols){
            patternForSymbols = patternForSymbols + s + "|";

        }
        patternForSymbols=patternForSymbols.substring(0,patternForSymbols.length()-1);

        patternForSymbols = patternForSymbols+")"+".*";


     //   text = text.replaceAll(patternForSymbols+".*?\n","\n");

       String[] splitString = text.split("\n") ;

       for(String i: splitString){
           for(String commentSymbol : commentSymbols){
               if(i.contains(commentSymbol)){
                   result = result + i.substring(0,i.indexOf(commentSymbol)) + "\n";
                   break;
               } else {
                   result = result + i + "\n";
                   break;
               }

           }
       }

        return result.substring(0,result.length()-1);
    }

    public static void main(String[] args){

        System.out.println(stripComments("apples, pears #  and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } ));
        System.out.println(stripComments("a #b\nc\nd ss$e f g", new String[] { "#", "$" }));
    }
}
