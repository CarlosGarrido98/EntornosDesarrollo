/*
@author Carlos Garrido Ortega
1ºDAW Entornos de Desarrollo
Realizar la función char [] quiniela() que genere una quiniela de 15 resultados con valores aleatorios 1, X o 2.
*/
import java.util.*;
public class Array {

        public static void main(String[] args) {

            char [] resu = quiniela ();			//Array

            System.out.println(Arrays.toString(resu));



        }

        static char [] quiniela() {			  //función Char

            char [] resu = new char[15];


            int num = 0;
            for(int i=0;i<resu.length;i++) {

                num = (int)(Math.random()*3);

                if(num==0) {

                    resu[i]='1';

                }else if(num==1) {

                    resu[i]='2';

                }else {
                    resu[i]='X';
                }
            }

            return resu;

        }

    }
