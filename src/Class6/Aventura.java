package Class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aventura {
    public static void main(String[] args) throws IOException {
        Aventura.instructions();
        Aventura.introStory();
    }

    private static void instructions() {
        System.out.println("Estás a punto de aventurarte en una mágica historia, conocerás las puertas, los pasajes\n" +
                "y te adentrarás a los secretos que oculta el majestuoso y eterno castillo Shadowgate.\nEstás listo?" +
                " Primero debes conocer la modalidad de la aventura, vas a sumergirte en una historia, cada vez\n" +
                "que leas una parte de esta mágica historia, deberás escoger tu propio camino, para ello deberás\n" +
                "escribir con tu teclado los números 1, 2, 3, o 4 dependiendo la cantidad de decisiones que\n" +
                "precises escoger. Te aconsejo que escojas sabiamente tus decisiones. Buena suerte!\n\n");
    }

    private static Integer readTyping() throws IOException {
        Integer num = 0;
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        return num = Integer.parseInt(strNum);
    }

    private static Integer pathValidation2(Integer num) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        Integer result = 0;

        while(num <= 0 || num > 2) {
            if(num == 0 || num > 2) {
                System.out.println("Please, type a number between \"1\" and \"2\":");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            } else {
                System.out.println("Please, type a positive number!");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            }
        }
        return result = num;
    }

    private static Integer pathValidation3(Integer num) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        Integer result = 0;

        while(num <= 0 || num > 3) {
            if(num == 0 || num > 3) {
                System.out.println("Please, type a number between \"1\" and \"3\":");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            } else {
                System.out.println("Please, type a positive number!");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            }
        }
        return result = num;
    }

    private static Integer pathValidation4(Integer num) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        Integer result = 0;

        while(num <= 0 || num > 4) {
            if(num == 0 || num > 4) {
                System.out.println("Please, type a number between \"1\" and \"4\":");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            } else {
                System.out.println("Please, type a positive number!");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            }
        }
        return result = num;
    }

    private static void introStory() throws IOException {
        System.out.println("Estás parado frente a las majestuosas puertas del antiguo castillo de Shadowgate. El \n" +
                "viento sopla con fuerza, silbando a través de las grietas de la puerta de madera. La sensación de \n" +
                "peligro y misterio se aferra al aire. Eres el último de los Grandes Hechiceros, el último \n" +
                "descendiente de una larga línea de magos poderosos. Tu misión es entrar en el castillo y encontrar \n" +
                "el Amuleto del Sol, un artefacto legendario que te permitirá deshacerte de un antiguo mal que \n" +
                "amenaza con sumir al mundo en la oscuridad eterna.\n¿Cómo decides entrar al castillo?\n" +
                "\n" +
                "1. Empujas con fuerza la pesada puerta principal para abrirla.\n" +
                "2. Buscas una entrada secreta alrededor del castillo.\n" +
                "3. Llamas a la puerta principal y esperas a que alguien te abra.\n" +
                "4. Estás lleno de dudas y decides no entrar al castillo.");

        Integer num = Aventura.readTyping();
        num = Aventura.pathValidation4(num);

        if(num >= 1 && num <= 3) {
            Aventura.storyPathA123(num);
        } else {
            Aventura.storyPathA4();
        }
    }

    private static void storyPathA123(Integer num) throws IOException {
        if(num == 1) {
                System.out.println("Empujas con todas tus fuerzas la puerta principal y logras abrir un camino \n" +
                        "hacia el oscuro interior del castillo. La puerta cruje y protesta mientras te adentras en \n" +
                        "el vestíbulo polvoriento.");
        } else if(num == 2) {
                System.out.println("Exploras cuidadosamente los alrededores del castillo y encuentras una pequeña \n" +
                        "abertura oculta en el muro. Con cuidado, te deslizas por ella y apareces en una sala \n" +
                        "desconocida, completamente alejado de la entrada principal.");
        } else {
            System.out.println("das unos golpes enérgicos a la puerta principal y esperas pacientemente. \n" +
                    "Después de unos momentos de silencio inquietante, la puerta se abre lentamente, revelando \n" +
                    "un hombre de aspecto extraño con ojos penetrantes. Te invita a entrar y te guía a \n" +
                    "través de un pasadizo secreto.");
        }

        System.out.println("\nAhora te encuentras en un corredor oscuro y frío. Hay varias puertas a tu alrededor. \n" +
                "¿Qué haces?\n" +
                "1. Abres la puerta más cercana a la izquierda.\n" +
                "2. Avanzas por el corredor y abres la puerta al final.\n" +
                "3. Inspeccionas la puerta de la derecha en busca de pistas.\n" +
                "4. Decides regresar al exterior y abandonar el castillo.");

        num = Aventura.readTyping();
        num = Aventura.pathValidation4(num);

        if(num >= 1 && num <= 3) {
            Aventura.storyPathB123(num);
        } else {
            Aventura.storyPathB4();
        }
    }

    private static void storyPathA4() {
        System.out.println("Decides que el castillo es demasiado peligroso y decides no entrar. Retrocedes\n" +
                " y te marchas, sintiendo una mezcla de alivio y duda mientras abandonas tu misión.\n" +
                "De repente en el bosque escuchas un ruido extraño, comienzas a dudar de tu existencia y de\n" +
                "tu desición con haberte adentrado al bosque.\n" +
                "Un ser extraño se interpone ante ti, hablando una lengua extraña que no logras comprender\n" +
                "debido al miedo que invade todo tu cuerpo. Este ser extraño se avalanza ante ti...\n" +
                "...Fin de tu historia.");
    }

    private static void storyPathB123(Integer num) {
        if(num == 1) {
            System.out.println("Abres la puerta más cercana a la izquierda y entras en una habitación oscura. Un \n" +
                    "haz de luz débil atraviesa la ventana y revela un pedestal con un libro antiguo. Al acercarte,\n" +
                    " te das cuenta de que el libro está escrito en un idioma que no puedes entender.");
        } else if(num == 2) {
            System.out.println("Avanzas por el corredor y abres la puerta al final. Entra una ráfaga de aire frío,\n" +
                    " revelando una sala grande y desolada con un trono en el centro. Te acercas cautelosamente y \n" +
                    "encuentras una corona brillante sobre el asiento.");
        } else {
            System.out.println("Examinas la puerta de la derecha y notas algunas marcas extrañas talladas en ella.\n" +
                    " Al tocar una de las marcas, sientes una descarga de energía mágica. La puerta se abre \n" +
                    "revelando una cámara secreta llena de tesoros antiguos.");
        }
    }

    private static void storyPathB4() {
        System.out.println("Abandonas el castillo y te retiras, dejando atrás la búsqueda del Amuleto del Sol. \n" +
                "Quizás otro valiente aventurero pueda enfrentar el desafío.\n" +
                "...Fin de tu aventura.");
    }
}
