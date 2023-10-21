n,m=map(int,input().split())
arrs=[]
temp=0
for i in range(n):
    arrs.append(i+1)
for _ in range(m):
    i,j=map(int,input().split())
    temp=arrs[i-1]
    arrs[i-1]=arrs[j-1]
    arrs[j-1]=temp
for arr in arrs:
    print(arr,end=' ')