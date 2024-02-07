using System;
using System.Text;
using System.Windows.Forms;

namespace WordGuessApplication
{
    public partial class frmGuessWord : Form
    {
        string correctAnswer; //stores the correct answer
        StringBuilder wordToGuess; //place holder for the correct answer

        public frmGuessWord()
        {
            InitializeComponent();

            string[] words = { "computer", "keyboard", "mouse", "printer" }; //array of words to be guessed

            Random word = new Random(); //generates a random index on the words array
            int wordIndex = word.Next(words.Length);
            correctAnswer = words[wordIndex]; //stores the word on the correct answer variable
            wordToGuess = new StringBuilder("?"); //stringbuilder to represent the word to guess with ?

            for (int i = 0; i < correctAnswer.Length - 1; i++){
                wordToGuess.Append("?");} //add a ? placeholder for each letter of the word

            wordToGuess[0] = correctAnswer[0]; //sets the first letter of the chosen word to be shown 
            wordToGuess[wordToGuess.Length - 1] = correctAnswer[correctAnswer.Length - 1]; //sets the last letter of the chosen word to be shown
            correctLabel.Text = wordToGuess.ToString(); //displays the previously set first and last letter
        }
        private void guessButton_Click(object sender, EventArgs e)
        {
            string userGuess = userTxtBox.Text.ToLower(); //converts user guess to all lower case

            if (correctAnswer.Equals(userGuess.ToString(), StringComparison.CurrentCultureIgnoreCase)) //if the guess is correct
            {
                correctLabel.Text = correctAnswer.ToString(); //the label will display the correct answer
                MessageBox.Show("Correct Guess!"); //a message box will appear
                return;
            }

            else //if the answer is incorrect
            {
                attemptListBox.Items.Add(userGuess.ToString()); //wrong answer is added on the attempt list
                MessageBox.Show("Wrong Guess! \n Try again."); //a message box will appear
                userTxtBox.Clear(); //textbox is cleared
            }
        }
    }
}