public class Issue55_ComputerComponentStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A23", "B23", "C23"};
        String target = new String("B23");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
