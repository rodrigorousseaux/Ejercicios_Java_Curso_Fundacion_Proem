package Clase10y11;

public class Producto {

    private String descripcion;

    private String rubro;

    private int codigo;

    private double precioCosto;

    private int stock;

    public String getRubro() {
        return rubro;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Laboratorio getLab() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getStock() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setRubro(String p_desc) {
    }

    public void setDescripcion(String p_desc) {
    }

    public void setPrecioCosto(double p_importe) {
    }

    public void setStock(int p_cant) {
    }

    public void setLaboratorio(Laboratorio p_lab) {
    }

    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double stockValorizado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
