package Coisas_do_Negan;

import java.util.ArrayList;
import java.util.List;

public class ListagemAlimentos {
public static void main(String[] args) {
Suprimentos sup1 = new Suprimentos("Conservas Vegetais-5");        
Suprimentos sup2 = new Suprimentos("Enlatados-13"); 
Suprimentos sup3 = new Suprimentos("ovos-20");
Suprimentos sup4 = new Suprimentos("Carne-6KG");

List<Suprimentos> listasups = new ArrayList<>();

listasups.add(sup1);
listasups.add(sup2);
listasups.add(sup3);
listasups.add(sup4);

contador(); 
imprimirlista(listasups);

}
public static void imprimirlista(List<Suprimentos> listasups){
    for (Suprimentos s : listasups){
    System.out.println("Reservas:--" +  s.getAlimentos());
    }
}
private static void contador(){
for (int x = 0; x < 1; x++ ){
   System.out.println("\\\\ESTOQUE_DOS_SALVADORES\\\\"); 
    }
  }
}
