package com.korovesys.demoCaminoApp.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korovesys.camino.executor.FlowExecutor;

@RestController
public class FlowService {

    @Autowired
    private FlowExecutor executor;

    @PostMapping("/flow")
    public void testController(@RequestParam(name = "name") String name) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", name);
        executor.execute("myFirstFlow", params);
    }
}
