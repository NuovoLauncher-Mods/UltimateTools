package io.nl.ut.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import com.google.gson.Gson;
import org.apache.commons.lang3.ArrayUtils;
import io.nl.ut.classes.Update;

public class UpdateChecker {
    
    public static String[] getUpdateJson() throws IOException {
        URL update_url = new URL("https://pastebin.com/raw/uR0qeyiG");
        URLConnection update_url_con = update_url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(update_url_con.getInputStream()));
        String inputLine;
        String[] update_info_return = {};
        while ((inputLine = in.readLine()) != null) {
            Gson gson = new Gson();
            Update update_info = gson.fromJson(inputLine, Update.class);
            update_info_return = ArrayUtils.add(update_info_return, update_info.getVersion());
            update_info_return = ArrayUtils.add(update_info_return, update_info.getForgeVersion());
        }
        in.close();
        return update_info_return;
    }
}
