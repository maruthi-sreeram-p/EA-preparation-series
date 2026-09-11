# 04 · SQL & DBMS

**Weeks 4–5** · 90 min a day · 60 SQL queries · [← Main README](../README.md) · [Roadmap](../ROADMAP.md)

## 📁 Layout
- `notes/` — DBMS concept notes (file names are given in the tasks below)
- `practice/` — the practice schema and query sets, each query with its question as a comment
- `interview-questions.md` — questions with short answers, added as you go

## Week 4 — SQL Queries + DBMS Concepts
- [ ] Day 1: Install MySQL 8.0 or newer and MySQL Workbench (window functions and CTEs need 8.0+). Create a practice database with `departments`, `employees` and `projects` tables and 15–20 rows each → `practice/00-schema.sql`. Learn DDL vs DML vs DCL vs TCL and constraints (`PRIMARY KEY`, `FOREIGN KEY`, `UNIQUE`, `NOT NULL`, `CHECK`, `DEFAULT`) → `notes/01-sql-basics.md`
- [ ] Day 2: `SELECT`, `WHERE`, `ORDER BY`, `LIMIT`, `DISTINCT`, `LIKE`, `IN`, `BETWEEN`, `IS NULL` → `practice/01-select-filter.sql` (10 queries)
- [ ] Day 3: Aggregates (`COUNT`, `SUM`, `AVG`, `MIN`, `MAX`), `GROUP BY`, `HAVING`; `WHERE` vs `HAVING` → `practice/02-group-by.sql` (10 queries)
- [ ] Day 4: Joins: inner, left, right, self, cross; full outer join (MySQL has no `FULL JOIN` — emulate it with `LEFT JOIN … UNION … RIGHT JOIN`) → `practice/03-joins.sql` (10 queries)
- [ ] Day 5: DBMS vs RDBMS; keys (super, candidate, primary, alternate, foreign, composite); ER diagrams → `notes/02-keys-er.md`
- [ ] Day 6: Normalization: anomalies, functional dependencies, 1NF, 2NF, 3NF, BCNF with one worked example → `notes/03-normalization.md`
- [ ] Interview: add 15 questions to `interview-questions.md`

## Week 5 — Advanced SQL, Transactions, JDBC
- [ ] Day 1: Subqueries (single-row, multi-row, correlated), `EXISTS`, `UNION` vs `UNION ALL` → `practice/04-subqueries.sql` (10 queries)
- [ ] Day 2: CTEs (`WITH`), views; classic questions: Nth highest salary, duplicate rows, employees earning more than their manager → `practice/05-classic-questions.sql` (10 queries)
- [ ] Day 3: Window functions: `ROW_NUMBER`, `RANK`, `DENSE_RANK`, `LAG`, `LEAD`, `SUM() OVER (PARTITION BY …)` → `practice/06-window-functions.sql` (10 queries)
- [ ] Day 4: Indexes: B-tree, clustered vs non-clustered, when they help and when they hurt; reading `EXPLAIN` output → `notes/04-indexes.md`
- [ ] Day 5: Transactions: ACID, `COMMIT`/`ROLLBACK`, isolation levels; dirty, non-repeatable and phantom reads → `notes/05-transactions-acid.md`
- [ ] Day 6: JDBC: connect Java to MySQL, CRUD with `PreparedStatement`, and why it prevents SQL injection → `practice/EmployeeJdbcDemo.java`
- [ ] Interview: add 20 questions to `interview-questions.md`

## ✅ Exit Check (end of Week 5)
- [ ] 60 queries written and run (`practice/01` to `practice/06`)
- [ ] Find the 2nd highest salary in three different ways
- [ ] Explain 3NF and ACID with your own examples
- [ ] Create, read, update and delete rows from Java through JDBC
