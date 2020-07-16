import myioutils.MyIOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.Scanner;

public class MyIOUtilsTest {
    @Test
    void testMyIOUtils(){
        System.out.println("running windows = " + MyIOUtils.runningWindows());
        MyIOUtils.printlnRedText("This is Red text");
        MyIOUtils.printlnYellowText("This is Yellow text");
        MyIOUtils.printlnGreenText("This is Green text");
        MyIOUtils.printlnBlueText("This is Blue text");

        MyIOUtils myIOUtils = new MyIOUtils();
        Path path = myIOUtils.getResFilePath("../sample_string_input.txt");
        String expectedPath = "/home/greg/javaProjects/MyIOUtils/target/classes/sample_string_input.txt";
        boolean pathMatches = expectedPath.equals(path.toString());
        Assertions.assertTrue(pathMatches, "Input file path does not match expected path");

        InputStream inputStream = myIOUtils.getResAsStream("../sample_string_input.txt");
        Scanner scanner = new Scanner(inputStream);
        String inString = scanner.nextLine();
        String expectedLine = "An ordered collection (also known as a sequence). " +
                "The user of this interface has precise control over where in the" +
                " list each element is inserted. The user can access elements by" +
                " their integer index (position in the list), and search for elements in the list.";
        boolean stringsMatch = expectedLine.equals(inString);
        Assertions.assertTrue(stringsMatch, "First line of stream input does not match expected");
    }
}
