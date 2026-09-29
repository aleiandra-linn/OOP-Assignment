# 🏦 Bank Account & ATM CityBank Program

A banking simulation with Java Object-Oriented Programming (OOP) that applies a **Static Array** data structure for the banking database and an **ArrayList** for customer account management.

---

## 📌 Implementation of Array & ArrayList

### 1. Static Array (`Customer[]`)
Used in the **`BankNew`** class as the main directory/database to store customer objects with a fixed maximum capacity (10 slots).

* **Class Location:** `BankNew.java`
  * **Lines 2 – 10:** Attribute declaration `private Customer[] customers;` and static array memory allocation with a capacity of `10` inside the constructor.
  * **Lines 28 – 36:** Array search/iteration (`for loop`) implementation in the `authenticate()` method to match the username and password during login.

![Static Array Customer](gambar/banknew%20static.png)
![Static Array Customer](gambar/banknew%20iteration.png)

---

### 2. Dynamic Collection (`ArrayList<Account>`)
Actively used in the **`Customer`** class to support *multi-account* functionality (allowing a single customer to hold multiple accounts) dynamically without array capacity constraints.

* **Class Location:** `Customer.java`
* **Code Line Screenshot Range:** **Lines 1 – 18** and **Lines 33 – 45**
* **Brief Explanation:**
  * **Lines 1 – 18:** Import `java.util.ArrayList`, declaration of `private ArrayList<Account> accounts;`, and initialization of `this.accounts = new ArrayList<>();` inside the constructor.
  * **Lines 33 – 45:** The `addAccount()` method to add a new account to the `ArrayList` via `this.accounts.add(acc);`, as well as the `getAccount()` method to retrieve account data from the `ArrayList` via `this.accounts.get(index);`.

![Dynamic ArrayList Account](gambar/customer%20dinamic.png)
![Dynamic ArrayList Account](gambar/customer%20getset.png)

---

## 🛠️ Data Structures Summary

| Class | Data Structure | Purpose |
| :--- | :--- | :--- |
| `BankNew.java` | **Static Array (`Customer[]`)** | Stores the list of all bank customers with a maximum capacity of `10`. |
| `Customer.java` | **ArrayList (`ArrayList<Account>`)** | Manages customer account lists dynamically. |

---
