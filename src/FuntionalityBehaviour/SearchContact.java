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
        for (int i = 0; i < person.getSize(); i++) {
            Client person1 = (Client) person.dataAtIndex(i);

            if (element.equals(person1.getFrsitName())) {
                match++;
                matchedContact.add(person1);
            }
        }
        if (match > 0) {
            System.out.println(match + " match found!");
        } else {
            System.out.println("NO RESULTS FOUND!");
        }
        view.printContact(matchedContact, match);

    }

}




    }


}
