package vtc.cis4150.svnclient.window_manager;

import net.miginfocom.swing.MigLayout;
import vtc.cis4150.svnclient.SVNClient;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: David Fisher Evans
 * Date: 11/14/13
 */
public class ActionPanel extends JToolBar implements ActionListener
{
    public ActionPanel()
    {
        this.setFloatable(false);

        testSetup();
    }

    private void testSetup()
    {
        this.add(getButton("res/dummy.png", "testButton", "Does Nothing", "In case image fails..."));
        this.add(getButton("res/dummy.png", "testButton", "Does Nothing", "In case image fails..."));
        this.add(getButton("res/dummy.png", "testButton", "Does Nothing", "In case image fails..."));
        this.add(getButton("res/dummy.png", "testButton", "Does Nothing", "In case image fails..."));
        this.add(getButton("res/dummy.png", "testButton", "Does Nothing", "In case image fails..."));
    }

    private JButton getButton(String imageFilename, String actionCommand, String toolTip, String altText)
    {
        ImageIcon icon = new ImageIcon(SVNClient.getFileIOManager().getImage(imageFilename));

        JButton button = new JButton();
        button.setActionCommand(actionCommand);
        button.setToolTipText(toolTip);
        button.addActionListener(this);

        try
        {
            button.setIcon(icon);
        }
        catch(Exception e)
        {
            button.setText(altText);
            e.printStackTrace();
        }

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch(e.getActionCommand())
        {
            default:
                // Do nothing
                break;
        }
    }
}
