//package cases.codility.soleratest2;
//
//import com.codility.external.OrdersService;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UsersService {
//
//    /**
//     * Service responsible for handling operations related to user orders.
//     *
//     * The OrdersService is utilized by the UsersService to fetch and process order data
//     * for a specific user, such as retrieving the total number of items purchased by a user.
//     * It serves as the primary interface to interact with order-related data and actions.
//     */
//    private final OrdersService ordersService;
//
//    public UsersService(OrdersService ordersService) {
//        this.ordersService = ordersService;
//    }
//
//    /**
//     * Retrieves the total number of items bought by the specified user.
//     *
//     * @param username the username of the user whose total items bought are to be retrieved
//     * @return the total number of items bought by the user
//     */
//    public int getNumberOfItemsBought(String username) {
//        return ordersService.itemsBought(username).size();
//    }
//}
//
