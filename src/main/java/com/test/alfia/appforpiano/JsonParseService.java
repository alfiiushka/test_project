package com.test.alfia.appforpiano;

import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.GZIPInputStream;

@Service
public class JsonParseService{

    public List<RequestViewDTO> getItems (String url)throws IOException, JSONException {
        String json=readJsonFromUrl(url);;
        Gson g = new Gson();
        return g.fromJson(json, RequestViews.class).getItems();
    }

    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    private String readJsonFromUrl(String url) throws IOException{
        InputStream is = new URL(url).openStream();
        GZIPInputStream gis = new GZIPInputStream(is);
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(gis, Charset.forName("UTF-8")));
            return readAll(rd);
        } finally {
            is.close();
        }
    }
}
