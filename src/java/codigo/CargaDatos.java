
package codigo;

import datos.Mascota;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author xp
 */
@ManagedBean
@RequestScoped
public class CargaDatos {
    private Session sesion;
    List <Mascota> listaMascotas = null;
    
    
    public List <Mascota> obtenListaMascotas() throws HibernateException{
        try{
            sesion = MiHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            listaMascotas = sesion.createQuery("from Mascota").list();
        } finally{
            sesion.close();
        }
        return listaMascotas;
    }
}
