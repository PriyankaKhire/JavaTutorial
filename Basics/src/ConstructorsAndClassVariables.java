public class ConstructorsAndClassVariables {
    public String publicStringVariable;
    private String privateStringVariable;

    public ConstructorsAndClassVariables() {
        System.out.println("This is a public constructor");
    }

    public ConstructorsAndClassVariables(String stringArg, int intArg) {
        System.out.println("This constructor has arguments");
        System.out.println("The value of string arg is "+stringArg);
        System.out.println("The value of int arg is "+intArg);
    }

    public ConstructorsAndClassVariables(String publicStringVariable, String privateStringVariable) {
        this.privateStringVariable = privateStringVariable;
        this.publicStringVariable = publicStringVariable;
        System.out.println("This constructor is assigning public and private class variables");
    }

    public static void main(String[] args) {
        ConstructorsAndClassVariables obj1 = new ConstructorsAndClassVariables();
        ConstructorsAndClassVariables obj2 = new ConstructorsAndClassVariables("String Argument", 123);
        ConstructorsAndClassVariables obj3 = new ConstructorsAndClassVariables("Public Class Variable", "Private Class Variable");
        System.out.println("Accessing class variables : \t\n private variable = "+obj3.privateStringVariable+"\t\n public variable = "+obj3.publicStringVariable);
    }
}