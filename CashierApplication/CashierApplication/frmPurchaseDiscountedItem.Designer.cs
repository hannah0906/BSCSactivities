namespace CashierApplication
{
    partial class frmPurchaseDiscountedItem
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.itemTxt = new System.Windows.Forms.TextBox();
            this.discTxt = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.priceTxt = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.quantityTxt = new System.Windows.Forms.TextBox();
            this.compute = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.amountLabel = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.payText = new System.Windows.Forms.TextBox();
            this.submit = new System.Windows.Forms.Button();
            this.label7 = new System.Windows.Forms.Label();
            this.changeTxt = new System.Windows.Forms.Label();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.fileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.logoutToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.exitApplicationToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(16, 44);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(45, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Item:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(251, 44);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(104, 20);
            this.label2.TabIndex = 1;
            this.label2.Text = "Discount (%):";
            // 
            // itemTxt
            // 
            this.itemTxt.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.itemTxt.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.itemTxt.Location = new System.Drawing.Point(20, 68);
            this.itemTxt.Name = "itemTxt";
            this.itemTxt.Size = new System.Drawing.Size(212, 22);
            this.itemTxt.TabIndex = 2;
            // 
            // discTxt
            // 
            this.discTxt.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.discTxt.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.discTxt.Location = new System.Drawing.Point(255, 68);
            this.discTxt.Name = "discTxt";
            this.discTxt.Size = new System.Drawing.Size(153, 22);
            this.discTxt.TabIndex = 3;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(16, 99);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(48, 20);
            this.label3.TabIndex = 4;
            this.label3.Text = "Price:";
            // 
            // priceTxt
            // 
            this.priceTxt.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.priceTxt.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.priceTxt.Location = new System.Drawing.Point(67, 99);
            this.priceTxt.Name = "priceTxt";
            this.priceTxt.Size = new System.Drawing.Size(165, 22);
            this.priceTxt.TabIndex = 5;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(251, 101);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(72, 20);
            this.label4.TabIndex = 6;
            this.label4.Text = "Quantity:";
            // 
            // quantityTxt
            // 
            this.quantityTxt.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.quantityTxt.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.quantityTxt.Location = new System.Drawing.Point(324, 100);
            this.quantityTxt.Name = "quantityTxt";
            this.quantityTxt.Size = new System.Drawing.Size(84, 22);
            this.quantityTxt.TabIndex = 7;
            // 
            // compute
            // 
            this.compute.BackColor = System.Drawing.SystemColors.ControlLight;
            this.compute.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.compute.Location = new System.Drawing.Point(159, 136);
            this.compute.Name = "compute";
            this.compute.Size = new System.Drawing.Size(98, 27);
            this.compute.TabIndex = 8;
            this.compute.Text = "Compute";
            this.compute.UseVisualStyleBackColor = false;
            this.compute.Click += new System.EventHandler(this.compute_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(118, 182);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(108, 20);
            this.label5.TabIndex = 9;
            this.label5.Text = "Total Amount:";
            this.label5.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // amountLabel
            // 
            this.amountLabel.AutoSize = true;
            this.amountLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.amountLabel.Location = new System.Drawing.Point(232, 182);
            this.amountLabel.Name = "amountLabel";
            this.amountLabel.Size = new System.Drawing.Size(0, 20);
            this.amountLabel.TabIndex = 10;
            this.amountLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(16, 227);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(145, 20);
            this.label6.TabIndex = 11;
            this.label6.Text = "Payment Received:";
            // 
            // payText
            // 
            this.payText.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.payText.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.payText.Location = new System.Drawing.Point(167, 228);
            this.payText.Name = "payText";
            this.payText.Size = new System.Drawing.Size(132, 22);
            this.payText.TabIndex = 12;
            // 
            // submit
            // 
            this.submit.BackColor = System.Drawing.SystemColors.ControlLight;
            this.submit.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.submit.Location = new System.Drawing.Point(307, 228);
            this.submit.Name = "submit";
            this.submit.Size = new System.Drawing.Size(98, 22);
            this.submit.TabIndex = 13;
            this.submit.Text = "Submit";
            this.submit.UseVisualStyleBackColor = false;
            this.submit.Click += new System.EventHandler(this.submit_Click);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(118, 266);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(69, 20);
            this.label7.TabIndex = 14;
            this.label7.Text = "Change:";
            this.label7.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // changeTxt
            // 
            this.changeTxt.AutoSize = true;
            this.changeTxt.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.changeTxt.Location = new System.Drawing.Point(188, 266);
            this.changeTxt.Name = "changeTxt";
            this.changeTxt.Size = new System.Drawing.Size(0, 20);
            this.changeTxt.TabIndex = 15;
            this.changeTxt.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // menuStrip1
            // 
            this.menuStrip1.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fileToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(424, 24);
            this.menuStrip1.TabIndex = 16;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // fileToolStripMenuItem
            // 
            this.fileToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.logoutToolStripMenuItem,
            this.exitApplicationToolStripMenuItem});
            this.fileToolStripMenuItem.Name = "fileToolStripMenuItem";
            this.fileToolStripMenuItem.Size = new System.Drawing.Size(37, 20);
            this.fileToolStripMenuItem.Text = "File";
            // 
            // logoutToolStripMenuItem
            // 
            this.logoutToolStripMenuItem.Name = "logoutToolStripMenuItem";
            this.logoutToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.logoutToolStripMenuItem.Text = "Logout";
            this.logoutToolStripMenuItem.Click += new System.EventHandler(this.logoutToolStripMenuItem_Click);
            // 
            // exitApplicationToolStripMenuItem
            // 
            this.exitApplicationToolStripMenuItem.Name = "exitApplicationToolStripMenuItem";
            this.exitApplicationToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.exitApplicationToolStripMenuItem.Text = "Exit Application";
            this.exitApplicationToolStripMenuItem.Click += new System.EventHandler(this.exitApplicationToolStripMenuItem_Click);
            // 
            // frmPurchaseDiscountedItem
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(424, 309);
            this.Controls.Add(this.changeTxt);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.submit);
            this.Controls.Add(this.payText);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.amountLabel);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.compute);
            this.Controls.Add(this.quantityTxt);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.priceTxt);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.discTxt);
            this.Controls.Add(this.itemTxt);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "frmPurchaseDiscountedItem";
            this.Text = "Purchase Discounted Item";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox itemTxt;
        private System.Windows.Forms.TextBox discTxt;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox priceTxt;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox quantityTxt;
        private System.Windows.Forms.Button compute;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label amountLabel;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox payText;
        private System.Windows.Forms.Button submit;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label changeTxt;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem logoutToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem exitApplicationToolStripMenuItem;
    }
}

