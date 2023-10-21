def rev_words(str):
    return "".join(reversed(str))
while (True):
    t=input()
    tRev=rev_words(t)
    if t=='0':
        break;
    if t==tRev:
        print("yes")
    else:
        print("no")
    