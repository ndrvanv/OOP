package schedular.modele;

public enum Priority {

    LOW("Низкий\033[92m"),
    MIDDLE("Средний\033[93m"),
    IMMIDIATE("Важный\033[91m");
    public String tittle;

    Priority(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return tittle;
    }
}
