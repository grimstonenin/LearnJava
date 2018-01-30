package OCJP.chapter8;

import java.io.*;

public class FileCopy {

    public static void fileCopy(File input, File output) throws IOException{
        try(InputStream in = new FileInputStream(input);
            OutputStream out = new FileOutputStream(output)){
            int b;
            while((b=in.read())!=-1){
                out.write(b);
            }
        }

    }

    public static void bufferedFileCopy(File input,File output) throws IOException{
        try(InputStream in = new BufferedInputStream(new FileInputStream(input));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(output))){
            byte[] buffer = new byte[1024];
            int lengthRead;
            while((lengthRead=in.read(buffer))>0){
                out.write(buffer,0,lengthRead);
                out.flush();
            }

        }

    }

    public static void main(String[] args) throws IOException {


        File source = new File("src/OCJP/chapter8/resources/Zoo.txt");
        File destination = new File("src/OCJP/chapter8/resources/ZooCopy.txt");
        fileCopy(source,destination);

        File sourceBuffer = new File("src/OCJP/chapter8/resources/ZooBuffer.txt");
        File destinationBuffer = new File("src/OCJP/chapter8/resources/ZooBufferCopy.txt");
        bufferedFileCopy(sourceBuffer,destinationBuffer);
    }

}
