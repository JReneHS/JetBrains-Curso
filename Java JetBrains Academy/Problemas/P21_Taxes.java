package Problemas;

import java.util.Scanner;

/* In some country, there are N companies, and the law of that country says that the taxes of each company are individual and appointed by a president. President wants to know which company pays the most taxes. But sadly, none of the president's proxies know math very well, so this work is transferred to you. Can you solve this problem?

The first line of the input contains N which is the number of companies in this country.
The second line contains the yearly incomes of each company. All numbers are non-negative integers.
The third line contains individual taxes for each company in percent of the company's income. All numbers are integers from 0 to 100 inclusive.

You should output № of the company that pays the most taxes. Keep in mind that the enumeration of the companies starts with number 1. If there are several companies with the same payment sizes, output the number of the company with the lowest number.

Note: be careful not to lose fractional parts while performing your calculations. All input and output numbers are integers, but you may have to use a different type for storing intermediate values. */

public class P21_Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] incomesYearly = new int[numberOfCompanies];
        int[] taxes = new int[numberOfCompanies];
        int pos = 0;
        double fullPay;
        double maxPay = 0.0D;

        for (int i = 0; i < numberOfCompanies; i++) {
            incomesYearly[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfCompanies; i++) {
            taxes[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfCompanies; i++) {
            fullPay = (double) incomesYearly[i] * taxes[i] / 100;
            if (fullPay > maxPay) {
                maxPay = fullPay;
                pos = i + 1;
            }
        }
        System.out.println(pos);
        scanner.close();
    }
}