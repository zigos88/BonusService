public class Main {
public static void main(String[] args) {
    int balanceBefore = 100;
    int depositAmount = 1100;
    int balance;
    int bonus;
    if (depositAmount > 1000) {
        bonus = depositAmount / 100;
        balance = balanceBefore + depositAmount + bonus;
    } else {
        balance = balanceBefore + depositAmount;
        bonus = 0;
    }
    System.out.println("Ваш баланс: " + balance);
    System.out.println("Ваш бонус: " + bonus);
}
}