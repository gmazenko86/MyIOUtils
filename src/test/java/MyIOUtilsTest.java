import java.nio.file.Path;

public class MyIOUtilsTest {
    static public void main(String... varargs){
        System.out.println("running windows = " + MyIOUtils.runningWindows());
        MyIOUtils.printlnRedText("This is Red text");
        MyIOUtils.printlnYellowText("This is Yellow text");
        MyIOUtils.printlnGreenText("This is Green text");
        MyIOUtils.printlnBlueText("This is Blue text");

        MyIOUtils myIOUtils = new MyIOUtils();
        Path path = myIOUtils.getResFilePath("sample_string_input.txt");
        System.out.println("\nThe path to the sample input file is:");
        System.out.println(path);
    }
}
