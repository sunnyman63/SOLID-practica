package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;

public abstract class FileSystemItemBase {
    protected static final String PATH_SEPARATOR = "/";
    protected String name;
    protected Directory parent;
    private String fullPath = PATH_SEPARATOR;
    private int size;
    private final List<FileSystemItemBase> files;

    protected FileSystemItemBase(Directory parent, String name) {
        this.parent = parent;
        this.name = name;
        files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
       this.name = name;
    }

    public FileSystemItemBase getParent() {
        return parent;
    }

    public void setParent(Directory directory) {
        this.parent = parent;
    }

    public String getFullPath() {
        if (parent != null) {
            String parentFullPath = parent.getFullPath();
            this.fullPath = parent.getFullPath() + (parentFullPath.length() > 1 ? PATH_SEPARATOR : "");
        }
        this.fullPath = this.fullPath + getName();
        return this.fullPath;
    }

    public abstract int getSize();

    public void setSize(int size) {
        this.size = size;
    }

    public abstract List<FileSystemItemBase> listFiles();
}
