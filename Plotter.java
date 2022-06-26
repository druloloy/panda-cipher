public class Plotter {
    public static void main(String[] args){
        plot("sfybzledtwgkvaoucihpxqnjrm");
    }
    public static void plot(String str){
        String[] arr = str.split("");
        // col
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++ ){
                System.out.print(arr[j]+" ");
            }
            for(int k = 0; k < i ; k++ ){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
}
