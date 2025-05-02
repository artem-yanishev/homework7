public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int purpose = 2_459_000;
        int savings = 15000;
        double total = 0;
        int month = 0;
        while (total < purpose) {
            total += savings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задача 2.");
        month = 1;
        while (month <= 10) {
            System.out.print(month + " ");
            month++;
        }
        System.out.println();
        for (month = 10; month >= 1; ) {
            System.out.print(month + " ");
            month--;
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
        purpose = 12_000_000;
        total = 15000;
        month = 0;
        float percent = 1.07f;
        while (total < purpose) {
            total *= percent;
            month++;
            String formatted = String.format("%.2f", total);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + formatted + " рублей.");
        }
        System.out.println("Задача 5.");
        purpose = 12_000_000;
        total = 15000;
        month = 0;
        percent = 1.07f;
        while (true) {
            month++;
            total *= percent;
            if (month % 6 == 0) {
                String formatted = String.format("%.2f", total);
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formatted + " рублей.");
            }
            if (total >= purpose && month % 6 != 0) {
                String formatted = String.format("%.2f", total);
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formatted + " рублей.");
                break;
            }
        }
        System.out.println("Задача 6.");
        total = 15000;
        month = 0;
        int year = 9;
        percent = 1.07f;
        while (month < 12 * year) {
            month++;
            total *= percent;
            if (month % 6 == 0) {
                String formatted = String.format("%.2f", total);
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formatted + " рублей.");
            }
        }
        System.out.println("Задача 7.");
        int firstFriday = 5;
        int daysInMonth = 31;
        if (firstFriday < 1 || firstFriday > 7) {
            System.out.println("Ошибка: первая пятница должна быть числом от 1 до 7");
        } else {
            while (firstFriday <= daysInMonth) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
                firstFriday += 7;
            }
        }
        System.out.println("Задача 8.");
        int currentYear = 2025;
        int lowerLimit = currentYear - 200;
        int upperLimit = currentYear + 100;
        int period = 79;
        year = lowerLimit / period;
        year *= period;
        for (; year < upperLimit; year += period)
            if (year > lowerLimit) {
            System.out.println(year);
        }
    }
}