package org.example.exceptions;

import org.example.Player;

import java.io.File;
import java.io.IOException;

public class FileExecutor {

    void doSmth(Player animal) throws ClassCastException, IOException {
        File file = new File("");
        file.createNewFile();
    }
}
