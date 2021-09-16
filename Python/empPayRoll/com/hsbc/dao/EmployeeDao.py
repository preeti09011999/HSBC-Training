
from com.hsbc.entity.EmployeeAlreadyExists import EmployeeAlreadyExists
from com.hsbc.entity.EmployeeNotfoundException import EmployeeNotFoundException
import pickle # analogous to serialization in java

class EmployeeDao :

    def __init__(self) :
        self.emps = []
        self.fwrite = open("EmployeeData.data", "ab") #opening file in append mode
        self.fread = open("EmployeeData.data", "rb") # opening file in read mode


#  --------------------------- Adding Employee ----------------------------------------
    def addEmployee(self, e) :
        # when we're not implementing the method, write pass inside that method
        # pass 
        pickle.dump(e, self.fwrite) 
        # self.emps.append(e)
       
    # ---------------------- find all employees --------------------------------
    def findAllEmployees(self) :
        while True :
            try :
                e = pickle.load(self.fread)
                self.emps.append(e)
            except EOFError :
                return self.emps
    # ---------------------- find all employees by id ----------------------------        
    def findAllEmployeeById(self, id) :
        # try :  
        e = pickle.load(self.fread)
        self.emps.append(e)
        # print(self.emps)
        # for emp in self.emps :
        #     if(emp.id == id) :
        #         return emp
        try :
            if e.id == id :
                return e
        except :
            raise EmployeeNotFoundException()

    def deleteEmployeeById(self, id) :
        for employee in self.emps :
            if employee.id == id :
                self.emps.remove(employee)
                return True
        else :
            raise EmployeeNotFoundException()

    def closeResources(self) :
        self.fwrite.close()
        self.fread.close()

    