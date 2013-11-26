package vtc.cis4150.svnclient.window_manager;


import net.miginfocom.swing.MigLayout;
import vtc.cis4150.svnclient.window_manager.connection_display.ConnectionPanel;

import javax.swing.*;
import java.awt.*;

/**
 * User: David Fisher Evans
 * Date: 11/14/13
 */
public class WindowManager
{
    private JFrame _mainWindow, _popupWindow;
    private SVNMenuBar _menuBar;
    private ActionPanel _actionPanel;
    private ConnectionPanel _connectionPanel;

    private static final String ACTION_HEIGHT = "40px";

    private static final String ACTION_MIG = "width max(400, 100%),height " + ACTION_HEIGHT;
    private static final String CONNECTION_MIG = "width max(400, 100%),height 100%-" + ACTION_HEIGHT;

    public void init()
    {
        createMainWindow();
    }

    private void createMainWindow()
    {
        _mainWindow = new JFrame("SVNClient");
        _mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _mainWindow.setSize(800, 600);

        _menuBar = new SVNMenuBar(); // SET MENU BAR
        _mainWindow.setJMenuBar(_menuBar);
        _mainWindow.setLayout(new MigLayout("gap 0 0,flowy"));
        _actionPanel = new ActionPanel(); // SET ACTION PANEL
        _mainWindow.add(_actionPanel, ACTION_MIG);

        setConnectionPanel(new ConnectionPanel()); // SET BLANK CONNECTION PANEL

        _mainWindow.setVisible(true);
    }

    private void createMenuBar()
    {
    }

    public void setPopupWindow(JFrame popupWindow)
    {
        _popupWindow = popupWindow;
    }

    public void setConnectionPanel(ConnectionPanel connectionPanel)
    {
        if(_connectionPanel != null)
            _mainWindow.remove(_connectionPanel);

        _connectionPanel = connectionPanel;
        _mainWindow.add(_connectionPanel, CONNECTION_MIG);
    }

    public JFrame getMainWindow()
    {
        return _mainWindow;
    }

    public JFrame getPopupWindow()
    {
        return _popupWindow;
    }

    public JMenuBar getMenuBar()
    {
        return _menuBar;
    }

    public ActionPanel getActionPanel()
    {
        return _actionPanel;
    }

    public ConnectionPanel getConnectionPanel()
    {
        return _connectionPanel;
    }
}
