import java.util.HashMap;

public class useMap {
          
          

         public HashMap<String,String> makeDetails(){

             HashMap<String,String> details=new HashMap<>();
            details.put("BS01","Basic Servicing");
            details.put("EF01","Engine Fixing");
            details.put("CF01","Clutch Fixing");
            details.put("BF01","Brake Fixing");
            details.put("GF01","Gear Fixing");
            return details;
         }

         public HashMap<String,Boolean> makePresent(){

            HashMap<String,Boolean> present=new HashMap<>();
            present.put("BS01",false);
            present.put("EF01",false);
            present.put("CF01",false);
            present.put("BF01",false);
            present.put("GF01",false);
            return present;
         }

           
    
}
