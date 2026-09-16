# CSE2006-PROGRAMMING-IN-JAVA
VITYARTHI PROJECT
# Advanced Calculator (Java, CLI)

A modular, command-line calculator application built in Java, structured
with a layered architecture, custom exception handling, lightweight
logging, and JUnit 5 unit tests.

Fully executable from a terminal — no GUI, no IDE required.

## Features

- **Basic Arithmetic:** addition, subtraction, multiplication, division, modulus, power
- **Scientific Operations:** square root, factorial, sine/cosine/tangent (degrees), natural log, log base 10
- **Memory Management:** store, recall, and clear a value across operations
- Centralized input validation and a consistent error-handling strategy
- Activity/error logging to console and `calculator.log`
- Unit-tested computational modules (JUnit 5)

## Project Structure

```
calculator-project/
├── pom.xml
├── README.md
├── docs/                     # Design & documentation artefacts
├── src/main/java/com/calculator/
│   ├── Main.java
│   ├── core/CalculatorEngine.java
│   ├── modules/BasicOperations.java
│   ├── modules/ScientificOperations.java
│   ├── modules/MemoryModule.java
│   ├── ui/ConsoleUI.java
│   ├── util/InputValidator.java
│   ├── util/CalculatorLogger.java
│   └── exception/CalculatorException.java
└── src/test/java/com/calculator/
    ├── modules/BasicOperationsTest.java
    ├── modules/ScientificOperationsTest.java
    ├── modules/MemoryModuleTest.java
    └── util/InputValidatorTest.java
```

## Requirements

- Java 17+ (JDK)
- Apache Maven 3.8+

## How to Build and Run

### Option 1 — Maven (recommended)

```bash
# Compile
mvn compile

# Run the unit tests
mvn test

# Run the application
mvn exec:java
```

### Option 2 — Build a runnable JAR

```bash
mvn package
java -jar target/advanced-calculator.jar
```

### Option 3 — Plain javac/java (no Maven)

```bash
mkdir -p out
find src/main/java -name "*.java" > sources.txt
javac -d out @sources.txt
java -cp out com.calculator.Main
```

## Documentation

See the [`docs/`](./docs) folder for:
- Problem statement & objectives
- Functional & non-functional requirements
- System architecture (with diagram)
- Workflow diagram
- UML use case, class, and sequence diagrams

All diagrams are written in Mermaid and render automatically in GitHub's
Markdown viewer.

## Logging

Every operation and error is appended to `calculator.log` in the directory
the app is run from, alongside console output.
