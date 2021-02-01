package com.Java.ChapterThreeOneTwo;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Invoice  myInvoice =  new Invoice(0.0,0.0,0,"This is My first Invoice","00124");
        System.out.println("Enter your pricePerItem: ");
        myInvoice.setPricePerItem(obj.nextDouble());
        System.out.println("Enter your Item Quantity: ");
        myInvoice.setItemQuantity(obj.nextInt());
        System.out.println("Enter your product description: ");
        myInvoice.setDescription(obj.nextLine());
        System.out.println(myInvoice.getDescription());


       System.out.println("Your invoice amount is:"+myInvoice.getInvoiceAmount());


//        System.out.println(myInvoice.getPartNumber());
//        System.out.println(myInvoice.getDescription());
//        System.out.println();

    }
}
