# Rule-Based Workflow Automation Engine

A modular workflow automation engine built in Java using Object-Oriented Programming (OOP) principles and design patterns. The project simulates how enterprise workflow platforms execute, monitor, and manage tasks within a workflow.

---

##  Project Overview

This project demonstrates the implementation of a rule-based workflow automation engine where multiple task types can be executed as part of a workflow.

Each task follows a common contract through interfaces, allowing new task types to be added without modifying the core workflow logic.

The project is inspired by enterprise workflow platforms such as Appian and focuses on clean software architecture rather than user interface development.

---

## Features

- Execute multiple tasks as part of a workflow
- Task validation before execution
- Workflow State Management
    - PENDING
    - RUNNING
    - COMPLETED
    - FAILED
- Event-driven logging using the Observer Pattern
- Pluggable task architecture using interfaces
- Easily extensible task types

---

##  Technologies Used

- Java
- Object-Oriented Programming (OOP)
- IntelliJ IDEA
- Git & GitHub

---






##  Design Patterns

### Observer Pattern

The workflow notifies all registered observers whenever its state changes.

Current implementation:

- WorkflowLogger

Future observers can be added without modifying the Workflow class.

Examples:

- EmailNotifier
- SlackNotifier
- AuditLogger

---

### Strategy Pattern

The project is designed to support interchangeable task execution strategies.

Possible strategies include:

- Sequential Execution
- Reverse Execution
- Priority-based Execution

This allows execution behavior to change without modifying the workflow engine.

---

