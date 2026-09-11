# 02 · Core Java

**Weeks 1–3** · 90 min a day · [← Main README](../README.md) · [Roadmap](../ROADMAP.md)

Core Java is the base for DSA, Spring Boot and most technical-interview questions.

## 📁 Layout
- `notes/` — one Markdown file per topic (file names are given in the tasks below)
- `code/` — small runnable programs; run any of them with `java FileName.java`
- `interview-questions.md` — questions with short answers, added as you go

## Week 1 — Java Basics + OOP
- [ ] Day 1: Check your JDK with `java -version` (21 or newer; an LTS release such as 21 or 25 is best for Spring Boot) and install IntelliJ IDEA; compile and run Hello World from the terminal with `javac` and `java`; set a breakpoint and step through it
- [ ] Day 2: JDK vs JRE vs JVM, bytecode, class loading, how `main` runs → `notes/01-jdk-jre-jvm.md`
- [ ] Day 3: Data types, type casting, operators, `if`/`switch`, loops, arrays, methods → `notes/02-java-basics.md`
- [ ] Day 4: Classes and objects, constructors (default, parameterised, chaining), `this`, `static`, `final` → `notes/03-classes-objects.md`
- [ ] Day 5: The four pillars: encapsulation, inheritance, polymorphism (overloading vs overriding), abstraction → `notes/04-oop-pillars.md`
- [ ] Day 6: Abstract classes vs interfaces (default and static methods), access modifiers, packages → `notes/05-abstract-vs-interface.md`
- [ ] Code: one small program per OOP pillar in `code/` (for example, `BankAccount.java` for encapsulation)
- [ ] Interview: add 15 questions with short answers to `interview-questions.md`

## Week 2 — Strings, Exceptions, Collections
- [ ] Day 1: `String` immutability, the string pool, `==` vs `equals()`, `StringBuilder` vs `StringBuffer` → `notes/06-strings.md`
- [ ] Day 2: Wrapper classes, autoboxing and unboxing, the `Integer` cache (−128 to 127) → `notes/07-wrapper-classes.md`
- [ ] Day 3: Exceptions: hierarchy, checked vs unchecked, `try`/`catch`/`finally`, `throw` vs `throws`, try-with-resources, custom exceptions → `notes/08-exceptions.md`
- [ ] Day 4: Collections: `List` (`ArrayList` vs `LinkedList`), `Set` (`HashSet`, `LinkedHashSet`, `TreeSet`) → `notes/09-list-set.md`
- [ ] Day 5: `Map` (`HashMap`, `LinkedHashMap`, `TreeMap`), how `HashMap` works inside, the `equals()`/`hashCode()` contract → `notes/10-map-hashmap.md`
- [ ] Day 6: `Queue`, `Deque`, `PriorityQueue`; `Comparable` vs `Comparator`; `Iterator`, fail-fast vs fail-safe → `notes/11-queue-comparator.md`
- [ ] Code: a console Student Management app using `ArrayList`, `HashMap` and a custom exception → `code/StudentManagement.java`
- [ ] Interview: add 20 questions to `interview-questions.md`

## Week 3 — Generics, Java 8+, Multithreading
- [ ] Day 1: Generics: generic classes and methods, bounded types, wildcards (`? extends`, `? super`) → `notes/12-generics.md`
- [ ] Day 2: Lambdas, functional interfaces (`Predicate`, `Function`, `Consumer`, `Supplier`), method references → `notes/13-lambdas.md`
- [ ] Day 3: Streams (`filter`, `map`, `sorted`, `collect`, `groupingBy`, `reduce`) and `Optional` → `notes/14-streams-optional.md`
- [ ] Day 4: Modern Java: `var`, records, switch expressions, text blocks, pattern matching for `instanceof` → `notes/15-modern-java.md`
- [ ] Day 5: Multithreading: `Thread` vs `Runnable`, thread lifecycle, `synchronized`, `volatile`, `ExecutorService` → `notes/16-multithreading.md`
- [ ] Day 6: JVM memory (stack, heap, metaspace), garbage collection basics; `final` vs `finally` vs `finalize` (deprecated) → `notes/17-jvm-memory-gc.md`
- [ ] Code: rewrite `StudentManagement.java` with records and streams; a producer–consumer demo with `BlockingQueue` → `code/ProducerConsumer.java`
- [ ] Interview: add 20 questions to `interview-questions.md`

## ✅ Exit Check (end of Week 3)
- [ ] Explain the four OOP pillars using your own code
- [ ] Explain how `HashMap` stores and finds a key
- [ ] Write a stream pipeline that groups and counts, without looking anything up
- [ ] 55 interview questions written in `interview-questions.md`
