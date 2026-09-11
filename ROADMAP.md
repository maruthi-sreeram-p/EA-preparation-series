# 🗺️ 12-Week Roadmap — Java Full Stack Developer Intern

**Start date:** YYYY-MM-DD · **Target test date:** YYYY-MM-DD

**Time:** about 3.5 hours a day, 6 days a week. Day 7 is for the weekly test, revision and catch-up.

> 📌 This page is the overview. The **day-by-day tasks** for every week are in each topic folder's `README.md`.

## ⏱️ Daily Routine

| Block | Time | What to do |
|---|---|---|
| Main topic | 90 min | Learn the week's focus topic, write notes, run the code |
| DSA | 60 min | 2 problems from the week's DSA topic |
| Aptitude | 30 min | 15–20 questions from the week's aptitude topic |
| Revision | 30 min | Re-read yesterday's notes and answer 5 interview questions |

**Weeks 10–11:** the main and revision blocks are shared — 45 min CS fundamentals + 75 min capstone project.

## 📅 At a Glance

| Week | Main focus | DSA | Aptitude / Mock tests |
|---|---|---|---|
| 1 | Java basics + OOP | Complexity, Arrays | Number system, HCF & LCM, Simplification |
| 2 | Strings, Exceptions, Collections | Strings, Hashing | Percentages, Profit & loss |
| 3 | Generics, Java 8+, Multithreading | Two pointers, Sliding window | Ratio & proportion, Averages, Ages |
| 4 | SQL queries + DBMS concepts | Sorting, Binary search | Time & work, Pipes & cisterns |
| 5 | Advanced SQL, Transactions, JDBC | Recursion, Backtracking | Speed & distance, Trains, Boats & streams |
| 6 | Spring Boot core + REST APIs | Linked list | Interest, Permutations & combinations, Probability |
| 7 | JPA, Validation, Security, Testing | Stack, Queue | Series, Coding-decoding, Blood relations, Directions |
| 8 | HTML, CSS, JavaScript | Trees, BST | Seating & puzzles, Syllogisms, Data interpretation |
| 9 | React + connecting to Spring Boot | Heaps, Greedy | Verbal + 1 aptitude mock |
| 10 | Capstone backend + OS, Networks | Graphs | 1 aptitude mock + 1 coding mock |
| 11 | Capstone frontend + Design basics | Dynamic programming | 1 technical MCQ mock + 1 coding mock |
| 12 | Interview mode | Timed mixed practice | 3 full-length mocks |

---

## Phase 1 — Core Java (Weeks 1–3)

### Week 1 — Java Basics + OOP
- [ ] Set up the JDK and IntelliJ IDEA; learn to use the debugger
- [ ] JDK vs JRE vs JVM; how Java code is compiled and run
- [ ] Data types, operators, control flow, arrays, methods
- [ ] Classes, objects, constructors, `this`, `static`
- [ ] Four pillars of OOP: encapsulation, inheritance, polymorphism, abstraction
- [ ] Abstract classes vs interfaces; access modifiers
- [ ] Git basics: `clone`, `add`, `commit`, `push`, `pull`, `branch`, `merge`
- **DSA:** Big-O basics + 12 array problems
- **Aptitude:** Number system, HCF & LCM, Simplification

### Week 2 — Strings, Exceptions, Collections
- [ ] `String` vs `StringBuilder`; immutability; the string pool
- [ ] Wrapper classes and autoboxing
- [ ] Exceptions: checked vs unchecked, `try-with-resources`, custom exceptions
- [ ] Collections: `List`, `Set`, `Map`, `Queue`; `ArrayList` vs `LinkedList`
- [ ] How `HashMap` works; `equals()` and `hashCode()`; `Comparable` vs `Comparator`
- **DSA:** 6 string + 6 hashing problems
- **Aptitude:** Percentages, Profit & loss

### Week 3 — Generics, Java 8+, Multithreading
- [ ] Generics and bounded types
- [ ] Lambdas, functional interfaces, method references
- [ ] Streams API and `Optional`
- [ ] Modern Java: `var`, records, switch expressions, text blocks
- [ ] `Thread` vs `Runnable`, `synchronized`, `ExecutorService`
- [ ] JVM memory: stack vs heap; garbage collection basics
- **DSA:** 12 two-pointer and sliding-window problems
- **Aptitude:** Ratio & proportion, Averages, Ages
- 🏁 **Milestone:** Core Java done · 36 DSA problems

## Phase 2 — SQL & Databases (Weeks 4–5)

### Week 4 — SQL Queries + DBMS Concepts
- [ ] Install MySQL; DDL vs DML; constraints
- [ ] `SELECT`, `WHERE`, `ORDER BY`, `LIMIT`, `GROUP BY`, `HAVING`
- [ ] Joins: inner, left, right, self, full (MySQL has no `FULL JOIN`; emulate it with `UNION`)
- [ ] Keys: primary, foreign, candidate, composite; ER diagrams
- [ ] Normalization: 1NF, 2NF, 3NF, BCNF
- **DSA:** 12 sorting and binary-search problems
- **Aptitude:** Time & work, Pipes & cisterns

### Week 5 — Advanced SQL, Transactions, JDBC
- [ ] Subqueries (including correlated), `UNION`, CTEs, views
- [ ] Window functions: `ROW_NUMBER`, `RANK`, `DENSE_RANK`, `LAG`, `LEAD`
- [ ] Indexes: how they speed up reads and when they slow down writes
- [ ] Transactions, ACID, isolation levels
- [ ] JDBC: `Connection`, `PreparedStatement`, `ResultSet`; preventing SQL injection
- **DSA:** 12 recursion and backtracking problems
- **Aptitude:** Speed & distance, Trains, Boats & streams
- 🏁 **Milestone:** 60 SQL queries practised · 60 DSA problems

