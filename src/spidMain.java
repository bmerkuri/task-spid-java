import Entities.Spid;
import Entities.Status;
import Entities.User;
import Service.SpidService;
import Service.UserService;

public class spidMain {
    public static void main(String[] args) {
        SpidService spidManager = new SpidService();
        UserService userManager = new UserService();

        try {
            // Creating a user
            User newUser = userManager.createUser("Bjoni", "Merkuri", "bmerkuri");
            System.out.println(newUser);

            // Creating a spid
            Spid newSpid = spidManager.createSpid(newUser);
            System.out.println(newSpid);

            // Aprove SPID with the id of 1
            spidManager.aproveSpid(1);

            // Display the list of spids
            spidManager.showList();

            // Showing SPID of a user
            System.out.println(userManager.showSpidOf("bmerkuri"));

            System.out.println("Modifying user with the user of 'bmerkuri'");
            // Modify user (Only the surname)
            userManager.modifyUser("bmerkuri", "bjoni", "Merkuri");

            // Modify spid
            System.out.println("Modify the SPID with the id of 1 ");
            spidManager.modifySpid(1, Status.READY_FOR_REVIEW);
            System.out.println(newSpid);
        } catch (Exception err) {
            System.out.println("There was an error!");
        }
    }

}
