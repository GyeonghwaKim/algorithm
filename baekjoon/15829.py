n=int(input())
hashStr=map(str,input())
sum=0
i=0
for a in hashStr:
    sum+=((ord(a)-96)*31**i)
    i+=1
print(sum%1234567891)