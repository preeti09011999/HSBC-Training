class EmployeeNotFoundException(Exception) :
    
    def __str__(self) :
        return "Employee Not Found"