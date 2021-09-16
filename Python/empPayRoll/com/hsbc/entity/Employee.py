from abc import ABC, abstractmethod 
# 1. Import abc and abstract method from module ABC
# 2. Class tthat you want to inherit from abstract class ABC
# 3. Declare a method with abstarct method decorator
# 4. To instantiate create a subclass -- class Manager(Employee)

class Employee(ABC) :
    
    def __init__(self, id, name, salary) :
        self.id = id
        self.name = name
        self.salary = salary

    def show(self) :
        print('in show')
        print('Id : ' , self.id, ', Name : ', self.name, ', Salary : ', self.salary)

    def __str__(self) :
        return "ID :" + str(self.id) + " | Name :" + str(self.name) + " | Salary :" + str(self.salary)

    # @abstractmethod #decorator
    # def calculateSalary(self) :
    #     pass