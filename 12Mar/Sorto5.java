public class Sorto5{
    public static void main(String[] args) {
        int[] arr = {186, 4531, 34, 989873, 2};
        int count = 0;
        int n = arr.length;
        int lol[]=new int[n];
        for(int i = 0 ; i< n ;i++){
            int lmao=0;
            for(int j = arr[i];j>0;j=j/10){
                lmao++;
            }
            
            lol[i]=lmao;
            if(lol[i]%2==0){
                count++;
            }
    }
      System.out.print(count);
        }
}