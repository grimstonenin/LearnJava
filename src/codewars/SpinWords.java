package codewars;

public class SpinWords {

    public String spinWords(String sentence) {

        String[] words = sentence.split(" ");

        String result = "";

        for(int i = 0; i<words.length; i++){
            if(words[i].length()>=5){
                words[i] = new StringBuilder(words[i]).reverse().toString();
                result+=words[i]+" ";
            } else {
                result+=words[i]+" ";
            }
        }

       return result.trim();
    }

}
