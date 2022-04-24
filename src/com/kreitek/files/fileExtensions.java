package com.kreitek.files;

public class fileExtensions implements pathnameFile{
    @Override
    public String getExtension(File file) {
        String extension = "";
        int indexOfLastDot = file.getName().lastIndexOf(".");
        if (indexOfLastDot > 0) {
            extension = file.getName().substring(indexOfLastDot + 1);
        }
        return extension;
    }
}
