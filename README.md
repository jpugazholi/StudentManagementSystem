Student Management System

A simple Student Management System developed using Java Swing in NetBeans IDE. This project helps users manage student records through an easy-to-use graphical user interface.

Features
Add new student records
View student details in a table
Update existing student information
Delete student records
Search students by Student ID
Input validation to prevent empty fields
Duplicate Student ID checking
Technologies Used
Programming Language: Java
GUI: Java Swing
IDE: Apache NetBeans
Version Control: Git
Repository Hosting: GitHub
Project Structure
StudentManagementSystem/
├── src/
│   └── studentmanagementsystem/
│       ├── Student.java
│       ├── StudentManagement.java
│       └── StudentManagementSystem.java
├── nbproject/
├── build.xml
├── manifest.mf
├── .gitignore
└── README.md

How to Run
Install the Java Development Kit (JDK).
Open Apache NetBeans IDE.
Select File → Open Project.
Choose the StudentManagementSystem project folder.
Open StudentManagement.java inside the studentmanagementsystem package.
Right-click the file and select Run File.
How to Use
Enter the Student ID, Name, Department, and Year.
Click Add Student to add a record.
Select a table row to load its details into the form.
Edit the details and click Update to modify a record.
Select a student and click Delete to remove a record.
Enter a Student ID in the search field and click Search ID.
Data Storage

This version stores student records in an in-memory ArrayList. Student records are not permanently saved and will be lost when the application closes.

Future Improvements
MySQL database integration
Login and authentication
Improved user interface
Permanent student record storage
GitHub Repository

https://github.com/jpugazholi/StudentManagementSystem

Author

JPugazholi
