package net.vidageek.fs.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

final public class GenericFileTest {

    private File file;
    private GenericFile genericFile;

    @Before
    public void setup() throws Throwable {
        file = File.createTempFile("filesystem", "vidageek");
        genericFile = new GenericFile(file);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThatThrowsExceptionIfFileIsNull() {
        new GenericFile(null);
    }

    @Test
    public void testThatHasSameLastModifiedAsWrappedFile() {
        Assert.assertEquals(file.lastModified(), genericFile.lastModified());
    }

    @Test
    public void testThatLastModifiedIsEqualsToFileLastModified() {
        genericFile.setLastModified(0);
        Assert.assertEquals(0, genericFile.lastModified());
        Assert.assertEquals(0, file.lastModified());
    }

    @Test
    public void testThatHasSameLenght() throws FileNotFoundException {
        new PrintStream(file).println("foo");
        Assert.assertEquals(file.length(), genericFile.length());
    }

}
