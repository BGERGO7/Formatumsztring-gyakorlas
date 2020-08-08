public class formatumsztring_gyakorlas {
    public static void main(String[] args) {
        System.out.printf("%s%_%s", ">>", 7, "<<\n");
        System.out.printf("%s%____%s", ">>", 7, "<<\n");
        System.out.printf("%s%_____%s", ">>", 7, "<<\n");
        System.out.printf("%s%_____%s", ">>", 7, "<<\n");
        System.out.printf("%s%__%s", ">>", 7, "<<\n");
        System.out.printf("%s%__%s", ">>", -7, "<<\n");
        System.out.printf("%s%__%s", ">>", -7, "<<\n");
        System.out.printf("%s%______%s", ">>", 7.0, "<<\n");
        System.out.printf("%s%_%s", ">>", "Hello", "<<\n");
        System.out.printf("%s%.1f%s", ">>", 'x', "<<\n");
        System.out.printf("%s%.1f%s", ">>", 'x', "<<\n");
    }
}