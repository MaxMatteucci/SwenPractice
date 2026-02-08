# Copilot instructions for this repo

Purpose
- Provide concise, actionable guidance for AI coding agents working in this workspace.

Big picture
- This is a small Java exercise repository located under `Practice/` containing many single-file exercises (no packages). Most files are one top-level class per file used for classroom practice (examples: [Practice/ArrayAnalyzer.java](Practice/ArrayAnalyzer.java#L1), [Practice/Exam2/OneDimensionArrays/ArrayInitialization.java](Practice/Exam2/OneDimensionArrays/ArrayInitialization.java#L1)).
- There is no build tool (Maven/Gradle) detected — code is intended to be compiled/run with `javac`/`java` directly.

Build & run (explicit)
- Compile all exercises: `javac Practice/**/*.java` or `javac Practice/*.java Practice/**/**/*.java` from repository root.
- Compile a single file: `javac Practice/ArrayAnalyzer.java` then run `java ArrayAnalyzer` (class name must match file name).
- Run a class with `main`: `java ClassName` from the repo root (ensure the current directory is on the classpath).

Conventions & patterns (observed)
- No package declarations: expect default package usage. Avoid introducing packages unless you update all callers.
- File-to-class mapping: filenames generally match public class names, but some filenames use inconsistent casing. Always open the file to confirm the class name before running.
- Small, self-contained examples: functions and logic are implemented directly inside each .java file for educational clarity — prefer minimal, non-invasive edits.

Examples to reference
- Open and inspect these canonical files when making edits or writing tests:
  - [Practice/ArrayAnalyzer.java](Practice/ArrayAnalyzer.java#L1)
  - [Practice/Exam2/OneDimensionArrays/ArrayInitialization.java](Practice/Exam2/OneDimensionArrays/ArrayInitialization.java#L1)

Testing & debugging notes
- There are no automated test frameworks detected. If you add tests, include a brief README and prefer a runnable script (bash/Makefile) to avoid forcing new tools on instructors.
- For quick debugging, compile and run the class; use `System.out.println` for tracing as these are small exercises.

When editing this file
- If a prior `.github/copilot-instructions.md` exists, merge by preserving any project-specific guidance already present; append missing items from this file.

Questions or unclear areas
- Ask the repository owner about preferred Java version and whether to introduce a simple build script (Makefile or Gradle wrapper) before adding tests.
