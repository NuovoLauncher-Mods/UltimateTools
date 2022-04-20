package io.nl.ut.handlers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class UpdateGetter {
    public static void getUpdate(String version) throws IOException {
        URL update_url = new URL("https://github.com/NuovoLauncher-Mods/UltimateTools/blob/main/Releases/ultimate_tools.jar?raw=true");
        File update_path = new File(System.getProperty("user.home") + "/.minecraft/mods");
        try {
            File update_path_at = new File(System.getProperty("user.dir") + "/ATLauncher/instances/Minecraft-1.7.10");
            FileUtils.copyURLToFile(update_url, update_path_at);
        } catch(Exception e) {
            FileUtils.copyURLToFile(update_url, update_path);
        }
     }

     public static void main(String[] args) throws IOException {
      getUpdate("0.1.1");   
    }
}
