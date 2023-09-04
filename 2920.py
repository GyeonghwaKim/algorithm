ascending=[1,2,3,4,5,6,7,8]
descending=[8,7,6,5,4,3,2,1]
asCnt=0
desCnt=0
input=list(map(int,input().split()))
for i in range(8):
    if input[i]==ascending[i]:
        asCnt+=1
    elif input[i]==descending[i]:
        desCnt+=1
if asCnt==8:
    print("ascending")
elif desCnt==8:
    print('descending')
else:
    print('mixed')
