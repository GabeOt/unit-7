import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleHelper {
    private ArrayList<String> wordList = new ArrayList<String>();

    public ScrabbleHelper() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("files/enable.txt"));
        int i =0;
        while (scan.hasNext()){
            String word1 = scan.nextLine();
            wordList.add(word1);
            i++;
        }
        scan.close();

    }

    public ArrayList getWordList() {
        return wordList;
    }

    public boolean foundWord(String word) {
        int min = 0;
        int max = wordList.size()-1;
        int mid = wordList.size()/2;
        while (min<=max) {
            if (wordList.get(mid).compareTo(word)==0) {
                return true;
            }
            else if (wordList.get(mid).compareTo(word)>0) {
                max =mid-1;
                mid = ((min+max)/2);

            }
            else if (wordList.get(mid).compareTo(word)<0) {
                min = mid+1;
                mid = ((min+max)/2);
            }

        }
        return false;

    }
    public ArrayList<String> findMatches(String sub) {
        ArrayList<String> found = new ArrayList<String>();
        for (int i = 0; i<wordList.size(); i++) {
            String words = wordList.get(i);
            if (words.indexOf(sub)>=0) {
                found.add(words);
            }
        }
        return found;
    }
    public void sortWords(ArrayList<String> bitList) {
        for (int i=0; i <bitList.size(); i++) {
            int smallest = i;
            for (int j =i+1; j<bitList.size(); j++) {
                if (bitList.get(j).length()<(bitList.get(smallest).length())) {
                    smallest = j;
                }
            }
            String temp = bitList.get(i);
            bitList.set(i, bitList.get(smallest));
            bitList.set(smallest, temp);
        }
    }
    public ArrayList<String> checkWords(String list) {
        ArrayList<String> words = new ArrayList<String>();
        for (int i=0; i<wordList.size(); i++) {
            ArrayList<Character> tiles = new ArrayList<Character>();
            for (int j = 0; j <list.length(); j++) {
                char t = list.charAt(j);
                tiles.add(t);
            }
            boolean works = true;
            String word = wordList.get(i);
            for (int g=0; g<word.length(); g++) {
                if (tiles.contains(word.charAt(g))) {
                    tiles.remove((Character)word.charAt(g));
                }
                else {
                    works = false;
                }
            }
            if (works) {
                words.add(word);
            }
        }
        return words;
    }
    public int getScores(String word) {
        int[] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        int total = 0;
        for (int i=0; i <word.length(); i++){
            int x = word.charAt(i)-'a';
            total += scores[x];
        }
        return total;
    }
    public void sortByScores(ArrayList<String> words){
        for (int i =1; i<words.size(); i++) {
            String temp1 = words.get(i);
            int tempVal = getScores(temp1);
            int possibleIndex = i;
            while (possibleIndex>0 && tempVal > getScores(words.get(possibleIndex-1))){
                words.set(possibleIndex, words.get(possibleIndex-1));
                possibleIndex--;
            }
            words.set(possibleIndex, temp1);
        }
    }
}

