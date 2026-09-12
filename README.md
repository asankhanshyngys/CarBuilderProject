# Car Builder

A Java project for the Builder Pattern assignment, using sports cars and SUVs.

Currently, only the main class is added. The car classes and builders are next.

## How to run

Use JDK 17 or newer. Run `Main.java` in IntelliJ IDEA, or use PowerShell:

```powershell
mkdir out -Force
javac --release 17 -d out src/*.java
java -cp out Main
```

# Car Builder

So far:
- Added the Car class with model, engine, seats, and GPS.
- Added validation for the model, engine, and seat count.
- Added the CarBuilder interface with methods for configuring and building a car.
