/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riverpuzzle;
import java.io.File;
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
import riverpuzzle.Carnivore;
import riverpuzzle.Farmer;
import riverpuzzle.Herbivore;
import riverpuzzle.ICrosser;
import riverpuzzle.Lion;
import riverpuzzle.Plant;
import riverpuzzle.Sheep;
 
public class XML1 {
    public static final String xmlFilePath = "D:\\Term 4\\Programming\\RiverPuzzle final\\src\\riverpuzzle.xml";
   private static List<ICrosser> left;
    private static List<ICrosser> right;
    private static List<ICrosser> boat;
    private static List<ICrosser> ll=new ArrayList<ICrosser>();
    private static List<ICrosser> rr=new ArrayList<ICrosser>();
    private static List<ICrosser> bb=new ArrayList<ICrosser>();
    private static List<List> all=new ArrayList<List>();
static ICrosser carnv=new Lion(); //can work as wolf 
static ICrosser  herb=new Sheep(); 
static ICrosser farmer=new Farmer(50);
static ICrosser plant=new Plant();
 public XML1(){}
    

       public void save(List<ICrosser> l,List<ICrosser> r,List<ICrosser> b){
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
         {System.out.println("left empty");}
             else
         {  Element list=document.createElement("list"); 
         root.appendChild(list);
           
             for(int i=0;i<left.size();i++)
    {
      if(left.get(i)instanceof Farmer)
      {        
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("0"));
      list.appendChild(type);
      }
      else if(left.get(i)instanceof Carnivore)
      {    
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("1"));
      list.appendChild(type);}
      else if(left.get(i)instanceof Herbivore)
      {    
      type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("2"));
      list.appendChild(type);}
      else if(left.get(i)instanceof Plant)
      {  
  type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("3"));
      list.appendChild(type);
      }
    }  place=document.createElement("Place");
       place.appendChild(document.createTextNode("1"));
      list.appendChild(place);  
                 }
         if(right.size()==0)
         {System.out.println("right empty");} 
         else
         {  
      
      Element list1=document.createElement("list"); 
         root.appendChild(list1);
    for(int i=0;i<right.size();i++)
    {  
      if(right.get(i)instanceof Farmer){
        type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("0"));
      list1.appendChild(type);}
      else if(right.get(i)instanceof Carnivore){
         type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("1"));
      list1.appendChild(type);
      }
      else if(right.get(i)instanceof Herbivore)
      { 
     type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("2"));
      list1.appendChild(type);
      }
      else if(right.get(i)instanceof Plant)
      {  
      type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("3"));
      list1.appendChild(type);
      }
    }   
    place=document.createElement("Place");
       place.appendChild(document.createTextNode("2"));
      list1.appendChild(place);
    }    
         if(boat.size()==0)
         {System.out.println("empty boat");} 
         else
         {
         Element list2=document.createElement("list"); 
         root.appendChild(list2);
    for(int i=0;i<boat.size();i++)
    {
      if(boat.get(i)instanceof Farmer){
     
      type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("0"));
      list2.appendChild(type);}
      else if(boat.get(i)instanceof Carnivore)
      { 
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("1"));
      list2.appendChild(type);}
      else if(boat.get(i)instanceof Herbivore)
      {  
      type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("2"));
      list2.appendChild(type);}
      else if(boat.get(i)instanceof Plant){
          
       type=document.createElement("Crosser");
       type.appendChild(document.createTextNode("3"));
      list2.appendChild(type);}
    }
    place=document.createElement("Place");
       place.appendChild(document.createTextNode("3"));
      list2.appendChild(place);
         }
               // create the xml file
            //transform the DOM Object to an XML File
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
              System.out.println("Done creating XML File");}
             catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    XML1(List<ICrosser> leftSide, List<ICrosser> rightSide, List<ICrosser> boatriders) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public List<List> load(){
       
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
                     {   System.out.println("length ="+ lists.getLength());
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
              if(k==0)
                 ll.add(farmer);
             else if(k==1)
                 ll.add(carnv);
             else if(k==2)
                 ll.add(herb);
             else if(k==3)
                 ll.add(plant);
              }  
                else if(y==2){
               if(k==0)
                rr.add(farmer);
             else if(k==1)
                 rr.add(carnv);
             else if(k==2)
                 rr.add(herb);
             else if(k==3)
                rr.add(plant);
              }
               else if(y==3)
                 {  
                   if(k==0)
                 bb.add(farmer);
             else if(k==1)
                 bb.add(carnv);
             else if(k==2)
                bb.add(herb);
             else if(k==3)
                 bb.add(plant);
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
        return all;
       }

}
 


       
       
    

//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

