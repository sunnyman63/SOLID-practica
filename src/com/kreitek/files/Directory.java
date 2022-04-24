package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;
import com.kreitek.files.fileCreation;
import com.kreitek.files.listedFile;
import com.kreitek.files.fileOperations;

public class Directory extends FileSystemItemBase implements fileCreation,listedFile {

    private final List<FileSystemItemBase> files;

    public Directory(Directory parent, String name) {
        super(parent, name);
        files = new ArrayList<>();
        // Aquí vendría lógica que rellena la lista de ficheros
    }

    @Override
    public void addFile(FileSystemItemBase file) {
        if (!files.contains(file)) {
            files.add(file);
            file.setParent(this);
        }
    }

    @Override
    public void removeFile(FileSystemItemBase file) {
        files.remove(file);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemItemBase file : files){
            size += file.getSize();
        }
        return size;
    }

    @Override
    public List<FileSystemItemBase> listFiles() {
        return files;
    }

}
