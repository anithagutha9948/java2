package A;

public class InstanceTest { 
    public static void main(String args[]){  
        System.out.println("Hashcode test of String:");  
        String sd="Prem";  
        System.out.println(sd.hashCode());  
        sd=sd+"Prem";  
        System.out.println(sd.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("tpoint");  
        System.out.println(sb.hashCode());  
    }  
}  


