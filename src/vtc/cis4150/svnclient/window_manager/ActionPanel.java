package vtc.cis4150.svnclient.window_manager;

import net.miginfocom.swing.MigLayout;
import vtc.cis4150.svnclient.SVNClient;
import vtc.cis4150.svnclient.connection_manager.ConnectionManager;
import vtc.cis4150.svnclient.connection_manager.WorkingCopy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * User: David Fisher Evans
 * Date: 11/14/13
 */
public class ActionPanel extends JPanel implements ActionListener
{
    private JToolBar _toolbar;
    private JComboBox _connectionDropDown;

    private final String[] NO_CONNECTIONS_ARRAY = new String[] {"No Saved Connections..."};

    private ButtonType _buttonType;

    private enum ButtonType { Image, Text, Both };

    public ActionPanel()
    {
        super(new MigLayout());

        _buttonType = ButtonType.Image;

        setupConnectionDropDown();
        setupToolbar();
    }

    private void setupConnectionDropDown()
    {
        _connectionDropDown = new JComboBox<>();

        List<WorkingCopy> connectionList = SVNClient.getConnectionManager().getConnectionsSortedList();
        if(connectionList != null && connectionList.size() > 0)
        {
            String[] connectionListNames = new String[connectionList.size()];
            int selectedId = 0;
            for(int id = 0;id < connectionList.size();id++)
            {
                connectionListNames[id] = connectionList.get(id).toString();
                if(connectionList.get(id) == SVNClient.getConnectionManager().getCurrentConnection())
                    selectedId = id;
            }

            _connectionDropDown = new JComboBox(connectionListNames);
            _connectionDropDown.setSelectedIndex(selectedId);
        }
        else
            _connectionDropDown = new JComboBox(NO_CONNECTIONS_ARRAY);

        _connectionDropDown.addActionListener(this);
        this.add(_connectionDropDown);
    }

    private void setupToolbar()
    {
        ToolTipManager.sharedInstance().setDismissDelay(500);

        _toolbar = new JToolBar();
        _toolbar.setFloatable(false);

        _toolbar.add(getButton("connection_add", _buttonType, "Add Connection", "res/green_plus.png", "Add a new connection to your connection list"));
        _toolbar.add(getButton("connection_del", _buttonType, "Delete Connection", "res/red_x.png", "Removes the current connection from your connection list"));
        _toolbar.addSeparator();
        _toolbar.add(getButton("save", _buttonType, "Save", "res/dummy.png", "Saves something important"));

        this.add(_toolbar);
    }

    private JButton getButton(String actionCommand, ButtonType buttonType, String buttonText, String imageLocation, String toolTip)
    {
        ImageIcon icon = new ImageIcon(SVNClient.getFileIOManager().getImage(imageLocation));

        JButton button = new JButton();
        button.setActionCommand(actionCommand);
        button.addActionListener(this);

        if(buttonType == ButtonType.Image || buttonType == ButtonType.Both)
        {
            try
            {
                button.setIcon(icon);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        if(buttonType == ButtonType.Text || buttonType == ButtonType.Both)
            button.setText(buttonText);

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(_toolbar.getComponentIndex((Component) e.getSource()) >= 0) // Toolbar action
        {
            System.out.println("Toolbar Button Pressed: " + e.getActionCommand());
            switch(e.getActionCommand())
            {
                default:
                    // Do nothing
                    break;
            }
        }
        else if(e.getSource() == _connectionDropDown) // New Connection
        {
            System.out.println("New Connection Selected: " + _connectionDropDown.getSelectedItem().toString());
            ConnectionManager cm = SVNClient.getConnectionManager();
            if(cm.getConnections().size() > 0)
            {
                int connectionId = _connectionDropDown.getSelectedIndex();
                WorkingCopy selectedWorkingCopy = cm.getConnectionsSortedList().get(connectionId);
                cm.setCurrentConnection(selectedWorkingCopy);
            }
        }
    }
}
