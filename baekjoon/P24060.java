package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24060 {


    static int[] tmp;
    static int K;
    static int result=-1;
    static int cnt;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K= Integer.parseInt(st.nextToken());

        StringTokenizer arrSt = new StringTokenizer(br.readLine());
        int[] mergeArr = new int[N];
        tmp=new int[N];

        for (int i = 0; i < N; i++) {
            mergeArr[i] = Integer.parseInt(arrSt.nextToken());
        }

        mergesort(mergeArr,0,mergeArr.length-1);
        System.out.println(result);

    }

    static void mergesort(int[] arr,int first,int last){
        if(first<last){
            int mid=(first+last)/2;
            mergesort(arr,first,mid);
            mergesort(arr,mid+1,last);
            merge(arr,first,mid,last);
        }
    }

    static void merge(int[] arr,int first,int mid,int last){
        int i=first;
        int j=mid+1;
        int index=0;
        while(i<=mid && j<=last){
            if(arr[i]<=arr[j]) tmp[index++]=arr[i++];
            else tmp[index++]=arr[j++];
        }

        while(i<=mid){
            tmp[index++] =arr[i++];
        }
        while (j<=last){
            tmp[index++]=arr[j++];
        }

        index=0;
        i=first;

        while(i<= last){
            cnt++;
            if(cnt==K) {
                result=tmp[index];
                break;}
            arr[i++]=tmp[index++];
        }

    }

}

