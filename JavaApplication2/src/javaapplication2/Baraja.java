package javaapplication2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {
    private ArrayList<Cartas>cartas;
    private ArrayList<Cartas>monton;
    private int cantidadCartas=40;

    public Baraja() {
        cartas= new ArrayList<>();
        monton= new ArrayList<>();
    }
   
   public void crearBaraja(){
       for(int i=1; i<=12;i++){
           if (i != 8 && i !=9){
                cartas.add(new Cartas(i, "Espadas"));
                cartas.add(new Cartas(i, "Bastos"));
                cartas.add(new Cartas(i, "Oros"));
                cartas.add(new Cartas(i, "Copas"));
           }
       }
   }
   
   public void Barajar(){
       Collections.shuffle(cartas);
       System.out.println("Se barajaron las cartas");
   }
   
   public void  siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja");
           cartas=null;
        } else {
            cartas.remove(0);
            System.out.println("Sigue Habiendo cartas");
        }
    }
   
   public void cartasDisponibles() {
           cartas.size();
           System.out.print("-----------------------------------------------------------------");
          System.out.print(cartas);
    }
    
   public void darCartas(){
       System.out.println("Indique el numero de cartas que quiere recibir");
       Scanner sc1 = new Scanner(System.in);
       int numCartas = sc1.nextInt();
       if(numCartas<=cantidadCartas){
           System.out.println("Recibio las siguiente cartas: ");
           System.out.println(" ");
           for (int i=0; i<numCartas; i++){
            Cartas cartasDadas=cartas.get(i);
            monton.add(cartasDadas);
            cartas.remove(monton);
              System.out.println(cartasDadas);
           }
       }else{
           System.out.println("No hay suficientes cartas");
       }
   }
   
   }
   

