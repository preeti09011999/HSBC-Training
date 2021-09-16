
#  Key - value pair
#  
emps = {"empId":1, "empName":"HSBC", "empId":2, "empSalary":1}
# print(emps)
# print(type(emps))
# print(emps.get("empId"))
# print(emps["empName"])
# print(emps.values())
# print(emps.items())
# print(emps.keys())
# for a in emps :
#     print(a)

list = [{"empId":1, "empName":"HSBC"}, {"empId":2, "empName":"HSBC2"}, {"empId":3, "empName":"preeti"}]
#  ---------------------------------- checking if the id already exists -------------------------------------------
# id = 2
# def getName(id, lists) :
#     for a in list :
#         if a["empId"] == id :
#             print("Exists")

# getName(2, list)
#  ------------------------ if id doesn't exist, add the dictionary to the list ---------------------------------------
# def addEmployee(dict, list) :
#     flag = True
#     for a in list :
#         if(a["empId"] == dict.get("empId")) :
#             flag = False
#     if flag == True :
#         list.append(dict)

# addEmployee({"empId":5, "empName":"Somya"}, list)

# print(list)

# --------------------------------- 
employees = [{"emp1":{"empId":1, "empName":"Preeti", "empSalary":200}}, {"emp2":{"empId":2, "empName":"Somya", "empSalary":100}}, {"emp3":{"empId":3, "empName":"Sonam", "empSalary":200}}]
id = 2
for employee in employees :
    for a in employee.values() :
        if a["empId"] == id :
            print("exists")
