package com.Java.ChapterThreeOneTwo;
/*3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent
        an invoice for an item sold at the store. An Invoice should include four pieces of information as
        instance variables—a part number (type String), a part description (type String), a quantity of the
        item being purchased (type int) and a price per item (double). Your class should have a constructor
        that initializes the four instance variables. Provide a set and a get method for each instance variable.
        In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
        multiplies the quantity by the price per item), then returns the amount as a double value. If the
        quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
        0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.


        */

import java.sql.SQLOutput;

public class Invoice {
    private double invoiceAmount;
    private double pricePerItem;   //rate or unit price
    private int itemQuantity;
    private String description;
    private String partNumber;

    public Invoice(double invoiceAmount, double pricePerItem, int itemQuantity, String description, String partNumber) {
        this.invoiceAmount = invoiceAmount;
        this.pricePerItem = pricePerItem;
        this.itemQuantity = itemQuantity;
        this.description = description;
        this.partNumber = partNumber;
    }

    //    Constructor to set default values
    //public Invoice(double pricePerItem, int itemQuantity, String description, String partNumber){

//    }

        public void setPricePerItem ( double pricePerItem){

        }
        public double getPricePerItem () {

            return pricePerItem;

        }
        public void setItemQuantity ( int itemQuantity){
            this.itemQuantity = itemQuantity;
        }

        public int getItemQuantity () {
            return itemQuantity;
        }

        public void setDescription (String description){
            this.description = description;
        }
        public String getDescription () {
            return description;
        }
        public void setPartNumber (String partNumber){
            this.partNumber = partNumber;
        }
        public String getPartNumber() {
            return partNumber;
        }


        public double getInvoiceAmount () {
            if(pricePerItem< 0.0)
            pricePerItem = 0;
            if(itemQuantity < 0)
                itemQuantity = 0;

           //this.pricePerItem = pricePerItem;

            double invoiceAmount = getItemQuantity() * getPricePerItem();
            return invoiceAmount;

        }

    }
