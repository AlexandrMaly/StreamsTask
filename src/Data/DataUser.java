package Data;

import User.User;

import java.util.Arrays;
import java.util.List;

public class DataUser {

    public List<User> getUser() {
        return Arrays.asList(
                new User("Oleksandr", "Oleksandr123@gmail.com"),
                new User("Oleksiy", "OdesaMyCyti@gmail.com"),
                new User("Mikhail", "KharkivForever12@gmail.com"),
                new User("Andrey", "123Antoshka123@gmail.com"),
                new User("Maksim", "Maksiiiim112233@gmail.com")
        );
    }
}
