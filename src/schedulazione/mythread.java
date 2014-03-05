/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulazione;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mythread extends Thread {
    String name;
    int time_slice=500;
    
    int tempo_lavoro;
    int priorità;
    Thread th;
    long max_cpu=10000;
    boolean out=true;
    int tempo;
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
 long t2=0;
 
 
    
    
    
         
        
    public mythread(String name, int priorità, int tempo_lavoro){
           this.name=name;
           this.priorità=priorità;
           th=new Thread(this);
           this.tempo_lavoro=tempo_lavoro;
           
            
    }

    @Override
    public void run() {
        
     
        
        
        
      
        
        
        tempo_lavoro=tempo_lavoro-time_slice;
        if(tempo_lavoro==0||tempo_lavoro<0){
           
            
            
            out=false;
            
                
            
        
            
        }else{
           
            System.out.println(name+" Tempo rimanente:"+tempo_lavoro);
            
            
        }
        //t1=c.getTimeInMillis();
        //t=t2-t1;
        
        //max_cpu=max_cpu-t;
        
        
        
       
       t2=System.currentTimeMillis();
        
        
    }
    public String toString(){
        return "Nome:"+name+" "+"Time Slice:"+time_slice+" Tempo lavoro: "+tempo_lavoro+" Priorità: "+priorità;
        
    }
}
