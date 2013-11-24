package vtc.cis4150.svnclient.local_settings;

import vtc.cis4150.svnclient.exceptions.SettingValueTypeMisMatch;
import vtc.cis4150.svnclient.exceptions.UnableToLoadSettings;
import vtc.cis4150.svnclient.exceptions.UnableToSaveSettings;

import java.util.HashMap;
import java.util.Set;

/**
 * User: David Fisher Evans
 * Date: 10/29/13
 */
public class LocalSettings
{
    private HashMap<String, Object> _settings;

    public LocalSettings()
    {
        _settings = new HashMap<String, Object>();
    }

    public void load(String filename) throws UnableToLoadSettings
    {

    }

    public void save(String filename) throws UnableToSaveSettings
    {

    }

    public void loadDefaultSettings()
    {

    }

    public Set<String> getSettingKeys()
    {
        return null;
    }

    public Object set(String settingKey, Object settingValue)
    {
        return null;
    }

    public Object get(String settingKey)
    {
        return null;
    }

    public Integer getInteger(String settingKey) throws SettingValueTypeMisMatch
    {
        return null;
    }

    public Float getFloat(String settingKey) throws SettingValueTypeMisMatch
    {
        return null;
    }

    public String getString(String settingKey) throws SettingValueTypeMisMatch
    {
        return null;
    }

    public Boolean getBoolean(String settingKey) throws SettingValueTypeMisMatch
    {
        return null;
    }
}
