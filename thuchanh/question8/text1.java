package thuchanh.question8;

public class text1 {
    String str;
    String[] words = new String[100];

    public checkString(String str) {
        this.str = str;
    }

    public boolean checkDoiXung(String str) {
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }
        if (str.equals(reverseString)) {
            return true;
        } else {
            return false;
        }

    }

    public void checkBolean(String str) {
        if (checkDoiXung(str) == true) {
            System.out.println("day la chuoi doi xung : " + str);
        } else {
            System.out.println("day khong phai la chuoi doi xung " + str);
        }
    }
}
