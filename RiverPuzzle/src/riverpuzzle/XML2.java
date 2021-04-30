package riverpuzzle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

 
public class XML2 {
    public static final String xmlFilePath = "D:\\Term 4\\Programming\\RiverPuzzle final\\src\\riverpuzzle.xml";
   private static List<ICrosser> left;
    private static List<ICrosser> right;
    private static List<ICrosser> boat;
    private static List<ICrosser> ll=new ArrayList<ICrosser>();
    private static List<ICrosser> rr=new ArrayList<ICrosser>();
    private static List<ICrosser> bb=new ArrayList<ICrosser>();
    private static List<List> all=new ArrayList<List>();
static ICrosser  herb=new Sheep(); 
static ICrosser farmer60=new Farmer(60);
static ICrosser farmer40=new Farmer(40);
static ICrosser farmer80=new Farmer(80);
static ICrosser farmer90=new Farmer(90);
 public XML2(){}
    

       public static void Save(List<ICrosser> l,List<ICrosser> r,List<ICrosser> b) throws TransformerException{
         left=l;
        right=r;
        boat=b;
     try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument(); 
            Element root=document.createElement("Lists");
            document.appendChild(root);
             Element type = null;
             Element place=null;
         if(left.size()==0)
         {System.out.println("Left empty");}
             else
         { Element list=document.createElement("list"); 
         root.appendChild(list);
           
             for(int i=0;i<left.size();i++)
    {
      if(left.get(i).getWeight()==60)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("60"));
      list.appendChild(type);
        }
      else if(left.get(i).getWeight()==80)
      {       System.out.println("80");
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("80"));
        list.appendChild(type);
        /*Attr attr = document.createAttribute("weight");
            attr.setValue("80");
            type.setAttributeNode(attr);*/
        }
      else if(left.get(i).getWeight()==40)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("40"));
      list.appendChild(type);
        }
      else if(left.get(i).getWeight()==90)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("90"));
      list.appendChild(type);
        }
      else if(left.get(i)instanceof Cow)
      {    
      type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("20"));
      list.appendChild(type);}
      }
    place=document.createElement("Place");
       place.appendChild(document.createTextNode("1"));
      list.appendChild(place);  
          }
         if(right.size()==0)
         {System.out.println("Right empty");} 
         else
         {  
      
      Element list1=document.createElement("list"); 
         root.appendChild(list1);
    for(int i=0;i<right.size();i++)
    {  
      if(right.get(i).getWeight()==80)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("80"));
        /*Attr attr = document.createAttribute("weight");
            attr.setValue("80");
            type.setAttributeNode(attr);*/
      list1.appendChild(type);
        }
      else if(right.get(i).getWeight()==60)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("60"));
      list1.appendChild(type);
        }
      else if(right.get(i).getWeight()==90)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("90"));
      list1.appendChild(type);
        }
      else if(right.get(i).getWeight()==40)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("40"));
      list1.appendChild(type);
        }
      else if(right.get(i)instanceof Cow)
      {    
      type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("20"));
      list1.appendChild(type);}
    }   
    place=document.createElement("Place");
       place.appendChild(document.createTextNode("2"));
      list1.appendChild(place);
    }    
         if(boat.size()==0)
         {System.out.println("Boat empty");} 
         else
         {
         Element list2=document.createElement("list"); 
      root.appendChild(list2);
    for(int i=0;i<boat.size();i++)
    {
     if(boat.get(i).getWeight()==40)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("40"));
      list2.appendChild(type);
        }
      else if(boat.get(i).getWeight()==60)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("60"));
      list2.appendChild(type);
        }
     else if(boat.get(i).getWeight()==80)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("80"));
      list2.appendChild(type);
        }
     else if(boat.get(i).getWeight()==90)
      {       
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("90"));
      list2.appendChild(type);
        }
      else if(boat.get(i)instanceof Cow)
      {    
      type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("20"));
      list2.appendChild(type);}
     
    place=document.createElement("Place");
       place.appendChild(document.createTextNode("3"));
      list2.appendChild(place);
        
         
               // create the xml file
            //transform the DOM Object to an XML File
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
              System.out.println("Done creating XML File");
         }
         }
     }catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }

       }

    XML2(List<ICrosser> leftSide, List<ICrosser> rightSide, List<ICrosser> boatriders) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public List<List> load() throws ParserConfigurationException, SAXException, IOException{
       
       try {
   DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
	File file = new File(xmlFilePath);
	if (file.exists()) {
	Document doc = db.parse(file);
	Element element = doc.getDocumentElement();

// Print root element of the document
System.out.println("Root element of the document: "+ element.getNodeName());
             NodeList lists =  element.getElementsByTagName("list");
             if (lists != null && lists.getLength() > 0)
                     {   System.out.println("length = "+ lists.getLength());
                     int y=0;
                    String m=null;
                     int k=0;
          for(int i=0;i<lists.getLength();i++)   
          {  
            Node n=lists.item(i);
            System.out.println("Current Element  :" +n.getNodeName());
            System.out.println("num" +i);
              if(n.getNodeType()== Node.ELEMENT_NODE){
               Element e=(Element) n;
                NodeList nodeList4= e.getElementsByTagName("Place");
     String x= nodeList4.item(0).getChildNodes().item(0).getNodeValue();
       y=Integer.parseInt(x);
        System.out.println("Place: " + y);
        
              NodeList nodeList0 = e.getElementsByTagName("Crosser");
              for(int j=0;j<nodeList0.getLength();j++)
              {   
                  Node nn=nodeList0.item(j);
                        if(n.getNodeType()== Node.ELEMENT_NODE){
                  m= nodeList0.item(j).getTextContent();
                k=Integer.parseInt(m);
                 System.out.println("Carn: " +k);
                 if(y==1){
                 if(k==40)
                    ll.add(farmer40);
                 else if(k==60)
                    ll.add(farmer60);
                 else if(k==80)
                    ll.add(farmer80);
                 else if(k==90)
                    ll.add(farmer90);
                 else if(k==20)
                     ll.add(herb);
              }
                 else if(y==2){
                if(k==40)
                    rr.add(farmer40);
                else if(k==60)
                    rr.add(farmer60);
                else if(k==80)
                    rr.add(farmer80);
                else if(k==90)
                    rr.add(farmer90);
                else if(k==20)
                    rr.add(herb);
              }
                else if(y==3)
                 {  if(k==40)
                    bb.add(farmer40);
                 else if(k==60)
                    bb.add(farmer60);
                 else if(k==80)
                    bb.add(farmer80);
                 else if(k==90)
                    bb.add(farmer90);
                 else if(k==20)
                     bb.add(herb);
                     }
                     }
                     }
                     }
                     }
                     }
       }
          all.add(ll);
          all.add(rr);
          all.add(bb);
       }
       
       
       catch (Exception e) {
			System.out.println(e);
}
    System.out.println("all size"+ all.size());
        return all;
}
}
       
       
    

//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

