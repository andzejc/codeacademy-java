package task1;

import task1.model.Person;

public class TaskImpl {

    public static void init() {
        ListBox<String> texts = new StringListBox();
        texts.addElement("Labas");
        texts.getElements().forEach(text ->
                System.out.println(text)
        );

        ListBox<Person> person = new PersonListBox();
        Person personObj = new Person();
        personObj.setName("Andrius");
        person.addElement(personObj);
        person.getElements().forEach(p ->
                System.out.println(p.getName())
        );
    }
}
