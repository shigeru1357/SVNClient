package vtc.cis4150.svnclient.window_manager.connection_display;

import javax.swing.*;
import java.awt.*;

/**
 * User: David Fisher Evans
 * Date: 11/14/13
 */
public class ConnectionPanel extends JPanel
{
    private ExplorerPanel _explorer;
    private FileViewerPanel _fileViewer;
    private RevisionHistoryPanel _revisionHistory;

    public ConnectionPanel()
    {
        //setBackground(new Color(0f, 1f, 0f));
        add(new JTextArea("Empty Connection Panel"));
    }

    public ExplorerPanel getExplorer()
    {
        return _explorer;
    }

    public void setExplorer(ExplorerPanel explorer)
    {
        _explorer = explorer;
    }

    public FileViewerPanel getFileViewer()
    {
        return _fileViewer;
    }

    public void setFileViewer(FileViewerPanel fileViewer)
    {
        _fileViewer = fileViewer;
    }

    public RevisionHistoryPanel getRevisionHistory()
    {
        return _revisionHistory;
    }

    public void setRevisionHistory(RevisionHistoryPanel revisionHistory)
    {
        _revisionHistory = revisionHistory;
    }
}
