using System;
using System.Diagnostics;
using System.Threading;

namespace ThreadTP
{
    class MyThreadClass
    {
        public static void Thread1() //Method 1
        {
            for (int i = 0; i <= 2; i++)
            {
                try
                {
                    Thread thread = Thread.CurrentThread;
                    Console.WriteLine("Name of Thread: " + thread.Name + " = " + i);
                    Thread.Sleep(500); //pause the thread for 0.5 sec
                }

                catch (Exception ex)
                {
                    Console.WriteLine("Exception Message: " + ex.Message);
                }
            }
        }

        public static void Thread2() //Method 2
        {

            for (int i = 0; i < 6; i++)
            {
                try
                {
                    Thread thread = Thread.CurrentThread;
                    Console.WriteLine("Name of Thread: " + thread.Name + " = " + i);
                    Thread.Sleep(1500); //pause the thread for 1.5 sec
                }

                catch (Exception ex)
                {
                    Console.WriteLine("Exception Message: " + ex.Message);
                }
            }
        }
    }
}

