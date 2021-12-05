package methods;

import com.sun.jmx.remote.internal.Unmarshal;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import recetas.Recetas;
import recetas.Recetas.Receta;



/**
 *
 * @author trm
 */
public class JAXBMetodos {
    
    Recetas misRecetas;
    /**
     * Abre Fichero 
     * @param fichero
     * @return 
     */
    public int abrir_XML_JAXB(File fichero){
        try {
            // creamos instancia JAXB
            JAXBContext contexto = JAXBContext.newInstance(Recetas.class);
            // Crea objeto Unmarshal
            Unmarshaller u = contexto.createUnmarshaller();
            // Deserializa fichero
            misRecetas = (Recetas) u.unmarshal(fichero);
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }
    
}
