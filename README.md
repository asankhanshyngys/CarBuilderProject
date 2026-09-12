# Car Builder
1 st commit 
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
2nd commit

So far:
- Added the Car class with model, engine, seats, and GPS.
- Added validation for the model, engine, and seat count.
- Added the CarBuilder interface with methods for configuring and building a car.


3th commit.

Implemented:
- Car class with model, engine, seats, and GPS.
- Validation for model, engine, and seat count.
- CarBuilder interface with chainable methods.
- AbstractCarBuilder with shared construction logic.
- SportsCarBuilder with a V8 engine and 2 seats.
- SuvBuilder with a hybrid engine and 7 seats.


4th commit 

Car stores the model, engine, seats, and GPS setting.
Its constructor checks that the model and engine are not blank
and the seat count is positive.

SportsCarBuilder starts with a V8 engine and 2 seats.
SuvBuilder starts with a hybrid engine and 7 seats.
Both share construction logic through AbstractCarBuilder.
Their methods can be chained to customize the car before calling build().

5 th commit 
CarDirector provides reusable city and travel configurations.
Main demonstrates building cars directly and through the director.