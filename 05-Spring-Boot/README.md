# 05 · Spring Boot

**Weeks 6–7** · 90 min a day · [← Main README](../README.md) · [Roadmap](../ROADMAP.md)

Across both weeks you build one app, the **Task Tracker API** (users and their tasks). In Week 9 you connect a React frontend to it.

## 📁 Layout
- `notes/` — concept notes (file names are given in the tasks below)
- `demo-apps/task-tracker-api/` — the Maven project you build over these two weeks
- `interview-questions.md` — questions with short answers, added as you go

## Week 6 — Spring Core + REST APIs
- [ ] Day 1: Maven basics: `pom.xml`, dependencies, build lifecycle → [`../08-Dev-Tools/03-maven.md`](../08-Dev-Tools/). Then what IoC and dependency injection are, and why Spring uses them → `notes/01-ioc-di.md`
- [ ] Day 2: Beans: `@Component`, `@Service`, `@Repository`, `@Controller`; `@Bean` inside `@Configuration`; bean scopes and lifecycle; constructor injection vs field injection → add to `notes/01-ioc-di.md`
- [ ] Day 3: Create `task-tracker-api` at start.spring.io (Spring Web, Validation, Spring Data JPA, MySQL Driver). Learn starters, auto-configuration, `@SpringBootApplication`, `application.properties`, profiles → `notes/02-spring-boot-basics.md`
- [ ] Day 4: REST: `@RestController`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, `@PathVariable`, `@RequestParam`, `@RequestBody`, `ResponseEntity`. Build `/api/tasks` CRUD backed by an in-memory list
- [ ] Day 5: HTTP methods, status codes (200, 201, 204, 400, 401, 403, 404, 500), idempotency, REST naming conventions → `notes/03-rest-http.md`
- [ ] Day 6: Refactor into controller → service → repository layers; add DTOs; test every endpoint in Postman and save the collection
- [ ] Interview: add 15 questions to `interview-questions.md`

## Week 7 — JPA, Validation, Security, Testing
- [ ] Day 1: Spring Data JPA + Hibernate: `@Entity`, `@Id`, `@GeneratedValue`, `JpaRepository`; replace the in-memory list with MySQL → `notes/04-jpa-hibernate.md`
- [ ] Day 2: Add a `User` entity: `@OneToMany`/`@ManyToOne`, lazy vs eager loading, derived query methods, `@Query`, pagination and sorting with `Pageable`
- [ ] Day 3: Validation (`@Valid`, `@NotBlank`, `@Size`, `@Email`) and global error handling with `@RestControllerAdvice` + `@ExceptionHandler` → `notes/05-validation-errors.md`
- [ ] Day 4: Spring Security: the filter chain, a `SecurityFilterChain` bean, BCrypt password hashing, JWT login and protected endpoints → `notes/06-security-jwt.md`
- [ ] Day 5: Testing: JUnit 5 + Mockito for the service layer, `@WebMvcTest` for controllers, one `@SpringBootTest` for a full flow → `notes/07-testing.md`
- [ ] Day 6: Swagger UI with springdoc-openapi; write the app's README (endpoints and how to run it)
- [ ] Interview: add 20 questions to `interview-questions.md`

## ✅ Exit Check (end of Week 7)
- [ ] Task Tracker API works end to end: CRUD, MySQL, validation, JWT login, tests
- [ ] Explain what happens from an HTTP request reaching the controller to a row in MySQL and back
- [ ] Explain IoC/DI, `@Component` vs `@Bean`, and `@RestController` vs `@Controller`
