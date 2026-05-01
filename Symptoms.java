package Smarthealthcare;

public class Symptoms {
    private final String details;

    public Symptoms(String details) {
        if (details == null || details.isBlank()) {
            throw new IllegalArgumentException("Symptoms cannot be empty");
        }
        this.details = details.trim();
    }

    public String getDetails() {
        return details;
    }
}
