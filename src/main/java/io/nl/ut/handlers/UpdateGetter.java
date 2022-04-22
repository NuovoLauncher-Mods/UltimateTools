package io.nl.ut.handlers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class UpdateGetter {
    public static void getUpdate(String version) throws IOException {
        URL update_url = new URL("https://objects.githubusercontent.com/github-production-release-asset-2e65be/480407059/7e9c5d4e-756b-4551-bd20-396ded7f1e7b?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20220422%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20220422T115243Z&X-Amz-Expires=300&X-Amz-Signature=02b1daa375217dd81c535f4c81c42a973b2e88b1e3de3982e47f42526c9b7381&X-Amz-SignedHeaders=host&actor_id=42328172&key_id=0&repo_id=480407059&response-content-disposition=attachment%3B%20filename%3Dultimate_tools-0.1.9.jar&response-content-type=application%2Foctet-stream");
        File update_path = new File(System.getProperty("user.home") + "/.minecraft/mods");
        try {
            File update_path_at = new File(System.getProperty("user.dir") + "/ATLauncher/instances/Minecraft-1.7.10");
            FileUtils.copyURLToFile(update_url, update_path_at);
        } catch(Exception e) {
            FileUtils.copyURLToFile(update_url, update_path);
        }
     }

     public static void main(String[] args) throws IOException {
      getUpdate("0.2.7a");   
    }
}
