package com.demo.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JavaDOM4J {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("F:\\java\\JavaWeb\\Demo0304\\src\\com\\demo\\xml\\goods.xml"));
        List<Element> list = document.getRootElement().elements();
        List<Good> listGood = new ArrayList<>();
        for (Element e :list){
            String id = String.valueOf(e.attribute("id"));

            String name = e.elementText("name");

            String firm = e.elementText("firm");

            double price = Double.valueOf(e.elementText("price"));

            Good good = new Good(id,name,firm,price);

            listGood.add(good);

        }
        for (Good good : listGood) {
            System.out.println(good);
        }
    }

}
