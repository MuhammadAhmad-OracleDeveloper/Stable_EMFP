package view;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class ClusterFarmerSidebar implements Serializable {
    private String taskFlowId =
        "/WEB-INF/Task_Flows/Modules/Clusters_Farmers/Cluster_Farmer_TaskFlow.xml#Cluster_Farmer_TaskFlow";

    public ClusterFarmerSidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void Clusters_Setup_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Clusters_Farmers/Cluster_Setup_TaskFlow.xml#Cluster_Setup_TaskFlow");
    }

    public void Farmer_Registration_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Clusters_Farmers/Farmer_Registration_TaskFlow.xml#Farmer_Registration_TaskFlow");
    }
}
