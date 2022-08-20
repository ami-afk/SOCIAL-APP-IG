package ir.saman.socia;

import ir.saman.socia.exception.SociaException;
import ir.saman.socia.model.Post;
import ir.saman.socia.model.User;
import ir.saman.socia.model.dao.*;
import ir.saman.socia.service.IdGenerator;
import ir.saman.socia.service.PostManager;
import ir.saman.socia.service.UserManager;

import java.util.Collection;
import java.util.Scanner;

public class Runner {

    private static User user = null;
    private static Scanner scanner;
    private static UserManager userManager;
    private static PostManager postManager;


    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        IdGenerator<User> userIdGenerator = new IdGenerator<>(userDao);

        FollowDao followDao = new FollowDao();
        PostDao postDao = new PostDao();
        CommentDao commentDao = new CommentDao();
        LikeDao likeDao = new LikeDao();


        userManager = new UserManager(userDao, followDao, userIdGenerator);
        postManager = new PostManager(postDao, commentDao, likeDao, followDao);

        scanner = new Scanner(System.in);

        while (true) {
            showMainMenu();

            int choose = scanner.nextInt();
            try {
                if (choose == 1) {
                    login();
                } else if (choose == 2) {
                    register();
                } else if (choose == 3) {
                    break;
                }

                showUserFeeds();
            } catch (SociaException e) {
                System.out.println(e.getErrorType().getHelpDescription());
                //e.printStackTrace();
            }


        }



    }

    private static void showMainMenu() {
        System.out.println("==================");
        System.out.println("1- login");
        System.out.println("2- register");
        System.out.println("3- exit");
    }

    private static void login() {
        System.out.println("enter your username:");
        String username = scanner.next();

        System.out.println("enter your password:");
        String password = scanner.next();

        user = userManager.login(username, password);
    }

    private static void register() {
        System.out.println("enter your username:");
        String username = scanner.next();

        System.out.println("enter your password:");
        String password = scanner.next();

        user = userManager.register(username, password);
    }

    private static void showUserFeeds() {
        Collection<Post> userFeed = postManager.getUserFeed(user.getId());

        System.out.println("++++++++++++++++++");
        userFeed.forEach(System.out::println);
        System.out.println("++++++++++++++++++");

        System.out.println("select post id to view");
        scanner.nextInt();
    }

}
