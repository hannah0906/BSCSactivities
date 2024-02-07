using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Thread thread = new Thread (new ThreadStart(MyThread));
            thread.Start();
        }

        public void MyThread()
        {
            for (int x = 0; x<= 5; x++)
            {
                Console.WriteLine("Thread Process: " + x);   
            }
        }
    }
}
