package com.hedreon.hedroniclauncher;

import org.apache.maven.plugins.annotations.Parameter;

public class SingleInstance {
    @Parameter
    String mutexName;

    @Parameter
    String windowTitle;

    net.sf.launch4j.config.SingleInstance toLaunch4j() {
        net.sf.launch4j.config.SingleInstance instance = new net.sf.launch4j.config.SingleInstance();

        instance.setMutexName(mutexName);
        instance.setWindowTitle(windowTitle);

        return instance;
    }
}