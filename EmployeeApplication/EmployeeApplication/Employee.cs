using System;
namespace EmployeeNamespace {
    public class Employee { //class called Employee under EmployeeNamespace namespace
        //private instance variables to store employee information
        private long employeeID; //employee ID
        private string fName; //first name
        private string lName; //last name
        private string pos; //position
        public Employee() { //default constructor
            this.employeeID = 0;
            this.fName = "no name";
            this.lName = "no name";
            this.pos = "no position"; }
        public Employee(long newemployeeID) { //first overloaded method
            this.employeeID = newemployeeID;
            this.fName = "no name";
            this.lName = "no name";
            this.pos = "no position"; }
        public Employee(string newfName, string newlName, string newPos) { //second overloaded method 
            this.employeeID = 0;
            this.fName = newfName;
            this.lName = newlName;
            this.pos = newPos;  }

        public long eId { //encapsulates employee id
            get { return this.employeeID; }
            set { this.employeeID = value; }}
        public string firstName { //encapsulates first name
            get { return this.fName; }
            set { this.fName = value; } }
        public string lastName { //encapsulates last name
            get { return this.lName; }
            set { this.lName = value; }  }
        public string posiTion { //encapsulates position
            get { return this.pos; }
            set { this.pos = value; } }
    }
}
