package com.kreitek.service;

import com.kreitek.files.Directory;
import com.kreitek.files.File;
import com.kreitek.files.error.InvalidFileFormatException;
import com.kreitek.files.fileExtensions;

public class typeFileConversor {

    public File convertMp3ToWav(File file, fileExtensions extensions) {
        if (!"mp3".equalsIgnoreCase(extensions.getExtension(file))) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }

        int indexOfLastDot = file.getName().lastIndexOf(".");
        String nameWithoutExtension = file.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = file.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".wav";
        File result = new File((Directory) file.getParent(), newFileName);
        result.open();
        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

    public File convertWavToMp3(File file, fileExtensions extensions) {
        if (!"wav".equalsIgnoreCase(extensions.getExtension(file))) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }

        int indexOfLastDot = file.getName().lastIndexOf(".");
        String nameWithoutExtension = file.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = file.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".mp3";
        File result = new File((Directory) file.getParent(), newFileName);
        result.open();
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

}
