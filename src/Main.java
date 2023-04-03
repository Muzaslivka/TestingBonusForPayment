public class Main {
    public static void main(String[] args) {

        int clientsAccount = 100;
        int sumOfPayment = 1100;
        int bonus = sumOfPayment / 100;
        int totalSumAccountWithBonus;
        int totalSumAccountWithoutBonus;

        if (sumOfPayment >= 1000) {
            totalSumAccountWithBonus = clientsAccount + sumOfPayment + bonus;
            System.out.println("Счет пополнен на: " + sumOfPayment + " руб., на счёте: " +  totalSumAccountWithBonus + " руб." + ", в том числе бонус: " + bonus + " руб.");

        } else {
            totalSumAccountWithoutBonus = clientsAccount + sumOfPayment;
            System.out.println("Счет пополнен на: " + sumOfPayment + " руб., на счёте: " + totalSumAccountWithoutBonus + " руб." + ", бонус отсутствует, так как сумма пополнения менее 1000 руб.");
        }
    }
}