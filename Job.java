
public class Job {
 String likesJob;
 String job;
 public Job() {

 }
 public boolean sucks() {
  System.out.println("Do you like your job?");
  likesJob = JobFinder.userInput.nextLine();
  boolean badJob = likesJob.equals("yes") ? false : true;
  return badJob;
 }

 public void getJobName(Adult username) {
  System.out.println("What is your current job?");
  System.out.print(username + " is a ");
  job = JobFinder.userInput.nextLine();
 }
}
