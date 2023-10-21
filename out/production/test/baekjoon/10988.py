words=input()
bool=True
for i in range(len(words)//2):
    if words[i]!=words[len(words)-(i+1)]:
        bool=False
        break;
    
print(1 if bool==True else 0)

