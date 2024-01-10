/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class VirtualKeyboard {
    public static void main(String[] args) {
        // Crear ventana y panel
        JFrame frame = new JFrame("Teclado Virtual");
        JPanel panel = new JPanel();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Agregar componentes
        JTextArea textArea = new JTextArea();
        JButton[] buttons = new JButton[62]; // 62 teclas del alfabeto y números
        String[] pangramas = {"El veloz murciélago hindú comía feliz cardillo y kiwi.",
                                   "El veloz murciélago hindú comía feliz cardillo y kiwi.",
                                   "La cigüeña tocaba el saxofón detrás del palenque de paja.",
                                   "Jovencillo emponzoñado de whisky, qué mala figurota exhibes.",
                                   "La dulce niña oye el ruido del tambor.",
                                   "El jefe busca el éxito más que el bienestar físico.",
                                   "El pingüino Wenceslao hizo kilómetros bajo exhaustiva lluvia y frío, añoraba a su querido cachorro.",
                                   "El cadáver de Wamba, rey godo de España, fue exhumado y trasladado en una caja de zinc que pesó un kilo.",
                                   "El volcán de Cuzco, de juerga, se escapó y qué chispa, flamenca, le quemó el bigote.",
                                   "El exquisito vals, de paja, es dudoso, pero la paz, que es lo que importa, es segura.",
                                   "El hidalgo ve la figura de la paloma en el cristal.",
                                   "El zorro marrón salta sobre el perro perezoso.",
                                   "El queso, de un ávido saltamontes, es un manjar exquisito.",
                                   "El boxeador tailandés, de kilómetro y medio, puso nervioso al quijote con el zapato.",
                                   "El jorobado, con cierta emoción, dijo: ¡Vaya, qué sorpresa, que aún tengo blanca la barba!",
                                   "El rápido murciélago hindú comía feliz cardillo y kiwi.",
                                   "El pingüino Wenceslao hizo kilómetros bajo exhaustiva lluvia y frío, añoraba a su querido cachorro.",
                                   "El veloz murciélago hindú comía feliz cardillo y kiwi.",
                                   "La cigüeña tocaba el saxofón detrás del palenque de paja.",
                                   "Jovencillo emponzoñado de whisky, qué mala figurota exhibes.",
                                   "La dulce niña oye el ruido del tambor.",
                             };
        Random random = new Random();
        int pangramaIndex = random.nextInt(pangramas.length);
        String pangrama = pangramas[pangramaIndex];
        JLabel pangramaLabel = new JLabel(pangrama);
        boolean[] teclasCorrectas = new boolean[62];

        // Configurar botones
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + (char)(i + 'A' - 1));
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    char tecla = buttons[i].getText().charAt(0);
                    if (pangrama.indexOf(tecla) != -1) {
                        // Tecla correcta
                        textArea.append(buttons[i].getText());
                        teclasCorrectas[i] = true;
                    } else {
                        // Tecla incorrecta
                        teclasCorrectas[i] = false;
                    }
                }
            });
        }

    }
}