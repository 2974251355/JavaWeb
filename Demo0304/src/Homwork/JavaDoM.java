package Homwork;

import com.demo.xml.JavaDocument;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaDoM {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {


        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document= documentBuilder.parse("F:\\java\\JavaWeb\\Demo0304\\src\\Homwork\\person.xml");
        String xmlEncoding= document.getXmlEncoding();
        String xmlVersion=document.getXmlVersion();
        List<Person> personList = new ArrayList<>();
        System.out.println(xmlEncoding);
        System.out.println(xmlVersion);

        NodeList nodeList = document.getElementsByTagName("person");

        for (int i = 0; i <nodeList.getLength() ; i++) {
            Person person = new Person();
           Node node= nodeList.item(i);
           String NodeName = node.getNodeName();
            System.out.println("第"+(i+1)+"个标签名："+NodeName);
            System.out.println("属性遍历开始");
            NamedNodeMap namedNodeMap = node.getAttributes();
            for (int j = 0; j <namedNodeMap.getLength() ; j++) {
                Node node2= namedNodeMap.item(j);
//                System.out.println(node2.getNodeName()+":"+node2.getNodeValue());
                person.setId(node2.getNodeValue());
            }
            System.out.println("属性遍历结束");
            System.out.println("子节点遍历开始");
            NodeList nodeList1 = node.getChildNodes();
            for (int x = 0; x <nodeList1.getLength() ; x++) {
                Node node3 = nodeList1.item(x);
                if (node3.getNodeType() == Node.ELEMENT_NODE){
//                    System.out.println("标签名："+node3.getNodeName()+"内容："+node3.getTextContent());
                    if (node3.getNodeName().equals("name")){
                        person.setName(node3.getTextContent());
                    }
                    if (node3.getNodeName().equals("age")){
                        person.setAge(Integer.parseInt(node3.getTextContent()));
                    }
                    if (node3.getNodeName().equals("address")){
                        person.setAddress(node3.getTextContent());
                    }
                    if (node3.getNodeName().equals("sex")){
                        person.setSex(node3.getTextContent());
                    }
                    if (node3.getNodeName().equals("weight")){
                        person.setWeight(Double.parseDouble(node3.getTextContent()));
                    }
                    if (node3.getNodeName().equals("height")){
                        person.setHeight(Double.parseDouble(node3.getTextContent()));
                    }
                }

            }


            personList.add(person);
            System.out.println("子节点遍历结束");

        }
        for (Person person : personList) {
            System.out.println(person);
        }




    }
}
