package com.mycompany.transporte;
import java.util.Scanner;

public class Transporte {
    
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;
    
    public Transporte(){
    }
    
    public Transporte(int capacidadeTanque, int numeroPassageiros, double preco){
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }
    
    public void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }
    
    public void setNumeroPassageiros(int numeroPassageiros){
        this.numeroPassageiros = numeroPassageiros;
    }
    
    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void imprimir(){
         System.out.println("Capacidade do Tanque: " + capacidadeTanque);
         System.out.println("numero de passageiros: " + numeroPassageiros);
         System.out.println("Valor do Transporte: " + preco);
    }
    
    public void entradaDeDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade do tanque: ");
        capacidadeTanque = scanner.nextInt();
        System.out.print("Digite o numero de passageiros: ");
        numeroPassageiros = scanner.nextInt();
        System.out.print("Digite o preco do transporte: ");
        preco = scanner.nextDouble();
    }
    
    public void ReajustarPreço(float percentual) {
        preco += preco * (percentual/100);
    }  
    
}