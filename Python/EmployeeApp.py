from EmployeeDao import EmployeeDao
from Employee import Employee

print('Working on Employee Payroll')

# Object creation of employee class
e = Employee(1, 'Preeti', 1223)
# e.show()

dao = EmployeeDao()

#  Adding employee
dao.addEmployee(e)

# Displaying all employees
employees = dao.findAllEmployees()

for employee in employees :
    print(employee.show())

# Finding employee id in employees
employee = dao.findAllEmployeeById(2)
print(employee.show())



