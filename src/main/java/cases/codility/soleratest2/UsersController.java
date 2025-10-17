//package cases.codility.soleratest2;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.PathVariable;
//
//
//import java.util.Collections;
//import java.util.Map;
//
//@RestController
//public class UsersController {
//
//    /**
//     * Service responsible for handling user-related operations.
//     *
//     * This service is used within the UsersController to fetch user-specific information,
//     * such as the total number of items bought by a user. It acts as an intermediary
//     * between the controller and the underlying services or data access layers.
//     */
//    private final UsersService usersService;
//
//    public UsersController(UsersService usersService) {
//        this.usersService = usersService;
//    }
//
//    /**
//     * Retrieves the total number of items bought by a user.
//     *
//     * @param username the username of the user whose total items bought are to be retrieved
//     * @return a TotalItemsBoughtResponse object containing the total count of items bought by the user
//     */
//    @GetMapping("/users/{username}/items/total")
//    public @ResponseBody TotalItemsBoughtResponse totalItemsBought(@PathVariable String username) {
//        int total = usersService.getNumberOfItemsBought(username);
//        return new TotalItemsBoughtResponse(total);
//    }
//
//}