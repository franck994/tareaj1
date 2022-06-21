public class modeloTO {
    public string idcat;
    public string Nombrecat;
    public modeloTO(string idcat, string nombrecat) {
        this.idcat = idcat;
        Nombrecat = nombrecat;
    }
    public string getIdcat() {
        return idcat;
    }
    public void setIdcat(string idcat) {
        this.idcat = idcat;
    }
    public string getNombrecat() {
        return Nombrecat;
    }
    public void setNombrecat(string nombrecat) {
        Nombrecat = nombrecat;
    }
    

}

