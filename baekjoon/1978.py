t=int(input())
numbers=map(int,input().split())
cnt=0
for number in numbers:
    primeNum=False
    if number==1:
        continue
    elif number==2:
        cnt+=1
        continue
    for i in range(2,number):
        if number%i==0:
            primeNum=False
            break
        else:
            primeNum=True
    if primeNum==True:
        cnt+=1
print(cnt)