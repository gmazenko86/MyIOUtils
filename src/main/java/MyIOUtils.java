import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyIOUtils {

    static  public void printRedText(String str){
        System.out.print("\033[31m"); // This turns the text to red
        System.out.print(str);
        System.out.print("\033[0m"); // This resets the text back to default
    }

    static  public void printlnRedText(String str){
        printRedText(str);
        System.out.println();
    }

    static public void printYellowText(String str){
        System.out.print("\033[33m"); // This turns the text to Yellow
        System.out.print(str);
        System.out.print("\033[0m"); // This resets the text back to default
    }

    static  public void printlnYellowText(String str){
        printYellowText(str);
        System.out.println();
    }

    static public void printGreenText(String str){
        System.out.print("\033[32m"); // This turns the text to Green
        System.out.print(str);
        System.out.print("\033[0m"); // This resets the text back to default
    }

    static  public void printlnGreenText(String str){
        printGreenText(str);
        System.out.println();
    }

    static public void printBlueText(String str){
        System.out.print("\033[34m"); // This turns the text to Blue
        System.out.print(str);
        System.out.print("\033[0m"); // This resets the text back to default
    }

    static  public void printlnBlueText(String str){
        printBlueText(str);
        System.out.println();
    }

    public static ArrayList<String> readLinesAsStrings(String inputPath){
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            ArrayList<String> arrayList = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }
            return arrayList;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }


}

