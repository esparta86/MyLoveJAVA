/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import org.hibernate.Session;
import pojo.Tventadetalle;

/**
 *
 * @author Esparta_86
 */
public interface ITVentaDetalle {
    public boolean insert(Session session,Tventadetalle tVentaDetalle) throws Exception;
}
