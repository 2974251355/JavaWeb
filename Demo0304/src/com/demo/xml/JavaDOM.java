package com.demo.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class JavaDOM {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
        Document doc = dbBuilder.parse("F:\\java\\JavaWeb\\Demo0304\\src\\com\\demo\\xml\\goods.xml");
        System.out.println("处理该文档的DomImplementation对象="+doc.getImplementation());
        NodeList nList = doc.getElementsByTagName("good");
        for (int i = 0; i < nList.getLength(); i++) {
            Element nobe = (Element) nList.item(i);
            System.out.println("ID:"+nobe.getAttribute("id").intern());
            System.out.println("Name: "+ nobe.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
            System.out.println("Firm: "+ nobe.getElementsByTagName("firm").item(0).getFirstChild().getNodeValue());
            System.out.println("Price: "+ nobe.getElementsByTagName("price").item(0).getFirstChild().getNodeValue());
            System.out.println();
        }

    }

}
