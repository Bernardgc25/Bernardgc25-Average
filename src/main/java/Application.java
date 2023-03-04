public class Application {
    public static void main(String[] args) {
        Average sample = new Average(); 
        int[] arr = {1,2,3,4};


        double sumArray = sample.getAvg(arr);
        
        System.out.println(sumArray);
        

    }
}
