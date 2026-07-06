package task;

public class ApprovalTask implements Task {

    private String approverName;
    private String requestId;

    public ApprovalTask(String approverName, String requestId) {
        this.approverName = approverName;
        this.requestId = requestId;
    }

    @Override
    public boolean validate() {
        return approverName != null && !approverName.isEmpty()
                && requestId != null && !requestId.isEmpty();
    }

    @Override
    public void execute() {
        System.out.println("Approver  : " + approverName);
        System.out.println("Request ID: " + requestId);
        System.out.println("Approval Granted!");
    }

    @Override
    public String getTaskName() {
        return "Approval Task";
    }
}