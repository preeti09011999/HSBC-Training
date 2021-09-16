emp1 = [{"empId":1, "empName":"Preeti", "dept":"IT"}, {"empId":3, "empName":"Sonam", "dept":"HR"}]
emp2 = [{"empId":2, "empName":"Somya", "dept":"IT"}]
emp3 = [{"empId":4, "empName":"Aman", "dept":"Accounts"}]
li = []

def addEmployee(emp) :
    for e in li :
        if e.get("empId") == emp.get("empId") :
            break
    else :
        li.append(emp)

def getAllUniqueDepts(emp) :
    setDept = {''}
    for e in li :
        setDept.add(e.get('dept'))
    return setDept

def addEmployees(li) :
    for e in li :
        addEmployee(e)

def groupEmployeesByDept(emp, setDept) :
    li = []
    for e in emp :
        emp.get('dept')

 
addEmployees(emp1)
addEmployees(emp1) # Not added
addEmployees(emp2)
addEmployees(emp2) # Not added
addEmployees(emp3)

print(getAllUniqueDepts(li))
print(li)
