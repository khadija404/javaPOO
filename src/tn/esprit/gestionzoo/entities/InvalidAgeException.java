package tn.esprit.gestionzoo.entities;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        System.out.println(message);
    }
}
