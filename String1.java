
public class String1 {
    public static void main(String args[]){
        //Scanner input=new
        
        String firstName="Shahin";
        String lastName=" Alam";
        
        String fullName=firstName+lastName;
        System.out.println("General addition: "+fullName);
        
        String fullName1=firstName.concat(lastName);
        System.out.println("Concated: "+fullName1);
        
        String lowerName=fullName1.toLowerCase();
        System.out.println("lowercase: "+lowerName);
        String upperName=fullName1.toUpperCase();
        System.out.println("UpperCase: "+upperName);
        
        boolean s=fullName.startsWith("Shah");
        System.out.println("Full Name starts with 'Shah': "+s);
        boolean l=fullName.endsWith("am");
        System.out.println("Full Name Ends with 'am': "+l);
        
        String[] names={"Shamim","Shahin","Mehedi"};
        for(String x:names){
            System.out.println(x);
        }
           String country="     Bangladesh is my country.    It is a beautiful country      ";
           System.out.println(country);
           char index=country.charAt(2);
           System.out.println("0 th : "+index);
           int pos=country.indexOf("is");
           System.out.println("first position of 'is': "+pos);
           pos=country.lastIndexOf("n");
           System.out.println("Last index of 'n': "+pos);
           String str=country.trim(); //removed space starting n finishing ends
           System.out.println(str); 
           
        String s1="I love my country";
        String s2=s1.replace('o','i');
        System.out.println(s2);
        String[] s3=s1.split(" ");//character dileo hobe
        for(String x:s3){
            System.out.println(x);
        }
    }
}
