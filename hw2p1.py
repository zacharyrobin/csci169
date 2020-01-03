#Zachary Robin
#CSCI 169
#Programming HW2 
#Part 1
def fun(x,y):
    z=x+y
    print(z)
    return z
fun(1,2)
fun("hi","there")

#Part 2
def report(xs):
    #y will keep track of the number of students 
    #z will keep track of the score 
    #q will hold the string of names
    y = 0
    z=0
    q= xs[1]
    for x in xs:
        for x in xs:
            if(type(x)==int):
                y = y +1
                z = z + x
        if (x-1):
            if(type(x-1) == int):
                q = ", " + str(x)

    print(q + "averaged: " + str(z/y))
report(["Jill", "Johnson", 87, "Billy", "Ray", "Cyrus", 78, "Rita", "Yeats", "Bobbie", "Sue", "Palmer", 72])

#Part 3
#A simple print function 
def printfun(x):
    for i in x:
        print(str(i) + " ")
    print()

#The partition function 
def partition(input, p, r):
    pivot = input[r]
    while p<r:
        while input[p] < input[r]:
            p = p +1
        while input[r] > pivot:
            r = r-1
        if input[p] == input[r]:
            p = p+1
        elif p<r:
            tmp = input[p]
            input[p] = input[r]
            input[r] = tmp
    return r 

#The quicksrt recurrsive function 
def quicksort(input, p, r):
    if p<r:
        j = partition(input,p,r)
        quicksort(input,p,j-1)
        quicksort(input,j+1,r)

# this part acts as the main function that we have in C++ code
input = [500, 700, 800, 100, 300, 200, 900, 400, 1000, 600]
print("Input: ")
printfun(input)
quicksort(input,0,9)
print("Output: ")
printfun(input)