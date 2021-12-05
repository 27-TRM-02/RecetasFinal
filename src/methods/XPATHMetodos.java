package methods;


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;


/**
 *
 * @author trm
 */
public class XPATHMetodos {
    
    // Estructura DOM
    Document doc;

    public int abrir_XML_XPATH(File fichero) {
        // Almacenamos estructura DOM
        doc = null;
        try {
            // Se crea un objeto DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Indica que el modelo DOM no debe contemplar los comentarios 
            // que tenga el XML.
            factory.setIgnoringComments(true);
            // Ignora los espacios en blanco que tenga el documento
            factory.setIgnoringElementContentWhitespace(true);
            // Creamos objeto para cargar la estructura del arbol del DOM
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Parsea el documento XML y genera el DOM equivalente
            doc = builder.parse(fichero);
            // Nos apunta al arbol DOM listo para ser recorrido 
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }
}
