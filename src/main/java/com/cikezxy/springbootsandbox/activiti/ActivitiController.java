package com.cikezxy.springbootsandbox.activiti;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivitiController {

    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("/activiti/start-process")
    public String startProcess() {

        runtimeService.startProcessInstanceByKey("myProcess");
        return "Process started. Number of currently running"
                + "processes instances = "
                + runtimeService.createProcessInstanceQuery().count();
    }
}
