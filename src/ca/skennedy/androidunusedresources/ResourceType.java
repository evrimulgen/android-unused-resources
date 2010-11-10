package ca.skennedy.androidunusedresources;

import java.io.File;

public abstract class ResourceType {
    private final String mType;
    
    public ResourceType(final String type) {
        mType = type;
    }
    
    public String getType() {
        return mType;
    }
    
    public abstract boolean doesDirectoryContainResources(File file);
    public abstract boolean doesFileDeclareResource(File file, String resourceName);
}
