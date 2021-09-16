# set doesn't allow duplicate elements
# we can instantiate set using constructor
s1 = {}
print(s1)
s = {2, 3, 5, 6, 7, 3, 2}
print(s)
print(type(s))
# s.clear()
print(s)
print(s1)
s1 = s.copy()
print(s1)