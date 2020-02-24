package FuntionalityBehaviour;

public class View {
    public boolean viewList(LinkedListDefinitionClass person) {
        System.out.println("--------------Here are all your Contacts---------");
        int size = person.getSize();
        printContact(person, size);
        return true;
    }
}
