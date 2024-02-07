using System;
using System.IO;
using System.Windows.Forms;

namespace HandsOnActivity12
{
    public partial class FrmLab1 : Form
    {
        public FrmLab1()
        {
            InitializeComponent();
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            FrmFileName form = new FrmFileName(); //open file name input

            string getInput = txtInput.Text; //get user input for the content of the file

            if (!string.IsNullOrWhiteSpace(getInput))
            {
                form.ShowDialog();

                string docPath = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
                using (StreamWriter outputFile = new StreamWriter(Path.Combine(docPath, FrmFileName.SetFileName)))
                {
                    outputFile.WriteLine(getInput);
                    Console.WriteLine(getInput);
                }
            }

            else
            {
                MessageBox.Show("Fill out the form.");
                return;
            }

            FrmRegistration reg = new FrmRegistration(); //opens FrmRegistration Form
            reg.ShowDialog();
            Close();
        }
    }
}
