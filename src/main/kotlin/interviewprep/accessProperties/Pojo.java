package interviewprep.accessProperties;

public class Pojo {
    public static void main(String[] args) {
        Aman.no = 99;
        System.out.println(Aman.no);
    }
}

class Aman {
    static int no = 8;
}
