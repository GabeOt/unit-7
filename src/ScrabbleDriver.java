import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDriver {
    public static void main(String[] args) throws FileNotFoundException {
        ScrabbleHelper sH = new ScrabbleHelper();
        Scanner scan = new Scanner(System.in);

        System.out.println("input a word to check in dictionary or \"x\" to skip: ");
        String word = scan.next();
        int compare = word.compareTo("x");
        while (compare !=0) {
            if (sH.foundWord(word)){
                System.out.println(word + " is in the dictionary");
            }
            else {
                System.out.println(word + " is not in the dictionary");
            }
            System.out.println("input a word to check in dictionary or \"x\" to skip: ");
            word = scan.next();
            compare = word.compareTo("x");
        }

        System.out.println("enter a substring to receive list of possible words or \"x\" to skip: ");
        String word2 = scan.next();
        int compare2 = word2.compareTo("x");
        ArrayList<String> list2 = new ArrayList<String>();
        while (compare2 != 0) {
            list2 = sH.findMatches(word2);
            System.out.println(list2);
            System.out.println("enter a substring to receive list of possible words or \"x\" to skip: ");
            word2 = scan.next();
            compare2 = word2.compareTo("x");

        }

        System.out.println("input \"y\" to sort word length in list from smallest to longest or \"x\" to skip: ");
        String word3 = scan.next();
        int compare3 = word3.compareTo("y");
        if (compare3==0) {
            sH.sortWords(list2);
            System.out.println(list2);
        }

        System.out.println("enter a set of tiles to use or \"x\" to skip: ");
        String word4 = scan.next();
        int compare4 = word4.compareTo("x");
        ArrayList<String> wordTiles = new ArrayList<String>();
        if (compare4 != 0){
            wordTiles = sH.checkWords(word4);
            System.out.println(wordTiles);
        }

        System.out.println("input \"y\" to sort list from highest score to lowest or \"x\" to skip");
        String word5 = scan.next();
        int compare5 = word5.compareTo("y");
        if (compare5 == 0){
            sH.sortByScores(wordTiles);
            System.out.println(wordTiles);
        }


    }
}