public class ultimo {
    public class HorasEmPalavras {
        public static void main(String[] args) {
            //coloquei horas fixas para simplificar o código
            int horas = 8;
            int minutos = 38 ;
            System.out.println(getTimeName(horas, minutos));
        }

        public static String getTimeName(int hours, int minutes) {
            String timeName = "";
            if (minutes == 0) {
                timeName = getHourName(hours) + " em ponto";
            } else if (minutes == 15) {
                timeName = "um quarto para " + getHourName(hours+1);
            } else if (minutes == 30) {
                timeName = getHourName(hours) + " e meia";
            } else if (minutes == 45) {
                timeName = "um quarto para " + getHourName(hours+1);
            } else if (minutes < 30) {
                timeName = "passam " + minutes + " minutos das " + getHourName(hours);
            } else if (minutes < 60) {
                timeName = "faltam " + (60 - minutes) + " minutos para " + getHourName(hours+1);
            }
            return timeName;
        }

        public static String getHourName(int hours) {
            String[] hourNames = {
                    "uma", "duas", "três", "quatro", "cinco", "seis",
                    "sete", "oito", "nove", "dez", "onze", "doze"
            };
            if (hours >= 1 && hours <= 12) {
                return hourNames[hours-1];
            } else {
                return "horário inválido";
            }
        }
    }

}
