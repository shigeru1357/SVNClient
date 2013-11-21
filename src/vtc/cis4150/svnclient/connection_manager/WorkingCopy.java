package vtc.cis4150.svnclient.connection_manager;

import org.tmatesoft.svn.core.SVNCommitInfo;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNRevision;

import java.io.File;

/**
 * User: David Fisher Evans
 * Date: 11/14/13
 */
public class WorkingCopy
{
    private SVNClientManager _client;

    public SVNCommitInfo makeDirectory( SVNURL url , String commitMessage ) throws SVNException
    {
        return null;
    }

    public SVNCommitInfo importDirectory( File localPath , SVNURL dstURL , String commitMessage , boolean isRecursive ) throws SVNException
    {
        return null;
    }

    public SVNCommitInfo commit( File wcPath , boolean keepLocks , String commitMessage ) throws SVNException
    {
        return null;
    }

    public long checkout( SVNURL url , SVNRevision revision , File destPath , boolean isRecursive ) throws SVNException
    {
        return 0;
    }

    public long update( File wcPath , SVNRevision updateToRevision , boolean isRecursive ) throws SVNException
    {
        return 0;
    }

    public long switchToURL( File wcPath , SVNURL url , SVNRevision updateToRevision , boolean isRecursive ) throws SVNException
    {
        return 0;
    }

    public void addEntry( File wcPath ) throws SVNException
    {

    }

    public void lock( File wcPath , boolean isStealLock , String lockComment ) throws SVNException
    {

    }

    public void delete( File wcPath , boolean force ) throws SVNException
    {

    }

    public SVNCommitInfo copy( SVNURL srcURL , SVNURL dstURL , boolean isMove , String commitMessage ) throws SVNException
    {
        return null;
    }

}
