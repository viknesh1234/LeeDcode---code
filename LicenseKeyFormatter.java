import java.util.Scanner;

public class LicenseKeyFormatter {

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-') {
                cleaned.append(Character.toUpperCase(c));
            }
        }

        StringBuilder result = new StringBuilder();
        int len = cleaned.length();
        int firstGroupLen = len % k;
        int index = 0;

        if (firstGroupLen != 0) {
            result.append(cleaned.substring(0, firstGroupLen));
            index = firstGroupLen;
            if (index < len) result.append("-");
        }

        while (index < len) {
            result.append(cleaned.substring(index, index + k));
            index += k;
            if (index < len) result.append("-");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the license key string:");
        String s = scanner.nextLine();

        System.out.println("Enter the group size k:");
        int k = scanner.nextInt();

        String formatted = licenseKeyFormatting(s, k);
        System.out.println("Formatted License Key: " + formatted);
    }
}
