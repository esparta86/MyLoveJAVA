/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clases.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class PersonaBean {
    private Persona persona = new Persona();
    private static List<Persona> listPersona = new ArrayList();

    public List<Persona> getListPersona() {
        return listPersona;
    }

    public void setListPersona(List<Persona> listPersona) {
        PersonaBean.listPersona = listPersona;
    }
    public PersonaBean() {
    }
    
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

      public void  registrarPersona(){
          PersonaBean.listPersona.add(this.persona);
      }
      
      public void  eliminarPersona(Persona per){
          PersonaBean.listPersona.remove(per);
      }
      
      public void validar(FacesContext context,UIComponent toValidate,Object value){
          context = FacesContext.getCurrentInstance();
          String texto = (String)value;
          if(!(texto.equalsIgnoreCase("M")&& texto.equalsIgnoreCase("F"))){
              (((UIInput)toValidate).setValid(false);
          }
      }
    
    
    
}
