import controller.UserController;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserMain {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser(
                "M",
                "K",
                "m",
                "k",
                "mk@mk.pl",
                "123321234",
                LocalDate.of(2000, 01, 01),
                LocalDateTime.now()
        );
        uc.addUser(
                "A",
                "B",
                "j",
                "h",
                "mk@wp.pl",
                "123321567",
                LocalDate.of(2003, 11, 01),
                LocalDateTime.now()
        );
        uc.addUser(
                "A",
                "C",
                "n",
                "f",
                "rk@op.pl",
                "456321567",
                LocalDate.of(2005, 12, 03),
                LocalDateTime.now()
        );
        uc.addUser(
                "K",
                "Z",
                "v",
                "x",
                "anna@op.pl",
                "456321666",
                LocalDate.of(2004, 10, 04),
                LocalDateTime.now()
        );
        uc.getAllUsers();
    }
}
