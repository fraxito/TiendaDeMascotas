
package datos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author xp
 */
@Entity
@Table(name="mascotas")
public class Mascota implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="mascotaId")
    private long mascotaId;
    
    @Column (name="name")
    private String nombreMascota;
    @Column (name="description")
    private String descripcion;
    @Column (name="imageurl")
    private String imageurl;
    @Column (name="imagethumburl")
    private String imagethumburl;
    
    @Column (name="price")
    private double precio;
    
    //constructor vacío que requiere Hibernate
    public Mascota(){
        
    }
    
    public Mascota(long _mascotaId, String _nombreMascota, String _descripcion, String _imageurl, String _imagethumburl, double _precio){
        mascotaId = _mascotaId;
        nombreMascota = _nombreMascota;
        descripcion = _descripcion;
        imageurl = _imageurl;
        imagethumburl = _imagethumburl;
        precio = _precio;
    
    }

    public long getMascotaId() {
        return mascotaId;
    }

    public void setMascotaId(long mascotaId) {
        this.mascotaId = mascotaId;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImagethumburl() {
        return imagethumburl;
    }

    public void setImagethumburl(String imagethumburl) {
        this.imagethumburl = imagethumburl;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
