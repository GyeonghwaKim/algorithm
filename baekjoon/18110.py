import sys
input=sys.stdin.readline

def newRound(num):
    return int(num)+ (1 if num-int(num)>=0.5 else 0)

n=int(input())
num=newRound(n*0.15)

if n==0:
    print(0)
else:
    score=[]
    for i in range(n):
        score.append(int(input()))
    score.sort()

    sum=0
    for i in range(num,n-num):
        sum+=score[i]
    sum=sum/(n-2*num)

    print(newRound(sum))