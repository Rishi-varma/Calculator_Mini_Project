public class App {
    public static void main(String []args) {
        double result1,result2,result3,result4;
        int x;

        System.out.println("**************** Calculator ****************\n");
        System.out.println("              Select a option:                  ");
        System.out.println("1. SqRt");
        System.out.println("2. Fact");
        System.out.println("3. Log");
        System.out.println("4. Powers");
        System.out.println("********************************************\n");


        double a = 2;
        double b = 4;


        System.out.println("First number: "+a);
        result1 = Math.sqrt(a);
        System.out.println("SqRt Result: "+result1);
        System.out.print("\n");
        //System.out.println("Not yet built, what for next version.");

        System.out.println("First number: "+a);
        double n = 1;
        for(int i=1; i<=a; i++){
          n = n*i;
        }
        result1 = n;
        System.out.println("Fact Result: "+result1);
        System.out.print("\n");
        //System.out.println("Subtraction module is not yet built, what for the next version.")

        System.out.println("First number: "+a);
        result1 = Math.log(a);
        System.out.println("Log Result: "+result1);
        System.out.print("\n");
        //System.out.println("Multiplication module is not yet built, what for the next version.");

        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
        result1 = Math.pow(a, b);
        System.out.println("Powers Result: "+result1);
        //System.out.println("Division module is not yet built, what for the next version.");

        System.out.println("\n********************************************\n");
    }
}
