package pojo;
// Generated 12-mar-2016 22:38:13 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * Tventadetalle generated by hbm2java
 */
public class Tventadetalle  implements java.io.Serializable {


     private Integer idVentaDetalle;
     private Tventa tventa;
     private Tproducto tproducto;
     private String codigoBarrasProducto;
     private String nombreProducto;
     private BigDecimal precioVentaUnitarioProducto;
     private int cantidad;
     private BigDecimal totalPrecioVenta;

    public Tventadetalle() {
    }

    public Tventadetalle(Tventa tventa, Tproducto tproducto, String codigoBarrasProducto, String nombreProducto, BigDecimal precioVentaUnitarioProducto, int cantidad, BigDecimal totalPrecioVenta) {
       this.tventa = tventa;
       this.tproducto = tproducto;
       this.codigoBarrasProducto = codigoBarrasProducto;
       this.nombreProducto = nombreProducto;
       this.precioVentaUnitarioProducto = precioVentaUnitarioProducto;
       this.cantidad = cantidad;
       this.totalPrecioVenta = totalPrecioVenta;
    }
   
    public Integer getIdVentaDetalle() {
        return this.idVentaDetalle;
    }
    
    public void setIdVentaDetalle(Integer idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }
    public Tventa getTventa() {
        return this.tventa;
    }
    
    public void setTventa(Tventa tventa) {
        this.tventa = tventa;
    }
    public Tproducto getTproducto() {
        return this.tproducto;
    }
    
    public void setTproducto(Tproducto tproducto) {
        this.tproducto = tproducto;
    }
    public String getCodigoBarrasProducto() {
        return this.codigoBarrasProducto;
    }
    
    public void setCodigoBarrasProducto(String codigoBarrasProducto) {
        this.codigoBarrasProducto = codigoBarrasProducto;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public BigDecimal getPrecioVentaUnitarioProducto() {
        return this.precioVentaUnitarioProducto;
    }
    
    public void setPrecioVentaUnitarioProducto(BigDecimal precioVentaUnitarioProducto) {
        this.precioVentaUnitarioProducto = precioVentaUnitarioProducto;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getTotalPrecioVenta() {
        return this.totalPrecioVenta;
    }
    
    public void setTotalPrecioVenta(BigDecimal totalPrecioVenta) {
        this.totalPrecioVenta = totalPrecioVenta;
    }




}


