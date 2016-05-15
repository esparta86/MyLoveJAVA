/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBeans;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import unit.Cars;

/**
 *
 * @author Esparta_86
 */
@Named(value = "carsBeans")
@ViewScoped
public class carsBeans {

    private List<Cars> carsLista;
    private final static String[] colors;
    private String colorSeleccionado;
     
    private final static String[] brands;
    private String[] listaColor;
     
    static {
        colors = new String[10];
        colors[0] = "Black";
        colors[1] = "White";
        colors[2] = "Green";
        colors[3] = "Red";
        colors[4] = "Blue";
        colors[5] = "Orange";
        colors[6] = "Silver";
        colors[7] = "Yellow";
        colors[8] = "Brown";
        colors[9] = "Maroon";
         
        brands = new String[10];
        brands[0] = "BMW";
        brands[1] = "Mercedes";
        brands[2] = "Volvo";
        brands[3] = "Audi";
        brands[4] = "Renault";
        brands[5] = "Fiat";
        brands[6] = "Volkswagen";
        brands[7] = "Honda";
        brands[8] = "Jaguar";
        brands[9] = "Ford";
    }
    
    public carsBeans() {
        
    }
    
    @PostConstruct
    public void init() {
        setCarsLista(createCars(10));
        setListaColor(colors);
    }
    
    
    private List<Cars> createCars(int size) {
        List<Cars> list = new ArrayList<Cars>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Cars(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
        }
         
        return list;
    }
    
    
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
    
    private String getRandomBrand() {
        return brands[(int) (Math.random() * 10)];
    }
    
    private int getRandomYear() {
        return (int) (Math.random() * 50 + 1960);
    }
    public int getRandomPrice() {
        return (int) (Math.random() * 100000);
    }
    
    public boolean getRandomSoldState() {
        return (Math.random() > 0.5) ? true: false;
    }
    
    private String getRandomColor() {
        return colors[(int) (Math.random() * 10)];
    }
    
    
    public void establecerColor(String Color){
        setColorSeleccionado(Color);
    }

    
    public List<Cars> getCarsLista() {
        return carsLista;
    }

    
    public void setCarsLista(List<Cars> carsLista) {
        this.carsLista = carsLista;
    }

    /**
     * @return the listaColor
     */
    public String[] getListaColor() {
        return listaColor;
    }

    /**
     * @param listaColor the listaColor to set
     */
    public void setListaColor(String[] listaColor) {
        this.listaColor = listaColor;
    }

    /**
     * @return the colorSeleccionado
     */
    public String getColorSeleccionado() {
        return colorSeleccionado;
    }

    /**
     * @param colorSeleccionado the colorSeleccionado to set
     */
    public void setColorSeleccionado(String colorSeleccionado) {
        this.colorSeleccionado = colorSeleccionado;
    }
}
