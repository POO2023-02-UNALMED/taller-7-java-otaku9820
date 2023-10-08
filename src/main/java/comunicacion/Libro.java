package comunicacion;

public class Libro extends Escrito {
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String coAutor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = coAutor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    // Getter para coAutor
    public String getCo_autor() {
        return co_autor;
    }

    // Setter para coAutor
    public void setCo_autor(String coAutor) {
        this.co_autor = coAutor;
    }

    // Getter para editorial
    public String getEditorial() {
        return editorial;
    }

    // Setter para editorial
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    // Getter para edicion
    public String getEdicion() {
        return edicion;
    }

    // Setter para edicion
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

 

    // Setter para interpretacion
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public String toString(){
        return this.getOrigen()
                + "\n" + this.getTitulo()
                + "\n" + this.getAutor()
                + "\n" + this.getPaginas()
                + "\n" + this.co_autor
                + "\n" + this.editorial
                + "\n" + this.edicion;
    }
    public int palabrasTotales(int palabras) {
    	return 2*this.getPaginas()*palabras;
    	
    }
    public String interpretacion() {
    	return interpretacion;
    	
    }
}
