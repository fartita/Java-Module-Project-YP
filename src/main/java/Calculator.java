import java.util.ArrayList;

public class Calculator {
    ArrayList<Pair<String, Double>> listItems = new ArrayList<Pair<String, Double>>();

    public void printResult(int guests){
        Double allPrice = 0.0;
        System.out.println("Добавленные товары:\n");
        for(int i = 0; i < listItems.size(); i++){
            System.out.printf("%s, стоит %.2f %s\n",listItems.get(i).getLeft(), listItems.get(i).getRight(), printRoubles(listItems.get(i).getRight()));
            allPrice = listItems.get(i).getRight() + allPrice;
        }
        Double sumPerPerson = allPrice/guests;
        String roubles = printRoubles(sumPerPerson);
        System.out.printf("Каждый заплатит %.2f %s", sumPerPerson, roubles);
    }

    private String printRoubles(Double dChislo){
        String rouble;
        String chislo = String.format("%.2f", dChislo).split(",")[0];
        if(chislo.length() > 1){
            if(chislo.charAt(chislo.length()-2) == '1'){
                return "рублей";
            }
        }
        switch(chislo.charAt(chislo.length()-1)){
            case '1':
                rouble = "рубль";
                break;
            case '2':
            case '3':
            case '4':
                rouble = "рубля";
                break;
            default:
                rouble = "рублей";
                break;
        }
        return rouble;
    }
}
