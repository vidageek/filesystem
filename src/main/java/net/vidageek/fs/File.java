package net.vidageek.fs;

public interface File extends FileSystemElement {

    Folder getWrappingFolder();

    long length();

}
