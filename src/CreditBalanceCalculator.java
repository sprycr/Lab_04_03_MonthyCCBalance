import static java.lang.Math.*;
public class CreditBalanceCalculator {
    public static void main(String[] args) {

        double startingBalance = 5000.00;
        double interestRate = 0.17;
        double monthlyBalance;

        monthlyBalance = startingBalance;
        monthlyBalance = pow(startingBalance, interestRate*1);
        System.out.println("the interest due after one month is: $" + monthlyBalance);
        monthlyBalance = pow(startingBalance, interestRate*2);
        System.out.println("the interest due after two months is: $" + monthlyBalance);

    }
}
