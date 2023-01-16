package controller;

import java.util.Scanner;

public class InputDado
{
    private String arq; 
    
    public InputDado () {}

    public void setDado (String texto) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println(texto);
        String d = teclado.next();
        this.arq = d;
        teclado.close();
    }

    public String getDado() 
    {
        return this.arq;
    }
}