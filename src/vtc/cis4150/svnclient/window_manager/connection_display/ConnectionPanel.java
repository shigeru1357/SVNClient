package vtc.cis4150.svnclient.window_manager.connection_display;

import javax.swing.*;

/**
 * User: David Fisher Evans
 * Date: 11/14/13
 */
public class ConnectionPanel extends JFrame
{
    private ExplorerPanel _explorer;
    private FileViewerPanel _fileViewer;
    private RevisionHistoryPanel _revisionHistory;

    public ExplorerPanel getExplorer() {
        return _explorer;
    }

    public void setExplorer(ExplorerPanel _explorer) {
        this._explorer = _explorer;
    }

    public FileViewerPanel getFileViewer() {
        return _fileViewer;
    }

    public void setFileViewer(FileViewerPanel _fileViewer) {
        this._fileViewer = _fileViewer;
    }

    public RevisionHistoryPanel getRevisionHistory() {
        return _revisionHistory;
    }

    public void setRevisionHistory(RevisionHistoryPanel _revisionHistory) {
        this._revisionHistory = _revisionHistory;
    }
}
