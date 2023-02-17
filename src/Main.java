public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int initialAccount = 400;
        int depositAmount = 15000;
        int bonus = 0;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        }

        int finalAccount = initialAccount + depositAmount + bonus;
        System.out.println("Итоговый счёт: " + finalAccount);
        System.out.println(" Сумма бонуса: " + bonus);
    }
}