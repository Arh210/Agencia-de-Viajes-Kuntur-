/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;


public class DetalleComprobante {

    //atributos de detalle de comprobante
    private String datosCliente;
    private String detallePaquete;
    private double costo;
    private String tipoPago;

    public String getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(String datosCliente) {
        this.datosCliente = datosCliente;
    }

    public String getDetallePaquete() {
        return detallePaquete;
    }

    public void setDetallePaquete(String detallePaquete) {
        this.detallePaquete = detallePaquete;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
}
