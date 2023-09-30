x=int(input("enter any number:"))
sum=0
num=x
while (num!=0):
    digit=num%10
    sum=sum+digit**3
    num=num//10

if x==sum:
    print("it is armstrong number")
else:
    print("It is not armstrong number")