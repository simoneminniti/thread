/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulazione;

import java.util.Random;

/**
 *
 * @author minniti.simone
 */
public class Schedulazione {

    
    public static void main(String[] args) throws InterruptedException {
       mythread vettore[]= new mythread[10];
      
       mythread coda1[]= new mythread[10];
       mythread coda2[]=new mythread[10];
       mythread coda3[] = new mythread[10];
       mythread coda4[] = new mythread[10];
      Random r = new Random();
      
      
       //Creazione thread casuale (10)
       for(int i=0; i<10; i++){
           vettore[i]=new mythread("Thread ".concat(Integer.toString(i)),r.nextInt(4),r.nextInt(1000));
           
       }
        Coda c = new Coda(vettore);
       c.prova();
       c.Stampa();
       c.esecuzione();
       
       /*for(int h = 0; h<10; h++){
           System.out.println(vettore[h].priorità);
           
       }*/
    }
}