## Phase 3 — Backend with Spring Boot (Weeks 6–7)

### Week 6 — Spring Core + REST APIs
- [ ] Maven: `pom.xml`, dependencies, build lifecycle
- [ ] Inversion of Control and dependency injection; beans and scopes; constructor injection
- [ ] Spring Boot starters, auto-configuration, `application.properties`, profiles
- [ ] REST: `@RestController`, `@GetMapping`, `@PostMapping`, `@PathVariable`, `@RequestParam`, `@RequestBody`, `ResponseEntity`
- [ ] HTTP methods and status codes; controller → service → repository layers; DTOs
- [ ] Test every endpoint in Postman
- **DSA:** 12 linked-list problems
- **Aptitude:** Simple & compound interest, Permutations & combinations, Probability

### Week 7 — JPA, Validation, Security, Testing
- [ ] Spring Data JPA + Hibernate: entities, relationships (`@OneToMany`, `@ManyToOne`), `JpaRepository`, custom queries, pagination
- [ ] Validation with `@Valid`; global error handling with `@RestControllerAdvice`
- [ ] Spring Security basics + JWT authentication
- [ ] Testing with JUnit 5 and Mockito; controller tests with `@WebMvcTest`
- [ ] API documentation with Swagger UI (springdoc-openapi)
- **DSA:** 12 stack and queue problems
- **Aptitude:** Number & letter series, Coding-decoding, Blood relations, Directions
- 🏁 **Milestone:** A CRUD REST API with MySQL and JWT login · 84 DSA problems

## Phase 4 — Frontend (Weeks 8–9)

### Week 8 — HTML, CSS, JavaScript
- [ ] Semantic HTML and forms
- [ ] CSS box model, Flexbox, Grid, responsive design with media queries
- [ ] JavaScript: `let`/`const`, scope, hoisting, closures, `this`, arrow functions
- [ ] Array methods (`map`, `filter`, `reduce`), destructuring, spread, modules
- [ ] DOM and events; the event loop; promises, `async`/`await`, `fetch`
- **DSA:** 12 tree and BST problems
- **Aptitude:** Seating arrangement & puzzles, Syllogisms, Data interpretation

### Week 9 — React
- [ ] Set up a project with Vite; JSX, components, props
- [ ] State with `useState`, side effects with `useEffect`; lists and keys
- [ ] Controlled forms; routing with React Router
- [ ] Call your Spring Boot API; fix CORS; store and send the JWT
- [ ] Share state (such as the logged-in user) with the Context API
- **DSA:** 12 heap and greedy problems
- **Aptitude:** Reading comprehension, Sentence correction, Para jumbles
- **Mock tests:** 1 aptitude
- 🏁 **Milestone:** A React app that logs in and calls your API · 108 DSA problems

## Phase 5 — Capstone Project + CS Fundamentals (Weeks 10–11)

### Week 10 — Project Backend + OS & Networks
- [ ] Pick the project; write the requirements, DB schema and API list
- [ ] Build the backend: entities, APIs, auth, validation, tests
- [ ] OS: process vs thread, CPU scheduling, deadlocks, mutex vs semaphore, paging and virtual memory
- [ ] Networks: OSI vs TCP/IP, TCP vs UDP, HTTP vs HTTPS, DNS, what happens when you type a URL
- [ ] Linux basics: `ls`, `cd`, `cat`, `grep`, `chmod`, `ps`, `kill`
- **DSA:** 12 graph problems (BFS, DFS, topological sort)
- **Aptitude:** mixed practice on weak topics
- **Mock tests:** 1 aptitude + 1 coding

### Week 11 — Project Frontend + Design Basics
- [ ] Build the React frontend and connect every screen to the API
- [ ] Project README: features, screenshots, setup steps, API list
- [ ] SOLID principles; design patterns: Singleton, Factory, Builder, Strategy, Observer
- [ ] System design basics: client–server, monolith vs microservices, caching, load balancing, SQL vs NoSQL
- [ ] Optional: Dockerize the backend, deploy it, and add the live link to the README
- **DSA:** 12 dynamic-programming problems
- **Aptitude:** mixed practice on weak topics
- **Mock tests:** 1 technical MCQ + 1 coding
- 🏁 **Milestone:** Capstone project complete and on GitHub · 132 DSA problems

## Phase 6 — Interview Mode (Week 12)
- [ ] 3 full-length mock tests (aptitude + coding + technical MCQs), each followed by an error review
- [ ] Revise every section's `interview-questions.md`
- [ ] Prepare "Tell me about yourself", 5 STAR stories and a 2-minute project walkthrough
- [ ] Final resume review
- [ ] 2 mock interviews with a friend or senior
- **DSA:** 18 timed, mixed problems focused on weak topics
- **Aptitude:** mixed practice on weak topics
- 🏁 **Milestone:** 150 DSA problems · 8 mock tests · interview-ready

---

## ⚡ Short on Time? 4-Week Fast Track

| Week | Focus |
|---|---|
| 1 | Aptitude daily · Core Java (OOP, strings, collections) · DSA: arrays, strings, hashing |
| 2 | SQL (joins, `GROUP BY`, subqueries) · DSA: two pointers, sliding window, binary search, stack |
| 3 | Spring Boot REST + JPA basics · OOP/DBMS/OS/CN interview questions · DSA: linked list, trees |
| 4 | React basics · explain one project end to end · 3 full-length mock tests |

## 🔁 Weekly Review (Day 7)
- 60-minute test: 20 aptitude questions in 25 min + 2 of the week's DSA problems in 35 min
- Update the Progress Snapshot in [README.md](README.md)
- Move unfinished items into next week
