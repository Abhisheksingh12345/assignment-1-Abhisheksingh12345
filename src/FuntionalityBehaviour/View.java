package FuntionalityBehaviour;

import Client.Client;

public class View {
    public boolean viewList(LinkedListDefinitionClass person) {
        System.out.println("--------------Here are all your Contacts---------");
        int size = person.getSize();
        printContact(person, size);
        return true;
    }

    public void printContact(LinkedListDefinitionClass<Client> totalContact, int size) {
        for (int i = 0; i < size; i++) {


        }


    }


}
