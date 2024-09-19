import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.

//        greatest = first;
//        smallest = first;
//
//        if (second > greatest) {
//            greatest = second;
//        }
//        if (second < smallest) {
//            smallest = second;
//        }
//
//        if (third > greatest) {
//            greatest = third;
//        }
//        if (third < smallest) {
//            smallest = third;
//        }
//
//        if (first < greatest && first > smallest) {
//            average = first;
//        }
//        if (second < greatest && second > smallest) {
//            average = second;
//        }
//        if (third < greatest && third > smallest) {
//            average = third;
//        }
        greatest = first > second ? (first > third ? first : third) : (second > third ? second : third);
        smallest = first < second ? (first < third ? first : third) : (second < third ? second : third);
        average = first > second ?
                (first < third ? first : (second > third ? second : third)) : (first > third ? first : third);

        //todo

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
