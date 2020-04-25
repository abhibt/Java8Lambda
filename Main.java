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
Lambda is basically a macro.
In the actual function, which is main in this case,
you have to define the characteristics of the macro.
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