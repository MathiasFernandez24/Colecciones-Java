package entidades;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
public class Pelicula {
    private String titulo, director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
}
