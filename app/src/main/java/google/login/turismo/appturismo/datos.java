package google.login.turismo.appturismo;

import java.io.Serializable;

public class datos implements Serializable {

    private String titulo, descripcion;
    private int imgSitio;
    private int id;

    public datos(String titulo, String descripcion, int imgSitio, int id) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgSitio = imgSitio;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImgSitio() {
        return imgSitio;
    }

    public void setImgSitio(int imgSitio) {
        this.imgSitio = imgSitio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
