Use the following context for my zeb interview preparation.

I want you to **coach me in Scala** so I can improve my skills quickly for this interview. Important: I am **starting from zero in Scala**. Assume I know programming in general, but in Scala itself I am a complete beginner.

Your teaching style should be:

* structured and progressive
* beginner-friendly but still interview-oriented
* focused on what is most relevant for this zeb role
* practical, with small exercises and examples

Also, when it helps, please add:

* **comments in the code**
* **pseudo-code before the real code**
  so I can first understand the logic and then fill in or complete parts myself.

But please **do not do this all the time**. Use comments and pseudo-code only when they are really useful.

What I want from you:

1. Build me up from zero in Scala.
2. Prioritize the topics most relevant for this interview:

   * Scala syntax
   * vals vs vars
   * functions
   * if/else
   * loops only if necessary
   * collections
   * case classes
   * pattern matching
   * Option
   * basic OOP in Scala
   * basic functional programming intuition
3. Connect Scala examples to:

   * financial math
   * simulations
   * bond pricing
   * Monte Carlo
   * data transformation
4. Act like a coach, not just an explainer:

   * give me short tasks
   * ask me to fill in missing parts
   * correct me
   * gradually increase difficulty
5. Since time is short, optimize for **interview survival and fast progress**, not academic completeness.
6. When relevant, explain how a Scala concept might matter in a codebase like zeb’s, especially if functional programming ideas appear.

Here is my context:

# zeb Interview Preparation — Ahmed Mahjoub

**Interview date:** April 22, 2026
**Role:** Mathematiker/Physiker als Softwareentwickler Quantitative Methoden @ zeb
**Link:** https://zeb-career.com/de/jobs/absolvierende/mathematiker-physiker-als-softwareentwickler-quantitative-methoden-381

## Candidate Profile (Key Facts)

* B.Sc. Mathematik (LMU München), Nebenfach Informatik
* M.Sc. Finanz- und Versicherungsmathematik: ONLY 2 modules completed (Stochastische Prozesse, Finanzmathematik). NOT completing — switching to AI master. This is a sensitive topic.
* Currently Werkstudent at metafinanz (Allianz Gruppe): fullstack web app, Power BI, Azure
* Previous: Experteer (data science/ML), VDW (QM/process automation, 5 years)
* Languages: Arabic (native), German C1, English C1, French C1
* Tech: Python, JS/TS, SQL, HTML/CSS, R, MATLAB, NumPy, Pandas, Azure, Git
* NO Scala experience (gap)
* NO Rechenkern/calculation engine experience (gap)
* NO functional programming experience (gap)
* Bachelor thesis: Monte Carlo simulation of random variables (directly relevant)

## Job Requirements Summary

* Python (simulations) + Scala (prototypes) — both explicitly required
* Rechenkern (calculation engine) development for financial services
* Modeling/simulation methods, agile development
* Client-facing (consulting environment)
* German C1+ mandatory, English B2+ mandatory
* Product: zeb.control — banking/insurance management platform (risk, regulatory, treasury, accounting, financial)
* zeb Scala codebase uses category-theoretic FP (monads, functors — per employee testimonial)

## Fit Scorecard

* Academic fit: 6/10 (B.Sc. Math good, but M.Sc. not completing)
* Python: 8/10
* Scala: 2/10
* Rechenkern: 3/10
* Simulation/modeling: 7/10
* Software engineering: 8/10
* Financial domain: 6/10
* German: 9/10
* Overall: ~5.5/10

## 3-Day Prep Plan

### Day 1 (Apr 19): Foundations

* AM: Scala crash course (syntax, case classes, Option, collections, pattern matching)
* PM: Financial math refresh (PV, yield curves, duration, VaR, PD/LGD/EAD, Basel III, IFRS 9, Vasicek SDE, floating-point)
* EVE: Research zeb.control deeply, prepare 3 interviewer questions

### Day 2 (Apr 20): Coding + Behavioral

* AM: Build bond pricer in Python (PV, duration, convexity, Monte Carlo VaR). Push to GitHub.
* PM: Prepare 6 STAR stories (end-to-end build, fast learning, cross-functional, automation, M.Sc. switch, why zeb)
* EVE: Drill hard questions out loud in German

### Day 3 (Apr 21): Polish + Simulate

* AM: Full mock interview (technical + behavioral, in German)
* PM: Final review checklist
* EVE: Rest

## Critical Interview Answers

### M.Sc. Question

"Nach zwei Modulen in Finanz- und Versicherungsmathematik habe ich mich entschieden, meinen Schwerpunkt breiter aufzustellen und in Richtung KI zu wechseln. Die Module haben mir eine fundierte Grundlage gegeben. KI-Methoden werden im Finanzbereich immer wichtiger. Ich will beides verbinden."

### No Scala

"Angefangen einzuarbeiten. Mathe-Hintergrund → FP passt. Hier ist mein GitHub-Beispiel."

### Web/Data not Rechenkern

"Studium = quantitativ. Bachelorarbeit = Monte Carlo. Berufserfahrung = produktive Software. Seltene Kombination."

### Why zeb

"Schnittstelle Mathematik × Software × Finanz. zeb.control = genau das Produkt wo ich Wirkung erzielen will."

## Progress So Far

* [x] Scala installed (v3.8.3)
* [x] Created project folder C:\Users\ADMB\scala-finance
* [ ] BondPricer.scala — typing it manually (next step: type the code, calculate PV by hand, then run)
* [ ] Push Scala example to GitHub
* [ ] Bond pricer in Python
* [ ] Monte Carlo VaR in Python
* [ ] Financial math 10-concept review
* [ ] zeb.control deep research
* [ ] 6 STAR stories prepared
* [ ] Hard questions drilled in German
* [ ] Mock interview
* [ ] Final checklist

## Key Financial Formulas to Know

* PV = CF / (1+r)^t
* Duration = Σ(t × PV(CF_t)) / Price
* VaR = -percentile(portfolio_returns, 1-confidence)
* Expected Loss = PD × LGD × EAD
* Vasicek SDE: dr = a(b-r)dt + σdW
* Basel III: Pillar 1 (min capital), Pillar 2 (supervisory), Pillar 3 (disclosure)

## Smart Questions for Interviewer

1. "Wie ist der Rechenkern architektonisch aufgebaut — monolithisch oder Pipeline aus komponierbaren Modulen?"
2. "Welche Rolle spielt Scalas Typsystem bei der Sicherstellung der Berechnungskorrektheit?"
3. "Wie geht ihr mit regulatorischen Änderungen im Rechenkern um — konfigurationsgetrieben oder codegetrieben?"

Start by giving me a **very small Scala lesson from zero**, then a **tiny exercise**, then correct me interactively.
