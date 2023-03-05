package com.hedreon.hedroniclauncher;

import org.apache.maven.plugin.logging.Log;

public class MavenLog extends net.sf.launch4j.Log {
    Log logJ;

    public MavenLog(Log log) {
        logJ = log;
    }

    @Override
    public void clear() {
        logJ.info("");
    }

    @Override
    public void append(String line) {
        logJ.info("HedronicLauncher: " + line);
    }
}