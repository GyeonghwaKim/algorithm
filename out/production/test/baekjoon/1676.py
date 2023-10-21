import sys
input=sys.stdin.readline
def factorial(a):
    if a>1:
        return factorial(a-1)*a
    else:
        return 1
    
n=int(input())
num=factorial(n)
cnt=0
for a in reversed(str(num)):
    if a!='0':
        break
    cnt+=1
print(cnt)
