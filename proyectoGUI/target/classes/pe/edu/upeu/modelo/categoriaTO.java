/**
 * categoriaTO
 */
public class categoriaTO {

    public string idcat;
    public string Nombrecat;
    
    public categoriaTO(string idcat, string nombrecat) {
        this.idcat = idcat;
        this.nombrecat = nombrecat;
    }
    public string getIdcat() {
        return idcat;
    }
    public void setIdcat(string idcat) {
        this.idcat = idcat;
    }
    public string getNombrecat() {
        return nombrecat;
    }
    public void setNombrecat(string nombrecat) {
        this.nombrecat = nombrecat;
    }

    
}