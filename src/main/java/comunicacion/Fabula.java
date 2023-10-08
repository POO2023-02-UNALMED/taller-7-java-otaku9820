package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza=ensenanza;
        this.interpretacion=interpretacion;
    }

    // Getter para ensenanza
    public String getEnsenanza() {
        return ensenanza;
    }

    // Setter para ensenanza
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    // Getter para interpretacion
    

    // Setter para interpretacion
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public String toString(){
        return this.getOrigen()
                + "\n" + this.getTitulo()
                + "\n" + this.getAutor()
                + "\n" + this.getPaginas()
                + "\n" + this.ensenanza;
    }

    // Otros métodos de la clase
    public int  palabrasTotales(int palabras) {
    	return 1* this.getPaginas()*palabras;        // Implementa la lógica para calcular el número total de palabras aquí
    }

    public String interpretacion() {
    	return interpretacion;
    	
        // Implementa la lógica para obtener la interpretación aquí
    }
}
