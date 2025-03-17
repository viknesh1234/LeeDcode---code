import java.util.HashSet;
import java.util.Set;

class uniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            // Remove everything after '+'
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }

            // Remove all dots from the local part
            local = local.replace(".", "");

            // Construct the cleaned email and add it to the set
            String cleanedEmail = local + "@" + domain;
            uniqueEmails.add(cleanedEmail);
        }

        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        uniqueEmails solution = new uniqueEmails();
        String[] emails = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };
        
        System.out.println("Unique emails: " + solution.numUniqueEmails(emails));
    }
}
