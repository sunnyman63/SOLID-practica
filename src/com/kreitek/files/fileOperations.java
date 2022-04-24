package com.kreitek.files;

public interface fileOperations {
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
    void open();
    void close();
}