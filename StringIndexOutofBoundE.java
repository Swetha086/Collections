public class StringIndexOutofBoundE {
   public static void main(String[] args) {
    String name ="Swetha";
    try{
      System.out.println(name.charAt(10));
    }
    catch(StringIndexOutOfBoundsException e){
      System.out.println("String is out !");
    }
  }
}
