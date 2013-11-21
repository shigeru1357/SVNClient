package vtc.cis4150.svnclient.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

/**
 * User: David Fisher Evans
 * Date: 11/14/13
 */
public class FileIOManager
{
    private String _root;

    public void setRoot(String root)
    {
        _root = root;
    }

    public String getRoot()
    {
        return _root;
    }

    public File getFile(String filename)
    {
        return null;
    }

    public BufferedReader getReader(File file)
    {
        return null;
    }

    public BufferedWriter getWriter(File file)
    {
        return null;
    }
}
