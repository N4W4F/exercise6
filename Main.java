import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

//      1.
        try {
            System.out.print("Input the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Input the second number: ");
            double num2 = input.nextDouble();

            intOperations(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only real numbers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      2.
        try {
            System.out.print("Input your number: ");
            tenMultiplicationTable(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      3.
        try {
            System.out.print("Enter the radius of circle: ");
            circleResult(input.nextDouble());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException, only positive real numbers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      4.
        try {
            System.out.print("Enter the count of numbers: ");
            getAvg(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only positive integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      5.
        try {
            System.out.print("Input the first number: ");
            int firstNum = input.nextInt();

            System.out.print("Input the second number: ");
            int secondNum = input.nextInt();

            System.out.print("Input the third number: ");
            int thirdNumb = input.nextInt();

            System.out.println("The result is: " + isEqual(firstNum, secondNum, thirdNumb));
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      6.
        System.out.print("Input a word: ");
        getReverse(input.next());

        System.out.println("\n---------------------------------------------------");

//      7.
        try {
            System.out.print("Enter a number: ");
            isEvenOrOdd(input.nextInt());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException, only real numbers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      8.
        try {
            System.out.print("Enter temperature in Centigrade: ");
            float temp = input.nextFloat();
            System.out.printf("Temperature in Fahrenheit is %.1f%n", toFahrenheit(temp));
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only real numbers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      9.
        System.out.print("Input a string: ");
        String userString = input.nextLine();
        userString = input.nextLine();

        try {
            System.out.print("Input a number: ");
            int index = input.nextInt();
            printChar(userString, index);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      10.
        double width = 5.5, height = 8.5;

        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, width * height);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, 2 * (width + height));

        System.out.println("---------------------------------------------------");

//      11.
        try {
            System.out.print("Input first integer: ");
            int firstInt = input.nextInt();

            System.out.print("Input the second integer: ");
            int secondInt = input.nextInt();

            compareNums(firstInt, secondInt);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      12.
        try {
            System.out.print("Input seconds: ");
            convertToClock(input.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only real numbers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      13.
        try {
            System.out.print("Input first number: ");
            int firstNumber = input.nextInt();

            System.out.print("Input second number: ");
            int secondNumber = input.nextInt();

            System.out.print("Input third number: ");
            int thirdNumber = input.nextInt();

            System.out.print("Input forth number: ");
            int fourthNumber = input.nextInt();
            areEqual(firstNumber, secondNumber, thirdNumber, fourthNumber);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      14
        try {
            System.out.print("Input a number: ");
            checkNum(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      15.
        try {
            System.out.print("Input a number, or -1 to quit: ");
            howMany(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      16.
        System.out.print("Input a number: ");
        reversedNumber(input.next());

        System.out.println("\n---------------------------------------------------");

//      17.
        try {
            System.out.print("Enter a number, or 0 to quit: ");
            minAndMax(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, only integers are allowed");
        }

        System.out.println("---------------------------------------------------");

//      18.
        System.out.print("Enter a string: ");
        String userStr = input.nextLine();
        userStr = input.nextLine();
        howManyA(userStr);
    }


//  1.
    public static void intOperations(double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
    }

//  2.
    public static void tenMultiplicationTable(int num) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " × " + i + " = " + (num * i));
            }
        } catch (InputMismatchException i) {
            System.out.println("InputMismatchException, enter only numbers!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//  3.
    public static void circleResult(double radius) {
        try {
            if (radius < 0) {
                throw new ArithmeticException("ArithmeticException, enter positive radius!");
            }
            else {
                System.out.println("Perimeter = " + (2 * 3.14 * radius));
                System.out.println("Area = " + (3.14 * (radius * radius)));
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

//  4.
    public static void getAvg(int count) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        try {
            if (count < 1) {
                throw new Exception("Exception! Enter a positive number of words");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < count; i++) {
                System.out.print("Enter an integer: ");
                sum += input.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException, enter only numbers!");
        }
        System.out.println("The average is: " + (double)(sum / count));
    }

//  5.
    public static boolean isEqual(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }

//  6.
    public static void getReverse(String word) {
        System.out.print("Reverse word: ");
        try {
            for (int i = word.length() - 1; i >= 0; i--)
                System.out.print(word.charAt(i));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

//  7.
    public static void isEvenOrOdd(int num) {
        if (num % 2 == 0)
            System.out.println("The number is Even");

        else System.out.println("The number is Odd");
    }

//  8.
    public static float toFahrenheit(float temperature) {
        try {
            return ((temperature * 9) / 5) + 32;
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
        return ((temperature * 9) / 5) + 32;
    }

//  9.
    public static void printChar(String word, int index) {
        try {
            System.out.println(word.charAt(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

//  11.
    public static void compareNums(int firstInt, int secondInt) {
        if (firstInt == secondInt)
            System.out.println(firstInt + " = " + secondInt);

        if (firstInt != secondInt)
            System.out.println(firstInt + " != " + secondInt);

        if (firstInt > secondInt)
            System.out.println(firstInt + " > " + secondInt);

        if (firstInt >= secondInt)
            System.out.println(firstInt + " >= " + secondInt);

        if (firstInt < secondInt)
            System.out.println(firstInt + " < " + secondInt);

        if (firstInt <= secondInt)
            System.out.println(firstInt + " <= " + secondInt);
    }

//  12.
    public static void convertToClock(double seconds) {
        try {
            if (seconds < 0)
                throw new InputMismatchException("Exception! Seconds must be a positive integer");
            double hours = seconds / 3600;
            double minutes = (seconds % 3600);
            double newSeconds = minutes % 60;

            minutes /= 60;

            System.out.println(
                    (int) Math.floor(hours) + ":" +
                    (int) Math.floor(minutes) + ":" +
                    (int) Math.floor(newSeconds));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//  13.
    public static void areEqual(int num1, int num2, int num3, int num4) {
        if (num1 == num2 && num2 == num3 && num3 == num4)
            System.out.println("Numbers are equal!");

        else System.out.println("Numbers are not equal!");
    }

//  14.
    public static void checkNum(int num) {
        if (num == 0)
            System.out.println("Number is 0");

        else if (num > 0)
            System.out.println("Number is positive");

        else System.out.println("Number is negative");
    }

//  15.
    public static void howMany(int num) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        while (num != -1) {
            if (num == -1) break;

            else if (num > 0)
                positiveCount++;
            else if (num < 0)
                negativeCount++;
            else
                zeroCount ++;

            System.out.print("Input a number, or -1 to quit: ");
            num = input.nextInt();
        }

        System.out.println(
                positiveCount + " positives\n" +
                        zeroCount + " zeros\n" +
                        negativeCount + " negatives");
    }

//  16.
    public static void reversedNumber(String num) {
            try {
                for (int i = num.length() - 1; i >= 0; i--)
                    System.out.print(num.charAt(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
    }

//  17.
    public static void minAndMax(int number) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 9999;

        while (number != 0) {
            if (max <= number)
                max = number;
            if (min >= number)
                min = number;
            System.out.print("Enter a number, or 0 to quit: ");
            number = input.nextInt();
        }

        System.out.println(
                "\nThe largest number is: " + max +
                "\nThe smallest number is: " + min
        );
    }

//  18.
    public static void howManyA(String word) {
        int counter = 0;
        char let = 'a';

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a')
                counter++;
        }

        System.out.println("Number of 'a's: " + counter);
    }
}
