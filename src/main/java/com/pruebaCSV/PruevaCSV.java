package com.pruebaCSV;




/*
Ejemplo de acceso a un archivo .csv desde java
No utiliza ningun gestor de dependencias(maven)
*/

    public class PruevaCSV {
        /**
         *
         * @author Alberto Cristobal Sanz
         */

        public static void main(String[] args) {
            LectorCSV miLector = new LectorCSV();
            miLector.leeCSV("./src/main/resources/datos/pokemon.csv");
        }

    }


