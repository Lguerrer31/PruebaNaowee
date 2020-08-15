package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author laura
 */
public class Ventas extends Generalidad implements java.io.Serializable {

    private String direccion;
    private String fecha;
    private String estado;
    private String identificacion;
    private String nombre;

    public Ventas(String direccion, String fecha, String estado, String identificacion, String nombre) {
        super(identificacion, nombre);
        this.direccion = direccion;
        this.fecha = fecha;
        this.estado = estado;
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
