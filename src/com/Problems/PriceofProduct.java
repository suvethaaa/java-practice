package com.Problems;
import java.util.Scanner;
//A supermarket maintains a pricing format for all its products. A value N is printed on each product.when scanner
// reads the value N on the item, the product of all the digits in the value N is the price of the item. The task
// here is to design the software such that// given the code of any item N the product (multiplication) of all the
// digits of value should be computed(price).
public class PriceofProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(originalPrice(n));
    }

    static int originalPrice(int n){
        int price = 1;
        while(n > 0){
            int rem = n%10;
            price*=rem;
            n /= 10;
        }
        return price;
    }
}