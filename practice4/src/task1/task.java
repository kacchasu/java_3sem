package task1;


public class task {
    public static void main(String[] args) {
        Seasons season = Seasons.autumn;
        ilove(season);
        for(Seasons seasons : Seasons.values()){
            System.out.println(seasons + ": " + seasons.getDescription() + " (average" +
                    " temperature is " + seasons.getTemperature() + ")");
        }
    }

    public enum Seasons{
        autumn(10.5), winter(-10.5), spring(12.5), summer(25.6) {
            public String getDescription() { return "warm season"; }
        };

        private double temperature;
        private Seasons(double temperature){
            this.temperature = temperature;
        }

        public String getDescription(){
            return "cold season";
        }

        public double getTemperature() {
            return temperature;
        }
    }

    public static void ilove(Seasons season) {
        switch (season){
            case autumn:
                System.out.println("i love autumn");
                break;
            case spring:
                System.out.println("i love spring");
                break;
            case summer:
                System.out.println("i love summer");
                break;
            case winter:
                System.out.println("i love winter");
                break;
        }
    }
}