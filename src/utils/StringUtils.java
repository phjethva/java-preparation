package utils;

public final class StringUtils {
    private StringUtils() {
    }

    public static void getGFGHeader(String name) {
        String message = name
                .substring(3)
                .replaceAll("([A-Z][a-z]+)", " $1") // Words beginning with UC
                .replaceAll("([A-Z][A-Z]+)", " $1") // "Words" of only UC
                .replaceAll("([^A-Za-z ]+)", " $1") // "Words" of non-letters
                .trim();
        System.out.println(message + " Example");
        System.out.println("----------");
    }
}