
package wat;

import java.util.Scanner;

public class Wat {


    public static void main(String[] args) {
       
        
        while(true){
            
            Scanner dime=new Scanner(System.in);
            int res;
            System.out.println("Profe es que, no alcanzo a ver que es (Es un arbol de sistemas operativos basados en Unix o Linux?)");
            System.out.println("Es que lo tomo con celular, puede volver a subirlo con mejor resolucion?");
            System.out.println("1-Si");
            System.out.println("2-No");
            System.out.print("Que dice?");
            res=dime.nextInt();
            if(res==1){
                System.out.println("Ya, oka profe.");
                break;
            }else if(res==2){
                System.out.println("Pero prooooofe!!!");
            }
            
        }
        
    }
    
}
