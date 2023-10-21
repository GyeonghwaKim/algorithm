str=input()
dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
sum=0
for s in str:
    for d in dial:
        if s in d:
            sum+=dial.index(d)+3
            
print(sum)


