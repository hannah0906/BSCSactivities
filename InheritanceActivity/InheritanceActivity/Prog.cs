using System;
using UserNamespace;

namespace InheritanceActivity
{
    public class Prog
    {
        public static void Main(string[] args)
        {
            Console.Write("Enter admin name: ");
            string adminName = Console.ReadLine();

            Console.Write("Enter user id: ");
            string userId = Console.ReadLine();

            Console.Write("Enter password: ");
            string userPassword = Console.ReadLine();

            Administrator admin = new Administrator(adminName, userId, userPassword);

            bool check = admin.verifyLogin(userId, userPassword);

            if (check.Equals(true))
            {
                Console.WriteLine("------------- You have successfully logged in -------------");
                Console.WriteLine("Admin Name: " + admin.adminName);
                Console.WriteLine("User ID: " + admin.userId);
                Console.WriteLine("Password: " + admin.userPassword);
                Console.WriteLine("------------- Actions to be done -------------");
                Console.WriteLine("Press 1 to change your Admin Name.");
                Console.WriteLine("Press 2 to change your Password.");
                Console.Write("Enter your choice: ");
                int choice = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("------------------------------");

                switch (choice)
                {

                    case 1:
                        Console.Write("Enter new admin name: ");
                        string newName = Console.ReadLine();
                        admin.updateName(newName);
                        break;

                    case 2:
                        Console.Write("Enter new password: ");
                        string newPass = Console.ReadLine();
                        admin.updatePassword(newPass);
                        break;

                    default:
                        Console.WriteLine("Only enter valid actions. Try Again.");
                        Console.ReadKey();
                        break;
                }

                Console.WriteLine("------------------------------");
                Console.WriteLine("Try Logging in with your new admin name / password.");
                Console.Write("Enter admin name: ");
                string adminName1 = Console.ReadLine();

                Console.Write("Enter user id: ");
                string userId1 = Console.ReadLine();

                Console.Write("Enter password: ");
                string userPassword1 = Console.ReadLine();

                bool check1 = admin.verifyLogin(userId1, userPassword1);

                if (check1.Equals(true))
                {
                    Console.WriteLine("------------- You have successfully logged in -------------");
                    Console.WriteLine("Admin Name: " + admin.adminName);
                    Console.WriteLine("User ID: " + admin.userId);
                    Console.WriteLine("Password: " + admin.userPassword);
                }

                else
                {
                    Console.WriteLine("Incorrect username or password.");
                }
            }

            else
            {
                Console.WriteLine("Incorrect username or password.");
            }

            Console.WriteLine("Press any key to exit...");
            Console.ReadKey();
        }
    }
}

