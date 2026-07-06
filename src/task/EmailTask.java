package task;

public class EmailTask implements Task {

    // Fields (Data)
    private String recipient;
    private String subject;
    private String message;

    // Constructor
    public EmailTask(String recipient, String subject, String message) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
    }

    // Validate the task before execution
    @Override
    public boolean validate() {
        return recipient != null
                && !recipient.isEmpty()
                && subject != null
                && !subject.isEmpty()
                && message != null
                && !message.isEmpty();
    }

    // Execute the task
    @Override
    public void execute() {
        System.out.println("=================================");
        System.out.println("Executing Email Task...");
        System.out.println("Recipient : " + recipient);
        System.out.println("Subject   : " + subject);
        System.out.println("Message   : " + message);
        System.out.println("Email sent successfully!");
        System.out.println("=================================");
    }

    // Return task name
    @Override
    public String getTaskName() {
        return "Email Task";
    }
}