n=int(input())
arr=[[0 for _ in range(100)]for _ in range(100)]
cnt=0
for i in range(n):
    x,y=map(int,input().split())
    for j in range(10):
        if x+j>99:
            break
        for l in range(10):
            if y+1>99:
                break
            arr[x+j][y+l]=1

for a in arr:
    for k in range(100):
        if a[k]==1:
            cnt+=1
print(cnt)