﻿using System;
namespace Inventory
{
    internal class ProductClass //given code
    {
        private int _Quantity;
        private double _SellingPrice;
        private string _ProductName, _Category, _ManufacturingDate, _ExpirationDate, _Description;

        public ProductClass(string ProductName, string Category, string MfgDate, string ExpDate, double Price, int Quantity, string Description)
        { //constructor
            this._Quantity = Quantity;
            this._SellingPrice = Price;
            this._ProductName = ProductName;
            this._Category = Category;
            this._ManufacturingDate = MfgDate;
            this._ExpirationDate = ExpDate;
            this._Description = Description;
        }

        //provided get-set methods to access the private fields
        public string productName
        {
            get { return this._ProductName; }
            set { this._ProductName = value; }
        }
        public string category
        {
            get { return this._Category; }
            set { this._Category = value; }
        }
        public string manufacturingDate
        {
            get { return this._ManufacturingDate; }
            set { this._ManufacturingDate = value; }
        }
        public string expirationDate
        {
            get { return this._ExpirationDate; }
            set { this._ExpirationDate = value; }
        }
        public string description
        {
            get { return this._Description; }
            set { this._Description = value; }
        }
        public int quantity
        {
            get { return this._Quantity; }
            set { this._Quantity = value; }
        }
        public double sellingPrice
        {
            get { return this._SellingPrice; }
            set { this._SellingPrice = value; }
        }
    }
}
   
