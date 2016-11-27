package PINARY;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class source {
    public static long cnt = 0;
    public static void main(String[] args) throws IOException{
     System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int N = Integer.parseInt(br.readLine());
        long[] arr0 = new long[N+1];
        long[] arr1 = new long[N+1];
         
        cnt = 0;
        if(N == 1){
            cnt = 1;
        }else if(N == 2){
            cnt = 1;
        }else if(N == 3){
            cnt = 2;;
        }else{
            arr0[2] = 1;
            arr1[2] = 1;
            for(int i=3;i<N;i++){
                arr0[i] = arr1[i-1] +arr0[i-1];
                arr1[i] = arr0[i-1];
            }
            cnt = arr1[N-1] + arr0[N-1];
        }
         
        System.out.println(cnt);
    }
     
}

