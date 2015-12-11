package edu.iut.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import edu.iut.app.ExamEvent;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// EX 1 Completer la classe

public class XMLProjectReader {
	public XMLProjectReader() {
		
	}
	
	public ArrayList<ExamEvent> load(java.io.File xmlfile) throws IOException {
		ArrayList<ExamEvent> data = new ArrayList<ExamEvent>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();   
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document= builder.parse(new File("/save.xml")); 
			org.w3c.dom.Element root = document.getDocumentElement(); 

			NodeList rootChildren = root.getElementsByTagName("event"); 
			for (int ci = 0;ci<rootChildren.getLength();ci++) { 
			  if (rootChildren.item(ci).getNodeType() == Node.ELEMENT_NODE) { 
			    Node child = (Element)rootChildren.item(ci); 
			    if (child.hasAttributes()) { 
			       NamedNodeMap attributes = child.getAttributes(); 
			       for (int att_i = 0;att_i<attributes.getLength();att_i++) { 
			         Attr attribute = (Attr)attributes.item(att_i); 
			       } 
			    } 
			  } 
			} 

			
		} catch (ParserConfigurationException e) {
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
}
