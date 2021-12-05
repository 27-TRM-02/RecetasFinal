package methods;


import java.io.File;
import java.io.IOException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author trm
 */
public class SAXMetodos {

    SAXParser parser;
    ManejadorSAX sh;
    File ficheroXML;

    public int abrir_XML_SAX(File fichero) {
        try {
            // Se crea un objeto SAXParser para interpretar el doc XML
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            // Se crea una instancia del manejador que será el que 
            // recorra el documento XML secuencialmente
            sh = new ManejadorSAX();

            ficheroXML = fichero;

            return 0;
        } catch (Exception e) {
            System.out.println(e.toString());
            return -1;
        }
    }

    public String recorrerSAX() {
        try {
            sh.cadena_resultado = "";
            parser.parse(ficheroXML, sh);
            return sh.cadena_resultado;

        } catch (IOException | SAXException e) {
            return "Error al parsear con SAX";
        }
    }
}

class ManejadorSAX extends DefaultHandler {

    String cadena_resultado = "";

    /**
     * Cndo detecta cadena de txt lo guarda en la variable de salida
     *
     * @param ch
     * @param start
     * @param length
     * @throws SAXException
     */
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        for (int i = start; i < length + start; i++) {
            cadena_resultado += ch[i];
        }
        // trim() = quita los espacios en blanco de delante y del final
        cadena_resultado = cadena_resultado.trim() + "\n";
    }

    /**
     * Cuando se detecta el final de un elemento <libro>
     * se pone una linea discontinua
     *
     * @param uri
     * @param localName
     * @param qname
     * @throws SAXException
     */
    public void endElement(String uri, String localName, String qname)
            throws SAXException {
        if (qname.equals("receta")) {
            cadena_resultado += "-------------------------------------------\n";
        }
    }

    /**
     * Se ejecuta cuando se encuentra un elemento de apertura de xml
     *
     * @param uri
     * @param localName
     * @param qname
     * @param attributes
     * @throws SAXException
     */
    public void startElement(String uri, String localName, String qname,
            Attributes attributes) throws SAXException {
        if (qname.equalsIgnoreCase("recetas")) {
            cadena_resultado += "LISTA DE RECETAS: \n";
            cadena_resultado += "------------------------------------------- \n";
        } else if (qname.equalsIgnoreCase("receta")) {
            cadena_resultado += "- ID: "
                    + attributes.getValue(attributes.getQName(0).trim());
        } else if (qname.equalsIgnoreCase("nombre")) {
            cadena_resultado += "- Nombre: ";
        } else if (qname.equalsIgnoreCase("tipo")) {
            cadena_resultado += "- Tipo: "
                    + attributes.getValue(attributes.getQName(0).trim());
        } else if (qname.equalsIgnoreCase("dificultad")) {
            cadena_resultado += "- Dificultad: ";
        } else if (qname.equalsIgnoreCase("calorias")) {
            cadena_resultado += "- Calorias: ";
        } else if (qname.equalsIgnoreCase("tiempo")) {
            cadena_resultado += "- Tiempo de elaboración: ";
        } else if (qname.equalsIgnoreCase("elaboracion")) {
            cadena_resultado += "- Elaboración en: ";
        } else if (qname.equalsIgnoreCase("ingrediente")) {
            cadena_resultado += "- Ingrediente: "
                    + attributes.getValue(attributes.getQName(0).trim())
                    + " de ";
        }
    }
}
