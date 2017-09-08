package codewars;

public class Keypad {
    public static int presses(String phrase) {

        int[] keypad[] = new int[12][];

        keypad[0] = new int[]{32, 48};
        keypad[1] = new int[]{49};
        keypad[2] = new int[]{65,66,67,50};
        keypad[3] = new int[]{68,69,70,51};
        keypad[4] = new int[]{71,72,73,52};
        keypad[5] = new int[]{74,75,76,53};
        keypad[6] = new int[]{77,78,79,54};
        keypad[7] = new int[]{80,81,82,83,55};
        keypad[8] = new int[]{84,85,86,56};
        keypad[9] = new int[]{87,88,89,90,57};
        keypad[10] = new int[]{42};
        keypad[11] = new int[]{35};

        int pressCount = 0;

        phrase = phrase.toUpperCase();

        for(int i = 0; i<phrase.length(); i++){

            for(int[] j: keypad){
                int count = 0;
                for(int k:j){
                    count++;
                    if(phrase.charAt(i)==k) pressCount+=count;
                }
            }

        }

        return pressCount;
    }

    public static void main(String args[]){
        System.out.println(presses("HOW R U"));
    }
}
