package vtc.cis4150.svnclient.connection_manager;

import vtc.cis4150.svnclient.SVNClient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User: David Fisher Evans
 * Date: 10/29/13
 */
public class ConnectionManager
{
    private Set<WorkingCopy> _connections;
    private WorkingCopy _currentConnection;

    public void init()
    {
        _connections = new HashSet<WorkingCopy>();
        _currentConnection = null;

        // TODO Load saved connections from settings
        // SVNClient.getLocalSettings();
    }

    public WorkingCopy getCurrentConnection()
    {
        return _currentConnection;
    }

    public void setCurrentConnection(WorkingCopy currentConnection)
    {
        if(!_connections.contains(currentConnection))
            _connections.add(currentConnection);

        _currentConnection = currentConnection;
    }

    public Set<WorkingCopy> getConnections()
    {
        return _connections;
    }

    public List<WorkingCopy> getConnectionsSortedList()
    {
        List<WorkingCopy> list = new ArrayList<WorkingCopy>(_connections);
        // TODO Sort list
        return list;
    }
}
