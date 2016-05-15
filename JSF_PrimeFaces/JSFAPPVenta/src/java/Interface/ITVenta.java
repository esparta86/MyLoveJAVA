/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import org.hibernate.Session;
import pojo.Tventa;

/**
 *
 * @author Esparta_86
 */
public interface ITVenta {
    public boolean insert(Session session,Tventa tventa) throws Exception;
    public Tventa getUltimoRegistro(Session session) throws Exception;
    
}
