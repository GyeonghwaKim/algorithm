b,n=map(int,input().split())
number='0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
output=''

while b!=0:
    output+=str(number[b%n])
    b=b//n
print(output[::-1])