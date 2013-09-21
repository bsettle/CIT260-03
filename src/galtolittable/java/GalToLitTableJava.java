/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package galtolittable.java;

/**
 *
 * @author rebeccasettle
 */
public class GalToLitTableJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons, liters;
        int counter;
        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++){
            liters = gallons * 3.7854;// convert to liters
            System.out.println(gallons + "gallons is" +
                    liters + "liters.");
            counter++;
            //every 10th line, print a blank line
            if ( counter == 10){
                System.out.println();
                counter = 0; // reset the line counter
            }
            }
        }
        }
