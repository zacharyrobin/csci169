# Zachary Robin
# CSCI 169: Programminig HW 2
# Dr. Linnell 
# 04/24/19

# Part 1:
# Q: Explain in words the output of the given program.
# A: Running the program yields the following output 
#   After local assignment: test spam
#   After nonlocal assignment: nonlocal spam
#   After global assignment: nonlocal spam
#   In global scope: global spam
# The local assignment makes sense since it is the first 
# assignment and the first function to be called. 
# Next the nonlocal function is called and declared 
# so it makes sense that it works. However, the next 
# portion, the global function is called and executed 
# but the "nonlocal spam" is returned instead. This 
# is due to the LEGB scoping rules for python in which 
# the priority is given first to local, then enclosed, 
# global, and finally built in. Since enclosed and 
# local take priority over global, it makes sense that
#  the "spam" variable does not change because the 
# scope is the same thus the priority does not change.
#  But when the scope_test is run, the global then 
# takes priority, and is thus used in the final return. 


# ******************************************************
# Part 2:
# 8-Queens problem

# Fill the board
def fill():
    row = [0,0,0,0,0,0,0,0]
    column = [
    [1,0,0,0,5,0,0,0]
    ,[0,2,0,0,6,0,0,0]
    ,[0,0,3,0,0,7,0,0]
    ,[0,0,0,4,0,0,8,0]
    ,[1,0,0,0,5,0,0,9]
    ,[0,2,0,0,0,6,0,0]
    ,[0,0,3,0,0,0,7,0]
    ,[0,0,0,4,0,0,0,8]]
    # for i in range(0,8):
    #     column.append(row)
    return column

# Prints out the board in  a 8x8 matrix. Input needs to be a list of lists, that is columns of rows.
def fprint(board):
    for i in range(0,8):
        print(board[i])

# Takes in a board, returns 1 if two or more queens can attack eachother. Else 0.
def collisionCheck(board):
    # This function is used in the horrizontal and diagonal detection to check if a list has two queens present. 
    # Returns 1 if two or more, else 0 
    def listCheck(l):
        flag = 0
        for i in range(0,8):
            if(i == 1):
                flag = flag + 1
                if(flag >=2):
                    return 1
        return 0

    # Check horizontal collision 
    for i in range(0,8):
        flag = 0
        for j in range (0,8):
            if(board[i][j]==1):
                flag = flag + 1
        if(flag >= 2):
            return "horizontal Nah"
    # Check vertical collision 
    for i in range(0,8):
        flag = 0
        for j in range (0,8):
            if(board[j][i]==1):
                flag = flag + 1
        if(flag >= 2):
            return "vertical Nah"
    # Check diagonal left collision (down and right)
    col = 7
    row = 0 
    



    # Check diagonal right collision (up and right)

    



    return "Gucci"  
z = fill()

for i in range(1,6):
    print(i)
# print(collisionCheck(z))




# Places the queens and calls collisionCheck to see if you can place a certain queen there.


