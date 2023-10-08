package comunicacion;
import java.util.List;
import java.util.ArrayList;




public class Tesis extends Escrito  {
    private String idea;
    private String[] argumentos;
    private String referencias;
    private String interpretacion;
    private String conclusion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,String conclusion, String referencias, String interpretacion) {
        
    	super(origen,  titulo,  autor,  paginas);
    	this.idea = idea;
        
        this.referencias = referencias;
        this.interpretacion = interpretacion;
        this.conclusion=conclusion;
    }

    // Getter para idea
    public String getIdea() {
        return idea;
    }

    // Setter para idea
    public void setIdea(String idea) {
        this.idea = idea;
    }

    // Getter para argumentos
    public String[] getArgumentos() {
        return argumentos;
    }

    // Setter para argumentos
    public void setArgumento(String [] argumentos) {
        // Asumiendo que 'argumentos' es una ArrayList<String> en la clase Tesis
        this.argumentos=argumentos;
    }
    // Getter para referencias
    public String getReferencias() {
        return referencias;
    }

    // Setter para referencias
    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    // Getter para interpretacion
    public String getInterpretacion() {
        return interpretacion;
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
                + "\n" + this.idea
                + "\n" + this.argumentos.length
                + "\n" + this.conclusion
                + "\n" + this.referencias;
    }
        // Implementa la lógica para calcular el número total de palabras aquí
    

    public String  interpretacion() {
    	return interpretacion;
        // Implementa la lógica para obtener la interpretación aquí
    }
    public int palabrasTotales(int palabras) {
    	return this.getPaginas()*5*palabras;    }
    public String getConclusion() {
    	return conclusion;
    }
    public void setConcluion(String conclusion) {
    	this.conclusion=conclusion;
    	
    }
    
}
