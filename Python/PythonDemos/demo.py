print("hello world");
num = 10;
print(num)
num = "hsbc";
print(num);
print("hello again");
print(2+3);
# print(2+""+8);
print("ajs"+"ask");
# add comment
if 3 < 8 :
    print("yes");
elif 2 < 8 :
    print("No");
else : 
    print("ok");

i = 10;
while i < 6 :
    print(i)
    i = i + 1;
    break;
else :
    print("done");

# prime number
# n = input('Enter a number');
# n = int(n);
# i = 2;
# while i * i <= n :
#     if n % i == 0 :
#         print("not prime");
#         break;
#     i = i + 1;
# else :
#     print("prime");

#
for a in range(5, 10) :
    print(a);

str = "HSBC_INdia";
print(str);
print(len(str))
print(str[0])
# count number of characters in a string
count = 0;
for a in str :
    count = count + 1;

print(count);

print(str.upper());
print(str.lower());
print(str.capitalize());

b = True;
print(b);
def functionName() :
    print("In function");

functionName();
#  method with arguments
def name(n) :
    print("Hello" + n);
name("10");

def func(n) :
    return n;

print(func(10));
# to check the data type 
print(type(10));
print(type("10"));

# to count number of digits
number = 5554555566;
c = 0;

while number > 0 :
    number = number // 10;
    c = c + 1;

print(c);

# logic to remove zeroes from number
numb = 1002;

result = 0;
pow = 1;
while numb > 0 :
    rem = numb % 10;
    numb = numb // 10;
    if rem != 0 :
        result = result + (rem * pow);
        pow = pow * 10;

print(result);

str = "This is HSBC {} {}"
print(str.format("India", "LTD"));


str = "This is HSBC {1} {0}"
print(str.format("India", "LTD"));


str = "This is HSBC {country} {type}"
print(str.format(country="India", type="LTD"));