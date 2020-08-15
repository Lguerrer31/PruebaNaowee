package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author laura
 */
public class Cliente extends Generalidad implements java.io.Serializable {

    private String identificacion;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String edad;
    private String email;
    private String sexo;
    private String tel;
    private String ventas;
    private Ventas direccion;
    private Ventas estado;

    public Cliente(String identificacion, String nombre, String primer_apellido, String segundo_apellido, String edad, String email, String sexo, String tel, String ventas, Ventas direccion) {
        super(identificacion, nombre);
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.edad = edad;
        this.email = email;
        this.sexo = sexo;
        this.tel = tel;
        this.direccion = direccion;
        this.ventas = ventas;
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

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getVentas() {
        return ventas;
    }

    public void setVentas(String ventas) {
        this.ventas = ventas;
    }

    public Ventas getDireccion() {
        return direccion;
    }

    public void setDireccion(Ventas direccion) {
        this.direccion = direccion;
    }

    public Ventas getEstado() {
        return estado;
    }

    public void setEstado(Ventas estado) {
        this.estado = estado;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
