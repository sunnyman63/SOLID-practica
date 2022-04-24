package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;
import com.kreitek.files.fileCreation;
import com.kreitek.files.listedFile;
import com.kreitek.files.fileOperations;

public class Directory extends FileSystemItemBase implements fileCreation {

    public Directory(Directory parent, String name) {
        super(parent, name);
        // Aquí vendría lógica que rellena la lista de ficheros
    }

    @Override
    public void addFile(FileSystemItemBase file) {
        if (!getFiles().contains(file)) {
            getFiles().add(file);
            file.setParent(this);
        }
    }

    @Override
    public void removeFile(FileSystemItemBase file) {
        getFiles().remove(file);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemItemBase file : getFiles()){
            size += file.getSize();
        }
        return size;
    }

}
