/*
1. Написать метод getLastDigit(int number), который принимает на вход число, а возвращает последнюю цифру этого числа.

2. В методе main получить число, введенное с клавиатуры, затем вызвать метод getLastDigit, передав ему это число.
Вывести на экран результат выполнения метода.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int lastDigit = getLastDigit(digit);
        System.out.printf("Последний цифра числа %d %d", digit, lastDigit);
    }
    static int getLastDigit(int digit){
        return digit % 10;
    }
}