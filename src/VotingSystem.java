//Write a program to create a custom exception InvalidAgeException for voting eligibility.
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class VotingSystem {
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to vote.");
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
/*
output:
Exception: Age must be at least 18 to vote.
 */