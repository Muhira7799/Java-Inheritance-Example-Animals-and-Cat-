# Java Inheritance Example (Animals and Cat)

A small Java program that demonstrates **inheritance**: the `Cat` class extends `Animals` and reuses its field and method.

## What It Demonstrates

- A parent class (`Animals`) with a field `name` and a method `eat()`
- A child class (`Cat`) that adds its own field `legs` and method `move()`
- A `Cat` object using both inherited and its own members

## Code Overview

| Class | Members |
|-------|---------|
| `Animals` | `String name`, `eat()` |
| `Cat` (extends `Animals`) | inherits `name` and `eat()`, adds `int legs` and `move()` |
| `AnimalDemo` | Contains `main` |

## Output

```
Cat name is: Bob
Animals can eat
Legs: 4
Cat can move
```

`c.name` and `c.eat()` work on a `Cat` even though they are defined in `Animals`.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac AnimalDemo.java
java AnimalDemo
```

## Project Structure

```
.
├── AnimalDemo.java
└── README.md
```

## Next Steps

- Add another child class such as `Bird`
- Override `eat()` in `Cat`
- Make the fields `private` and add getters and setters
