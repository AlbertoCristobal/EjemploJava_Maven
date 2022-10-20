package com.pruebaCSV;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
* esta clase se encarga de leer el archivo csv que se le pase como parametro
*
* no devuelve nada, muestra el contenido del csv en el terminal
* */
public class LectorCSV {
    /**
     *
     * @author Alberto Cristobal Sanz
     */
    public void leeCSV(String nombreArchivo){

        /**try catch se me tre por el try si no hay error al leer**/
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String [] fila ; //array donde se va a meter la fila

            //va reseteando string fila por cada bucle del while
            while((fila = csvReader.readNext()) != null ){

                System.out.println(fila[0] + " | " +
                        fila[1] + " | " +
                        fila[2] + " | ");

            }
            csvReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
