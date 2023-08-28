n,m=map(int,input().split())
arrs=[]
for i in range(n):
    arrs.append(i+1)

for _ in range(m):
    i,j=map(int,input().split())
    arrs[i-1:j]=reversed(arrs[i-1:j])

print(*arrs)