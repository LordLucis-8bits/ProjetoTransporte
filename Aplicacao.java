package com.mycompany.transporte;

public class Aplicacao {
    public static void main(String[] args){
        
        Transporte[] listTransportes = new Transporte[20];
        
        for(int i = 0; i < 10; i++){
          listTransportes[i] = new Aviao();
          listTransportes[i].entradaDeDados();
          System.out.print("\n");
        }
        for(int i = 10; i < 20; i++){
            listTransportes[i] = new Navio();
            listTransportes[i].entradaDeDados();
            System.out.print("\n");
            
        }
        for(Transporte transporte : listTransportes){
            transporte.imprimir();
            System.out.println();
        }  
    }
}