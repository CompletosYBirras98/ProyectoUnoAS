package com.mycompany.proyectounoas;

import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<Gasto> lista= new ArrayList<Gasto>();
 
        lista.add(new Gasto("Luz",12000,false));
        lista.add(new Gasto("Agua",7000,false));
        lista.add(new Gasto("Internet",30000,false));
        lista.add(new Gasto("Gas",20000,false));
 
        /*No compila esto:
        double resultado=lista.stream().mapToDouble(gasto-gasto.getValor()*1.21)
                        .filter(gasto->gasto<20000)
                        .sum();
        */
        
        //Lo haré denuevo
        
        
        double resultado=0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getValor()<20000){
                resultado=resultado+lista.get(i).getValor() + (lista.get(i).getValor()*0.21);
            }else{
                resultado=resultado+lista.get(i).getValor();
            }
            
        }
        
        System.out.println(resultado);
        
        

    }
}
