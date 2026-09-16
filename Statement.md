# Statement — Advanced Calculator

## Problem Statement
Everyday computational tasks — basic arithmetic, scientific calculations, and
short-term value retention — are often handled through scattered,
single-purpose scripts or GUI calculators that lack structure, input
validation, error handling, or reusability. There is a need for a single,
reliable command-line application that consolidates basic arithmetic,
scientific functions, and memory operations into one well-structured,
testable, and maintainable system that can run in any terminal environment
without GUI dependencies.

## Scope of the Project
This project delivers a modular, command-line calculator application in
Java, covering:

- Basic arithmetic operations (addition, subtraction, multiplication,
  division, modulus, power)
- Scientific operations (square root, factorial, trigonometric functions,
  logarithms)
- Memory management (store, recall, clear)
- Centralized input validation and a consistent error-handling strategy
- Activity/error logging to console and a persistent log file
- Unit-tested computational modules (JUnit 5)
- A layered architecture (UI → Core Engine → Functional Modules) for
  maintainability and future extension

**Out of scope:** graphical user interfaces, expression parsing of
multi-operator strings (e.g. `3 + 4 * 2`), persistence of calculation
history across sessions, networked or multi-user functionality, and mobile
or web deployment. These are noted as potential future enhancements rather
than current deliverables.

## Target Users
- **Students and educators** who need a dependable calculator for
  coursework, demonstrations, or learning how layered software
  architecture and input validation work in practice.
- **Developers and reviewers/evaluators** assessing the project for code
  structure, modularity, testing discipline, and adherence to software
  engineering best practices.
- **Command-line users** who prefer a fast, dependency-light tool over a
  GUI application, including users working in terminal-only or remote
  (SSH) environments.

## High-Level Features
- **Basic Arithmetic Module** — add, subtract, multiply, divide, modulus,
  and power operations with divide/modulus-by-zero protection.
- **Scientific Operations Module** — square root, factorial, sine/cosine/
  tangent (degrees), natural log, and log base 10, each with domain
  validation (e.g. no square root of a negative number).
- **Memory Module** — store, recall, and clear a numeric value across
  operations for multi-step calculations.
- **Input Validation** — every numeric entry point is validated centrally
  before computation, preventing crashes from malformed input.
- **Error Handling** — a single custom exception type produces clear,
  human-readable error messages instead of raw stack traces.
- **Logging** — every operation and error is timestamped and recorded to
  both the console and a `calculator.log` file for traceability.
- **Automated Testing** — JUnit 5 test suites cover all computational and
  validation logic.
- **Terminal-Only Execution** — runs via Maven, a packaged JAR, or plain
  `javac`/`java`, with no IDE or GUI setup required.
