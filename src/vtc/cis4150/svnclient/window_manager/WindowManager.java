package vtc.cis4150.svnclient.window_manager;

import vtc.cis4150.svnclient.window_manager.connection_display.ConnectionPanel;

import javax.swing.*;

/**
 * User: David Fisher Evans
 * Date: 11/14/13
 */
public class WindowManager
{
    private JFrame _mainWindow, _popupWindow;
    private JMenuBar _menuBar;
    private ActionPanel _actionPanel;
    private ConnectionPanel _connectionPanel;

    public void setPopupWindow(JFrame popupWindow)
    {
        _popupWindow = popupWindow;
    }

    public void setConnectionPanel(ConnectionPanel connectionPanel)
    {
        _connectionPanel = connectionPanel;
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
