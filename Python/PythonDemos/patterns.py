# n = 6
# for i in range(n) :
#     print()
#     for j in range(i) :
#         print("*", end=" ") 

space = 5
n = 5
for i in range(n) :
    for k in range(space) :
        print(" ", end="")
    for j in range(2*i + 1) :
        print("*", end="")
    print()
    space = space - 1



   