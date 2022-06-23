package Coisas_do_Negan;

import java.util.ArrayList;
import java.util.List;

public class ListagemArmamentos { 
    public static void main(String[] args) {
    Armamentos arms1 = new Armamentos("AK47 - 3 unidades");
    Armamentos arms2 = new Armamentos("M16 - 4 unidades");
    Armamentos arms3 = new Armamentos("M4A1 - 1 unidade");
    Armamentos arms4 = new Armamentos("COLT1911 - 18 unidades");

    List <Armamentos> armas = new ArrayList<>();
    
    armas.add(arms1);
    armas.add(arms2);
    armas.add(arms3);
    armas.add(arms4);
     
    aviso();
    System.out.println("//Listagem de armas//");
    listaarmas(armas);
}
public static void listaarmas(List<Armamentos> armas) {
    for(Armamentos s : armas){
        System.out.println("Armas:--" + s.getArmamentos());
    }
}  
private static void aviso(){
    for(int x= 0; x<3; x++){
        System.out.println("!!Sujeito a punição SEVERA em caso de roubo!!");
    }
  }
}
