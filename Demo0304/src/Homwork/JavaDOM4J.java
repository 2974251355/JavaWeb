package Homwork;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class JavaDOM4J {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("F:\\java\\JavaWeb\\Demo0304\\src\\Homwork\\person.xml");
        List<Element> list = document.getRootElement().elements();
        List<Person> list1 = new ArrayList<>();

        for (Element element : list) {
            String id =  element.attributeValue("id");
            String name = element.elementText("name");
            int age = Integer.parseInt(element.elementText("age"));
            String address =element.elementText("address");
            String sex = element.elementText("sex");
            double weight = Double.parseDouble(element.elementText("weight"));
            double height = Double.parseDouble(element.elementText("height"));
            Person person = new Person(id,name,age,address,sex,weight,height);
            list1.add(person);
        }
        for (Person person : list1) {
            System.out.println(person);
        }


    }
}
