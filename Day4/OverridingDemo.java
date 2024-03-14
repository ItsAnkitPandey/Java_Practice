class Animal{
    void eat(){
        System.out.println("Animal Eats???");
    }
}

class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger Eats flash");
    }
}
class Buffalo extends Animal{
    void eat(){
        System.out.println("Buffalo Eats grass");
    }
}

class OverridingDemo{
    public static void main(String[] args){
        Tiger tiger = new Tiger();
        tiger.eat();

        Buffalo buffalo = new Buffalo();
        buffalo.eat();
    }
}