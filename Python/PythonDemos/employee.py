emp1 = [{"empId":1, "empName":"Preeti"}, {"empId":3, "empName":"Sonam"}]
emp2 = [{"empId":2, "empName":"Somya"}]
emp3 = [{"empId":4, "empName":"Aman"}]
list = []

# ---------------------- add employee -----------------------------
def addEmployee(emp) :
    for e in list :
        if e.get("empId") == emp.get("empId") :
            break
    else :
        list.append(emp)

def addEmployees(li) :
    for e in li :
        addEmployee(e)

addEmployees(emp1)
addEmployees(emp1) # Not added
addEmployees(emp2)
addEmployees(emp2) # Not added
addEmployees(emp3)

print(list)

# ---------------------- 