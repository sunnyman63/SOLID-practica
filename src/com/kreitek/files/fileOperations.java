package com.kreitek.files;

import com.kreitek.files.FileSystemItemBase;
import java.util.List;

public interface fileOperations {
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
}