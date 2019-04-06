package view;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class ManagementSidebar implements Serializable {
    private String taskFlowId = "/WEB-INF/Task_Flows/Modules/Management/Management_TaskFlow.xml#Management_TaskFlow";

    public ManagementSidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void UserRoles_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Management/UserRoles_TaskFlow.xml#UserRoles_TaskFlow");
    }
}
