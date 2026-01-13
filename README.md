# UMLRev: A context-aware feature-oriented approach to support continuous reverse engineering of UML models

Maintaining up-to-date design models is a persistent challenge in modern software development, especially within continuous integration (CI) environments. While prior research in UML reverse engineering has offered valuable insights, existing approaches often neglect contextual information about application features and lack integration with automated delivery pipelines. To address this gap, we present UMLRev, a practical tool that supports the continuous reverse engineering of UML models from feature-level execution traces. UMLRev integrates directly into CI pipelines and automatically generates UML class and sequence diagrams for every software release, ensuring that documentation evolves alongside the codebase with minimal developer effort. Unlike previous approaches, UMLRev combines context-awareness, feature orientation, and CI compatibility into a unified, working prototype. Features are manually delimited via test scripts, allowing teams to define and track behaviorally meaningful units over time. We conducted a qualitative study with 22 industry professionals to evaluate the tool’s perceived usefulness, ease of use, and impact on UML adoption. Results show that 91% found UMLRev helpful in generating diagrams in agile settings, and over 70% believe it encourages broader UML use. These findings underscore the tool’s potential to close the gap between design documentation and evolving implementations in agile software practices.


## 🧭 Overview

Traditional UML reverse engineering tools often fail to reflect evolving software behavior and overlook feature-specific contextual information. UMLRev bridges this gap by:
* Extracting execution traces during test runs.
* Associating features with contextual elements inferred from test scripts.
* Automatically generating updated UML class and sequence diagrams in CI pipelines.

It was designed to **promote model consistency**, **reduce architectural drift**, and **enhance program comprehension**, especially in dynamic or agile development environments.

## 🎯 Main Contributions

#### 1. Feature-Oriented Model Extraction

UMLRev associates each generated model with a feature context, inferred from test executions. This ensures that diagrams reflect the behavior of individual features rather than generic system behavior.

#### 2. Context-Sensitive Diagram Generation

The approach leverages contextual trace data to selectively generate UML class and sequence diagrams aligned with the architectural intent of the tested feature.

#### 3. CI Pipeline Integration

UMLRev can be seamlessly integrated into automated build pipelines (e.g., Jenkins, GitHub Actions), enabling continuous documentation during software delivery.

#### 4. Modular, Extensible Architecture

The tool is implemented with a component-based architecture, allowing straightforward extension to support new diagram types or data sources.

#### 5. Empirical Evaluation

The approach has been qualitatively evaluated with practitioners, highlighting its perceived usefulness, traceability benefits, and practical relevance.


## 🧱 System Architecture

UMLRev is structured into six modular components:

* `Tracer`: Captures runtime execution traces during test runs.

* `Repository`: Stores contextual execution data (in-memory or persistent).

* `InformationModel`: Defines typed entities (classes, methods, parameters, etc.).

* `DiagramStrategy`: Encapsulates generation strategies for UML diagrams.

* `DiagramEngine`: Orchestrates the generation process.

* `MetamodelAdapter`: Connects with the UML2 framework to produce standard-compliant diagrams.

See the `/docs/architecture` folder for detailed UML diagrams, which are shown as follows:


#### Component-based Architecture

<img width="600" height="600" alt="diagrama-componentes" src="https://github.com/user-attachments/assets/9dd149c8-06d5-4f3d-a9cd-9adb8fb1b7e6" />


#### UML class diagram

<img width="800" height="1000" alt="diagrama-classes" src="https://github.com/user-attachments/assets/52804916-12f0-4fa4-b2a8-e03af3a61467" />



## 📥 Installation

#### Requirements

* Java 11+
* Maven 3.6+
* Git
* Eclipse UML2 (automatically resolved via Maven)

#### Clone the Repository

```
git clone [https://github.com/cristianoccf/UMLRev.git](https://github.com/cristianoccf/UMLRev.git)`
cd umlrev
```


#### Build the Project

```
mvn clean install
```



### 🚀 Running the Tool

You can use UMLRev in standalone or CI-integrated mode.

#### 1. Standalone Execution

Run tests and generate diagrams manually:

```java
java -jar target/umlrev.jar --projectPath=/your/project/path --outputDir=/uml/output/
```


This will:
* Execute test cases.
* Record execution traces.
* Generate .uml models for classes and sequences.
* Export diagrams to the specified output directory.

#### 2. CI Integration (Example)

You can integrate UMLRev into your CI configuration using a GitHub Action or Jenkins pipeline. For example:

```yaml
- name: Generate UML Diagrams
  run: java -jar umlrev.jar --projectPath=. --outputDir=docs/diagrams
```

This ensures your UML models are automatically updated at each build stage.

### 📂 Repository Structure

| Folder / File | Description                                    |
| ------------- | ---------------------------------------------- |
| `/src`        | Java source code implementing UMLRev           |
| `/docs`       | Documentation and figures (e.g., architecture) |
| `/examples`   | Sample projects and generated diagrams         |
| `umlrev.jar`  | Standalone executable (after build)            |
| `README.md`   | This file                                      |
| `pom.xml`     | Maven configuration and dependencies           |



### 🧪 Testing the Approach

To evaluate UMLRev:
1. Navigate to the `/examples` directory.
2. Select a sample project.
4. Run the tool using the project path.
5. Explore generated `.uml` and `.svg` diagrams in the output directory.

Example:

```bash
java -jar umlrev.jar --projectPath=examples/sample-java --outputDir=output/diagrams
```







### 🤝 Contributing

We welcome pull requests, feedback, and ideas for extensions!

To contribute:
* Fork the repo.
* Open a pull request with a clear description.
* Respect the architecture and design patterns already adopted.

For feature requests or bug reports, please open an issue


