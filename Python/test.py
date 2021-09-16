try :
    n = 13
    print(n/0)
except ZeroDivisionError :
    print("Sorry can't divide by zero :)")
finally :
    print('In finally')
