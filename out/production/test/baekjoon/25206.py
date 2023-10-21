gradeWithScore=[['A+',4.5],['A0',4.0],['B+',3.5],
       ['B0',3.0],['C+',2.5],
       ['C0',2.0],['D+',1.5],
       ['D0',1.0],['F',0.0]]

creditSum=0
scoreSum=0


for i in range(20):
    sub,credit,grade=map(str,input().split())
    
    for i in range(len(gradeWithScore)):
        if grade==gradeWithScore[i][0]:
             scoreSum+=float(credit)*gradeWithScore[i][1]
             creditSum+=float(credit)
             break
print(round(scoreSum/creditSum,6))
