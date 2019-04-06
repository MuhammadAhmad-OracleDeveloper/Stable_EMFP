package view;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class SetupSideBar {
    private String taskFlowId = "/WEB-INF/Task_Flows/Modules/Setup/Setup_TaskFlow.xml#Setup_TaskFlow";

    public SetupSideBar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void Program_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Program_TaskFlow.xml#Program_TaskFlow");
    }

    public void Project_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Project_TaskFlow.xml#Project_TaskFlow");
    }

    public void Phase_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Phase_TaskFlow.xml#Phase_TaskFlow");
    }

    public void Crops_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Crops_TaskFlow.xml#Crops_TaskFlow");
    }

    public void Target_Crops_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Target_Crops_TaskFlow.xml#Target_Crops_TaskFlow");
    }

    public void Farm_Machinery_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Farm_Machinery_TaskFlow.xml#Farm_Machinery_TaskFlow");
    }

    public void Supplier_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Supplier_TaskFlow.xml#Supplier_TaskFlow");
    }

    public void Supplier_Rate_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Supplier_Rate_TaskFlow.xml#Supplier_Rate_TaskFlow");
    }

    public void Library_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Library_TaskFlow.xml#Library_TaskFlow");
    }
}
