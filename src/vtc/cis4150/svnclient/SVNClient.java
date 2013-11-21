package vtc.cis4150.svnclient;

import vtc.cis4150.svnclient.connection_manager.ConnectionManager;
import vtc.cis4150.svnclient.io.FileIOManager;
import vtc.cis4150.svnclient.local_settings.LocalSettings;
import vtc.cis4150.svnclient.window_manager.WindowManager;

/**
 * User: David Fisher Evans
 * Date: 10/29/13
 */
public class SVNClient
{
    private ConnectionManager _connectionManager;
    private LocalSettings _localSettings;
    private WindowManager _windowManager;
    private FileIOManager _fileIOManager;

    public SVNClient(String[] args)
    {
    }

    public void init()
    {

    }

    public ConnectionManager getConnectionManager()
    {
        return _connectionManager;
    }

    public LocalSettings getLocalSettings()
    {
        return _localSettings;
    }

    public WindowManager getWindowManager()
    {
        return _windowManager;
    }

    public FileIOManager getFileIOManager() {
        return _fileIOManager;
    }
}
