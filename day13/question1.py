import os
from InvalidPathException import InvalidPathException
path = "C:/Users/preet/Documents/HSBC_Assignments/empPayRoll"


#  List of files
f_list = []
# List of folders
d_list = list()
number_of_folders = 0
number_of_files = 0
def cwd_details(path) :
    try :
        for f in os.listdir(path):
                if os.path.isfile(os.path.join(path, f)):
                    number_of_files = number_of_files + 1
                    f_list.append(f)
                else:
                    if os.path.isdir(os.path.join(path, f)):
                        number_of_folders = number_of_folders + 1
                        cwd_details(os.path.join(path, f))
                        d_list.append(f)
    except :
        raise InvalidPathException()
print(number_of_files)
print(number_of_folders)
print(f_list)
print(d_list)


cwd_details(path)
