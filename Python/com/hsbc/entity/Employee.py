
class Employee(object) :
    
    def __init__(self, id, name, salary) :
        print('in init')
        self.id = id
        self.name = name
        self.salary = salary

    def show(self) :
        print('Id is ' , self.id, ', Name is ', self.name, ', Salary is ', self.salary)
