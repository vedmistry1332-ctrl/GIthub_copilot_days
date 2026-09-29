print ("========Student Result Calculator=========")

#first of all taking student Information from user  

name = input("enter sttudent name :-")
age = int(input("enter an age of student :-"))


#taking Marks of student in different subjects  

java_marks = float (input("enter marks of java :-"))
python_marks = float(input("enter marks of python :-"))
english_marks = float (input("enter marks of an english  :-"))


#calculating results 

total_marks = java_marks + python_marks + english_marks 
percentage = (total_marks / 3)

# Checking pass/fail
passed = (
    python_marks >= 40
    and java_marks >= 40
    and english_marks >= 40
)

#Displaying the results

print("\n ========Result==========")

print(f"Name of Student is :_{name}")
print(f"Age        : {age}")
print(f"Python     : {python_marks}")
print(f"Java       : {java_marks}")
print(f"english      : {english_marks}")

print(f"Total      : {total_marks}")
print(f"Percentage : {percentage:.2f}%")

if passed:
    print("Result     : PASS")
else:
    print("Result     : FAIL")

# Displaying data types
print("\n===== DATA TYPES =====")

print(type(name))
print(type(age))
print(type(python_marks))
print(type(passed))
