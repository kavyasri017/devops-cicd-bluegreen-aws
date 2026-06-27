# Project Notes

## Project

**Blue-Green Deployment CI/CD Pipeline on AWS**

---

## Date

27 June 2026

---

## Completed Tasks

### Repository Setup

* Created GitHub repository.
* Initialized Git repository.
* Created project folder structure.
* Added `.gitignore`.
* Created professional `README.md`.

### Development Environment

* Installed Git.
* Installed Java 17.
* Installed Maven.
* Installed Docker.

### Jenkins Server

* Created a dedicated EC2 instance for Jenkins.
* Installed Docker successfully.
* Attempted to install Jenkins using the official APT repository.

---

## Issues Faced

### Issue 1: Git does not track empty folders

**Problem**

* After creating the project folders, `git status` showed nothing to commit.

**Root Cause**

* Git only tracks files, not empty directories.

**Resolution**

* Added project files (`README.md`, `.gitignore`, `Dockerfile`, `Jenkinsfile`, etc.) so Git could track the directories.

---

### Issue 2: Jenkins installation failed on Ubuntu 26.04

**Problem**

* `apt install jenkins` failed.

**Error**

* `NO_PUBKEY`
* `Repository is not signed`
* `Package 'jenkins' has no installation candidate`

**Root Cause**

* The Jenkins APT repository does not currently support Ubuntu 26.04 (Resolute Raccoon).

**Resolution**

* Decided to run Jenkins using the official Docker image instead of installing it from the APT repository.

---

## Lessons Learned

* Git does not track empty directories.
* Always verify the operating system version before following installation guides.
* Docker can simplify software deployment and avoid package compatibility issues.
* Reading error messages carefully helps identify the real problem.

---

## Next Tasks

* Run Jenkins in Docker.
* Unlock Jenkins and complete the initial setup.
* Connect Jenkins to GitHub.
* Create the first Jenkins pipeline.
* Build the Maven application.
* Build the Docker image.
* Prepare for Blue-Green deployment.

---

## Notes for Interviews

If asked about a challenge:

> "While setting up Jenkins, I found that the official Jenkins repository was not yet compatible with Ubuntu 26.04. Instead of spending time on unsupported package installation, I deployed Jenkins using the official Docker image. This resolved the compatibility issue and reflects a common production approach."
