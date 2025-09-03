# Customized Calculator 🧮

A **Java-based customized calculator** project that performs basic arithmetic operations with **custom exception handling** for invalid inputs, large numbers, division by zero, and restricted multiplications.

---

## 🚀 Features
- ➕ **Addition** (with restrictions on input size)  
- ➖ **Subtraction**  
- ✖️ **Multiplication** (limited to values ≤ 7000)  
- ➗ **Division** (safe handling of division by zero)  
- 🎯 **Custom Exceptions** for:  
  - Invalid input (example: 8 + 9 not allowed – optional)  
  - Division by zero  
  - Input greater than **100,000**  
  - Multiplication overflow (>7000)  

---

## 📂 Project Structure

Customized-Calculator/

  │── Exercise_Project5.java # Main calculator implementation
  
  │── README.md # Documentation

---

## 🛠️ How to Run
1. Clone the repository:  
   ```bash
   git clone https://github.com/YourUsername/Customized-Calculator.git

   Navigate to the folder:

cd Customized-Calculator


Compile and run the program:

javac Exercise_Project5.java
java com.company.Exercise_Project5

## 📝 Example Usage
Enter first number: 25
Enter second number: 5
Choose operation: 
1. Addition 
2. Subtraction 
3. Multiplication 
4. Division

Your Choice: 4
Result: 5.0

## ⚡ Custom Exception Messages

Invalid Input. Cannot add 8 & 9.

Mathematical Error, Cannot divide by Zero.

Sorry, input cannot be greater than 1,00,000.

Input value for multiplication cannot be greater than 7000.

## 💡 Future Enhancements

GUI-based version with Java Swing/JavaFX

Scientific calculator features (square root, power, trigonometry)

Unit tests with JUnit

