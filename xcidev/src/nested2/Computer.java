package nested2;

public class Computer {
    String model;
    static Computer instance;
    // 싱글톤처럼 실행되서, 컴퓨터가 여러대면 문제가 생길 수 있음
    // 그때는 static 빼면 됨

    public Computer(String model) {
        this.model = model;
        instance = this;
    }

    public void showModel() {
        System.out.println("Computer model: " + model);
    }

    public static class CPU {
        int cores;

        public CPU(int cores) {
            this.cores = cores;
        }

        public void showSpec() {
            System.out.println("CPU cores: " + cores);            
            System.out.println("Belongs to: " + Computer.instance.model);
        }
    }
}