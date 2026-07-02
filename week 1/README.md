# Singleton Pattern Example

## Description

This project demonstrates the Singleton Design Pattern in Java.

The Logger class ensures that only one instance is created throughout the application's lifecycle.

## Project Structure

```
src/
├── Logger.java
└── SingletonTest.java
```

## How it Works

- Logger has a private constructor.
- Logger stores a private static instance.
- getInstance() returns the same object every time.
- SingletonTest verifies that only one object exists.

## Output

```
Logger instance created.
LOG: Application Started
LOG: Loading Modules
Only one Logger instance exists.
Logger1 HashCode: 1072408673
Logger2 HashCode: 1072408673
```

## Design Pattern

Singleton Pattern