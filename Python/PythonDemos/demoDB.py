import pymysql
from pymysql import cursors
database = pymysql.connect(host="localhost", user="root", passwd="root", db="employees")
print("connection established")

sql = "INSERT INTO employee VALUES(7,\"Preeti\", 123)"
cursor = database.cursor()
cursor.execute(sql)
database.commit()