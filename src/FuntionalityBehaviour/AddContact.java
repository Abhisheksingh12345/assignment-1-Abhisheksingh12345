package FuntionalityBehaviour;

import Client.Client;

import java.util.Scanner;

public class AddContact {
    public Client addContact() {
        Client client = new Client();
        Scanner tell = new Scanner(System.in);
        System.out.println("You have chosen to add a new Contact: ");
        boolean finish = false;
        System.out.println("Please enter the Name of the Person: ");
        System.out.print("First Name : ");
        client.setFirstName(tell.nextLine());
        System.out.print("Last Name : ");
        client.setLastName(tell.nextLine());
        LinkedListDefinition<Long> contactNumber=new LinkedListDefinition<Long>();
        while (finish!=true){

        }
    }
}
