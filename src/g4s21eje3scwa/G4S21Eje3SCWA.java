/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21eje3scwa;

/**
 *
 * @author hp
 */
public class G4S21Eje3SCWA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("operaciones"+ args.length);
        for (int a=0; a<args.length;a++)
        
        System.out.println("valor#"+a+", contiene ->"+ args[a]);
        for (int a=0; a<args.length;a++){
            if(args[a].equals( "22-5")) break;
        System.out.println("El resultado es 27, del valor #"+args[a]);
        }
           
        for (int a=1; a<args.length;a++){
            if(args[a].equals( "22x5")) break;
        System.out.println("El resultado es 17, del valor #"+args[a]);
        }
         
        for (int a=2; a<args.length;a++){
            if(args[a].equals( "22/5")) break;
        System.out.println("El resultado es 110, del valor #"+args[a]);
        }
       
        for(int a=3; a<args.length;a++){
            if(args[a].equals("")) break;
        System.out.println("El resultado 4.4, del valor #"+args[a]);
        }
        
        System.out.println("Nos salimos de la ejecucion");
        
        
        
        }
}

