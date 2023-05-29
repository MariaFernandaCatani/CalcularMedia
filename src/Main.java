public class Main {
    public static void main(String[] args) {
        CalcularMedia form = new CalcularMedia();
        form.setContentPane(form.formCalcularMedia);
        form.setVisible(true);
        form.setSize(500,230);
        form.setTitle("Calcular Média");
    }
}