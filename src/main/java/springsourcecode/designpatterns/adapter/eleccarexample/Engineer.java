package springsourcecode.designpatterns.adapter.eleccarexample;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Engineer {
    public static void main(String[] args) {

        Motor motor = (Motor) Engineer.getObject();
        motor.drive();

    }


    private  static Object getObject(){
        try
        {
            DocumentBuilderFactory dFactory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src/main/resources/config.xml"));
            NodeList nl=doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName="springsourcecode.DesignPatterns.adapter.eleccarexample."+classNode.getNodeValue();
            Class<?> c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
