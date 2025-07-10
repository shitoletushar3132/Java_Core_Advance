package Basic;

public class SubStrings {

    public static void main(String[] args) {
        // .substring() = a method used to extract a portion of a string
        // string.substring(start,end)

        String email = "bro123@gmail.com";
        String userName = email.substring(0,email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1);
        System.out.println(userName);
    }
}
