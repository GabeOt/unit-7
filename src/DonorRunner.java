import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> donorList;

    public static void main(String[] args) throws IOException {
        donorList = new ArrayList<>();
        getDonorList("files/donors.txt");
        sortDonorList();
        System.out.println(donorList.get(0).getName()); // Should print out Hernandez
        System.out.println(donorList.get(donorList.size()-1).getName()); // Should print out Hall
        System.out.println(getDonatedAmount("Anderson")); // should print 1436.5
        System.out.println(getDonatedAmount("Roberts")); // should print 307.86
        System.out.println(getDonatedAmount("Wilkinson")); // should print 0.0

    }

    public static void getDonorList(String filename) throws IOException {
        Scanner scan = new Scanner(new File(filename));
        while (scan.hasNext()) {
            String donor = scan.next();
            double amount = scan.nextDouble();
            Donor d = new Donor(amount, donor);
            donorList.add(d);

        }

    }

    public static void sortDonorList() {
        for (int i=0; i <donorList.size(); i++) {
            int biggest =i;
            for (int j=i+1; j<donorList.size(); j++) {
                if (donorList.get(i).getAmount() > donorList.get(biggest).getAmount())
                    biggest = j;

            }
            Donor temp = donorList.get(i);
            donorList.set(i, donorList.get(biggest));
            donorList.set(biggest, temp);
        }

    }

    public static double getDonatedAmount(String name) {


        return 0.0; // this is returned if the name is not found
    }
}
