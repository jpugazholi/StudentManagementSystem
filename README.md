🎓 Student Management System

<p align="center"> A simple and user-friendly Student Management System built with Java Swing and Apache NetBeans. </p>

<p align="center"> <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java"/> <img src="https://img.shields.io/badge/GUI-Java%20Swing-blue?style=for-the-badge" alt="Java Swing"/> <img src="https://img.shields.io/badge/IDE-Apache%20NetBeans-blue?style=for-the-badge&logo=apachenetbeanside" alt="NetBeans"/> <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" alt="Project status"/> </p>

📌 About the Project

The Student Management System is a Java desktop application developed to manage student information through a simple graphical user interface.

It allows users to add, view, update, delete, and search student records. The project demonstrates Java programming, object-oriented concepts, event handling, and GUI development using Java Swing.

✨ Features
➕ Add Student — Add new student details.
📋 View Students — Display records in a table.
✏️ Update Student — Modify existing student information.
🗑️ Delete Student — Remove student records with confirmation.
🔍 Search Student — Find students using their Student ID.
✅ Input Validation — Prevent empty fields and duplicate IDs.
🖥️ Simple GUI — Easy-to-use desktop interface.
🛠️ Technologies Used
Technology	Purpose
Java	Application programming
Java Swing	Graphical user interface
JTable	Displaying student records
ArrayList	Temporary data storage
Apache NetBeans	Development environment
Git & GitHub	Version control and project hosting
📂 Project Structure
StudentManagementSystem/
│
├── src/
│   └── studentmanagementsystem/
│       ├── Student.java
│       ├── StudentManagement.java
│       └── StudentManagementSystem.java
│
├── nbproject/
├── build.xml
├── manifest.mf
├── .gitignore
└── README.md

🚀 Getting Started
Prerequisites
Java Development Kit (JDK)
Apache NetBeans IDE
Git (optional, for version control)
Installation and Setup

1. Clone the repository

git clone https://github.com/jpugazholi/StudentManagementSystem.git


2. Open the project

Launch Apache NetBeans.
Select File → Open Project.
Choose the StudentManagementSystem folder.

3. Run the application

Open the studentmanagementsystem package.
Open StudentManagement.java.
Right-click and select Run File.
📖 How to Use
Enter the Student ID.
Enter the student's name.
Enter the department.
Enter the academic year.
Click Add Student to save the record in the current session.
Select a row to update or delete a student.
Use Search ID to find a student record.
⚠️ Current Limitation

This version uses an in-memory ArrayList for storing student records. Data is temporary and will be lost when the application is closed. Database integration can be added in a future version.

🔮 Future Enhancements
MySQL database integration
Login and authentication
Permanent student data storage
Improved UI design
Export student records to CSV
Student profile management
🎯 Learning Outcomes

This project demonstrates practical knowledge of:

Java classes and objects
Object-oriented programming
Java Swing components
Event handling
CRUD operations
Git and GitHub basics
👨‍💻 Author

JPugazholi

🔗 GitHub Repository:
https://github.com/jpugazholi/StudentManagementSystem

<p align="center"> ⭐ If you find this project useful, consider giving the repository a star! </p>
