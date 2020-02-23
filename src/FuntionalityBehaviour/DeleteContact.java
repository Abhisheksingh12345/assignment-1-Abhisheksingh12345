package FuntionalityBehaviour;

import Client.Client;
import LinkList.LinkedListDefinition;

import java.util.Scanner;

public class DeleteContact {
    public void removeContactFromList(LinkedListDefinition person) {
        Scanner tell = new Scanner(System.in);
        System.out.println("Here are all your contacts:");
        for (int i = 0; i < person.getSize(); i++) {
            Client person1 = (Client) person.dataAtIndex(i);
            System.out.println(i + 1 + ". " + person1.getFirstName() + " " + person1.getLastName());
        }


    }

}
