package vtc.cis4150.svnclient.connection_manager;

import java.util.Set;

/**
 * User: David Fisher Evans
 * Date: 10/29/13
 */
public class ConnectionManager
{
    private Set<WorkingCopy> _connections;
    private WorkingCopy _currentConnection;

    public ConnectionManager()
    {

    }

    public WorkingCopy getCurrentConnection()
    {
        return _currentConnection;
    }

    public void setCurrentConnection(WorkingCopy currentConnection)
    {
        _currentConnection = currentConnection;
    }

    public Set<WorkingCopy> getConnections()
    {
        return _connections;
    }

    public void doSomething()
    {

    }
}
