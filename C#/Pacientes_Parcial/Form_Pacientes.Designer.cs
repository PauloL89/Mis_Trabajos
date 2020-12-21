namespace Pacientes_Parcial
{
    partial class Form_Pacientes
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.rb_Femenino = new System.Windows.Forms.RadioButton();
            this.rb_Masculino = new System.Windows.Forms.RadioButton();
            this.txt_apellido = new System.Windows.Forms.TextBox();
            this.txt_nombre = new System.Windows.Forms.TextBox();
            this.txt_numPac = new System.Windows.Forms.TextBox();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.cmb_denominacion = new System.Windows.Forms.ComboBox();
            this.cmb_plan = new System.Windows.Forms.ComboBox();
            this.btn_Registrar = new System.Windows.Forms.Button();
            this.btn_Salir = new System.Windows.Forms.Button();
            this.label7 = new System.Windows.Forms.Label();
            this.txt_Edad = new System.Windows.Forms.TextBox();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(6, 45);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(107, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Numero de Paciente:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(6, 73);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(47, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Nombre:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(6, 104);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(47, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Apellido:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(6, 163);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(34, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Sexo:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(6, 35);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(78, 13);
            this.label5.TabIndex = 4;
            this.label5.Text = "Denominacion:";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(6, 93);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(28, 13);
            this.label6.TabIndex = 5;
            this.label6.Text = "Plan";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.txt_Edad);
            this.groupBox1.Controls.Add(this.label7);
            this.groupBox1.Controls.Add(this.rb_Femenino);
            this.groupBox1.Controls.Add(this.rb_Masculino);
            this.groupBox1.Controls.Add(this.txt_apellido);
            this.groupBox1.Controls.Add(this.txt_nombre);
            this.groupBox1.Controls.Add(this.txt_numPac);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Location = new System.Drawing.Point(12, 24);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(339, 220);
            this.groupBox1.TabIndex = 8;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Pacientes";
            // 
            // rb_Femenino
            // 
            this.rb_Femenino.AutoSize = true;
            this.rb_Femenino.Location = new System.Drawing.Point(137, 187);
            this.rb_Femenino.Name = "rb_Femenino";
            this.rb_Femenino.Size = new System.Drawing.Size(71, 17);
            this.rb_Femenino.TabIndex = 8;
            this.rb_Femenino.TabStop = true;
            this.rb_Femenino.Text = "Femenino";
            this.rb_Femenino.UseVisualStyleBackColor = true;
            // 
            // rb_Masculino
            // 
            this.rb_Masculino.AutoSize = true;
            this.rb_Masculino.Location = new System.Drawing.Point(137, 163);
            this.rb_Masculino.Name = "rb_Masculino";
            this.rb_Masculino.Size = new System.Drawing.Size(73, 17);
            this.rb_Masculino.TabIndex = 7;
            this.rb_Masculino.TabStop = true;
            this.rb_Masculino.Text = "Masculino";
            this.rb_Masculino.UseVisualStyleBackColor = true;
            // 
            // txt_apellido
            // 
            this.txt_apellido.Location = new System.Drawing.Point(137, 101);
            this.txt_apellido.Name = "txt_apellido";
            this.txt_apellido.Size = new System.Drawing.Size(138, 20);
            this.txt_apellido.TabIndex = 6;
            // 
            // txt_nombre
            // 
            this.txt_nombre.Location = new System.Drawing.Point(137, 70);
            this.txt_nombre.Name = "txt_nombre";
            this.txt_nombre.Size = new System.Drawing.Size(138, 20);
            this.txt_nombre.TabIndex = 5;
            // 
            // txt_numPac
            // 
            this.txt_numPac.Location = new System.Drawing.Point(137, 42);
            this.txt_numPac.Name = "txt_numPac";
            this.txt_numPac.Size = new System.Drawing.Size(87, 20);
            this.txt_numPac.TabIndex = 4;
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.cmb_denominacion);
            this.groupBox2.Controls.Add(this.cmb_plan);
            this.groupBox2.Controls.Add(this.label5);
            this.groupBox2.Controls.Add(this.label6);
            this.groupBox2.Location = new System.Drawing.Point(12, 250);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(339, 139);
            this.groupBox2.TabIndex = 9;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Obra Social";
            // 
            // cmb_denominacion
            // 
            this.cmb_denominacion.FormattingEnabled = true;
            this.cmb_denominacion.Items.AddRange(new object[] {
            "Daspu",
            "Swiss Medical",
            "Federada"});
            this.cmb_denominacion.Location = new System.Drawing.Point(137, 35);
            this.cmb_denominacion.Name = "cmb_denominacion";
            this.cmb_denominacion.Size = new System.Drawing.Size(138, 21);
            this.cmb_denominacion.TabIndex = 8;
            // 
            // cmb_plan
            // 
            this.cmb_plan.FormattingEnabled = true;
            this.cmb_plan.Items.AddRange(new object[] {
            "Recibo de Sueldo",
            "Prepago",
            "Monotributo"});
            this.cmb_plan.Location = new System.Drawing.Point(137, 84);
            this.cmb_plan.Name = "cmb_plan";
            this.cmb_plan.Size = new System.Drawing.Size(138, 21);
            this.cmb_plan.TabIndex = 7;
            this.cmb_plan.SelectedIndexChanged += new System.EventHandler(this.cmb_plan_SelectedIndexChanged);
            // 
            // btn_Registrar
            // 
            this.btn_Registrar.Location = new System.Drawing.Point(90, 418);
            this.btn_Registrar.Name = "btn_Registrar";
            this.btn_Registrar.Size = new System.Drawing.Size(98, 39);
            this.btn_Registrar.TabIndex = 10;
            this.btn_Registrar.Text = "Registrar";
            this.btn_Registrar.UseVisualStyleBackColor = true;
            this.btn_Registrar.Click += new System.EventHandler(this.btn_Registrar_Click);
            // 
            // btn_Salir
            // 
            this.btn_Salir.Location = new System.Drawing.Point(372, 418);
            this.btn_Salir.Name = "btn_Salir";
            this.btn_Salir.Size = new System.Drawing.Size(98, 39);
            this.btn_Salir.TabIndex = 11;
            this.btn_Salir.Text = "Salir";
            this.btn_Salir.UseVisualStyleBackColor = true;
            this.btn_Salir.Click += new System.EventHandler(this.btn_Salir_Click);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(6, 135);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(35, 13);
            this.label7.TabIndex = 9;
            this.label7.Text = "Edad:";
            // 
            // txt_Edad
            // 
            this.txt_Edad.Location = new System.Drawing.Point(137, 127);
            this.txt_Edad.Name = "txt_Edad";
            this.txt_Edad.Size = new System.Drawing.Size(108, 20);
            this.txt_Edad.TabIndex = 10;
            // 
            // Form_Pacientes
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(629, 469);
            this.Controls.Add(this.btn_Salir);
            this.Controls.Add(this.btn_Registrar);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Name = "Form_Pacientes";
            this.Text = "App_Pacientes";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.TextBox txt_apellido;
        private System.Windows.Forms.TextBox txt_nombre;
        private System.Windows.Forms.TextBox txt_numPac;
        private System.Windows.Forms.RadioButton rb_Femenino;
        private System.Windows.Forms.RadioButton rb_Masculino;
        private System.Windows.Forms.ComboBox cmb_plan;
        private System.Windows.Forms.ComboBox cmb_denominacion;
        private System.Windows.Forms.Button btn_Registrar;
        private System.Windows.Forms.Button btn_Salir;
        private System.Windows.Forms.TextBox txt_Edad;
        private System.Windows.Forms.Label label7;
    }
}

