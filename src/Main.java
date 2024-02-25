public class Main {
    public static void main(String[] args) {

        int clientAccount = 567;  // Сумма на счету
        int clientPayment = 1234;  // Сумма пополнения
        int bonus; // Бонус

        if (clientPayment > 1000) {
            bonus = (clientPayment / 100) * 1;
        } else {
            bonus = 0;
        }

        int clientSum = clientAccount + clientPayment + bonus;  // Итоговая сумма на счету
        System.out.println("Итоговая сумма на счету клиента: " + clientSum + " руб");
        System.out.println("Бонус равен: " + bonus + " руб");
    }
}