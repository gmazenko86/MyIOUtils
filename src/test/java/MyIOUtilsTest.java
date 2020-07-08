import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

public class MyIOUtilsTest {
    @Test
    void testMyIOUtils(){
        System.out.println("running windows = " + MyIOUtils.runningWindows());
        MyIOUtils.printlnRedText("This is Red text");
        MyIOUtils.printlnYellowText("This is Yellow text");
        MyIOUtils.printlnGreenText("This is Green text");
        MyIOUtils.printlnBlueText("This is Blue text");

        MyIOUtils myIOUtils = new MyIOUtils();
        Path path = myIOUtils.getResFilePath("sample_string_input.txt");
        String expectedPath = "/home/greg/javaProjects/MyIOUtils/target/classes/sample_string_input.txt";
        boolean pathMatches = expectedPath.equals(path.toString());
        Assertions.assertTrue(pathMatches, "Input file path does not match expected path");
    }
}
