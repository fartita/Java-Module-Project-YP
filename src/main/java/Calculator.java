import java.util.ArrayList;

public class Calculator {
    ArrayList<Pair<String, Double>> listItems = new ArrayList<Pair<String, Double>>();

    public void printResult(int guests){
        Double allPrice = 0.0;
        System.out.println("Добавленные товары:\n");
        for(int i = 0; i < listItems.size(); i++){
            System.out.println(listItems.get(i).getLeft()+"\n");
            allPrice = listItems.get(i).getRight() + allPrice;
        }
        Double sumPerPerson = allPrice/guests;
        System.out.printf("Каждый заплатит %.2f%n рубля", sumPerPerson);
    }
}
