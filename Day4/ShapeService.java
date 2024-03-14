import java.util.Scanner ; 

class Shape{
    void area(){
           System.out.println("Shape Area?");
    }
}

class Circle extends Shape{
  void area(){
    System.out.println("Circe Area");
  }
}

class Triangle extends Shape{
  void area(){
    System.out.println("Triangle Area");
  }
}

class Rectangle extends Shape{
  void area(){
    System.out.println("Rectangle Area");
  }
}

class ShapeService{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Shape name");
        String shapeName = sc.next();
        sc.close();

        Shape s = null;

        if(shapeName.equals("circle")){
           s = new Circle();
        }else if(shapeName.equals("triangle")){
            s = new Triangle();
        }else if(shapeName.equals("rectangle")){
            s = new Rectangle();
        }else {
            System.out.println("invalid input");
        }

        if(s != null){
            s.area();
        }
    }
}
