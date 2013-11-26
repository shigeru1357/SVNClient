package vtc.cis4150.svnclient.window_manager;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: immortal
 * Date: 11/25/13
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class SVNMenuBar extends JMenuBar
{
    public SVNMenuBar()
    {

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Exit"));
        this.add(fileMenu);
    }
}
