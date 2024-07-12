package com.myjavaspring.springcore.utils2;


import org.springframework.stereotype.Component;

@Component
public class WorkerJob {

    public void deleteJob()
    {
        System.out.println("Running Delete Job");
    }
}
