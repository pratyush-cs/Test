package Posts;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class PostsCall {
    final static String ALL_POSTS_URL;
    final static String POST_BY_UID;

    static {

        ALL_POSTS_URL = ("https://jsonplaceholder.typicode.com/posts");
        POST_BY_UID = ("https://jsonplaceholder.typicode.com/posts?userId=");

    }


    public List<Post> getAllPosts() {
        try {
            URL allPostsurl = new URL(ALL_POSTS_URL);
            HttpURLConnection urlConnection = (HttpURLConnection) allPostsurl.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int responseCode = urlConnection.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("ResponseCode: " + responseCode);
            } else {
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setPrettyPrinting();
                Gson gson = gsonBuilder.create();

                List<Post> postList = gson.fromJson(new BufferedReader(new InputStreamReader(allPostsurl.openStream())),
                        new TypeToken<List<Post>>() {
                        }.getType());

                return postList;

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Post> getPostsByUid(int uid) {
        try {
            URL postsByUidUrl = new URL(POST_BY_UID + String.valueOf(uid));
            HttpURLConnection urlConnection = (HttpURLConnection) postsByUidUrl.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int responseCode = urlConnection.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("ResponseCode: " + responseCode);
            } else {
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setPrettyPrinting();
                Gson gson = gsonBuilder.create();

                List<Post> postList = gson.fromJson(new BufferedReader(new InputStreamReader(postsByUidUrl.openStream())),
                        new TypeToken<List<Post>>() {
                        }.getType());

                return postList;

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
