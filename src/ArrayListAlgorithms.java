import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAlgorithms {

    public static ArrayList<Integer> fileDuplicates(String file1, String file2) throws FileNotFoundException {
            Scanner input1 = new Scanner(new File(file1));
            ArrayList<Integer> list1 = new ArrayList<>();
            while (input1.hasNext()) {
                list1.add(input1.nextInt());
            }

            Scanner input2 = new Scanner(new File(file2));
            ArrayList<Integer> list2 = new ArrayList<>();
            while (input2.hasNext()) {
                list2.add(input2.nextInt());
            }

        ArrayList list = new ArrayList<>();

            for (int i=0; i<list1.size(); i++) {
                int x = list1.get(i);
                if (list2.contains(x)) {
                    list.add(x);
                }

            }
            ArrayList list3 = new ArrayList<>();
            for (int i=0; i<list1.size(); i++) {
                int x =list1.get(i);
                if (list2.contains(x)) {
                    if (!list3.contains(x)) {
                        list3.add(x);
                    }
                }
            }
            return list3;



    }


    /*
    public static ArrayList<Integer> fileDuplicates(String file1, String file2) throws FileNotFoundException {


    }

     */
/*
    public static ArrayList<String> removeDuplicates(String filename)throws FileNotFoundException {

    }

 */
/*
    public static ArrayList<Integer> orderedList()throws FileNotFoundException {

    }

 */

}
