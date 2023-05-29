import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularMedia extends JFrame{
    public JLabel PrimeiraNota;
    private JTextField textPrimeiraNota;
    public JLabel SegundaNota;
    private JTextField textSegundaNota;
    private JButton buttonCalcularMedia;
    private JTextField textMedia;
    public JLabel Media;
    private JTextField textSituacao;
    public JLabel Situacao;
    public JPanel formCalcularMedia;

    public CalcularMedia() {
    buttonCalcularMedia.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double valorMedia = 0d;
            valorMedia = (Double.valueOf(textPrimeiraNota.getText()) + Double.valueOf(textSegundaNota.getText())) / 2;
            textMedia.setText(valorMedia.toString());

            if (valorMedia < 7) {
                textSituacao.setText("Reprovado");
            }
                else if (valorMedia >= 7){
                    textSituacao.setText("Aprovado");
            }
        }
    });
}
}
