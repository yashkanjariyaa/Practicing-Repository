public class sample{
  public void publicMethod(){
    System.out.println("This is public");
  }
  static void staticMethod(){
    System.out.println("This is static");
  }
  public static void main(String[] args){
      staticMethod();
      sample myObj = new sample();
      myObj.publicMethod();
  }
}