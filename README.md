# Clojure starter pack for Application.garden, Kaocha and Babashka

This repository demonstrates a workflow for continuous delivery without pull requests or third-party CI solutions such as Github Workflows.

## Goal: simple, interactive development

We aim for two goals:

1. Do it as simple as possible.
   Remove that which is not needed.
2. Make interactive systems.
   It is our job to create interactive feedback loops for the systems we create.

## References

We'll build on the following tools:

| Tool               | Purpose     | Documentation                    |
|--------------------|-------------|----------------------------------|
| Application.garden | Deployment  | [docs.apps.garden]               |
| Babashka           | Scripting   | [book.babashka.org]              |
| Kaocha             | Test runner | [github.com/lambdaisland/kaocha] |

[docs.apps.garden]: https://docs.apps.garden
[book.babashka.org]: https://book.babashka.org
[github.com/lambdaisland/kaocha]: https://github.com/lambdaisland/kaocha

Each tool is well worth learning!
Take this repository as a starting point, take what you want, then build in the direction you need.

## Development

Shell commands:

| Task                           | Command       |
|--------------------------------|---------------|
| Run locally                    | `garden run`  |
| Connect to production REPL     | `garden repl` |
| Run test suite outside of REPL | `bb test`     |

## Run tests from inside the REPL

```clojure
(require 'kaocha.repl)
(kaocha.repl/run-all)
```
