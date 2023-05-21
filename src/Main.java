import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("задача 1");
        int contribution = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i = i + 1;
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        i = 10;
        for (; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("задача 3");
        int born = 17;
        int died = 8;
        int population = 12_000_000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + (born - died) * population / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int contribution = 15000;
        double percentMonth = 0.07;
        double total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            month++;
            total = total + contribution;
            total = total + total * percentMonth;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");

    }

    public static void task5() {
        System.out.println("задача 5");
        int contribution = 15000;
        double percentMonth = 0.07;
        double total = 0;
        int Month = 0;
        while (total <= 12_000_000) {
            Month++;
            total = total + contribution;
            total = total + total * percentMonth;
            if (Month % 6 == 0) {
                System.out.println("Месяц " + Month + " сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("Месяц " + Month + " сумма накоплений равна " + total + " рублей");
    }

    public static void task6() {
        System.out.println("задача 6");
        int contribution = 15000;
        double percentMonth = 0.07;
        double total = 0;
        int month = 0;
        while (month < 9 * 12) {
            month++;
            total = total + contribution;
            total = total + total * percentMonth;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("задача 7");
        int friday = 1;
        int dayInMonth = 31;
        for (; friday <= dayInMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("задача 8");
        int cometsVizit = 79;
        int beginningOfPeriod = 1823;
        int endOfPeriod = 2123;
        for (int yearOfVizit = 0; yearOfVizit <= endOfPeriod; yearOfVizit = yearOfVizit + cometsVizit) {
            if (yearOfVizit >= beginningOfPeriod && yearOfVizit <= endOfPeriod) {
                System.out.println(yearOfVizit);
            }
        }
    }
}
