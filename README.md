# Remove Duplicates from a Generic List

## Collaborators

Zohaib, Nickk, Tasnim, Jun, Waheed, Okwan

---

**Create:**

```java
ArrayList<String> pokemon = new ArrayList<>();
```

**Task Setup**

- Add duplicate values manually.

**Group Task**

- Use an `Iterator` to remove duplicates.
- Explain why removing elements inside a regular for loop is dangerous.
- Why does `ArrayList<String>` prevent mixing types?
- If this were `ArrayList<Object>`, what would change?

**Discussion**

- What does type safety actually mean?

---

#  Lessons Learned

**Removing elements inside a regular for loop**
  - Elements might be skipped.
  - Removing a lot of elements may cause an `IndexOutOfBounds` error.
  - Overall prone to errors.


**ArrayList<> with generics prevents mixing types**
  - Java is a statically typed language meaning every variable has a declared type (`int`, `double`, `String`, etc). You cannot perform operations that are incompatible with a variables type!
    
    ```java
    int x = 5;
    String s = "Hello";

    x + s; // ❌ Compile-time error
    ```
  - Generics enforces type correctness so that incompatible operations cannot be performed. All elements must match a declared type - makes code safe!
    
    ```java
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add("Hello"); // ❌ Compile-time error
    ```
  - Without generics, you would need to type cast every time you get an element and you would run into runtime errors like `ClassCastException`. This is the case with a raw ArrayList (no generics).

    ```java
    ArrayList list = new ArrayList(); // raw type
    list.add("Hello");
    list.add(42); // allowed
    String s = (String) list.get(1); // compiles, but fails at runtime (ClassCastException)
    ```


**Difference with `ArrayList<Object>`**
  - Since every class extends form Objects, anything could be stored in the ArrayList. This behaves the same way as having no generics.
  - You lose the convenience of generics - type saftey.
  - When retrieving from a list of Objects, you will need to type cast similar to raw ArrayList, however, this will not throw an error.

    ```java
    ArrayList<Object> list = new ArrayList<>();
    list.add("Hello");
    list.add(42);
    String s = (String) list.get(0); // cast still required but runs with no error
    ```
  - ArrayList of Objects should only be used if you intentially want to mix types since it will not throw an error.


**What does Type Saftey mean?**
  - Type saftey is a programming concept that ensures a variable can only perform operation declared by its type.
    
    ```java
    int x = 0, y = 7;
    String a = "Hello", b = "World";

    //Check equals
    if (x == y) { System.out.println("Equal"); } // ✅ OK

    if (a.equals(b)) { System.out.println("Equal"); } // ✅ OK

    if (x.equals(a)) { System.out.println("Equal"); } // ❌ ERROR

    ```
- If a variable is declared as a certain type, you cannot assign or store incompatible types in it.

  ```java
  int x = 5;
  x = 10;        // ✅ OK
  x = "Hello";   // ❌ Compile-time error
  ```
