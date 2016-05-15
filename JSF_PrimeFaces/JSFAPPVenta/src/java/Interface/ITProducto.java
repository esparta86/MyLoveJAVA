/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Session;
import pojo.Tproducto;

/**
 *
 * @author Esparta_86
 */
public interface ITProducto {
    public Tproducto getByIdProducto(Session session,Integer idProducto) throws Exception;
    public List<Tproducto> getALL(Session session) throws Exception;
    public Tproducto getByCodigoBarras(Session session,String codigoBarras) throws Exception;
}
