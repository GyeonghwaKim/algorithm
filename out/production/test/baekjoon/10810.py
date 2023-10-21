n,m=map(int,input().split())
arrs=[ 0 for _ in range(n)]
for _ in range(m):
    i,j,k=map(int,input().split())
    for l in range(i,j+1):
        arrs[l-1]=k
for arr in arrs:
    print(arr,end=' ')
