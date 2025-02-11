package userNameFRQ;

public class Main {
    public static void main(String[] args) {
        UserName listOne = new UserName("john","smith");
        System.out.println(listOne);
        String[] used = {"harta","hartm","harty"};
        UserName person2 = new UserName("mary","hart");
        person2.setAvailableUserNames(used);
        System.out.println(person2);
    }
}
