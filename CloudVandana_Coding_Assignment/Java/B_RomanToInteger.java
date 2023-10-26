import java.util.Scanner;

public class B_RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String roman = scanner.nextLine();
        System.out.println("The Integer of given Roman number is: " + romanToInt(roman));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        if (s.indexOf("IV") != -1) sum -= 2;
        if (s.indexOf("IX") != -1) sum -= 2;
        if (s.indexOf("XL") != -1) sum -= 20;
        if (s.indexOf("XC") != -1) sum -= 20;
        if (s.indexOf("CD") != -1) sum -= 200;
        if (s.indexOf("CM") != -1) sum -= 200;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') sum += 1;
            if (s.charAt(i) == 'V') sum += 5;
            if (s.charAt(i) == 'X') sum += 10;
            if (s.charAt(i) == 'L') sum += 50;
            if (s.charAt(i) == 'C') sum += 100;
            if (s.charAt(i) == 'D') sum += 500;
            if (s.charAt(i) == 'M') sum += 1000;
        }

        return sum;
    }
}
