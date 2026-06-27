# Blue-Green Deployment CI/CD Pipeline on AWS

## Project Overview

This project demonstrates a complete DevOps CI/CD pipeline using Blue-Green Deployment on AWS. The goal is to automate application deployment with zero downtime by integrating Git, Jenkins, Docker, Nginx, and AWS EC2.

The project follows DevOps best practices, including version control, containerization, automated deployments, and traffic switching between Blue and Green environments.

---

## Objectives

* Build a complete CI/CD pipeline
* Deploy applications with zero downtime
* Automate deployments using Jenkins
* Containerize applications using Docker
* Configure Nginx as a reverse proxy
* Host the solution on AWS EC2
* Showcase a real-world DevOps project for learning and interviews

---

## Tools & Technologies

| Category               | Tools               |
| ---------------------- | ------------------- |
| Version Control        | Git, GitHub         |
| CI/CD                  | Jenkins             |
| Containerization       | Docker              |
| Web Server             | Nginx               |
| Cloud                  | AWS EC2             |
| Operating System       | Ubuntu Linux        |
| Scripting              | Bash                |
| Monitoring *(Planned)* | Prometheus, Grafana |

---

## Project Architecture

> Architecture diagram will be added in a later phase.

```
Developer
     |
     v
 GitHub Repository
     |
     v
 Jenkins Pipeline
     |
     v
 Docker Image
     |
     v
 Blue / Green Containers
     |
     v
     Nginx
     |
     v
   End Users
```

---

## Planned Features

* Git-based source control
* Jenkins CI/CD pipeline
* Docker image creation
* Blue-Green deployment strategy
* Nginx traffic switching
* Zero-downtime deployments
* Rollback capability
* Automated deployment scripts
* AWS EC2 hosting
* Monitoring with Prometheus and Grafana
* Project documentation and screenshots

---

## Project Structure

```
devops-cicd-bluegreen-aws/
│
├── app/
├── docker/
├── jenkins/
├── nginx/
├── scripts/
├── docs/
├── diagrams/
├── screenshots/
├── .gitignore
└── README.md
```

---

## Project Status

Current Phase: Project Initialization

Completed:

* Repository created
* Git initialized
* Project folder structure created
* README added
* .gitignore configured

Upcoming:

* Build sample web application
* Dockerize the application
* Configure Nginx
* Create Jenkins pipeline
* Implement Blue-Green deployment
* Deploy on AWS EC2

---

## Author

**Kavyasri K**

DevOps Engineer | AWS | Docker | Jenkins | Linux | Git | CI/CD
