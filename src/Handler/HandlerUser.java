package Handler;

import User.User;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class HandlerUser {

    public String handleAllUser(List<User> list) {
        Stream<User> allUser = list.stream();
        AtomicInteger count = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();
        allUser.forEach(user -> sb.append(count.getAndIncrement())
                .append(") ").append(user)
                .append("\n"));
        return sb.toString();
    }

    public String handleUserFilterWith(List<User> list) {
        AtomicInteger count = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();
        Stream<User> filteredUser = list.stream().filter(user ->
                user.getEmail().contains("123"));
        filteredUser.forEach(user ->
                sb.append(count.getAndIncrement())
                        .append(") ").append(user)
                        .append("\n"));

        return sb.toString();
    }

    public String handleUserFilterWithout(List<User> list) {
        AtomicInteger count = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();
        Stream<User> filteredUser = list.stream().filter(user ->
                !user.getEmail().contains("123"));
        filteredUser.forEach(user ->
                sb.append(count.getAndIncrement())
                        .append(") ").append(user)
                        .append("\n"));

        return sb.toString();
    }
}
