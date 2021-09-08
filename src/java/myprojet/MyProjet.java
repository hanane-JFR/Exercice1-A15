/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprojet;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author hjaaf
 */
@Path("bdeb")
public class MyProjet {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MyProjet
     */
    public MyProjet() {
    }

  

      @GET
    @Path("afficherdetail&RECANGLE&{val1}&{val2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getXml(@PathParam("val1")int val1,@PathParam("val2")int val2) {
        //TODO return proper representation object
//        return "Le resultat est :"+(valeur1+valeur2);
                return ShapeTwo(val1,val2);

    }
        private static String ShapeTwo(int val1,int val2){
        String msg;
        double Area;
        
    if(val1>0&&val2>0){
        Area=val1*val2;
         msg=("{\"Status\":\"OK\",\"Timestamp\":12255645,\"Shape\":\"RECTANGLE\"}"+"Width = "+val1+" Width = "+val2+" Area = "+ Area);
        
       
    }else{
      msg="{\"Status\":\"Error\",\"Timestamp\":12255645,\"Shape\": \"RECANGLE\",\"Message\":\"Not the good Shape\"}";  
       
    }
        
        return msg;
    }
    
    @GET
    @Path("afficherdetail&trapzoid&{val1}&{val2}&{val3}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getXml(@PathParam("val1")int val1,@PathParam("val2")int val2,@PathParam("val3")int val3) {
        //TODO return proper representation object
//        return "Le resultat est :"+(valeur1+valeur2);
                return ShapeTree(val1,val2,val3);

    }
        private static String ShapeTree(int val1,int val2,int val3){
        String msg;
        double Area;
        
    if(val1>0&&val2>0&&val3>0){
        Area=((val1+val2)/0.5)*val3;
         msg=("{\"Status\":\"OK\",\"Timestamp\":12255645,\"Shape\":\"TRAPEZOID\"}"+"Base1 = "+val1+" Base2 = "+val2+" height = "+ val3+" Area = "+ Area);
        
       
    }else{
      msg="{\"Status\":\"Error\",\"Timestamp\":12255645,\"Shape\":\"TRAPEZOID\",\"Message\":\"Not the good Shape\"}";  
       
    }
        
        return msg;
    }
}
