
public class Adult {
 int activities;
 public Adult() {

 }
 public boolean isBored() {
  System.out.println("How many things are on your current schedule that you must do right now?");
  activities = JobFinder.userInput.nextInt();
  return activities < 1;
 }
}
