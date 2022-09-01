package Class;

import Interface.NaveInterface;

public class Shuttle extends Nave implements NaveInterface {


    /**
     * Llamado del constructor de la clase abstracta
     * @param name
     * @param country
     * @param weight
     * @param push
     * @param height
     * @param gas
     */
    public Shuttle(String name, String country, float weight, float push, float height, String gas) {
        super(name, country, weight, push, height, gas);
    }

    /**
     * Sobreescritura de método
     * @return
     */
    @Override
    public float detach() {
        int velocidad = 10;
        return velocidad;
    }

    @Override
    public float land() {
        int velocidad = 0;
        return velocidad;
    }


    @Override
    public void flightTime() {

    }
}


