/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Libro {

    private String titulo;
    private String autor;
    private final Integer ejemplares;
    private Integer ejemplaresPrestados;

    public Libro(String titulo, String autor, Integer ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        if (ejemplaresPrestados >= 0) {
            this.ejemplaresPrestados = ejemplaresPrestados;
        }
    }

}
