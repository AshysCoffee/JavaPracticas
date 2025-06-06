package poo.director;

public class Pelicula {

	private String titulo;
	Director director;
	private int anno_creacion;
	
	////////////
	
	public Pelicula(String titulo) {
		this.titulo = titulo;
	}

	public Pelicula(Director director) {
		this.director = director;
	}

	public Pelicula() {
	}
	
	////////////
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public int getAnno_creacion() {
		return anno_creacion;
	}

	public void setAnno_creacion(int anno_creacion) {
		this.anno_creacion = anno_creacion;
	}
	///////////
	
	public String toStringPelicula() {
		String s;
		s=(" ·····Pelicula····· \n");
		s+=("Titulo: " + titulo + "\n");
		s+=("Año de estreno: " + anno_creacion + "\n");
		s+=("Director: " + director.toStringDirector() + "\n");
		return s;

	}
}
