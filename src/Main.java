class Main2 {
    public static void main(String[] args) {
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(total);
        System.out.println(i);
        int points = 10;

        do {
            System.out.println("Осталось " + points + " баллов.");
            points--;
        } while (points >= 0);

        System.out.println("Игра окончена!");
        i = 5;
        while (i < 9) {
            System.out.println(i);
            i++;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int savings = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total += savings;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задача 2.");
        i = 1;
        while ( i <= 10 ) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; ) {
            System.out.print(i +" ");
            i--;
        }
        System.out.println();
        System.out.println("Задача 3.");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            int change = population * (birthRate - deathRate) / 1000;
            population += change;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4.");

    }
}