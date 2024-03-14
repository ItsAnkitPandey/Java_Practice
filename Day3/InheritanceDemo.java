class BasicPhone{
    void sendMessage(){
         System.out.println("send message");
    }
    void makeCall(){
         System.out.println("Make calls");
    }
    void recieveMessage(){
          System.out.println("Recieve message");
    }
    void recieveCall(){
        System.out.println("Recieve calls");
    }
}
class SmartPhone extends BasicPhone{
    void browseInternet(){
        System.out.println("Browse Intenet");
    }

    void useCamera(){
         System.out.println("use camera");
    }
}

class InheritanceDemo{
    public static void main(String[] args){
        SmartPhone sphone = new SmartPhone();
        sphone.sendMessage();
        sphone.makeCall();
        sphone.recieveMessage();
        sphone.recieveCall();
        sphone.browseInternet();
        sphone.useCamera();

    }
}