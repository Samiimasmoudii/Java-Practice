package Grading;

public class GradingSystem {

  public boolean isAPass(int percentage) {
    if (percentage >= 60) {
      return true;
    } else
      // Return true if the percentage is higher than or equal to 60.
      // Otherwise return false.
      return false;
  }

  public char getGrade(int percentage) {
    if (percentage >= 90) {
      return 'A';
    } else if (percentage >= 80) {
      return 'B';
    } else if (percentage >= 70) {
      return 'B';
    } else if (percentage >= 60) {
      return 'B';
    }

    else
      return 'F';
  }

  public String retakeMessage(int percentage, boolean allowedToRetake) {
    if (percentage <= 60) {
      if (allowedToRetake == true) {
        return "The student has been entered for a retake.";
      } else {
        return "The student is not allowed to retake this exam.";
      }
    } else
      return " A retake is not required ";

    // If percentage is less than 60 and allowedToRetake is false, return a String
    // that says "The student is not allowed to retake this exam."
    // If percentage is 60 or higher, return a String that says "A retake is not
    // required."

  }

}