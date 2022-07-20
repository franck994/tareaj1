package pe.edu.upeu.modelo;

import lombok.Data;

/**
 * CategoriaTO
 */
@Data
public class CategoriaTO {
   public String idCat;
   public String nombreCat;
   public String descuentos;

    public CategoriaTO(){}
    
    public CategoriaTO(String idCat, String nombreCat) {
        this.idCat=idCat;
        this.nombreCat=nombreCat;
        this.descuentos=descuentos;
    }

    public String getIdCat() {
        return idCat;
    }
    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }
    public String getNombreCat() {
        return nombreCat;
    }
    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }
    public String getDescuentos() {
        return descuentos;
    }
    public void setDescuentos(String descuentos) {
        this.descuentos = descuentos;
    }
}