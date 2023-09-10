import sys
import math
input=sys.stdin.readline
lst=[3,5]
result=0
n=int(input())
kg_lst=[3,5]
routine3=n//3
routine5=n//5
result=routine5+routine3
ok=False
for i in range(routine3+1):
    for j in range(routine5+1):
        if 3*i+5*j==n:
            sum=i+j
            ok=True
            if sum<result:
                result=sum
if ok==False:
    result=-1
print(result)
