package codewars;

public class PeacefulYard {

    public static boolean peacefulYard(String[] yard, int minDistance) {
        int[] L = new int[2];
        int[] M = new int[2];
        int[] R = new int[2];

        boolean lFound = false;
        boolean rFound = false;
        boolean mFound = false;

        boolean dist1 = true;
        boolean dist2 = true;
        boolean dist3 = true;

        int catCount = 0;

        for(int i =0; i<yard.length; i++){
            if(yard[i].contains("L")){
                L[0] = yard[i].indexOf('L'); // x coord
                L[1] = i; // y coord
                lFound = true;
                catCount++;
            }

            if(yard[i].contains("M")){
                M[0] = yard[i].indexOf('M'); // x coord
                M[1] = i; // y coord
                catCount++;
                mFound = true;
            }

            if(yard[i].contains("R")){
                R[0] = yard[i].indexOf('R'); // x coord
                R[1] = i; // y coord
                catCount++;
                rFound = true;
            }
        }

        if(catCount<=1) return true;

        if(lFound&mFound) dist1 = calcDistance(L[0],L[1],M[0],M[1])>=minDistance;
        if(lFound&rFound) dist2 = calcDistance(L[0],L[1],R[0],R[1])>=minDistance;
        if(mFound&rFound) dist3 = calcDistance(M[0],M[1],R[0],R[1])>=minDistance;

        return dist1&dist2&dist3;
    }

    public static double calcDistance(int x1, int y1, int x2,int y2){

        System.out.println(Math.hypot(x2 - x1, y2 - y1));

    return Math.hypot(x2 - x1, y2 - y1);
    }

    public static void main(String[] args){
        System.out.println(peacefulYard(new String[]{"--------------------",
                "-----------M--------",
                "----------------R---",
                "--------------------",
                "--------------------",
                "--------------------",
                "--------------------",
                "--------------------",
                "--------------------",
                "--------------------"},2));

           }

}
