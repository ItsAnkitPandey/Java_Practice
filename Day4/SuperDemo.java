class A{
    int i;

    A(){
        System.out.println("A class zero args contrutor");
    }

    A(int a){
         this();
         System.out.println("A class int args contrutor");
    }   
}

class B extends A{
    int j;

    B(){
        this("ankit");
         System.out.println("B class zero args contrutor");
    }

    B(String s){
        super(5);
        System.out.println("B class string args contrutor");
    }
}

class SuperDemo{
    public static void main(String[] agrs){
        B b = new B();
    }
}