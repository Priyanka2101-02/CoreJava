/*
 * class definitions:class Source:
 visibility: public
 method definition:
 validate(String username, String password): method to authenticate username
and password(Use custom values for username and password for authentication)
 return type: boolean

Create a Source class and implement below given method:
• validate(String username, String password): Use lambda expression to authenticate
username and password(Use custom values "ABC" for username and "DEF" as password for
authentication). Return true if authentication is successful else return false.
Implement using Lambda expressions

 Do not use any for loops or other control structures.
• Use the stream API methods for your implementations, else the test-cases might fail.

input:
Alexa coded123

output:
false

 */


class Source {
    private static final String VALID_USERNAME = "ABC";
    private static final String VALID_PASSWORD = "DEF";

    public static boolean validate(String username, String password) {
        return VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password);
    }

    public static void main(String[] args) {
        String username = "Alexa";
        String password = "coded123";
        
        boolean isAuthenticated = validate(username, password);
        System.out.println(isAuthenticated);
    }
}

