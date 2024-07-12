package com.myjavaspring.springcore.utils2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySystem {

    @Autowired
    private WorkerJob workerJ;

    public void runJob()
    {
        workerJ.deleteJob();
        System.out.println("Job complete");
    }
}
