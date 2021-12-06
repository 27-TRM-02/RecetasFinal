package methods;

//import com.sun.org.apache.xml.internal.serialize.OutputFormat;
//import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import jFrames.MainWindow;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author trm
 */
public class DOMMetodos {

    MainWindow ventPrin = new MainWindow();
    Document doc;

    /**
     * @param fichero
     * @return 0 = Todo OK // -1 = Error Recibe fichero xml. Lo convierte a
     * formato DOM y lo guarda en doc
     */
    public int abrir_XML_DOM(File fichero) {
        // doc representará el árbol DOM
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

    public int addRecetaDOM(String id, String nombre, String tipo, String dificultad, String calorias, String tiempo, String elaboracion, String[] cantidades, String[] ingredientes) {
        try {
            Node nReceta = doc.createElement("receta");
            ((Element) nReceta).setAttribute("id", id);

            Node nNombre = doc.createElement("nombre");
            Node nNombre_text = doc.createTextNode(nombre);
            nNombre.appendChild(nNombre_text);

            Node nTipo = doc.createElement("tipo");
            ((Element) nTipo).setAttribute("definicion", tipo);

            Node nDificultad = doc.createElement("dificultad");
            Node nDificultad_text = doc.createTextNode(dificultad);
            nDificultad.appendChild(nDificultad_text);

            Node nCalorias = doc.createElement("calorias");
            Node nCalorias_text = doc.createTextNode(calorias);
            nCalorias.appendChild(nCalorias_text);

            Node nTiempo = doc.createElement("tiempo");
            Node nTiempo_text = doc.createTextNode(tiempo);
            nTiempo.appendChild(nTiempo_text);

            Node nElaboracion = doc.createElement("elaboracion");
            Node nElaboracion_text = doc.createTextNode(elaboracion);
            nElaboracion.appendChild(nElaboracion_text);

            Node nIngredientes = doc.createElement("ingredientes");
            for (int i = 0; i < ingredientes.length; i++) {
                Node nIngrediente = doc.createElement("ingrediente");
                ((Element) nIngrediente).setAttribute("cantidad", cantidades[i]);
                Node nIngrediente_text = doc.createTextNode(ingredientes[i]);
                nIngrediente.appendChild(nIngrediente_text);
                nIngredientes.appendChild(nIngrediente);
            }

            nReceta.appendChild(nNombre);
            nReceta.appendChild(nTipo);
            nReceta.appendChild(nDificultad);
            nReceta.appendChild(nCalorias);
            nReceta.appendChild(nTiempo);
            nReceta.appendChild(nElaboracion);
            nReceta.appendChild(nIngredientes);

            Node nRecetas = doc.getFirstChild();
            nRecetas.appendChild(nReceta);

            return 0;
        } catch (DOMException e) {
            System.out.println(e.toString());
            return -1;
        }
    }

    public int guardarDOMcomoFile(File archivo) {
        try {
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);
            // salida indentada
            format.setIndenting(true);
            // Escribo contenido en el File
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(archivo), format);
            serializer.serialize(doc);
            // Se ha ejecutado correctamente
            return 0;
        } catch (IOException e) {
            return 1;
        }
    }

}
