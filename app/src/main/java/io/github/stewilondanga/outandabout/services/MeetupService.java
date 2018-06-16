package io.github.stewilondanga.outandabout.services;

import android.app.LauncherActivity;
import android.provider.CalendarContract;

import javax.security.auth.callback.Callback;
import io.github.stewilondanga.outandabout.Constants;
import io.github.stewilondanga.outandabout.models.Event;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by stewart on 6/16/18.
 */

public class MeetupService {
    private static OkHttpClient client = new OkHttpClient();

    public static void findEvents(String event, okhttp3.Callback callback) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.MEETUP_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.MEETUP_QUERY_PARAMETER, event);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .header("Authorization", "Bearer " + Constants.API_KEY)
                .url(url)
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public List<events> processResults(Response response) {
        List<events> Events = new ArrayList<>();

            try {
                String jsonData = response.body().string();

                if (response.isSuccessful()){
                    JSONObject ApiJSON = new JSONObject(jsonData);
                    JSONArray businessesJSON = ApiJSON.getJSONArray(jsonData);
                    JSONArray eventsJSON = ApiJSON.getJSONArray("events");

                    Type collectionType = new TypeToken<List<LauncherActivity.ListItem>> () {}.getType();
                    Gson gson = new GsonBuilder().create();
                    LauncherActivity.ListItem = gson.fromJson(eventsJSON.toString(), collectionType);
                }
            } catch (JSONException | NullPointerException | IOException e) {
                e.printStackTrace();
            }
                return LauncherActivity.ListItem;
    }
}
