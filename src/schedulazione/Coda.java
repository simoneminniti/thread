/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulazione;

import java.util.Calendar;

/**
 *
 * @author minniti.simone
 */
public class Coda {
    mythread vettore[];
    Calendar c = new Calendar() {

        @Override
        protected void computeTime() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        protected void computeFields() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void add(int field, int amount) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void roll(int field, boolean up) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getMinimum(int field) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getMaximum(int field) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getGreatestMinimum(int field) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int getLeastMaximum(int field) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    
    mythread coda1[]= new mythread[10];
       mythread coda2[]=new mythread[10];
       mythread coda3[] = new mythread[10];
       mythread coda4[] = new mythread[10];
       mythread coda0[] = new mythread[10];
       mythread codatemp[] = new mythread[10];
       
    public Coda(mythread vettore[]){
        this.vettore=vettore;
            
            
    }
    //Thread messi nei loro corrispondenti array di code in base alla priorità 
    public void Stampa(){
        /*for(int i=0; i<10; i++){
            if(coda1[i]==null){
                System.out.println("null");
                
            }else{
            System.out.println(coda1[i].toString());
            }
           /*System.out.println(coda2[i].toString());
            
            System.out.println(coda3[i].toString());
               System.out.println(coda4[i].toString());
               System.out.println(coda0[i].toString());*/
            
        }
        
        
        
        
    
     public void esecuzione() throws InterruptedException{
         
         //implmenetazione coda0
         int nvuoto=0;
         int l=0;
         int m=0;
         //System.currentTimeMillis();
         do{
             
             
             nvuoto=0;
             for(int i=0; i<9; i++){
               
                 if(coda0[i]!=null&&coda0[i+1]!=null){
                    if(coda0[i+1].t2-System.currentTimeMillis()>coda0[i].t2-System.currentTimeMillis()){
                        
                        codatemp[0] =coda0[i];
                        
                        coda0[i]=coda0[i+1];
                        
                        coda0[i+1]=codatemp[0];
                        
                        
                    }
                 
                 
                 }else{}
             }
             
             
             
                 
             if(l==10){
                 l=0;
                 
                 
             }
           if(coda0[l]!=null){
               if(coda0[l].isDaemon()){
                   coda0[l].notify();
                   
               }else{
                   
               
               
               coda0[l].start();
               coda0[l].wait();
               }
               
               if(coda0[l].out==false){
                   
                   
               System.out.println(coda0[l].name+" Finito ed eliminato!");
              coda0[l]=null;
                   
           }
               l++;
           }else{
              
               l++;
          
           
           
           }
           //Implementazione coda1
           
           
          
            /*if(coda1[m]!=null){
            coda1[m].start();
                
           
           if(coda1[m].out==false)
               System.out.println(coda1[m].name+" Finito ed eliminato!");
               coda1[m]=null;
               m++;
           }else{m++;}
          
           */
           
           
          
           
           
             
         for(int y=0; y<10; y++){
             if(coda0[y]!=null){
                 nvuoto++;
                 
            
             
         }
         }
         
         
         //implmentazione coda2
         
         
         
         
         
         
         
        
           
               
           
           
           
         }while(nvuoto!=0);
         
       
         
     
     
     
      
                 }

    
    public void prova(){
    int i = 0,h = 0,k = 0,l = 0,o = 0;
    
        for(int j=0; j<10; j++){
            
        if(vettore[j].priorità==0){
            coda0[i]=vettore[j];
            i++;
        
        }else if(vettore[j].priorità==1){
            coda1[h]=vettore[j];
           h++;
         
        }else if(vettore[j].priorità==2){
            coda2[k]=vettore [j];
            l++;
        }else if(vettore[j].priorità==3){
            coda3[l]=vettore[j];
            l++;
        }else if(vettore[j].priorità==4){
            coda4[o]=vettore[j];
            o++;
        }
}
        
    
        /**
     *
     */
 
            
      
    
    
    
    }
    
}
