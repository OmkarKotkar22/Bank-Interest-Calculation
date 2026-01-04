# 🏦 Bank Management System (Java – OOP Project)

![Java](https://img.shields.io/badge/Language-Java-orange?logo=openjdk)
![OOP](https://img.shields.io/badge/Concept-OOP-blue)
![Status](https://img.shields.io/badge/Feature-Abstraction-pink)
![IDE](https://img.shields.io/badge/IDE-Eclipse-purple?logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Platform](https://img.shields.io/badge/Platform-Console-lightgrey)

---

## 📌 Project Overview

The **Bank Management System** is a **console-based Java application** developed using **Object-Oriented Programming (OOP)** principles.  
It simulates basic banking operations such as **account creation**, **deposit**, **withdrawal**, **balance inquiry**, and **transaction handling**.

This project is mainly designed for:
- Academic learning
- Understanding OOP concepts
- Java practice for interviews and exams

---

## 🎯 Objectives of the Project

- To understand **real-world banking operations**
- To implement **Java OOP concepts** in a practical way
- To learn **class interaction and data encapsulation**
- To build a **modular and maintainable Java program**

---

## 🧠 Core OOP Concepts Used

| Concept | Usage |
|-------|------|
| Encapsulation | Protects account data |
| Inheritance | Reuse common account features |
| Polymorphism | Different account behaviors |
| Abstraction | Hides implementation details |
| Classes & Objects | Model real bank entities |

---

## 🏗️ System Features

- ✔ Create new bank account  
- ✔ Deposit money  
- ✔ Withdraw money  
- ✔ Check account balance  
- ✔ Display account details  
- ✔ Secure and structured design  

---

## 🗂️ Project Structure (Example)
```
Bank-Interest-Calculation
│
├── src/
│   └── Interest/
│       ├── BankAccount.java
│       ├── SavingAccount.java
│       ├── CurrentAccount.java
│       ├── FixedDepositAccount.java
│       └── BankInterestSystem.java
│
├── bin/
│   └── Interest/
│       ├── BankAccount.class
│       ├── SavingAccount.class
│       ├── CurrentAccount.class
│       ├── FixedDepositAccount.class
│       └── BankInterestSystem.class
│
├── .classpath
├── .project
└── README.md
```


---

## 📄 Class Description

### 🔹 BankManagementSystem.java
- Main class
- Handles user input and menu
- Controls program flow

### 🔹 Account.java
- Base class
- Stores account number and balance
- Common methods for deposit & withdraw

### 🔹 SavingsAccount.java
- Inherits Account
- Applies minimum balance rules

### 🔹 CurrentAccount.java
- Inherits Account
- Allows higher transactions

### 🔹 Customer.java
- Stores customer details
- Linked with account

---

## 🔁 Sample Operations Flow

1. User selects option from menu
2. System validates input
3. Corresponding account method executes
4. Output displayed on console

---

## 🧪 Example Use Case (Real Life)

A customer visits a bank:
- Opens a savings account
- Deposits ₹10,000
- Withdraws ₹2,000
- Checks remaining balance

➡ The same process is simulated using this Java application.

---

## 🖥️ How to Run the Project

1. Clone the repository
```bash
   git clone https://github.com/your-username/bank-management-system.git
```

2. Open project in Eclipse  
3. Run BankManagementSystem.java  
4. Follow on-screen instructions

📚 Technologies Used
---
Java  
Eclipse IDE  
OOP Principles  
Console I/O  

🎓 Learning Outcomes
---
Strong understanding of Java OOP  
Real-world application design    
Improved logical thinking  
Interview-ready project  
