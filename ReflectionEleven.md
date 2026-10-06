# Date: 15/09/2026 (Lecture 11)

Today’s session was entirely hands-on and dedicated to researching and planning our group project: a **JavaFX-based object tree interface** that allows users to navigate a hierarchy of items and edit the properties of individual selected objects.

**1. UI Architecture & Layout Strategy**

We mapped out the primary layout of our application using the classic **Master-Detail pattern**, balancing functional requirements with standard desktop software design:

* **Split-Pane Structural Layout:**
  * **Left Panel (Master Explorer):** A hierarchical `TreeView` operating as the primary navigation bar and file directory explorer.
  * **Right Panel (Detail/Property Editor):** A dynamic main screen that loads and exposes editable fields corresponding to whichever node or object is currently selected on the left.
* **Architecture-First Approach:** Sketching and agreeing on the structural layout as a team before writing code clarified our shared mental model and saved us from costly UI refactoring later.

**2. Interface Benchmarking & Real-World Examples**

To ground our design decisions, we compared production applications that handle nested navigation models side-by-side:

| Tool | Navigation Layout Model | Primary Strengths | Relevance to Our Project |
| :--- | :--- | :--- | :--- |
| **VS Code** | Deeply nested file tree Explorer | Excellent for navigating nested folders and selecting individual files for editing | **High** — Directly aligns with our multi-level object hierarchy and property inspection needs |
| **Google Docs** | Document Outline Panel | Great for flat heading jumps within a single continuous text file | **Low** — Too document-focused; lacks support for complex multi-level object depth |

**3. Prototyping & Development Setup**

* **Rapid Prototyping:** Utilized **Antigravity** alongside **Claude** to draft an initial functional wireframe and layout proof-of-concept.
* **Framework Constraints:** Kept the prototype strictly bound to default out-of-the-box **JavaFX dependencies and libraries** to ensure the underlying layout and state management remained clean before adding custom styling or extra features.

**Summary & Takeaways**

Moving from abstract theoretical discussions into active project planning made our course concepts feel much more concrete. Benchmarking existing industry tools like VS Code gave us a proven reference point for UI design, ensuring we built a natural, user-friendly layout rather than relying on trial-and-error during the coding phase.
