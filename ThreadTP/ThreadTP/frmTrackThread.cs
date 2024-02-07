using System;
using System.Threading;
using System.Windows.Forms;
using System.Diagnostics;

namespace ThreadTP
{
    public partial class frmTrackThread : Form
    {
        public frmTrackThread()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try {

                //create four threads using the MyThreadClass methods
                Thread threadA = new Thread(new ThreadStart(MyThreadClass.Thread1));
                Thread threadB = new Thread(new ThreadStart(MyThreadClass.Thread2));
                Thread threadC = new Thread(new ThreadStart(MyThreadClass.Thread1));
                Thread threadD = new Thread(new ThreadStart(MyThreadClass.Thread2));

                //set names for each thread
                threadA.Name = "Thread A Process";
                threadB.Name = "Thread B Process";
                threadC.Name = "Thread C Process";
                threadD.Name = "Thread D Process";

                //set priorities for each thread
                threadA.Priority = ThreadPriority.Highest;
                threadB.Priority = ThreadPriority.Normal;
                threadC.Priority = ThreadPriority.AboveNormal;
                threadD.Priority = ThreadPriority.BelowNormal;

                //display a message indicating the start of the threads in the console and the label
                Console.WriteLine("- Thread Starts -");
                label1.Text = "- Thread Starts -";

                //start each thread
                threadA.Start();
                threadB.Start();
                threadC.Start();
                threadD.Start();

                //Possible exceptions
               // threadA.Start();

                Thread.Sleep(1500);

                 threadC.Interrupt();

                //wait for each thread to finish
                threadA.Join();
                threadB.Join();
                threadC.Join();
                threadD.Join();

                //display a message indicating the end of the threads in the console and the label

                Console.WriteLine("- End of Thread -");
                label1.Text = "- End of Thread -";
            }

            catch (ThreadInterruptedException ex) //Exception 
            {
                label1.Text = " - Already Running - ";
                Console.WriteLine("Exception Message: " + ex.Message);
                return;
            }

            catch (ThreadStateException ex) //Exception 
            {
                label1.Text = " - Already Running - ";
                Console.WriteLine("Exception Message: " + ex.Message);
                return;
            }
        }
    }
}
