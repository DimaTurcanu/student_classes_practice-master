# student_classes_practice

PROJECT

The purpose of this project is to practice some OOP Principles specifically Encapsulation, Inheritance and Polymorphism together with Exceptions and Collections.


BEFORE WRITING THE ACTUAL PROGRAM

There are 5 classes that needs to be done first.


QUESTIONS TO ASK IN PROGRAM

Would you like to be part of our Math or Science programs? (Y/N)

If user enters Y, then ask below questions and store data but if user enters N, then do not ask those questions and go for another user.

What is your first name?

What is your last name?

How old are you?

What is your gender? (F/M)


What class would you like to join? (Math/Science)

NOTE: This program will end once you got 3 students registered to the classes. So, basically you will be gathering information from 3 users only.


EXPECTED OUTPUT

-Print information for each student who are registered

-Print how many students are MathStudent with message -> "Math students = {numberOfMathStudents}"

-Print how many students are ScienceStudent with message -> "Science students = {numberOfScienceStudents}"


EXAMPLE PROGRAM:

Program: Would you like to be part of our Math or Science programs? (Y/N)

User1: N

NOTE: So, user1 will not be asked any other questions as she/he refused to part of programs!

------------------------------------------------------------------------------------------------------------------------------------------

Program: Would you like to be part of our Math or Science programs? (Y/N)

User2: Y

Program: What is your first name?

User2: Alex

Program: What is your last name?

User2: Morgan

Program: How old are you?

User2: 25

Program: What is your gender? (F/M)

User2: M

Program: What class would you like to join? (Math/Science)

User2: Math

Program: Congratulations! You are registered for Math class.

------------------------------------------------------------------------------------------------------------------------------------------

Program: Would you like to be part of our Math or Science programs? (Y/N)

User3: Y

Program: What is your name?

User3: Jennifer

Program: How old are you?

User3: 18

NOTE: So, user3 will not be asked any other questions as she is 18 and this age is not allowed to join. Your checkAge method should throw an Exception, and also the exception must be handled properly.

------------------------------------------------------------------------------------------------------------------------------------------

Program: Would you like to be part of our Math or Science programs? (Y/N)

User4: N

NOTE: So, user4 will not be asked any other questions as she/he refused to part of programs!

------------------------------------------------------------------------------------------------------------------------------------------

Program: Would you like to be part of our Math or Science programs? (Y/N)

User5: Y

Program: What is your first name?

User5: Jessica

Program: What is your last name?

User5: Taylor

Program: How old are you?

User5: 23

Program: What is your gender? (F/M)

User5: F

Program: What class would you like to join? (Math/Science)

User5: Science

Program: Congratulations! You are registered for Science class.

------------------------------------------------------------------------------------------------------------------------------------------

Program: Would you like to be part of our Math or Science programs? (Y/N)

User5: Y

Program: What is your first name?

User5: John

Program: What is your last name?

User5: Doe

Program: How old are you?

User5: 45

Program: What is your gender? (F/M)

User5: M

Program: What class would you like to join? (Math/Science)

User5: Space

NOTE: So, user5 will not be registered as he did not select the programs available. Your checkClassName method should throw an Exception, and also the exception must be handled properly.

------------------------------------------------------------------------------------------------------------------------------------------

Program: Would you like to be part of our Math or Science programs? (Y/N)

User6: Y

Program: What is your first name?

User5: Jane

Program: What is your last name?

User5: Doe

Program: How old are you?

User5: 35

Program: What is your gender? (F/M)

User5: F

Program: What class would you like to join? (Math/Science)

User5: Math

Program: Congratulations! You are registered for Math class.


THE END RESULT OF ABOVE SURVEY

MathStudent {firstName=‘Alex’, lastName=’Morgan’ age=25, gender=‘M’, className=’Math’}

ScienceStudent {firstName=‘Jessica, lastName=Taylor age=23, gender=‘F’, className=’Science’}

MathStudent {firstName=‘Jane, lastName=Doe age=35, gender=‘F’, className=’Math’}

Math students = 2

Science students = 1