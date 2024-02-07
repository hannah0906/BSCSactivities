using System;
namespace ItemNamespace
{
    public abstract class Item
    {
        protected string item_name; //stores the name of the item
        protected double item_price; //stores the price of the item
        protected int item_quantity; //stores the number of item
        private double total_price; //stores total price of the item

        public Item(string name, double price, int quantity)  //constructor for the item class
        {
            this.item_name = name; 
            this.item_price = price; 
            this.item_quantity = quantity;
        }

        public abstract double getTotalPrice(); //abstract method to calculate total price
        public abstract void setPayment(double amount);

        public string ItemName //properties to access item_name
        {
            get { return item_name; }   
            set { item_name = value; }
        }

        public double ItemPrice //properties to access item_price
        {
            get { return item_price; }  
            set { item_price = value; }
        }

        public int ItemQuantity //properties to access item_quantity
        {
            get { return item_quantity; }
            set { item_quantity = value; }
        }

        public double TotalPrice //properties to access total_price
        {
            get { return total_price; }
            set { total_price = value; }
        }
    }
}
