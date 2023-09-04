t=int(input())
words=[]
wordsSet=set()
for _ in range(t):
    wordsSet.add(input())#중복 제거
words=list(wordsSet)
words.sort()
words.sort(key=len) #길이로 정렬

for word in words:
    print(word)