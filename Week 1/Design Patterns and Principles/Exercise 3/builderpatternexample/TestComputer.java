package builderpatternexample;

public class TestComputer {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Computer:\n" + basicComputer);
        System.out.println("-----------------------------------");

        Computer highEndComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .build();

        System.out.println("High-End Computer:\n" + highEndComputer);
    }
}