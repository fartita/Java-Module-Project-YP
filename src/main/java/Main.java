import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guests = getGuests(scanner);
        Calculator calc = new Calculator();
        while(true){
            System.out.println("Введите товар");
            String name = scanner.next();
            System.out.println("Введите стоимость, цену введите дробную с точкой");
            Double cost  = insertDouble(scanner);
            calc.listItems.add(new Pair(name, cost));
            System.out.println("Товар успешно добавлен, завершить подсчет?");
            String answer = scanner.next();
            if(answer.toLowerCase().contains("завершить")){
                break;
            }
        }
        calc.printResult(guests);
        scanner.close();
    }

    public static int getGuests(Scanner scanner){
        int count;
        while(true){
            System.out.println("Сколько гостей?");
            count = insertCount(scanner);
            if(count <= 1){
                System.out.println("Некорректное значение для подсчета");
            }
            else{
                break;
            }
        }
        return count;
    }

    public static int insertCount(Scanner scanner){
        int count;
        try{
                count = Integer.parseInt(scanner.nextLine());
        }
        catch (Exception e){
                System.out.println("Введите целочисленное");
                count = insertCount(scanner);
        }
        return count;
    }

    public static Double insertDouble(Scanner scanner){
        double count;
        try{
            scanner.nextLine();
            count = Double.parseDouble(scanner.nextLine());
        }
        catch (Exception e){
                System.out.println("Введите дробное число с точкой");
                count = insertDouble(scanner);
        }
        return count;
    }
}