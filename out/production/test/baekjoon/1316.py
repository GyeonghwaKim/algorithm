n=int(input())
words=[]
cnt=n
for _ in range(n):
    words.append(input())
for word in words:

    for i in range(len(word)-1):
        if word[i]==word[i+1]:
            pass
        elif word[i] in word[i+1:]:
            print(word)
            cnt-=1
            break
print(cnt)