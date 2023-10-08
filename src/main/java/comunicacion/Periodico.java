package comunicacion;



public class Periodico extends Escrito {
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas,String fecha, String primicia, String interpretacion) {
    	super( origen,  titulo,  autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    // Getter para fecha
    public String getFecha() {
        return fecha;
    }

    // Setter para fecha
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Getter para primicia
    public String getPrimicia() {
        return primicia;
    }

    // Setter para primicia
    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

   

    // Setter para interpretacion
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    // Método toString
    @Override
    public String toString(){
        return this.getOrigen()
                + "\n" + this.getTitulo()
                + "\n" + this.getAutor()
                + "\n" + this.getPaginas()
                + "\n" + this.fecha
                + "\n" + this.primicia;
    }
    // Otros métodos de la clase
    public int  palabrasTotales(int palabras) {
    	return this.getPaginas()*10*palabras;
        // Implementa la lógica para calcular el número total de palabras aquí
    }

    public String  interpretacion() {
    	return interpretacion;
        // Implementa la lógica para obtener la interpretación aquí
    }
}