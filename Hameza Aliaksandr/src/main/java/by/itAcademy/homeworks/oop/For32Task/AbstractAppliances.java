package by.itAcademy.homeworks.oop.For32Task;

    public class AbstractAppliances implements Appliances {
        public boolean isOn;
        private String model;
        private String brand;
        // Конструктор получающий значения.
        protected AbstractAppliances (boolean isOn, String model, String brand){
            this.isOn = isOn;
            this.model = model;
            this.brand = brand;
    }
    public String getModel(){
            return model;
    }
    public String getBrand(){
            return brand;
    }
    public void turnOn(){
            if (this.isOn == true){
                System.out.println("Прибор включен");
            }
            else {
                System.out.println("Прибор выключен");
            }
    }
        public void printInfo(){
        }
}
