import java.util.HashMap;
import java.util.Scanner;

public class Sedan {
        private int ans=0;
          private HashMap<String,Integer> Hatchhm=new HashMap<>();

     void createHashmap(){
         
          
            Hatchhm.put("BS01",4000);
            Hatchhm.put("EF01",8000);
            Hatchhm.put("CF01",4000);
            Hatchhm.put("BF01",1500);
            Hatchhm.put("GF01",6000);
            
        
            

            
     }


    public void generateTheBill(){
        createHashmap();

         

        useMap map=new useMap();

        HashMap<String,String> details=map.makeDetails();
        HashMap<String,Boolean> present=map.makePresent();
         
            Scanner scan=new Scanner(System.in);
          System.out.println("Details of Our Service Code and Price -->");
            for(String ele:Hatchhm.keySet()){
                System.out.println(details.get(ele)+" : "+ele+" : "+Hatchhm.get(ele));
            }  
            System.out.println("Select Service Code -->");
            System.out.println("If You want to Stop it Press : 'Stop'-->" );
            while (true) {
               String code=scan.nextLine();
                  if(present.containsKey(code)){
                    if(present.get(code)==false){
                          present.put(code, true);
                    }else{
                        System.out.println("You have All Ready Choose it ! ");
                    }
                       
                  }else if(code.equalsIgnoreCase("stop")){
                         break;
                  }else{
                    System.out.println("Please Correctly Choose it ! ");
                  }
            }
            
            


              
             
           
            System.out.println("<--------- Your Service Bill ------------>");
            StringBuilder sb=new StringBuilder();
            sb.append("Type of Car - Seden");
              for (String ele : present.keySet()) {
                  if(present.get(ele)==true){
                      ans+=Hatchhm.get(ele);
                      sb.append("\nService Codes - "+ele+", : ");
                      if(details.containsKey(ele)){
                        sb.append("Service - "+details.get(ele)+", : "+"Price - "+Hatchhm.get(ele));
                      }
                  }
              }
    
            sb.append("\nTotal Bill : "+ans);


            System.out.println(sb);
           
     }
}
