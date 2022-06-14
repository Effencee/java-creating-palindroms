package z3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CzytanieZPliku {
    private static final String INPUT_FILE_NAME = "words.txt";
    private static final String OUTPUT_FILE_NAME = "palindroms.txt";

    public List<String> readFromFile(){
        List<String> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {
            String line;
            do {
                line = bufferedReader.readLine();
                if (line!=null){
                    list.add(line);
                }
            }while (line != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeToFile(List<String> list){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME))) {
            for (String s:list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
