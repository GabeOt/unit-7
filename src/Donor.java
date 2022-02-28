public class Donor {
    private double amount;
    private String name;
    public Donor(double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

}


//    public void selection() {
//        for (int i=0; i <list.size(i); i++) {
//            int smallest =i;
//            for (int j=i+1; j<list.size(); j++) {
//                if (list.get(i) < list.get(smallest))
//                    smallest = j;
//
//            }
//            int temp = list.get(i);
//            list.set(i, list.get(smallest));
//            list.set(smallest, temp);
//        }
//    }
//
//    public void insertion () {
//        for (int k =1; k<list.size(); k++) {
//            int temp = list.get(k);
//            int i=k-1;
//            while (i>=0 && temp < list.get(i)) {
//                list.get(i+1, list.get(i));
//                i--;
//            }
//            list.set(i+1, temp);
//        }
//    }
//
//    System.out.println("Yayyyyyyy");
//
