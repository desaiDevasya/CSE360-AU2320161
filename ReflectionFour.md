

\*\*Lecture Date: 18/07/2026\*\*



Today's lecture was mainly about understanding how a simple shape like a square is actually created using mathematics and programming. Before this, I would normally think of a square as just a shape on the screen, but in the lecture we saw that the computer needs the exact coordinates and calculations to draw it.



\### Computer Graphics



\- We started with the basic idea of drawing a \*\*line using two points\*\*.

\- A point is represented using `(x, y)`, where x represents the horizontal position and y represents the vertical position.

\- We also learned about \*\*pixels\*\*, which are the smallest addressable elements of an image or screen.

\- The coordinate system used by a screen is generally different from the mathematical coordinate system because `(0,0)` is usually at the top-left and the y value increases downwards.

\- We then used the centre of the screen as the reference point for drawing a square.



For a screen of width `W` and height `H`, the centre can be found as:



\- `Cx = W / 2`

\- `Cy = H / 2`



After finding the centre, we calculated the four corners of the square using its side length. This made it clear that even a simple square requires proper calculations before it can be drawn.



\### Drawing the Square



The basic process we followed was:



\- Find the centre of the screen.

\- Take the side length of the square.

\- Calculate half of the side length.

\- Find the four corner points.

\- Join the points using four lines.



So the overall idea was:



\*\*Points → Lines → Multiple Lines → Square\*\*



I found this part useful because it connected the mathematics with the graphics concepts we had already discussed in earlier lectures.



\### Java and Project Structure



We also discussed the structure of a Java project and how the different folders are used.



\- `src/main/java` contains the main application code.

\- `src/test/java` contains the testing code.

\- `target/` contains generated build files.

\- Packages such as `com.example.project` help organise the code.

\- `.gitignore` is used to tell Git which files should not be tracked.



The discussion about `.gitignore` was particularly useful because I had seen files like `target/` in projects but did not fully understand why they are usually not pushed to Git.



\### OOP and Java



The lecture also introduced some basic \*\*Object-Oriented Programming\*\* concepts.



\- A \*\*class\*\* can be thought of as a blueprint.

\- An \*\*object\*\* is an actual instance created from that class.

\- We also discussed `static`, which is associated with the class rather than with individual objects.

\- We went through the basic Java flow of `.java` files being compiled into `.class` files and then executed by the JVM.

\- We also learned about the \*\*JDK\*\* and its role in Java development.

\- A brief introduction to \*\*AWT\*\* showed how Java can be used for GUI and graphics-related tasks.



\### Reflection



Overall, this lecture helped me understand what actually happens behind a simple graphic on the screen. Earlier, concepts like coordinates and pixels seemed quite basic, but while creating the square, I could see how important they are for drawing anything correctly.



The lecture also connected different parts of the course together. We used mathematics to calculate the points, Java to implement the logic, and graphics concepts to display the final shape. The Git and Java project structure discussion also helped me understand how a proper project is organised.



The main thing I took from the lecture is that even a simple shape requires a proper sequence of calculations and instructions for the computer to create it.

