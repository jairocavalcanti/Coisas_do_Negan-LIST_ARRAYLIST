package Coisas_do_Negan;

import java.util.List;
import java.util.ArrayList;

public class ListagemaVeiculos {
    public static void main(String[] args) {
    Veiculos vei1 = new Veiculos("Ford Ranger - Médio Estado");
    Veiculos vei2 = new Veiculos("Chevrolet S10 - Bom Estado");
    Veiculos vei3 = new Veiculos("Hyundai HB20 - (Amo esse carro) - MEU");
    Veiculos vei4 = new Veiculos("Volkswagem Virtus - Médio Estado");

    List<Veiculos> listvei = new ArrayList<>();

    listvei.add(vei1);
    listvei.add(vei2);
    listvei.add(vei3);
    listvei.add(vei4);
   
    Aviso();
    listaveiculos(listvei);
    }


    public static void Aviso() {
    for(int  i=0 ; i<3 ; i++){
        System.out.println("!!Veiculos novos devem ser apresentados diretamente ao Negan!!");
        }
    }
     
    public static void listaveiculos(List<Veiculos> listvei){
    for(Veiculos s : listvei ){
        System.out.println("Veiculos Capturados:--" + s.getModelo());
        }
      }
    }

    

