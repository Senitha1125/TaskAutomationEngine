package task;

public class DataSyncTask implements Task {

    private String source;
    private String destination;

    public DataSyncTask(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public boolean validate() {
        return source != null && !source.isEmpty()
                && destination != null && !destination.isEmpty();
    }

    @Override
    public void execute() {
        System.out.println("Syncing data...");
        System.out.println("Source      : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Data Sync Completed!");
    }

    @Override
    public String getTaskName() {
        return "Data Sync Task";
    }
}