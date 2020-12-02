package learningjava;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 5
        result /= 5; // 30 / 5 = 6
        System.out.println("30 / 5 = " + result);

        // result = result - 3
        result -= 3; // 6 - 3 = 2
        System.out.println("6 - 3 = " + result);

        boolean isCake = false;
        if (isCake == false) {
            System.out.println("It is not a cake!");
        }
        // != is not equal
        // == is equal to
        // > greater than
        // >= greater than or equal to
        // < less than
        // <= less than or equal to
        int topScore = 7;
        if (topScore < 10) {
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 6;
        if ((topScore > secondTopScore) && (topScore < 10)) {
            System.out.println("Greater than second top score and less than 10");
        }

        if ((topScore > 9) || (secondTopScore <= 9)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This won't show");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double totalValue = (firstValue + secondValue) * 100.00d;
        System.out.println("totalValue =" + totalValue);
        double theRemainder = totalValue % 40;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = theRemainder == 0 ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}