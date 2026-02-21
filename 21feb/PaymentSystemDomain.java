class Payment {
    public void processPayment() {
        System.out.println("processing payment");
    }
    public void getPaymentDetails() {
        System.out.println("payment details");
    }
}
class CreditCardPayment extends Payment {
    private String cardNumber;
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment() {
        System.out.println("credit card payment processing : " + cardNumber);
    }
    @Override
    public void getPaymentDetails() {
        System.out.println("Credit Card Payment Details");
        System.out.println(cardNumber);
    }
}
class PayPalPayment extends Payment {
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void processPayment() {
        System.out.println(" PayPal payment Processing : " + emailAddress);
    }

    @Override
    public void getPaymentDetails() {
        System.out.println("PayPal Payment Details");
        System.out.println(emailAddress);
    }
}
public class PaymentSystemDomain {
    public static void main(String[] args) {
        CreditCardPayment creditCard = new CreditCardPayment();
        creditCard.setCardNumber("1234-1069-9669-2167");
        creditCard.processPayment();
        creditCard.getPaymentDetails();
        System.out.println();
        PayPalPayment paypal = new PayPalPayment();
        paypal.setEmailAddress("Gradiousphase2@gmail.com");
        paypal.processPayment();
        paypal.getPaymentDetails();
        System.out.println();
       Payment[] payments = {creditCard, paypal};
        System.out.println("PaymentMethods:");
        for (Payment p : payments) {
            p.processPayment();//overriding by calling bot instancese
            p.getPaymentDetails();
        }
    }
}