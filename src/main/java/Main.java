/**
 * Importar las clases
 */

import java.util.Scanner;
import Class.Shuttle;
import Class.Manned;
import Class.Unmanned;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option = 0;

        /**
         * Implemetacion de ciclo Do-while para generar ejecución infinita
         */

        do {

            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Escriba el tipo de aeronnave que quiere crear o salir");
            System.out.println("1. VEHÍCULOS LANZADERA:");
            System.out.println("2. NAVES ESPACIALES NO TRIPULADAS:");
            System.out.println("3. NAVES ESPACIALES TRIPULADAS:");
            System.out.println("4. Salir");
            option = input.nextInt();
            System.out.println("-----------------------------------------------------------------------------------");





            /**
             * Crear la aeronave con cada una de sus caracteristicas
             */


            switch (option) {
                case 1:


                    Shuttle shuttle = new Shuttle("Saturno V", "EE.UU", 2900, 3500, 100, "propelente líquido");

                    System.out.println("Estas son las caracteristicas" + " nombre: " + shuttle.getName() + " pais:" + shuttle.getCountry() + " peso: " + shuttle.getWeight() +
                            "fuerza de empuje: " + shuttle.getPush() + " altura: " + shuttle.getHeight() + " tipo de combustible: " + shuttle.getGas());
                    break;
                case 2:

                    Manned manned = new Manned("ATV", "EE.UU", 0, 2, 0, "celdas fotovoltaicas ");

                    System.out.println("Estas son las caracteristicas" + " nombre: " + manned.getName() + " pais: " + manned.getCountry() + " peso: " + manned.getWeight() +
                            " fuerza de empuje: " + manned.getPush() + " altura: " + manned.getHeight() + " tipo de combustible: " + manned.getGas());
                    break;
                case 3:


                    Unmanned unmannedttle = new Unmanned("Skylab", "EE.UU", 77, 0, 0, "solido");

                    System.out.println("Estas son las caracteristicas" + " nombre: " + unmannedttle.getName() + " pais: " + unmannedttle.getCountry() + " peso: " + unmannedttle.getWeight() +
                            " fuerza de empuje: " + unmannedttle.getPush() + " altura: " + unmannedttle.getHeight() + " tipo de combustible:" + unmannedttle.getGas());
                    break;
                default:
                    System.out.println("esta opcion no es validad");

            }


        } while (option != 4);
        System.out.println("gracias por participar");

    }

}
