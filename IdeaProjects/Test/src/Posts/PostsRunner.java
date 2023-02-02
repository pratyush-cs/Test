package Posts;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class PostsRunner {
    public static void main(String[] args) {
        PostsCall postsCall = new PostsCall();

        postsCall
                .getAllPosts()
                .stream()
                .collect(groupingBy(Post::getUserId, counting()))
                .forEach((k, v) -> System.out.println("UserId- " + k + " posted " + v + " posts."));

        System.out.println("\nUnique Uid");
        System.out.println(postsCall.
                getAllPosts().
                stream().
                map(Post::getUserId).distinct().count());

        System.out.println("\nUid 1 posts");
        System.out.println(postsCall.getPostsByUid(1).stream().count());

    }
}
