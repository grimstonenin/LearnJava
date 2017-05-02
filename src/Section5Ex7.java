/**
 * (Financial application: compute future tuition) Suppose that the tuition for a university
 is $10,000 this year and increases 5% every year. In one year, the tuition
 will be $10,500. Write a program that computes the tuition in ten years and the
 total cost of four years’ worth of tuition after the tenth year.
 */
public class Section5Ex7 {
    public static void main(String[] args){
        int tuition = 10000;
        for (int i =0; i<10;i++){
            tuition = (int)(tuition*1.05);
        }

        System.out.println("Tuition after 10 years will be: " + tuition);

        for(int i = 0; i<4; i++){
            tuition = (int)(tuition*1.05);
        }

        System.out.println("Tuition after 4 more years will be: " + tuition);
    }
}
