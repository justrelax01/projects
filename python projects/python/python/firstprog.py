
from math import *


#
character_name="john"
character_age ="35"
int_h=12

age =("enter your age")
color =input("enter a color:")
name= input ("enter your name:")

print("hello "+name+"and your age is"+age)
print ("hello world")
print ("6"+"8")
print ("hasan")


# lists

freinds =["hasan","ali","john"]

print (friends[1])  # calling the names by there index


# 
text="hasan"
print (text.islower())
print (text.lower())
print (len(text))
print (text[0])
print (text.index(h))
print (text.replace("",""))



#

number = 5
numdouble=5.5
print (number)
print (str(numdouble))
print(str(numdouble)+"my number is")

print(pow(2,3))

print(max(4,4))
print(min(4,4))
print(round(3.4,3))

print(floor(3.4))
print(ceil(3.3))
print(sqrt(16))


#

in1=input ("enter the first number:")
in2=input ("enter your second number:")
result=int(num1)+int(num2)
print(result)


#

color =input("enter a color :")
pluralnoun=input("enter a plural noun :")
adjective=input ("enter an adjective:")
print("trees are "+ color)
print(pluralnoun+ "are mean")
print("please keep it" +adjective)



#tuples

coordinates = (23,45)
list_of_tuples=[(2,3),(5,7)]
print (coordinates[1])



#functions

def say_hi(name,age):
    
    print ("hello "+name+ "your age is:"+age)


say_hi()

def cube(num):
    return  num*3

cube (4)


def sum (num1 , num2):
    return num1+num2

print(sum(2,4))


#loops


## if elif else

is_hungry = True
want_to_eat= True

if is_hungry or want_to_eat:
    print("go eat you are hungry")
elif is_hungry and not wants_to_eat:
    print("eat so ypu acn survive")
elif not is_hungry and want_to_eat:
    print("do not eat you are not hungry")
else:
    print("dont eat")
  
  

##while

i=1
while i<=10:    
    i+=1
    if i==6:
        continue  
    print (i)
    


##FOR LOOP

buddies=["hasan" , "ali", "george","winner"]

for index in range (len (buddies)):
    print (index)

for index in range (len (buddies)):
    print(buddies [index])

for x in range(5, 10):
    print (x)
    

for index in range (10):
    if index % 2 == 0:
        print (index , " is an even number ")    
    else:
        print(index, "is an odd number")
 
 
for buddy in rangr (len(buddies )):
    if buddies[buddy ] ==" winner":
        print(buddy,"is the winner")
    else: 
        print(buddy,"is not the winner")


for buddy in buddies:
    if buddy == "george":
        print(buddy,"is your friend ")
        break
    else:
        print("not found")

for x in range (3,10):
    if x == 5:
        continue
    print (x , "is the chosen number")


            
#


convert_month={
    "jan":"january",
    "feb" : febraury,
    "mar" : march
}

print(convert_month.get("","the key is not found !"))










