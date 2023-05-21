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
        //       task8();
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
        int i = 0;
        while (i < 10) {
            i = i + 1;
            population = population + (born - died) * population / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int contribution = 15000;
        double percentYear = 0.07;
        double total = 0;
        int i = 0;
        while (total <= 12_000_000) {
            i = i + 1;
            total = total + contribution;
            total = total + total * percentYear / 12;
        }
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");

    }

    public static void task5() {
        System.out.println("задача 4");
        int contribution = 15000;
        double percentYear = 0.07;
        double total = 0;
        int i = 0;
        while (total <= 12_000_000) {
            i = i + 1;
            total = total + contribution;
            total = total + total * percentYear / 12;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");

    }

    public static void task6() {
        System.out.println("задача 4");
        int contribution = 15000;
        double percentYear = 0.07;
        double total = 0;
        int i = 0;
        while (i < 9 * 12) {
            i = i + 1;
            total = total + contribution;
            total = total + total * percentYear / 12;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("задача 7");

        Date dayWeek = null;
        Date dateNow = new Date();
        System.out.println(dateNow);
        dayWeek = ParseException(dateNow);
        System.out.println(dayWeek);

    }
    //public static int getDayNumberOld(Date date) {

   // Calendar cal = Calendar.getInstance();
    //     cal.setTime(dateNow);
    //      return cal.get(Calendar.DAY_OF_WEEK);

    // public static void task7() {

/*
            int i = 1;
        while (i <= 31) {

        }

        System.out.println("Сегодня пятница, ...-е число. Необходимо подготовить отчет");

        public static void task8 () {
          System.out.println("задача 8"); */
}
