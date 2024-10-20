package J05027;

public class Teacher {
    String ID, name, subject;
    public static int id = 1;

    Teacher(String name, String subject){
        this.ID = "GV" + String.format("%02d", id++);
        this.name = name;
        this.subject = subject;
    }

    public static String convert(String S){
        StringBuilder ans = new StringBuilder();
        String[] tmp = S.trim().split("\\s+");
        for (String x : tmp){
            ans.append(Character.toUpperCase(x.charAt(0)));
        }
        return ans.toString();
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + convert(subject);
    }
}