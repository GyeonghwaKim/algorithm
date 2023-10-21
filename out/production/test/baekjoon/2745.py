import math
b,n=map(str,input().split())
cnt=0
sum=0
number='0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
n=int(n)
for i in reversed(range(len(b))):
    index=number.index(b[i])
    sum+=index*(math.pow(n,cnt))
    cnt+=1
    print(i)
print(int(sum))
