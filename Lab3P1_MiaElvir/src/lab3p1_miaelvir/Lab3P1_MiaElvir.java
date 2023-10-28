
package lab3p1_miaelvir;

import java.util.Scanner; 
public class Lab3P1_MiaElvir {

    
    public static void main(String[] args) {
        
        Scanner papoy = new Scanner(System.in); 
        System.out.println("Menu");
        System.out.println("1. Sucesiones y más sucesiones");
        System.out.println("2. Pocket monsters");
        System.out.println("3. Asterisco en casa");
        System.out.println("4. Salir");
        System.out.println("Ingrese opcion: ");
        int opcion = papoy.nextInt(); 

        
        while (opcion > 0 && opcion < 4){
            
            switch (opcion) {

                case 1: 
                    
                    System.out.println("Sucesiones y mas sucesiones");
                    System.out.println("");
                    
                    int diferencia, inicial, cantidad;
                    System.out.print("Ingrese la diferencia: ");
                    diferencia = papoy.nextInt(); 
                    System.out.print("Ingrese el numero incial: ");
                    inicial = papoy.nextInt(); 
                    System.out.print("Ingrese la cantidad: ");
                    cantidad = papoy.nextInt(); 

                    for (int i = 1; i <= cantidad; i++){
                        if (i == cantidad){
                            System.out.println(inicial);
                        }else{
                            System.out.print(inicial+", ");
                            inicial += diferencia;
                            diferencia += 1; 

                           
                        }// else principal 
                    }// for principal 
                    
                    System.out.println("Ingrese la posicion de numero que desea ver: ");
                    int num_suces = papoy.nextInt(); 
                    
                    for (int i = cantidad; i <= num_suces; i++){
                        if (i == num_suces){
                            System.out.println("El numero seria: "+inicial);
                        }else{
                            inicial += diferencia; 
                            diferencia+= 1; 
                        }
                    }

                    break; 
                    
                case 2: 
                    
                    System.out.println("Pocket Monsters");
                    System.out.println("");
                    
                    
                    System.out.println("Ingrese el modo de pelea que desea: ");
                    System.out.println("1. Hasta la muerte");
                    System.out.println("2. Por Rondas");
                    int modo = papoy.nextInt(); 
                    
                    System.out.println("Estadisticas de los pokemones");
                    System.out.println("Sylveon Vida: 280  Ataque: 80  Defensa: 15%");
                    System.out.println("Gyarados Vida: 300  Ataque: 50  Defensa: 10%");
                    System.out.println("Giratina Vida: 300  Ataque: 70  Defensa: 25%");
                    System.out.println("Dragonite Vida: 250 Ataque: 75  Defensa: 20%");
                    System.out.println("");
                    
                    System.out.println("Ingrese una pelea determinada: ");
                    System.out.println("1. Sylveon vrs Dragonite");
                    System.out.println("2. Gyarados vrs Giradina");
                    System.out.println("3. Dragonite vrs Giratina");
                    System.out.println("4. Giratina vrs Sylveon");
                    int pelea = papoy.nextInt(); 
                    double vida_s = 0; 
                    double defensa_s = 0; 
                    double ataque_s = 0; 
                    double vida_d = 0; 
                    double defensa_d = 0; 
                    double ataque_d = 0; 
                    double vida_g = 0; 
                    double defensa_g = 0; 
                    double ataque_g = 0; 
                    double vida_gn = 0;  
                    double defensa_gn = 0; 
                    double ataque_gn = 0; 
                    
                    switch (pelea){
                        
                        case 1: 
                            vida_s = 280;
                            defensa_s = 0.15; 
                            ataque_s = 80; 
                            vida_d = 250;
                            defensa_d = 0.20; 
                            ataque_d = 75; 
                            
                            
                            
                           if (modo ==1){
                               
                               for (int i = 1; vida_s > 0 && vida_d > 0; i++){
                                   //double pp = ataque * 1 - defensa del opuesto 
                                   System.out.println("------------Ronda "+i+" ------------");
                                   System.out.println("Vida de pokemon 1: "+vida_s);
                                   System.out.println("Vida de pokemon 2: "+vida_d);
                                   
                                   
                                   System.out.println("Pokemon 1 Ha atacado!");
                                   System.out.println("Pokemon 2 Ha atacado!");
                                   System.out.println("");
                                   
                                   
                                   vida_s -= (ataque_d * (1 - defensa_s)); 
                                   vida_d -= (ataque_s * (1 - defensa_d)); 
                                   
                                   if (vida_s < 0){
                                       vida_s = 0; 
                                   }else if (vida_d < 0) {
                                       vida_d = 0; 
                                   }
                                   
                                   System.out.println("Vida de Pokemon 1: "+vida_s);
                                   System.out.println("Vida de Pokemon 2: "+vida_d);
                                   
                               }
                           
                               if (vida_s > vida_d){
                                   System.out.println("Gano Pokemon 1!");
                               }else{
                                   System.out.println("Gano Pokemon 2!");
                               }
                               
                               System.out.println(" ");
                               
                           }
                           if (modo ==2){
                               
                               for (int i = 1; i <= 10 && (vida_s > 0 && vida_d > 0) ; i++){
                                   //double pp = ataque * 1 - defensa del opuesto 
                                   System.out.println("------------Ronda "+i+" ------------");
                                   System.out.println("Vida de pokemon 1: "+vida_s);
                                   System.out.println("Vida de pokemon 2: "+vida_d);
                                   
                                   
                                   System.out.println("Pokemon 1 Ha atacado!");
                                   System.out.println("Pokemon 2 Ha atacado!");
                                   System.out.println("");
                                   
                                   vida_s -= (ataque_d * (1 - defensa_s)); 
                                   vida_d -= (ataque_s * (1 - defensa_d)); 
                                   
                                   if (vida_s < 0){
                                       vida_s = 0; 
                                   }else if (vida_d < 0) {
                                       vida_d = 0; 
                                   }
                                   
                                   System.out.println("Vida de Pokemon 1: "+vida_s);
                                   System.out.println("Vida de Pokemon 2: "+vida_d);
                               }
                               
                               if (vida_s > vida_d){
                                   System.out.println("Gano Pokemon 1!");
                               }else{
                                   System.out.println("Gano Pokemon 2!");
                               }
                               
                               System.out.println(" ");
                           
                           }
                           
                           break; 
                           
                            
                         
                        case 2: 
                            
                            vida_g = 300; 
                            defensa_g = 0.10; 
                            ataque_g = 50; 
                            vida_gn = 300; 
                            defensa_gn = 0.25; 
                            ataque_gn = 70; 
                            
                            if (modo == 1){
                            
                                for (int i = 1; vida_g > 0 && vida_gn > 0; i++){
                                   //double pp = ataque * 1 - defensa del opuesto 
                                   System.out.println("------------Ronda "+i+" ------------");
                                   System.out.println("Vida de pokemon 1: "+vida_g);
                                   System.out.println("Vida de pokemon 2: "+vida_gn);
                                   
                                   
                                   System.out.println("Pokemon 1 Ha atacado!");
                                   System.out.println("Pokemon 2 Ha atacado!");
                                   System.out.println("");
                                   
                                   
                                   vida_g -= (ataque_gn * (1 - defensa_g)); 
                                   vida_gn -= (ataque_g * (1 - defensa_gn)); 
                                   
                                   if (vida_g < 0){
                                       vida_g = 0; 
                                   }else if (vida_gn < 0) {
                                       vida_gn = 0; 
                                   }
                                   
                                   System.out.println("Vida de Pokemon 1: "+vida_g);
                                   System.out.println("Vida de Pokemon 2: "+vida_gn);
                                   
                               }
                           
                               if (vida_g > vida_gn){
                                   System.out.println("Gano Pokemon 1!");
                               }else{
                                   System.out.println("Gano Pokemon 2!");
                               }
                               
                               System.out.println(" ");
                               
                           
                            }
                            
                            if (modo == 2){
                                
                                for (int i = 1; i <= 10 && (vida_g > 0 && vida_gn > 0) ; i++){
                                   //double pp = ataque * 1 - defensa del opuesto 
                                   System.out.println("------------Ronda "+i+" ------------");
                                   System.out.println("Vida de pokemon 1: "+vida_g);
                                   System.out.println("Vida de pokemon 2: "+vida_gn);
                                   
                                   
                                   System.out.println("Pokemon 1 Ha atacado!");
                                   System.out.println("Pokemon 2 Ha atacado!");
                                   System.out.println("");
                                   
                                   vida_g -= (ataque_gn * (1 - defensa_g)); 
                                   vida_gn -= (ataque_g * (1 - defensa_gn)); 
                                   
                                   if (vida_g < 0){
                                       vida_g = 0; 
                                   }else if (vida_gn < 0) {
                                       vida_gn = 0; 
                                   }
                                   
                                   System.out.println("Vida de Pokemon 1: "+vida_g);
                                   System.out.println("Vida de Pokemon 2: "+vida_gn);
                               }
                               
                               if (vida_g > vida_gn){
                                   System.out.println("Gano Pokemon 1!");
                               }else{
                                   System.out.println("Gano Pokemon 2!");
                               }
                               
                               System.out.println(" ");
                            
                            }
                            break; 
                            
                        case 3: 
                            
                            vida_d = 300; 
                            defensa_d = 0.10; 
                            ataque_d = 50; 
                            vida_gn = 300; 
                            defensa_gn = 0.25; 
                            ataque_gn = 70; 
                            
                            if (modo == 1){
                            
                                for (int i = 1; vida_d > 0 && vida_gn > 0; i++){
                                   //double pp = ataque * 1 - defensa del opuesto 
                                   System.out.println("------------Ronda "+i+" ------------");
                                   System.out.println("Vida de pokemon 1: "+vida_d);
                                   System.out.println("Vida de pokemon 2: "+vida_gn);
                                   
                                   
                                   System.out.println("Pokemon 1 Ha atacado!");
                                   System.out.println("Pokemon 2 Ha atacado!");
                                   System.out.println("");
                                   
                                   
                                   vida_d -= (ataque_gn * (1 - defensa_d)); 
                                   vida_gn -= (ataque_d * (1 - defensa_gn)); 
                                   
                                   if (vida_d < 0){
                                       vida_d = 0; 
                                   }else if (vida_gn < 0) {
                                       vida_gn = 0; 
                                   }
                                   
                                   System.out.println("Vida de Pokemon 1: "+vida_d);
                                   System.out.println("Vida de Pokemon 2: "+vida_gn);
                                   
                               }
                           
                               if (vida_d > vida_gn){
                                   System.out.println("Gano Pokemon 1!");
                               }else{
                                   System.out.println("Gano Pokemon 2!");
                               }
                               
                               System.out.println(" ");
                               
                            }
                            
                            if (modo == 2){
                                
                                for (int i = 1; i <= 10 && (vida_d > 0 && vida_gn > 0) ; i++){
                                   //double pp = ataque * 1 - defensa del opuesto 
                                   System.out.println("------------Ronda "+i+" ------------");
                                   System.out.println("Vida de pokemon 1: "+vida_d);
                                   System.out.println("Vida de pokemon 2: "+vida_gn);
                                   
                                   
                                   System.out.println("Pokemon 1 Ha atacado!");
                                   System.out.println("Pokemon 2 Ha atacado!");
                                   System.out.println("");
                                   
                                   vida_d -= (ataque_gn * (1 - defensa_d)); 
                                   vida_gn -= (ataque_d * (1 - defensa_gn)); 
                                   
                                   if (vida_d < 0){
                                       vida_d = 0; 
                                   }else if (vida_gn < 0) {
                                       vida_gn = 0; 
                                   }
                                   
                                   System.out.println("Vida de Pokemon 1: "+vida_d);
                                   System.out.println("Vida de Pokemon 2: "+vida_gn);
                               }
                               
                               if (vida_d > vida_gn){
                                   System.out.println("Gano Pokemon 1!");
                               }else{
                                   System.out.println("Gano Pokemon 2!");
                               }
                               
                               System.out.println(" ");
                            
                            }
                            
                            break; 
                            
                        case 4: 
                            
                            vida_gn = 300; 
                            defensa_gn = 0.25; 
                            ataque_gn = 70; 
                            vida_s = 280;
                            defensa_s = 0.15; 
                            ataque_s = 80; 
                            
                            if (modo == 1){
                                
                                for (int i = 1; vida_gn > 0 && vida_s > 0; i++){
                                   //double pp = ataque * 1 - defensa del opuesto 
                                   System.out.println("------------Ronda "+i+" ------------");
                                   System.out.println("Vida de pokemon 1: "+vida_gn);
                                   System.out.println("Vida de pokemon 2: "+vida_s);
                                   
                                   
                                   System.out.println("Pokemon 1 Ha atacado!");
                                   System.out.println("Pokemon 2 Ha atacado!");
                                   System.out.println("");
                                   
                                   
                                   vida_gn -= (ataque_s * (1 - defensa_gn)); 
                                   vida_s -= (ataque_gn * (1 - defensa_s)); 
                                   
                                   if (vida_gn < 0){
                                       vida_gn = 0; 
                                   }else if (vida_s < 0) {
                                       vida_s = 0; 
                                   }
                                   
                                   System.out.println("Vida de Pokemon 1: "+vida_gn);
                                   System.out.println("Vida de Pokemon 2: "+vida_s);
                                   
                               }
                           
                               if (vida_gn > vida_s){
                                   System.out.println("Gano Pokemon 1!");
                               }else{
                                   System.out.println("Gano Pokemon 2!");
                               }
                               
                               System.out.println(" ");
                            
                            }
                            
                            if (modo == 2){
                                
                                for (int i = 1; i <= 10 && (vida_gn > 0 && vida_s > 0) ; i++){
                                   //double pp = ataque * 1 - defensa del opuesto 
                                   System.out.println("------------Ronda "+i+" ------------");
                                   System.out.println("Vida de pokemon 1: "+vida_gn);
                                   System.out.println("Vida de pokemon 2: "+vida_s);
                                   
                                   
                                   System.out.println("Pokemon 1 Ha atacado!");
                                   System.out.println("Pokemon 2 Ha atacado!");
                                   System.out.println("");
                                   
                                   vida_gn -= (ataque_s * (1 - defensa_gn)); 
                                   vida_s -= (ataque_gn * (1 - defensa_s)); 
                                   
                                   if (vida_gn < 0){
                                       vida_gn = 0; 
                                   }else if (vida_s < 0) {
                                       vida_s = 0; 
                                   }
                                   
                                   System.out.println("Vida de Pokemon 1: "+vida_gn);
                                   System.out.println("Vida de Pokemon 2: "+vida_s);
                               }
                               
                               if (vida_gn > vida_s){
                                   System.out.println("Gano Pokemon 1!");
                               }else{
                                   System.out.println("Gano Pokemon 2!");
                               }
                               
                               System.out.println(" ");
                            
                            }
                            break; 
                            
                            
                     
                    }// fin switch pelea 
                    
                    
                    break; 
                    
                case 3: 
                    
                    System.out.println("Asterisco en Casa");
                    System.out.println("");
                    
                    System.out.print("Ingrese un numero IMPAR: ");
                    int tamaño = papoy.nextInt(); 
                    
                    if (tamaño % 2 == 0){
                        System.out.println("El numero debe ser IMPAR, ingreselo de nuevo: ");
                        tamaño = papoy.nextInt();
                         
                        
                    }else{
                        int mid = (tamaño)/2;
                        for (int i = 1; i <= tamaño; i++){
                            for (int j = 1; j <= tamaño; j++){
                                if (i == 1 || i == tamaño ){
                                    System.out.print("* ");
                                }else if(j == 1 || j == tamaño){
                                    System.out.print("* ");
                                }else if (j == (tamaño+1)/2){
                                    System.out.print("| ");
                                }else if (j == i || i + j == tamaño+1){
                                    System.out.print("> ");
                                }else{
                                    System.out.print("  ");
                                }
                            }
                            
                                    
                            System.out.println("");
                        }
                    
                    }
                    break; 
                    

            }// fin switch



        
            
        System.out.println("Menu");
        System.out.println("1. Sucesiones y más sucesiones");
        System.out.println("2. Pocket monsters");
        System.out.println("3. Asterisco en casa");
        System.out.println("4. Salir");
        System.out.println("Ingrese opcion: ");
        opcion = papoy.nextInt(); 
        
        }// fin while  
        
        
    }// fin main
    
}// fin class
