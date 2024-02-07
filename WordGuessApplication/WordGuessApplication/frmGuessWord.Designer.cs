namespace WordGuessApplication
{
    partial class frmGuessWord
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.attemptListBox = new System.Windows.Forms.ListBox();
            this.wrongLabel = new System.Windows.Forms.Label();
            this.correctLabel = new System.Windows.Forms.Label();
            this.userTxtBox = new System.Windows.Forms.TextBox();
            this.guessButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // attemptListBox
            // 
            this.attemptListBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.attemptListBox.FormattingEnabled = true;
            this.attemptListBox.ItemHeight = 16;
            this.attemptListBox.Location = new System.Drawing.Point(370, 35);
            this.attemptListBox.Name = "attemptListBox";
            this.attemptListBox.Size = new System.Drawing.Size(183, 148);
            this.attemptListBox.TabIndex = 4;
            // 
            // wrongLabel
            // 
            this.wrongLabel.BackColor = System.Drawing.Color.DarkSeaGreen;
            this.wrongLabel.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.wrongLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.wrongLabel.Location = new System.Drawing.Point(369, 9);
            this.wrongLabel.Name = "wrongLabel";
            this.wrongLabel.Size = new System.Drawing.Size(186, 22);
            this.wrongLabel.TabIndex = 0;
            this.wrongLabel.Text = "Wrong Guess";
            this.wrongLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // correctLabel
            // 
            this.correctLabel.BackColor = System.Drawing.Color.DarkSeaGreen;
            this.correctLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.correctLabel.Location = new System.Drawing.Point(12, 9);
            this.correctLabel.Name = "correctLabel";
            this.correctLabel.Size = new System.Drawing.Size(346, 93);
            this.correctLabel.TabIndex = 1;
            this.correctLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // userTxtBox
            // 
            this.userTxtBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.userTxtBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.userTxtBox.Location = new System.Drawing.Point(26, 110);
            this.userTxtBox.Name = "userTxtBox";
            this.userTxtBox.Size = new System.Drawing.Size(318, 29);
            this.userTxtBox.TabIndex = 2;
            this.userTxtBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // guessButton
            // 
            this.guessButton.BackColor = System.Drawing.Color.DarkSeaGreen;
            this.guessButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.guessButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.guessButton.Location = new System.Drawing.Point(107, 145);
            this.guessButton.Name = "guessButton";
            this.guessButton.Size = new System.Drawing.Size(159, 37);
            this.guessButton.TabIndex = 3;
            this.guessButton.Text = "Guess";
            this.guessButton.UseVisualStyleBackColor = false;
            this.guessButton.Click += new System.EventHandler(this.guessButton_Click);
            // 
            // frmGuessWord
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlLight;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.ClientSize = new System.Drawing.Size(567, 194);
            this.Controls.Add(this.attemptListBox);
            this.Controls.Add(this.guessButton);
            this.Controls.Add(this.userTxtBox);
            this.Controls.Add(this.correctLabel);
            this.Controls.Add(this.wrongLabel);
            this.ForeColor = System.Drawing.Color.White;
            this.Name = "frmGuessWord";
            this.Text = "Guess the Word";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label wrongLabel;
        private System.Windows.Forms.Label correctLabel;
        private System.Windows.Forms.TextBox userTxtBox;
        private System.Windows.Forms.Button guessButton;
        private System.Windows.Forms.ListBox attemptListBox;
    }
}

