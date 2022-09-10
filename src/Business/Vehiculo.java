
package Business;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String propietario;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String propietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.propietario = propietario;
    }


    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    
    
    
}
