package org.example;

public class Main {
    public static void main(String[] args) {
        // Palindrom Sayı Kontrolü
        System.out.println("121 palindrom mu? " + isPalindrome(121));
        System.out.println("707 palindrom mu? " + isPalindrome(707));
        System.out.println("11212 palindrom mu? " + isPalindrome(11212));

        // Mükemmel Sayı Kontrolü
        System.out.println("6 mükemmel sayı mı? " + isPerfectNumber(6));
        System.out.println("28 mükemmel sayı mı? " + isPerfectNumber(28));
        System.out.println("5 mükemmel sayı mı? " + isPerfectNumber(5));

        // Sayıyı Kelimelere Çevirme
        System.out.println("123 kelime olarak: " + numberToWords(123));
        System.out.println("1010 kelime olarak: " + numberToWords(1010));
        System.out.println("-12 kelime olarak: " + numberToWords(-12));
    }

    // Palindrom sayıyı bulan metod
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return original == reverse;
    }

    // Mükemmel sayıyı bulan metod
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Sayıyı kelimelere döken metod
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int digit = number % 10;
            result.insert(0, words[digit] + " ");
            number /= 10;
        }

        return result.toString().trim();
    }
}

