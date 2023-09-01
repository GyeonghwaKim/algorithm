n,m=map(int,input().split())
aList=[list(map(int,input().split()))for _ in range(n)]
bList=[list(map(int,input().split()))for _ in range(n)]
arr=[[0 for _ in range(m)]for _ in range(n)]
for i in range(n):
    for j in range(m):
        arr[i][j]=aList[i][j]+bList[i][j]

for k in range(n):
    for l in range(m):
        print(arr[k][l],end=" ")
    print()

