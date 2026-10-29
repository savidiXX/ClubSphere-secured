## About this fork

This is my fork of [ClubSphere](https://github.com/tharunsasanka/ClubSphere),
a group project built for PUSL2024 Software Engineering 2 at the
University of Plymouth.

**My contributions to the original project:** the registration, login and forgot-password servlets, the database connection pool configuration and the User model.

**Improvements added in this fork:**
- Moved database credentials out of the source code into environment variables

## Configuration

The application reads its database settings from environment variables,
so no passwords are stored in the code.

| Variable | Required | Default | Description |
|---|---|---|---|
| `DB_PASSWORD` | Yes | none | Password for your MySQL user |
| `DB_USER` | No | `root` | MySQL username |
| `DB_URL` | No | `jdbc:mysql://localhost:3307/event_management?useSSL=false&allowPublicKeyRetrieval=true` | JDBC connection URL |

**Setting them on Windows:** open "Edit the system environment variables",
click "Environment Variables", and add a new user variable for each setting
you need. Restart your IDE and application server afterwards so they pick up
the new values.

If `DB_PASSWORD` is missing, the application stops at startup with a message
saying so.

---

<div align="center">

# ClubSphere

### University Clubs & Events Management System

A centralised Java web application for managing university clubs, events, members, announcements, feedback, and participation.

[![Live Demo](https://img.shields.io/badge/Live_Demo-Visit_ClubSphere-2563EB?style=for-the-badge&logo=googlechrome&logoColor=white)](https://clubsphere.site/clubsphere)

![Java](https://img.shields.io/badge/Java-17-111827?style=for-the-badge&logo=openjdk&logoColor=ED8B00)
![JSP](https://img.shields.io/badge/Frontend-JSP-111827?style=for-the-badge)
![Servlets](https://img.shields.io/badge/Backend-Java_Servlets-111827?style=for-the-badge)
![MySQL](https://img.shields.io/badge/Database-MySQL-111827?style=for-the-badge&logo=mysql&logoColor=4479A1)

</div>

---

## Overview

**ClubSphere** was developed to replace fragmented club-management processes such as manual attendance sheets, separate forms, and scattered communication channels.

The platform provides a single environment for administrators, club leaders, and members to manage university clubs and activities efficiently.

---

## Key Features

- User registration and secure login
- Role-based dashboards
- Club and member management
- Event creation and participation
- Announcements and updates
- Event registration tracking
- Ratings and feedback collection
- Administrative reports and analytics
- Interactive charts with real-time data updates
- Session-based access control

---

## User Roles

| Role | Main Responsibilities |
|---|---|
| Administrator | Manage users, clubs, events, reports, and analytics |
| Club Leader | Manage assigned clubs, events, and announcements |
| Member | Browse clubs, register for events, and submit feedback |

---

## Technology Stack

| Layer | Technologies |
|---|---|
| Frontend | JSP, HTML, CSS, JavaScript, AJAX |
| Backend | Java Servlets |
| Database | MySQL |
| Data Access | JDBC, DAO Pattern, HikariCP |
| Architecture | MVC and layered architecture |
| Analytics | Chart.js |
| Application Server | GlassFish |
| Collaboration | Git and GitHub |

---

## Architecture

```text
Presentation Layer
JSP • HTML • CSS • JavaScript • AJAX
              ↓
Business Logic Layer
Java Servlets • Authentication • Sessions
              ↓
Data Access Layer
DAO Classes • JDBC • HikariCP
              ↓
MySQL Database
```

---

## Software Engineering Concepts

The project demonstrates practical application of:

- Object-Oriented Programming
- Encapsulation, inheritance, abstraction, and polymorphism
- Model–View–Controller architecture
- Data Access Object pattern
- Relational database design
- Functional and non-functional requirements
- UML-based system modelling
- Version control and team collaboration

---

## Core Modules

```text
ClubSphere/
├── admin/
├── auth/
├── leader/
├── member/
├── WEB-INF/
├── css/
├── js/
├── includes/
├── Java Models
├── Servlet Controllers
└── DAO Classes
```

---

## Academic Context

Developed as a group project for:

```text
Module: PUSL2024 — Software Engineering 2
Programme: BSc (Hons)
Institution: University of Plymouth
```

---

<div align="center">

### Connect • Participate • Manage

A structured digital platform for modern university club management.

</div>
