package io.nl.ut.classes;

public class Update {
    private String version;
    private String mcVersion;
    
    public String getVersion() {
        return this.version;
    }
    public String getForgeVersion() {
        return this.mcVersion;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setForgeVersion(String version) {
        this.mcVersion = version;
    }
}
