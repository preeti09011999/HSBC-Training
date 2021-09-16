class EmployeeAlreadyExists(Exception) :
    def __str__(self) :
        return "Employee Already Exists"