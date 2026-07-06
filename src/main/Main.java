package main;

import observer.WorkflowLogger;
import task.ApprovalTask;
import task.DataSyncTask;
import task.EmailTask;
import workflow.Workflow;
import strategy.ReverseStrategy;

public class Main {

    public static void main(String[] args) {

        Workflow workflow = new Workflow("Employee Onboarding");
        workflow.addObserver(new WorkflowLogger());
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







        workflow.setExecutionStrategy(new ReverseStrategy());


        

        workflow.start();
    }


    }
