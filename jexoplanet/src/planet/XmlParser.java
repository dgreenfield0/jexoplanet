package planet;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlParser {

	private DocumentBuilderFactory domFactory;
	private DocumentBuilder builder;
	private Document doc;
	private XPath xpath;
	public String tempImageURL_DOC;

	public XmlParser(String XmlFile) {
		try {
			tempImageURL_DOC = XmlFile;
			domFactory = DocumentBuilderFactory.newInstance();
			domFactory.setNamespaceAware(true);
			builder = domFactory.newDocumentBuilder();
			doc = stringToDom(XmlFile);
			xpath = XPathFactory.newInstance().newXPath();
		} catch (Exception ex) {
			System.err.println("ERROR LOADING XML");
		}
	}

	public static Document stringToDom(String xmlSource) throws SAXException,
		ParserConfigurationException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(new InputSource(new StringReader(xmlSource)));
	}

	public String getXpath_single(String Xpath) {
		String XPath_Results = "";
		try {
			// ArrayList nbList = new ArrayList();
			XPathExpression expr = xpath.compile(Xpath);
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			NodeList nodes = (NodeList) result;
			XPath_Results = nodes.item(0).getNodeValue();
			for (int i = 0; i < nodes.getLength(); i++) {
				XPath_Results = nodes.item(i).getNodeValue();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return XPath_Results;
	}

	public ArrayList<String> getXpath(String Xpath) {
		ArrayList<String> arList = new ArrayList<String>();
		try {
			NodeList nodes = (NodeList) xpath.evaluate(Xpath, doc, XPathConstants.NODESET);
			for (int i = 0; i < nodes.getLength(); i++) {
				arList.add(nodes.item(i).getNodeValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arList;
	}

}
