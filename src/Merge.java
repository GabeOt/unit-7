import java.util.ArrayList;

public class Merge {

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        ArrayList list = new ArrayList<>();
        while (listOne.size()>0 && listTwo.size()>0) {
            if(listOne.get(count1)>+listTwo.get(count2)) {
                list.add(count3, listOne.get(count1));
                count3++;
                listOne.remove(count1);
            }
            if(listOne.get(count1)<listTwo.get(count2)) {
                list.add(count3, listTwo.get(count2));
                count3++;
                listOne.remove(count2);
            }
        }
        return list;

    }

}
