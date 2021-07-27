public class Main {
    public static void main(String[] args) {
        int initial = 100; //начальная сумма на счете клиента
        int transfer = 1000; //сумма пополнения счета
        int K = 100; // количество рублей, за которую начисляется 1 миля
        int bonus; //количество начисленных бонусов

        if (transfer/K > 10) {
            bonus = transfer/K;
        }
        else {
                bonus = 0;
                }
        int totalSum = initial + transfer + bonus; //итог
                System.out.println(totalSum);
    }
}