package regular.expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    /*RegEx*/
    private static final String EMAIL_PATTERN
            = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
    private static final Pattern patternGmail = Pattern.compile(EMAIL_PATTERN);
    
    private static final String HOTMAIL_PATTERN
            = "^[a-zA-Z0-9._%+-]+@(hotmail|outlook)\\\\.com$";
    private static final Pattern patterHotmail = Pattern.compile(HOTMAIL_PATTERN);
    
    

    /*Métod for evaluate email @gmail*/
    public static boolean validateGmail(final String email) {
        Matcher matcher = patternGmail.matcher(email);
        return matcher.matches();
    }
    
    /*Métod for evaluate email @hotmail*/
    public static boolean validateHotmail(final String email) {
        Matcher matcher = patterHotmail.matcher(email);
        return matcher.matches();
    }
    
    public static void messageValidation(boolean isValidEmail){
        if(isValidEmail == true){
            System.out.println("Email Valido");
        }
        else{
            System.out.println("Email Invalido");
        }
    }
    
    /*-----------------------------------------------------*/
    
    private static final String ADDRESS_PATTERN =
        "^[0-9]+\\s+(\\p{L}+\\s+){1,2}(St\\.|Ave\\.|Rd\\.|Blvd\\.|Ln\\.)\\s*(\\p{L}+\\s+){1,3}(\\#\\s*[0-9]+)?$";

    private static final Pattern pattern = Pattern.compile(ADDRESS_PATTERN);

    public static boolean validateAdress(final String address) {
        Matcher matcher = pattern.matcher(address);
        return matcher.matches();
    }
    
    public static void messageValidationAdress(boolean isValidAddress){
        if(isValidAddress == true){
            System.out.println("Dirección postal correcta");
        }
        else{
            System.out.println("Dirección postal incorrecta");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        /*System.out.println("Ingrese email para direcciones gmail: ");
        String gmail = sc.nextLine();
        
        boolean isValidEmailGmail = RegularExpression.validateGmail(gmail);
        messageValidation(isValidEmailGmail);
        
        System.out.println("Ingrese email - para direcciones hotmail : ");
        String hotmail = sc.nextLine();
        
        boolean isValidEmailHotmail = RegularExpression.validateHotmail(hotmail);
        messageValidation(isValidEmailHotmail);
        */
        System.out.println("Ingrese direccion postal: ");
        String address = sc.nextLine();
        boolean isValidAdress = RegularExpression.validateAdress(address);
        messageValidationAdress(isValidAdress);
    }

}
