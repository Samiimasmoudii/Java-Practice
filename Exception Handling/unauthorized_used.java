import java.util.List;

class Answer {

    /***************************************************
     * Change these boolean values to control whether you see
     * the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = true;
    static boolean showHints = true;

    static List<String> authorizedUsers = List.of("techwizard87", "codeNinja123", "dataQueen99", "cyberPioneer",
            "byteMaster", "algorithmGuru", "cloudSurfer55", "pixelPilot", "javaJedi", "scriptScribe");
    static String accessDeniedMessage = "Access denied";

    static void checkAccess(String username) throws UnauthorizedException {
        // Check if the username is in the list
        if (!authorizedUsers.stream().anyMatch(user -> user.equals(username))) {
            throw new UnauthorizedException(accessDeniedMessage);
        }
    }
}

// Do not change this class
class UnauthorizedException extends Exception {
    public UnauthorizedException() {
        this("Unauthorized to access");
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}
