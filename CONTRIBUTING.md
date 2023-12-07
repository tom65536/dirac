Contribute
==========

<!-- omit in toc -->
# Contributing to Dirac

First off, thanks for taking the time to contribute! ❤️

All types of contributions are encouraged and valued. See the [Table of Contents](#table-of-contents) for different ways to help and details about how this project handles them. Please make sure to read the relevant section before making your contribution. It will make it a lot easier for us maintainers and smooth out the experience for all involved. The community looks forward to your contributions. 🎉

> And if you like the project, but just don't have time to contribute, that's fine. There are other easy ways to support the project and show your appreciation, which we would also be very happy about:
> - Star the project
> - Post about it
> - Refer this project in your project's readme
> - Mention the project at local meetups and tell your friends/colleagues

<!-- omit in toc -->
## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [I Have a Question](#i-have-a-question)
- [I Want To Contribute](#i-want-to-contribute)
  - [Reporting Bugs](#reporting-bugs)
  - [Suggesting Enhancements](#suggesting-enhancements)
  - [Your First Code Contribution](#your-first-code-contribution)
  - [Improving The Documentation](#improving-the-documentation)
- [Styleguides](#styleguides)
  - [Commit Messages](#commit-messages)
- [Join The Project Team](#join-the-project-team)


## Code of Conduct

This project and everyone participating in it is governed by the
[Dirac Code of Conduct](https://github.com/tom65536/dirac/blob/master/CODE_OF_CONDUCT.md).
By participating, you are expected to uphold this code. Please report unacceptable behavior
to <peregrinus@planet.ms>.


## I Have a Question

> If you want to ask a question, we assume that you have read the available [Documentation](https://tom65536.github.io/dirac/).

Before you ask a question, it is best to search for existing [Issues](https://github.com/tom65536/dirac/issues) that might help you. In case you have found a suitable issue and still need clarification, you can write your question in this issue. It is also advisable to search the internet for answers first.

If you then still feel the need to ask a question and need clarification, we recommend the following:

- Open an [Issue](https://github.com/tom65536/dirac/issues/new).
- Provide as much context as you can about what you're running into.
- Provide project and platform versions, depending on what seems relevant.

We will then take care of the issue as soon as possible.


## I Want To Contribute

> ### Legal Notice <!-- omit in toc -->
> When contributing to this project, you must agree that you have authored 100% of the content, that you have the necessary rights to the content and that the content you contribute may be provided under the project license.

> ### Be FAIR
This project adopts and implements the [FAIR for Research Software principles](https://rd-alliance.org/group/fair-research-software-fair4rs-wg/outcomes/fair-principles-research-software-fair4rs-0) [(DOI:10.15497/RDA00068)](https://doi.org/10.15497/RDA00068). If your contribution relies on your or other people's research, please, make sure you inicate the appropriate references in the [codemeta.json](https://github.com/tom65536/dirac/blob/master/codemeta.json) file (see [The CodeMeta Project](https://codemeta.github.io/) for reference).

### Reporting Bugs

<!-- omit in toc -->
#### Before Submitting a Bug Report

A good bug report shouldn't leave others needing to chase you up for more information. Therefore, we ask you to investigate carefully, collect information and describe the issue in detail in your report. Please complete the following steps in advance to help us fix any potential bug as fast as possible.

- Make sure that you are using the latest version.
- Determine if your bug is really a bug and not an error on your side e.g. using incompatible environment components/versions (Make sure that you have read the [documentation](https://tom65536.github.io/dirac/). If you are looking for support, you might want to check [this section](#i-have-a-question)).
- To see if other users have experienced (and potentially already solved) the same issue you are having, check if there is not already a bug report existing for your bug or error in the [bug tracker](https://github.com/tom65536/dirac/issues?q=label%3Abug).
- Also make sure to search the internet (including Stack Overflow) to see if users outside of the GitHub community have discussed the issue.
- Collect information about the bug:
  - Stack trace (Traceback)
  - OS, Platform and Version (Windows, Linux, macOS, x86, ARM)
  - Version of the interpreter, compiler, SDK, runtime environment, package manager, depending on what seems relevant.
  - Possibly your input and the output
  - Can you reliably reproduce the issue? And can you also reproduce it with older versions?

<!-- omit in toc -->
#### How Do I Submit a Good Bug Report?

> You must never report security related issues, vulnerabilities or bugs including sensitive information to the issue tracker, or elsewhere in public. Instead sensitive bugs must be sent by email to <peregrinus@planet.ms>.

We use GitHub issues to track bugs and errors. If you run into an issue with the project:

- Open an [Issue](https://github.com/tom65536/dirac/issues/new). (Since we can't be sure at this point whether it is a bug or not, we ask you not to talk about a bug yet and not to label the issue.)
- Explain the behavior you would expect and the actual behavior.
- Please provide as much context as possible and describe the *reproduction steps* that someone else can follow to recreate the issue on their own. This usually includes your code. For good bug reports you should isolate the problem and create a reduced test case.
- Provide the information you collected in the previous section.

Once it's filed:

- The project team will label the issue accordingly.
- A team member will try to reproduce the issue with your provided steps. If there are no reproduction steps or no obvious way to reproduce the issue, the team will ask you for those steps and mark the issue as `needs-repro`. Bugs with the `needs-repro` tag will not be addressed until they are reproduced.
- If the team is able to reproduce the issue, it will be marked `needs-fix`, as well as possibly other tags (such as `critical`), and the issue will be left to be [implemented by someone](#your-first-code-contribution).

### Suggesting Enhancements

This section guides you through submitting an enhancement suggestion for Dirac, **including completely new features and minor improvements to existing functionality**. Following these guidelines will help maintainers and the community to understand your suggestion and find related suggestions.

<!-- omit in toc -->
#### Before Submitting an Enhancement

- Make sure that you are using the latest version.
- Read the [documentation]() carefully and find out if the functionality is already covered, maybe by an individual configuration.
- Perform a [search](https://github.com/tom65536/dirac/issues) to see if the enhancement has already been suggested. If it has, add a comment to the existing issue instead of opening a new one.
- Find out whether your idea fits with the scope and aims of the project. It's up to you to make a strong case to convince the project's developers of the merits of this feature. Keep in mind that we want features that will be useful to the majority of our users and not just a small subset. If you're just targeting a minority of users, consider writing an add-on/plugin library.

<!-- omit in toc -->
#### How Do I Submit a Good Enhancement Suggestion?

Enhancement suggestions are tracked as [GitHub issues](https://github.com/tom65536/dirac/issues).

- Use a **clear and descriptive title** for the issue to identify the suggestion.
- Provide a **step-by-step description of the suggested enhancement** in as many details as possible.
- **Describe the current behavior** and **explain which behavior you expected to see instead** and why. At this point you can also tell which alternatives do not work for you.
- You may want to **include screenshots and animated GIFs** which help you demonstrate the steps or point out the part which the suggestion is related to. You can use [this tool](https://www.cockos.com/licecap/) to record GIFs on macOS and Windows, and [this tool](https://github.com/colinkeenan/silentcast) or [this tool](https://github.com/GNOME/byzanz) on Linux. <!-- this should only be included if the project has a GUI -->
- **Explain why this enhancement would be useful** to most Dirac users. You may also want to point out the other projects that solved it better and which could serve as inspiration.

### Your First Code Contribution
* This project does not enforce a specific IDE but you
  are encouraged to set up your editor to respect the
  settings of the [`.editorconfig`](https://github.com/tom6536/dirac/blob/master/.editorconfig) file.
  See the [EditorConfig](https://editorconfig.org/) site for a list of IDEs, editors and plugins.
* Some of the style rules are enforced by [Pre-Commit](https://pre-commit.com/) hooks. You are encouraged to install pre-commit locally such that these rules are checked ech time you commit.
* Your development environment needs a recent Java development kit, a C compiler and a working LaTeX installation, at least providing the CWEB literate programming tools.

## Styleguides
### Commit Messages
* Commit atomic changes, do not commit unrelated changes
  in a single commit.
* Keep your commit messages short.
* Use imperative mood (prsent tense) for commit messages:
  "change" not "changed" nor "changes"
* Don't capitalize the first letter
* No dot (.) at the end
* If you work on an issue make reference to it.
* Make sure all pre-commit hooks succeed before you commit
* Apply [Conventional Commits Format (1.0.0)](https://www.conventionalcommits.org/en/v1.0.0/#specification)
  as we would like to exploit commit messages for
  [Semantic Release](https://github.com/semantic-release/semantic-release) workflow.

A commit message should therefore have the following
[Angular Commit Format](https://github.com/angular/angular/blob/main/CONTRIBUTING.md#-commit-message-format):

```
<type>(<optional scope>): <short summary>

<optional body>

<optional footer>
```

The possible scopes for this project are the names of
the sub-packages or
`repo` for changes affecting repository metadata,
i.e. especially *NOT* affecting any of the sub-packages
directly.

Example:
```
feat(java): add command line option for verbosity

Add a command line option `--verbose` (short: `-v`)
which makes the program print out all HTTP requests
to standard output.


Fixes #2587
```

There are several things to avoid in commit messages:

* Do NOT include any secrets such as passwords or TLS keys in the message.
*  Do NOT include anything that you wouldn't want published in a newspaper. Usually messages can be read by others.
* Avoid massive sizes.

For further information you might want to read the
introductory blog post
[Git Commit Messages: Best Practices & Guidelines](https://initialcommit.com/blog/git-commit-messages-best-practices) by Matthew Forsyth.

<!-- omit in toc -->
## Attribution
This guide is based on the **contributing-gen**. [Make your own](https://github.com/bttger/contributing-gen)!
