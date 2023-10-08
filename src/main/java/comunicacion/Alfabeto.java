package comunicacion;
import java.util.List;

import java.util.Arrays;

public class Alfabeto extends Pictograma {
    private String interpretacion;
    private static String[] letras;
    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.interpretacion = interpretacion;
        this.letras=letras;
    }

    // Getter para interpretacion
    public String getInterpretacion() {
        return interpretacion;
    }

    // Setter para interpretacion
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    // Getter para letras
    public String[] getLetras() {
        return letras;
    }

    // Setter para letras
    public void setLetras(String []letras) {
        this.letras = letras;
    }

    public int cantidadLetras() {
    	return letras.length;
        
    }

    public String interpretacion() {
        // Implementa la lógica para obtener la interpretación aquí
        return interpretacion;
    }

    @Override
    public String toString() {
        // Implementa la lógica para convertir el objeto a una cadena de texto aquí
        return String.join(", ", letras);
    }
    
}






