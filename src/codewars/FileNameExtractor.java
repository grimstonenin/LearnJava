package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {

    public static String extractFileName(String dirtyFileName) {

        String filename = "";

        Pattern pattern = Pattern.compile("(\\d+_)");
        Matcher matcher = pattern.matcher(dirtyFileName);

        filename = matcher.replaceAll("");

        pattern = Pattern.compile("(\\..*)(\\..*)");

        matcher = pattern.matcher(filename);

        matcher.find();

        filename = filename.replaceAll(matcher.group(2),"");

        return filename;
    }

    public static void main(String[] args){

        System.out.println(extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));

    }
}
