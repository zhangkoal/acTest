package acTest;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;

public class mainClass {
    public static void main(String[] args) {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

        processEngine.close();
        System.exit(0);
    }
}
