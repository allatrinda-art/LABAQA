package lesson5;

public class Pen {
        private int inkContainerValue = 1000;         // сколько чернила в ручке
        private double sizeLetter = 1.0;// размер букв, которые пишутся ручкой
        private String color = "BLUE";// цвет ручки

        public Pen(int inkContainer) {
            this.inkContainerValue = inkContainer;
        }

        public Pen(int inkContainerValue, double sizeLetter) {
            this(inkContainerValue);
            this.sizeLetter = sizeLetter;
        }

        public Pen(int inkContainerValue, double sizeLetter, String color) {
            this(inkContainerValue, sizeLetter);
            this.color = color;
        }

        public String write(String word) {
            if (!isWork()) {
                return "";
            }
            double sizeOfWord = word.length()*sizeLetter;
            if(sizeOfWord<=inkContainerValue)
            {
                inkContainerValue -=sizeOfWord;
                return word;
            }
            String partOfWord = word.substring(0, inkContainerValue);
            inkContainerValue = 0;
            return partOfWord;
        }

        //Bug
        public String getColor() {
            return "BLUE";
        }

        public Boolean isWork() {
            return inkContainerValue > 0;
        }

        public void doSomethingElse() {
            System.out.println(color);
        }
}
