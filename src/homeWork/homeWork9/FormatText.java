package homeWork.homeWork9;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormatText {
    public static void main(String[] args) {
        String fileName = "/Users/kirylfursau/Downloads/strings.txt";
        String fileName1 = "/Users/kirylfursau/Downloads/blackList.txt";
        String text = "";
        String blackList = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
             BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text += line;
            }
            String line1;
            while ((line1 = bufferedReader1.readLine()) != null) {
                blackList += line1;
            }
            List<String> sentences = new ArrayList<>(Arrays.asList(text.toLowerCase().split("\\.")));
            List<String> blackWords = new ArrayList<>(Arrays.asList(blackList.toLowerCase().split(" ")));
            List<Integer> blackSentences = new ArrayList<>();
            for (int i = 0; i < sentences.size(); i++){
                String[] wordsInSentences = sentences.get(i).split(" ");
                for (int j = 0; j < wordsInSentences.length; j++){
                    for (int k = 0; k < blackWords.size(); k++){
                        if (wordsInSentences[j].equals(blackWords.get(k))){
                            blackSentences.add(i + 1);
                        }
                    }
                }
            }
            if(!blackSentences.isEmpty()){
                System.out.print("Sentences that failed verification ");
                for (Integer i : blackSentences){
                    System.out.print(i + ";");
                }
            }else{
                System.out.println("Text passed validation");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
