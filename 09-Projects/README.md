# 09 · Projects

**Weeks 10–11** · ~75 min a day + extra time on Day 7 · [← Main README](../README.md) · [Roadmap](../ROADMAP.md)

Your capstone is the project you'll talk about most in interviews, so it uses the full stack: Spring Boot + MySQL + React + JWT.

> Build the capstone in **its own GitHub repository** so it shows on your profile. Keep the plan and design notes here, with a link to that repo.

## 💡 Pick One Idea

| Idea | Core features |
|---|---|
| **GameVault** — game catalog & reviews | Browse and search games, ratings and reviews, wishlists, admin adds and edits games |
| **Tournament Manager** | Teams, fixtures, score entry, live leaderboard, admin and player roles |
| **Team Task Manager** | Grow the Week 6–9 Task Tracker: projects, team members, comments, due-date filters |

## ✅ Minimum Feature List
- [ ] JWT login with two roles (USER and ADMIN)
- [ ] CRUD on at least 3 related entities
- [ ] Search, filtering and pagination
- [ ] Validation and consistent error responses
- [ ] Unit tests for the service layer
- [ ] Swagger UI for the API
- [ ] React UI with routing and protected pages
- [ ] README with screenshots, tech stack, setup steps and the API list

## Week 10 — Plan + Backend
- [ ] Day 1: Pick the idea; write user stories and the feature list → `capstone-plan.md`
- [ ] Day 2: Design the database (ER diagram) and the API list (method, path, request, response) → add to `capstone-plan.md`
- [ ] Day 3: Create the Spring Boot project and entities; connect MySQL
- [ ] Day 4: Repositories, services and controllers for the main entities
- [ ] Day 5: JWT authentication and role-based access
- [ ] Day 6: Validation, error handling, service tests, Swagger UI
- [ ] Day 7: Test every endpoint in Postman and fix bugs

## Week 11 — Frontend + Polish
- [ ] Day 1: Create the React app with Vite; routing and page layout
- [ ] Day 2: Login and register pages; store the JWT; protected routes
- [ ] Day 3: Main list page with search, filtering and pagination
- [ ] Day 4: Create/edit forms and detail pages
- [ ] Day 5: Admin pages; loading and error states
- [ ] Day 6: README with screenshots; optionally record a 2-minute demo video
- [ ] Day 7 (optional): Dockerize the backend, deploy it, and add the live link to the README

## 🗣️ Be Ready to Explain
- Why you chose this stack
- Your database schema and one tricky relationship
- How a request travels from the React UI to MySQL and back
- How JWT authentication works in your app
- One bug you hit and how you fixed it
