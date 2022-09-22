public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
      int deposit = 29000;
      int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 2");
        int deposit1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + deposit1;
            total1 = total1 + total1/100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 + " рублей");
        }
    }
}