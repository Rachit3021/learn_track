Design Notes

1. Why ArrayList instead of Array?

ans-ArrayList is used instead of arrays because:

* Arrays have fixed size, while ArrayList is dynamic
* It allows easy addition and removal of elements
* It provides built-in methods like add(), remove(), and size()
* It makes the code more flexible and easier to manage

2. Where static members are used and why?

ans-Static members are used in the IdGenerator class.

Reason:

To generate unique IDs without creating multiple objects
Static method is shared across the application
Ensures a single source of ID generation

Example:(used in the code)

public class IdGenerator {
private static int id = 1;

    public static int generateId() {
        return id++;
    }
}

3. Where inheritance is used and what are its benefits?

Inheritance is used between:

Person (parent class)----------->Student (child class)


Benefits:

* Code reusability (common fields like id and name are reused)
* Avoids duplication
* Creates a clear relationship between classes
* Improves code structure and readability