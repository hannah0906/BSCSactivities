using System;
namespace StudentNamespace
{
    //class called StudentInfo under StudentNamespace
    public class StudentInfo {

        //private fields to store student information.
        private string fName; //first name
        private string lName; //last name
        private int studID; //student ID

        public StudentInfo() { //default constructor
            this.fName = "no name";
            this.lName = "no name";
            this.studID = 0; }
        public StudentInfo(string newFname, string newLname) { //first overloaded constructor
            this.fName = newFname;
            this.lName = newLname;
            this.studID = 0; }

        public StudentInfo(int newStudID) { //second overloaded constructor
            this.fName = "no name";
            this.lName = "no name";
            this.studID = newStudID; }

        public string firstName { //encapsulates first name
            get{ return this.fName; }
            set{ this.fName = value; } }

        public string lastName { //encapsulates last name
            get{ return this.lName; }
            set{ this.lName = value; } }

        public int studentNumber { //encapsulates student number
            get{ return this.studID; }
            set { this.studID = value; } }
    }
}
