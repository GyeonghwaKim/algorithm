package swea.d3;


import java.io.*;

import java.util.*;

class Q1206
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int T=10;

		for(int i=0;i<T;i++){
			int result=0;
		//건물의 개수
		int n= Integer.parseInt(br.readLine());
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(0);
		arrayList.add(0);
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int j=0;j<n;j++){
			arrayList.add(Integer.parseInt(st.nextToken()));
		}
		arrayList.add(0);
		arrayList.add(0);
		for(int k=2;k<n+2;k++){
			boolean left=false;
			boolean right=false;
			//왼쪽조망권
			if(arrayList.get(k)-arrayList.get(k-2)>0){
				if (arrayList.get(k)-arrayList.get(k-1)>0){
					left=true;
				}
			}
			//오른쪽 조망권
			if(arrayList.get(k)-arrayList.get(k+2)>0){
				if (arrayList.get(k)-arrayList.get(k+1)>0){
					right=true;
				}}

			if(left&right){
				int[] arr={
						arrayList.get(k+2),arrayList.get(k+1),arrayList.get(k-1),arrayList.get(k-2)
				};
				result+= arrayList.get(k)-Arrays.stream(arr).max().getAsInt();
			}

		}
			System.out.println(String.format("#%d %d",i+1,result));
		}

	}
}