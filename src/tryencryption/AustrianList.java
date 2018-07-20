package tryencryption;

import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AustrianList {

    public static void main(String args[]) {

        String toEncrypt = "karl.testinger@firma.at";
        List<String> encryptedList = null;

        System.out.println(sha1(toEncrypt));

        try {
            encryptedList = readEncryptedList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(encryptedList.contains(sha1(toEncrypt))) System.out.println("UHAAAAAAAAAAA!!!!");

    }

    public static List<String> readEncryptedList() throws IOException {
        File testListHash = new File("src/tryencryption/4243_testliste.hash");
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream(testListHash));
        List<String> encryptedList = new ArrayList<>();

        byte[] input = new byte[20];

        while (reader.read(input) != -1) {
            String result = new String(input, "ISO-8859-1");
            encryptedList.add(result);
            System.out.println("-------------");
            System.out.println(result);
            System.out.println("-------------");
        }

        return encryptedList;
    }

    public static String sha1(String input) {
        String sha1 = null;
        try {
            MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
            msdDigest.update(input.getBytes("ISO-8859-1"), 0, input.length());
            sha1 = new String(msdDigest.digest(),"ISO-8859-1");
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            Logger.getLogger(AustrianList.class.getName()).log(Level.SEVERE, null, e);
        }
        return sha1;
    }

}
