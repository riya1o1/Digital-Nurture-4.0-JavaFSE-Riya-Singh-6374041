package builderpatternexample;

public class Computer {

    private final String CPU;
    private final String RAM;
    private final String storage;
    
    
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;

    }
    public static class Builder {
        private final String CPU;
        private final String RAM;
        private String storage;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
    @Override
    public String toString() {
        return "Computer Configuration:\n" +
               "CPU: " + CPU + "\n" +
               "RAM: " + RAM + "\n" +
               "Storage: " + storage;
    }
}
     