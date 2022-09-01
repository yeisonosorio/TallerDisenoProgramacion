package Class;

import Interface.NaveInterface;

/**
 * Representa las caracteristicas de una nave
 */
public abstract class Nave implements NaveInterface {

    /**
     * Representa el nombre de la nave
     */
    public String name;
    /**
     *Representa el nombre el pais de origen de la nave
     */
    public String country;
    /**
     *Representa el peso de la nave
     */
    public float weight;
    /**
     *Representa la fuerza de empuje de la nave
     */
    public float push;
    /**
     *Representa la altura de la nave
     */
    public float height;
    /**
     *Representa el combustible que utiliza la nave
     */
    public String gas;


    /**
     * Crea una instancía de la clase Nave con parametros
     * @param name
     * @param country
     * @param weight
     * @param push
     * @param height
     * @param gas
     */
    public Nave(String name, String country, float weight, float push, float height, String gas) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.push = push;
        this.height = height;
        this.gas = gas;
    }

    /**
     * Get y Set son representan el acceso a las propiedades de los objetos
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPush() {
        return push;
    }

    public void setPush(float push) {
        this.push = push;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    /**
     * Representa un metodo para despegar la nave
     * @return
     */
    public abstract float detach();

    /**
     *Representa un metodo para aterrizar la nave
     * @return
     */
    public abstract float land();

}
