package z3;

import java.util.ArrayList;
import java.util.List;

public class Palindroms {
    CzytanieZPliku czytanieZPliku = new CzytanieZPliku();

    public void createPalindroms(){
        List<String> list = czytanieZPliku.readFromFile();
        List<String> stringList = new ArrayList<>();
        for (String s: list) {
            stringList.add(s+new StringBuilder(s).reverse());
        }
        czytanieZPliku.writeToFile(stringList);
    }
}
