package com.github.browep.efh;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FileTransferContractTest {
    @Test
    public void canConnect() throws IOException {
        FileHubAdapter fileHubAdapter = new FileHubAdapter();
        Assert.assertNotNull(fileHubAdapter);
    }
}