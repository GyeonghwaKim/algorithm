test=int(input())
for i in range(test):
    price=int(input())
    quarter=price//25
    price=price%25
    prime=price//10
    price=price%10
    nickel=price//5
    price=price%5
    penny=price//1
    print(quarter,prime,nickel,penny)
