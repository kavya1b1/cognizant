# Mockito Example - Mocking and Stubbing

## Description

This project demonstrates how to use Mockito to mock an external API and stub its methods for unit testing.

## Project Structure

```text
MockitoExample/
├── pom.xml
└── src
    ├── main
    │   └── java
    │       ├── ExternalApi.java
    │       └── MyService.java
    └── test
        └── java
            └── MyServiceTest.java
```

## Concepts Covered

- Mock Object Creation
- Method Stubbing
- Dependency Injection
- Unit Testing with JUnit 5
- Mockito Framework

## Sample Test

```java
ExternalApi mockApi = mock(ExternalApi.class);
when(mockApi.getData()).thenReturn("Mock Data");

MyService service = new MyService(mockApi);

assertEquals("Mock Data", service.fetchData());
```

## Output

```
BUILD SUCCESSFUL
Tests run: 1
Failures: 0
Errors: 0
```