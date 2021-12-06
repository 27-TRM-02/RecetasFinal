package methods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.management.AttributeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
        } catch (IOException | ParserConfigurationException | SAXException e) {
            return -1;
        }
    }

    
    
    public String consultaNombre(String nombre) {
        try {
            String salida = "";
            // Se crea Objeto XPath
            javax.xml.xpath.XPath xpath = XPathFactory.newInstance().newXPath();

            String consulta = "/recetas/receta[nombre='" + nombre + "']";
            // Creamos una XPathExpression con la consulta deseada
            XPathExpression exp = xpath.compile(consulta);
            // Ejecuta la consulta indicando que se ejecuta sobre el DOM
            // Devolverá el resultado como una lista de nodos
            Object result = exp.evaluate(doc, XPathConstants.NODESET);
            NodeList nodelistRecetas = (NodeList) result;

            for (int i = 0; i < nodelistRecetas.getLength(); i++) {
                Node nodeReceta = nodelistRecetas.item(i);
                // Si la consulta muestra la informacion entera de un libro
                if (nodelistRecetas.item(i).getNodeName().equals("receta")) {
                    ArrayList<String> infoReceta = procesaReceta(nodeReceta);
                    for (String infoReceta1 : infoReceta) {
                        salida += "\n" + infoReceta1;
                    }
                }
            }
            // Todo ha ido bien y se devuelve String con el resultado
            System.out.println(salida);
            return salida;

        } catch (XPathExpressionException ex) {
            System.err.println("Error: " + ex.toString());
            return null;
        }

    }
    
    public String consultaElaboracion(String elaboracion) {
        try {
            String salida = "";
            // Se crea Objeto XPath
            javax.xml.xpath.XPath xpath = XPathFactory.newInstance().newXPath();

            String consulta = "/recetas/receta[elaboracion='" + elaboracion + "']";
            // Creamos una XPathExpression con la consulta deseada
            XPathExpression exp = xpath.compile(consulta);
            // Ejecuta la consulta indicando que se ejecuta sobre el DOM
            // Devolverá el resultado como una lista de nodos
            Object result = exp.evaluate(doc, XPathConstants.NODESET);
            NodeList nodelistRecetas = (NodeList) result;

            for (int i = 0; i < nodelistRecetas.getLength(); i++) {
                Node nodeReceta = nodelistRecetas.item(i);
                // Si la consulta muestra la informacion entera de un libro
                if (nodelistRecetas.item(i).getNodeName().equals("receta")) {
                    ArrayList<String> infoReceta = procesaReceta(nodeReceta);
                    for (String infoReceta1 : infoReceta) {
                        salida += "\n" + infoReceta1;
                    }
                }
            }
            // Todo ha ido bien y se devuelve String con el resultado
            System.out.println(salida);
            return salida;

        } catch (XPathExpressionException ex) {
            System.err.println("Error: " + ex.toString());
            return null;
        }

    }
    
    public String consultaTipo(String tipo) {
        try {
            String salida = "";
            // Se crea Objeto XPath
            javax.xml.xpath.XPath xpath = XPathFactory.newInstance().newXPath();

            String consulta = "/recetas/receta[tipo/@definicion='" + tipo + "']";
            // Creamos una XPathExpression con la consulta deseada
            XPathExpression exp = xpath.compile(consulta);
            // Ejecuta la consulta indicando que se ejecuta sobre el DOM
            // Devolverá el resultado como una lista de nodos
            Object result = exp.evaluate(doc, XPathConstants.NODESET);
            NodeList nodelistRecetas = (NodeList) result;

            for (int i = 0; i < nodelistRecetas.getLength(); i++) {
                Node nodeReceta = nodelistRecetas.item(i);
                // Si la consulta muestra la informacion entera de un libro
                if (nodelistRecetas.item(i).getNodeName().equals("receta")) {
                    ArrayList<String> infoReceta = procesaReceta(nodeReceta);
                    for (String infoReceta1 : infoReceta) {
                        salida += "\n" + infoReceta1;
                    }
                }
            }
            // Todo ha ido bien y se devuelve String con el resultado
            System.out.println(salida);
            return salida;

        } catch (XPathExpressionException ex) {
            System.err.println("Error: " + ex.toString());
            return null;
        }

    }

    public String consultaCalorias(String calorias) {
        try {
            String salida = "";
            // Se crea Objeto XPath
            javax.xml.xpath.XPath xpath = XPathFactory.newInstance().newXPath();

            String consulta = "/recetas/receta[calorias='" + calorias + "']";
            // Creamos una XPathExpression con la consulta deseada
            XPathExpression exp = xpath.compile(consulta);
            // Ejecuta la consulta indicando que se ejecuta sobre el DOM
            // Devolverá el resultado como una lista de nodos
            Object result = exp.evaluate(doc, XPathConstants.NODESET);
            NodeList nodelistRecetas = (NodeList) result;

            for (int i = 0; i < nodelistRecetas.getLength(); i++) {
                Node nodeReceta = nodelistRecetas.item(i);
                // Si la consulta muestra la informacion entera de un libro
                if (nodelistRecetas.item(i).getNodeName().equals("receta")) {
                    ArrayList<String> infoReceta = procesaReceta(nodeReceta);
                    for (String infoReceta1 : infoReceta) {
                        salida += "\n" + infoReceta1;
                    }
                    salida += "\n -------------------------------------- \n";
                }
            }
            // Todo ha ido bien y se devuelve String con el resultado
            System.out.println(salida);
            return salida;

        } catch (XPathExpressionException ex) {
            System.err.println("Error: " + ex.toString());
            return null;
        }

    }
    
    
    
    public ArrayList<String> procesaReceta(Node n) {
        ArrayList<String> datosReceta = new ArrayList<>();
        try {
            Node dato = null;
            // Guarda el atributo ID de la receta
            datosReceta.add(0, "-ID: " + n.getAttributes().item(0).getNodeValue());
            // Obtiene los hijos de la receta
            NodeList receta = n.getChildNodes();
            for (int i = 0; i < receta.getLength(); i++) {
                dato = receta.item(i);
                if (dato.getNodeType() == Node.ELEMENT_NODE) {
                    // Atributo definicion del tipo
                    if (dato.getNodeName().equalsIgnoreCase("tipo")) {
                        datosReceta.add("-Tipo: " + dato.getAttributes().item(0).getNodeValue());
                    } else if (dato.getNodeName().equalsIgnoreCase("ingredientes")) {
                        // Añadimos info de la lista de ingredientes
                        NodeList ingredientes = dato.getChildNodes();
                        Node ingrediente;
                        for (int j = 0; j < ingredientes.getLength(); j++) {
                            ingrediente = ingredientes.item(j);
                            if (ingrediente.getNodeType() == Node.ELEMENT_NODE) {
                                String cantidadNode = ingrediente.getAttributes().item(0).getNodeValue();
                                String nombreIngrediente = ingrediente.getFirstChild().getNodeValue();
                                datosReceta.add("-Ingrediente: " + cantidadNode + " de " + nombreIngrediente);
                            }

                        }
                    } else if (dato.getNodeName().equalsIgnoreCase("nombre")){
                        datosReceta.add("-Nombre: " + dato.getFirstChild().getNodeValue());
                    } else if (dato.getNodeName().equalsIgnoreCase("dificultad")){
                        datosReceta.add("-Dificultad: " + dato.getFirstChild().getNodeValue());
                    } else if (dato.getNodeName().equalsIgnoreCase("calorias")){
                        datosReceta.add("-Calorias: " + dato.getFirstChild().getNodeValue());
                    } else if (dato.getNodeName().equalsIgnoreCase("tiempo")){
                        datosReceta.add("-Tiempo: " + dato.getFirstChild().getNodeValue());
                    } else if (dato.getNodeName().equalsIgnoreCase("elaboracion")){
                        datosReceta.add("-Elaboracion: " + dato.getFirstChild().getNodeValue());
                    }
                }

            }
        } catch (DOMException e) {
            System.err.println(e.toString());
            return null;
        }
        // Devuelve lista de datos de la receta
        return datosReceta;
    }

}
