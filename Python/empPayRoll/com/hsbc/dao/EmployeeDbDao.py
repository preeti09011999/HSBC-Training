import pymysql
from pymysql import cursors

from com.hsbc.entity.Employee import Employee
class EmployeeDbDao :

    def addEmployee(self, e) :
        database = pymysql.connect(host="localhost", user="root", passwd="root", db="employees")
        sql = "INSERT INTO employee(id, name, salary) VALUES('%d', '%s', '%d')" %(e.id, e.name, e.salary)
        cursor = database.cursor()
        cursor.execute(sql)
        database.commit()

    def findAllEmployees(self) :
        database = pymysql.connect(host="localhost", user="root", passwd="root", db="employees")
        sql = "SELECT * FROM employee"
        cursor = database.cursor()
        cursor.execute(sql)
        emps = cursor.fetchall()
        employees = []
        for e in emps :
            employee = Employee(e[0], e[1], e[2])
            employees.append(employee)
        return employees

    def findAllEmployeeById(self, id) :
        database = pymysql.connect(host="localhost", user="root", passwd="root", db="employees")
        sql = "SELECT * FROM employee WHERE id = %d" %(id)
        cursor = database.cursor()
        cursor.execute(sql)  
        employee = cursor.fetchone()
        return employee

    def deleteEmployeeById(self, id) :
        database = pymysql.connect(host="localhost", user="root", passwd="root", db="employees")
        sql = "DELETE FROM employee WHERE id = %d" %(id)
        cursor = database.cursor()
        cursor.execute(sql)  
        database.commit()
        
    def updateEmployee(self, id, salary) : 
        database = pymysql.connect(host="localhost", user="root", passwd="root", db="employees")
        sql = "UPDATE employee SET salary = %d WHERE id = %d" %(salary, id)
        cursor = database.cursor()
        cursor.execute(sql)  
        database.commit()