# 📦 Behalf

[![MIT License](https://img.shields.io/badge/license-MIT-green)](LICENSE)
[![Build](https://img.shields.io/badge/build-passing-brightgreen)]()
[![Java](https://img.shields.io/badge/backend-Java%2017-blue)]()
[![React](https://img.shields.io/badge/frontend-React.js-lightgrey)]()
[![PostgreSQL](https://img.shields.io/badge/database-PostgreSQL-blue)]()

Behalf is a community-powered **C2C delivery platform** where users can post package delivery requests ("quests") and other users (typically travelers) can fulfill them in exchange for compensation. Think of it as a marketplace for parcel delivery, made personal.

---

## 🌍 Live Demo

🔗 [https://behalf-front-production.up.railway.app/post](https://behalf-front-production.up.railway.app/post)

---

## 🎥 Demo

![Behalf Demo](https://github.com/abhayraghuwanshi/Behalf/assets/demo.gif)

> GIF shows a user posting a quest, chatting with a traveler, and tracking status updates.

---

## ✨ Features

- 🔐 Google OAuth2 Login
- 👥 Role-Based Access Control (User, Traveler, QA)
- 🧾 Quest (delivery request) creation and assignment
- 💬 In-app inbox & comments
- 🏷️ Caching with Redis for faster data access
- 📬 Traveler & QA communication loop
- 📄 Admin dashboard for roles & user control

---

## 🛠 Tech Stack

| Layer       | Technology                        |
|-------------|------------------------------------|
| Frontend    | React.js, Material Ui             |
| Backend     | Spring Boot, Spring Security      |
| Auth        | Google OAuth2 + JWT               |
| Database    | PostgreSQL                        |
| Caching     | Redis                             |
| Deployment  | Railway                           |

---

## 📁 Directory Structure

```bash
Behalf/
├── backend/                  # Spring Boot app
│   ├── src/main/java/...     # Controllers, services, config
│   └── resources/            # application.properties
├── frontend/                 # React app
│   ├── public/
│   └── src/                  # Pages, components, services
