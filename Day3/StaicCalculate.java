class CalculateService{
    static int findCube(int n){
        return n*n*n; 
    }
}

class StaicCalculate{
    public static void main(String[] args){
        int result = CalculateService.findCube(4);
        System.out.println(result);
    }
}

// static keyword helps in calling methods directly using classname without creating any object of class