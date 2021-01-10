package mx.com.gm.sga.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author wilme
 */
@Entity
public class Alumno implements Serializable{
    private static final long serializbleUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private int idAlumno;
    private String nombre;
    private String apellido;
    private String celular;

    public Alumno() {
    }

    public Alumno(String nombre, String apelido, String celular) {
        this.nombre = nombre;
        this.apellido = apelido;
        this.celular = celular;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apellido;
    }

    public void setApelido(String apelido) {
        this.apellido = apelido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apelido=" + apellido + ", celular=" + celular + '}';
    }
    
}
