# Shape Demo Program (OOP Assignment)

A simple Java program, to demonstrates the three core Pillars of Object-Oriented Programming (OOP): **Encapsulation**, **Inheritance**, and **Polymorphism**.

---

## OOP Concepts & Proof Screenshots

### 1. Encapsulation
Attributes (such as `radius`, `side`, and `height`) are declared as `private` to restrict direct access. They are accessed and modified securely using public `getter` and `setter` methods.

![Encapsulation Circle](images/encap%20circle.png)
![Encapsulation Square](images/encap%20square.png)

---

### 2. Inheritance
Inheritance allows child classes to inherit attributes and methods from a parent class using the `extends` keyword. The `super()` keyword is used to invoke(merujuk) the constructor of the parent class.

* `Circle` and `Square` extend `Shape`.
* `Silinder` extends `Circle`.

![Inheritance Cylinder](images/encap%20silinder.png)

---

### 3. Polymorphism
Polymorphism is demonstrated in two ways:

#### A. Method Overriding
Subclasses (`Circle`, `Square`, and `Silinder`) provide their own specific implementations of the `printInfo()` method inherited from the base class `Shape`.

![Override Circle](images/override%20circle.png)
![Override Square](images/override%20square.png)
![Override Cylinder](images/override.png)

#### B. Polymorphic Collection & Dynamic Binding
An `ArrayList<Shape>` is used to hold different subclass instances (`Square`, `Circle`, `Silinder`). Calling `bentuk.printInfo()` dynamically executes the correct method version based on the actual object type.

![Polymorphic ArrayList](images/arraylist.png)
