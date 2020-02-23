package FuntionalityBehaviour;

import Client.Client;
import LinkList.LinkedListDefinition;

import javax.swing.text.View;
import java.util.Scanner;

public class SearchContact {
    public void seach(LinkedListDefinition person) {
        View view = new View();
        Scanner tell = new Scanner(System.in);
        LinkedListDefinition<Client> matchedContact = new LinkedListDefinition();
        System.out.println("You could search for a contact from their first names:");
        String element = tell.nextLine();
        int match = 0;







    }


}
