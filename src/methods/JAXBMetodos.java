package methods;

import com.sun.jmx.remote.internal.Unmarshal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
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
     *
     * @param fichero
     * @return
     */
    public int abrir_XML_JAXB(File fichero) {
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

    /**
     * 
     * @param file
     * @return 
     */
    public int guardarToXML(File file) {
        int res;
        try {
            if (!file.getAbsolutePath().endsWith(".xml")){
                File rightFile = new File(file.getAbsolutePath() + ".xml");
                if (!rightFile.exists()){
                    try {
                        // crea nuevo fichero vacio
                        new FileOutputStream(rightFile).close();
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                file = rightFile;
            }
            // creamos instancia JAXB
            JAXBContext contexto = JAXBContext.newInstance(Recetas.class);
            // Crea objeto Unumarshal
            Marshaller m = contexto.createMarshaller();
            // Pinta xml formateado
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            m.marshal(misRecetas, file);
            
            res = 0;
        } catch (JAXBException e) {
            e.printStackTrace();
            res = -1;
        }
        return res;
    }
    
    public void cambiarNombre (String id, String nombre){
        List<Recetas.Receta> lRecetas = misRecetas.getReceta();
        for (Receta lReceta : lRecetas) {
            if (lReceta.getId().toString().equals(id)){
                lReceta.setNombre(nombre);
            }
        }
    }
    
    public void cambiarTipo (String id, String tipo){
        List<Recetas.Receta> lRecetas = misRecetas.getReceta();
        for (Receta lReceta : lRecetas) {
            if (lReceta.getId().toString().equals(id)){
                lReceta.getTipo().setDefinicion(tipo);
            }
        }
    }
    
    public void cambiarDificultad (String id, String dificultad){
        List<Recetas.Receta> lRecetas = misRecetas.getReceta();
        for (Receta lReceta : lRecetas) {
            if (lReceta.getId().toString().equals(id)){
                lReceta.setDificultad(dificultad);
            }
        }
    }
    
    public void cambiarTiempo (String id, String tiempo){
        List<Recetas.Receta> lRecetas = misRecetas.getReceta();
        for (Receta lReceta : lRecetas) {
            if (lReceta.getId().toString().equals(id)){
                lReceta.setTiempo(tiempo);
            }
        }
    }
    
}
