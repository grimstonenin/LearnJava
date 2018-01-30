package OCJP.chapter8;

import java.io.File;

public class ReadFileInformation {
    public static void main(String[] args) {

        File file = new File("/Users/andreicristea/test.mv.db");
        File fileDir = new File("/Users/andreicristea/spark");


        System.out.println("File " + file.getName() + " exists? - " + file.exists());
        System.out.println("File " + fileDir.getName() + " exists? - " + fileDir.exists());

        System.out.println();
        System.out.println();

        File[] files = {file, fileDir};
        for (File f : files) {
            if (f.exists()) {
                System.out.println("Absolute Path: " + f.getAbsolutePath());
                System.out.println("Is Directory: " + f.isDirectory());
                System.out.println("Parent Path: " + f.getParent());
                if (f.isFile()) {
                    System.out.println("File size: " + f.length());
                    System.out.println("File LastModified: " + f.lastModified());
                } else {
                    for (File subfile : f.listFiles()) {
                        System.out.println("\t" + subfile.getName());
                    }
                }
            }

            System.out.println();
            System.out.println();
        }
    }
}
