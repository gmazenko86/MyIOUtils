package myioutils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MyIOUtils {

    static  public void printRedText(String str){
        if(!runningWindows()){ setRedText();}
        System.out.print(str);
        if(!runningWindows()){ setDefaultText();}
    }

    static  public void printlnRedText(String str){
        printRedText(str);
        System.out.println();
    }

    static public void printYellowText(String str){
        if(!runningWindows()){ setYellowText();}
        System.out.print(str);
        if(!runningWindows()){ setDefaultText();}
    }

    static  public void printlnYellowText(String str){
        printYellowText(str);
        System.out.println();
    }

    static public void printGreenText(String str){
        if(!runningWindows()){ setGreenText();}
        System.out.print(str);
        if(!runningWindows()){ setDefaultText();}
    }

    static  public void printlnGreenText(String str){
        printGreenText(str);
        System.out.println();
    }

    static public void printBlueText(String str){
        if(!runningWindows()){ setBlueText();}
        System.out.print(str);
        if(!runningWindows()){ setDefaultText();}
    }

    static  public void printlnBlueText(String str){
        printBlueText(str);
        System.out.println();
    }

    static void setDefaultText(){
        System.out.print("\033[0m"); // This resets the text back to default
    }

    static void setRedText(){
        System.out.print("\033[31m"); // This turns the text to red
    }

    static void setYellowText(){
        System.out.print("\033[33m"); // This turns the text to Yellow
    }

    static void setGreenText(){
        System.out.print("\033[32m"); // This turns the text to Green
    }

    static void setBlueText(){
        System.out.print("\033[34m"); // This turns the text to Blue
    }

    static public String getOS(){
        return System.getProperty("os.name");
    }

    static  public boolean runningWindows(){
        boolean returnFlag;
        String os = getOS();
        String lowercase;
        lowercase = os.toLowerCase();
        returnFlag = lowercase.contains("windows");
        return returnFlag;
    }

    static public ArrayList<String> readLinesAsStrings(String inputPath){
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

    static public double secElapsed(LocalDateTime time1, LocalDateTime time2){
        long time1MicroSec = (time1.getMinute()*60 + time1.getSecond()) * 1000000
                + time1.getNano()/1000;
        long time2MicroSec = (time2.getMinute()*60 + time2.getSecond()) * 1000000
                + time2.getNano()/1000;
        long elapsed = time2MicroSec - time1MicroSec;
        return (double)elapsed/1000000.;
    }

    public Path getResFilePath (String filename){
        URL url = this.getClass().getResource(filename);
        return Paths.get(url.getPath());
    }

    public InputStream getResAsStream (String filename){
        System.out.println("getResAsStream object is " + this.toString());
        return this.getClass().getResourceAsStream(filename);
    }

    public InputStream getResAsStream (String filename, Object object){
        System.out.println("getResAsStream object is " + object.toString());
        return object.getClass().getResourceAsStream(filename);
    }

}

