## 🧮 Matrix Manipulation Tool

- A robust, console-based Java application designed to perform complex linear algebra operations with mathematical precision. This tool handles everything from basic matrix arithmetic to advanced operations like Gaussian Elimination for matrix inversion.
- 🚀 FeaturesCreate & Store: Initialize multiple matrices and view them in a structured grid format.
- Matrix Arithmetic: * Addition and Subtraction of matrices.
- Standard Matrix Multiplication: Implements the true dot product logic ($A_{m \times n} \times B_{n \times p}$).
- Geometric Operations: Rapidly compute the Transpose of any rectangular matrix.
- High Precision Inverse: Uses the Gauss-Jordan elimination method to find the inverse of square matrices with double precision (2 decimal places).
- 
---

## 🛠️ Logic & Mathematics
### The core of this application follows strict mathematical rules:
- Matrix Multiplication :
  - Unlike element-wise multiplication, this tool uses the standard algorithm:$$C_{ij} = \sum_{k=1}^{n} A_{ik} B_{kj}$$Matrix InversionThe program uses an Augmented Matrix $[A | I]$ approach. Through row operations, it transforms the left side into the Identity matrix, leaving the inverse on the right.💻 How to RunPrerequisites: Ensure you have JDK installed.Compile:Bashjavac MatrixManipulation.java
Execute:Bashjava MatrixManipulation
📂 Project StructureMethodDescriptionmainHandles the UI menu and user flow.fillMatrixUtility to handle user input for matrix elements.calculateInverseContains the Gauss-Jordan elimination algorithm.printMatrixFormats and displays 2D/3D arrays cleanly.📝 Example UsagePlaintextSelect an option : 6 (Inverse)

Size of square matrix: 2
Enter elements:
4 7
2 6

Inverse Matrix:
	0.60	-0.70
	-0.20	0.40
🤝 ContributingContributions are welcome! If you'd like to add features like Determinant calculation or Eigenvalues, feel free to fork this repo and submit a pull request.
