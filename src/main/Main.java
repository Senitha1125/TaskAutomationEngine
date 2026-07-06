package main;

import task.ApprovalTask;
import task.DataSyncTask;
import task.EmailTask;
import workflow.Workflow;

public class Main {

    public static void main(String[] args) {

        Workflow workflow = new Workflow("Employee Onboarding");

        workflow.addTask(new EmailTask(
                "john@company.com",
                "Welcome",
                "Welcome to our company!"
        ));

        workflow.addTask(new ApprovalTask(
                "Manager",
                "REQ-101"
        ));

        workflow.addTask(new DataSyncTask(
                "HR Database",
                "Payroll Database"
        ));

        workflow.start();
    }
}