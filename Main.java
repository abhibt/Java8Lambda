@FunctionalInterface
interface MyFunctionalInterface {

	//A method with no parameter
    public String sayHello();
}

@FunctionalInterface
interface MyFunctionalInterface2 {
    public int Increment(int a);
}

/*
Trying out lambda functions from Java 8
*/
public class Main {

   public static void main(String args[]) {
        // lambda expression
    	MyFunctionalInterface msg = () -> {
    		return "Hello";
    	};

      MyFunctionalInterface2 numBer = (num) -> num+5;
      System.out.println(msg.sayHello());
      System.out.println(numBer.Increment(2));
    }
}