using System;
namespace ItemNamespace {
    public class DiscountedItem : Item //DiscountedItem class inherits from the Item class
    {
        private double item_discount;  //stores the discount percentage
        private double discounted_price; //stores the price after discount
        private double payment_amount; //stores payment amount
        private double change; //stores change

        public DiscountedItem (string name, double price, int quantity, double discount) : base (name, price, quantity) //constructor for discounted items
        { this.item_discount = discount; }

        public override double getTotalPrice() //calculates the total price
        {
            this.discounted_price = ItemPrice - (ItemPrice  * (this.item_discount * 0.01));
            TotalPrice = ItemQuantity * (discounted_price);
            return TotalPrice;
        }

        public override void setPayment(double amount) {//sets the payment amount and calculate the change
            payment_amount = amount;
            this.change = this.payment_amount - TotalPrice;
        }

        public double getChange() { return this.change; } //gets the change

        public double ItemDiscount //properties to access item_discount
        {
            get { return this.item_discount; }
            set { this.item_discount = value; }
        }

        public double DiscountedPrice //properties to access discounted_price
        {
            get { return this.discounted_price; }
            set { this.discounted_price = value; }
        }
        public double PaymentAmount //properties to access payment_amount
        {
            get { return this.payment_amount; }
            set { this.payment_amount = value; }
        }

        public double Change //properties to access change
        {
            get { return this.change; }
            set { this.change = value; }
        }
    }
}
