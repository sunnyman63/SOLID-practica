package com.kreitek.files;

import com.kreitek.files.error.InvalidFileFormatException;
import com.kreitek.files.fileCreation;
import com.kreitek.files.fileOperations;
import java.util.List;

public  class File extends FileSystemItemBase implements fileOperations {

    private int size = 0;
    private boolean isOpen = false;
    private int position = 0;

    public File(Directory parent, String name) {
        super(parent, name);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void open() {
        isOpen = true;
        // Aquí vendría código que actualizaría también this.size
    }

    @Override
    public byte[] read(int numberOfBytesToRead) {
        if (position + numberOfBytesToRead > size) {
            numberOfBytesToRead = size - position;
        }
        // Aquí habría lógica que lee el contenido del fichero
        byte[] buffer = new byte[numberOfBytesToRead];
        position += numberOfBytesToRead;
        return buffer;
    }

    @Override
    public void write(byte[] buffer) {
        // Aquí habría lógica que escribiría en el fichero
        size += buffer.length;
        position += buffer.length;
    }

    @Override
    public void close() {
        isOpen = false;
    }

}
