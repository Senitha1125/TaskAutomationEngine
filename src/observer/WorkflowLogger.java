package observer;

import state.WorkflowState;

public class WorkflowLogger implements WorkflowObserver {

    @Override
    public void onStateChange(WorkflowState state) {
        System.out.println("[LOGGER] Workflow State Changed -> " + state);
    }
}