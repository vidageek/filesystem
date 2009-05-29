package net.vidageek.fs;

import java.io.File;

public interface FileSystemElement extends Comparable<FileSystemElement> {

    File toJavaFile();

    long lastModified();

    void setLastModified();

    String getName();

    String getAbsolutePath();

    String getPath();

    String relativizeFrom(FileSystemElement element);

    boolean isAbsolute();

    boolean canRead();

    boolean canWrite();

    boolean exists();

    boolean isHidden();

    void setReadOnly();

    void delete();

    void rename(String newName);
}
