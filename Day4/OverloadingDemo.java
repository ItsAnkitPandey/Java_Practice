class SmartPhone{
    void takePic(){
        System.out.println("click pic");
    }

    void takePic(String mode){
        System.out.println("click poto with "+ mode);
    }
}

class OverloadingDemo{
    public static void main(String[] args){
        SmartPhone s1 = new SmartPhone();
        s1.takePic();
        s1.takePic("depth");
    }
}