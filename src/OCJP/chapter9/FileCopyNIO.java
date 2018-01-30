package OCJP.chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyNIO {

    public static void main(String[] args){

        Path file1 = Paths.get("src/OCJP/chapter8/resources/Zoo.txt");
        Path fIle2 = Paths.get("src/OCJP/chapter8/resources/ZooCopy.txt");

        System.out.println("The Path Name is: "+file1);
        for(int i=0; i<file1.getNameCount(); i++) {
            System.out.println(" Element "+i+" is: "+file1.getName(i));
        }

        System.out.println("This is an absolute path: " + fIle2.isAbsolute());

        if(!fIle2.isAbsolute()){
            System.out.println("In this case we make an absolute path: "+fIle2.toAbsolutePath());
        }

        System.out.println("The root is: " + fIle2.toAbsolutePath().getRoot()) ;


    }
}
