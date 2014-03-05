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
    mythread coda1[] = new mythread[10];
    mythread coda2[] = new mythread[10];
    mythread coda3[] = new mythread[10];
    mythread coda4[] = new mythread[10];
    mythread coda0[] = new mythread[10];
    mythread codatemp[] = new mythread[10];
    private int nvuoto;

    public Coda(mythread vettore[]) {
        this.vettore = vettore;


    }
    //Thread messi nei loro corrispondenti array di code in base alla priorità 

    public void Stampa() {
        
    }

    

public void ordina(){
    
            nvuoto = 0;
            for (int i = 0; i < 9; i++) {

                if (coda0[i] != null && coda0[i + 1] != null) {
                    if (coda0[i + 1].t2 - System.currentTimeMillis() > coda0[i].t2 - System.currentTimeMillis()) {

                        codatemp[0] = coda0[i];

                        coda0[i] = coda0[i + 1];

                        coda0[i + 1] = codatemp[0];


                    }


                } else {
                }
            }

}


        

    public void prova() {
        int i = 0, h = 0, k = 0, l = 0, o = 0;

        for (int j = 0; j < 10; j++) {

            if (vettore[j].priorità == 0) {
                coda0[i] = vettore[j];
                i++;

            } else if (vettore[j].priorità == 1) {
                coda1[h] = vettore[j];
                h++;

            } else if (vettore[j].priorità == 2) {
                coda2[k] = vettore[j];
                l++;
            } else if (vettore[j].priorità == 3) {
                coda3[l] = vettore[j];
                l++;
            } else if (vettore[j].priorità == 4) {
                coda4[o] = vettore[j];
                o++;
            }
        }


        /**
         *
         */
    }
}
