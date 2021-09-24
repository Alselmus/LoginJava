package com.codebind;
import javax.swing.*;


public class Ventana extends JFrame{
    private JPanel panel1;
    private JLabel usuario;
    private JLabel password;
    private JTextField txtusuario;
    private JTextField txtpassword;
    private JButton ingresarButton;
    private JButton salirButton;

    public Ventana():{
        super(title:"Ejemplo de Java Swin Login");
        setContentPane(panel1);
    }

}
