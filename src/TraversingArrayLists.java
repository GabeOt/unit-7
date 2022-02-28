//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class TraversingArrayLists {
//    public static ArrayList<String> getStates() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a name of a state or \"stop\" to quit");
//        String state = scan.nextLine();
//        ArrayList<String> array = new ArrayList<>();
//        while(!state.equals("Stop")) {
//            array.add(state);
//            System.out.println("Enter a name of a state or \"stop\" to quit");
//            state = scan.nextLine();
//        }
//        return array;
//
//    }
//    public static String createList(ArrayList<String> states){
//        int length = states.size()-1;
//        String state;
//        for (int i=0; i<length; i++){
//            state += getStates(i);
//
//        }
//
//    }
//
//    // Please write the two methods for listOfStates in the space below. Uncomment the tests
//    // when you are ready to run them.
//
//
//    public static ArrayList<Integer> largestAndSmallest(String filename) throws FileNotFoundException {
//        Scanner input = new Scanner(new File(filename));
//        ArrayList<Integer> list = new ArrayList<>();
//        while (input.hasNext()) {
//            list.add(input.nextInt());
//        }
//        // Your code should go below here, and above the return statement.
//
//
//        return list;
//    }
//
//
//
//
//
//
//
//}
