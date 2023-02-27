package schedular;

public enum Priority {
    LOW ("Низкий\033[92m"),
    MIDDLE("Средний\033[93m"),
    IMMIDIATE("Срочный\033[91m");
    private String tittle;

    Priority(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return tittle;
    }
}
