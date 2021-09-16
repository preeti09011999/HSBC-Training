
from EmployeeNotfoundException import EmployeeNotFoundException


class EmployeeDao :

    def __init__(self) :
        self.emps = []

    def addEmployee(self, e) :
        # when we're not implementing the method, write pass inside that method
        # pass 
        self.emps.append(e)

    def findAllEmployees(self) :
        return self.emps

    def findAllEmployeeById(self, id) :
        for e in self.emps :
            if(e.id == id) :
                return e
        else :
            raise EmployeeNotFoundException()
