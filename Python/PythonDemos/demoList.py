li = ["A", "b", "C", "abcd", 10, "12", {"abc":10}];
for i in li :
    print(i);
li.append(20);
print(li);
li.insert(2, 10);
print(li);
print(li.count(4)); #count occurence of the argument in the list
# li.clear();
# print(li)

list = li.copy();
print(list);
print(li[3]);
li.extend(list);
print(len(li))
li.reverse();
print(li);

# allow duplicate elements, insert at any index