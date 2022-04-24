package com.kreitek.service;

import com.kreitek.files.Directory;
import com.kreitek.files.File;
import com.kreitek.files.pathnameFile;
import com.kreitek.files.FileSystemItemBase;
import com.kreitek.files.fileOperations;
import java.util.List;

public class FileManager {

    public static int calculateSize(FileSystemItemBase fileSystemItem) {
        return fileSystemItem.getSize();
    }

    public static int calculateSize(List<FileSystemItemBase> files) {
        int totalSize = 0;

        for(FileSystemItemBase file : files){
            totalSize += file.getSize();
        }

        return totalSize;
    }

    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
}
