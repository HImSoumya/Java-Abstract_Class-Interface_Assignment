// Design an interface `Login` with method `authenticate()`. Implement classes `GoogleLogin`, `FacebookLogin`, and `OTPLogin`.

interface Login {
    void authenticate();
}

class GoogleLogin implements Login {
    @Override
    public void authenticate() {
        System.out.println("Logged in Successful using Gamil and Password...");
    }
}

class FacebookLogin implements Login {
    @Override
    public void authenticate() {
        System.out.println("Logged in Successful using FaceBook Username and Password...");
    }
}

class OTPLogin implements Login {
    @Override
    public void authenticate() {
        System.out.println("Logged in Successful using OTP sent to your registered mobile number...");
    }
}

public class Main {

    public static void main(String[] args) {
        Login user;

        user = new GoogleLogin();
        user.authenticate();

        user = new FacebookLogin();
        user.authenticate();

        user = new OTPLogin();
        user.authenticate();
    }
}