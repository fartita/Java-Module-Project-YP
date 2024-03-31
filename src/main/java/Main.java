import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guests = getGuests(scanner);
        Calculator calc = new Calculator();
        while(true){
            System.out.println("Введите товар");
            String name = scanner.next();
            System.out.println("Введите стоимость");
            Double cost  = scanner.nextDouble();
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
        int count = -1;
        while(true){
            System.out.println("Сколько гостей?");
            count = scanner.nextInt();
            if(count <= 1){
                System.out.println("Некорректное значение для подсчета");
            }
            else{
                break;
            }
        }
        return count;
    }

}