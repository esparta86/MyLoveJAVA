/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unit;


public class Cars {
    private String idCar;
    private String marca;
    private int anio;
    private String color;
    private int price;
    private boolean soldState;
    public Cars(String idCar,String marca,int anio,String color,int price,boolean soldState){
        this.idCar = idCar;
        this.marca = marca;
        this.anio  = anio;
        this.color = color;
        this.price = price;
        this.soldState = soldState;
    }

    /**
     * @return the idCar
     */
    public String getIdCar() {
        return idCar;
    }

    /**
     * @param idCar the idCar to set
     */
    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the soldState
     */
    public boolean isSoldState() {
        return soldState;
    }

    /**
     * @param soldState the soldState to set
     */
    public void setSoldState(boolean soldState) {
        this.soldState = soldState;
    }
    
}
