package lords_college_java_training.src.main.java.org.example.module_2.control_flow;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=0; i<=4; i++) {

            if(i<2) continue;
            System.out.println("iteration:"+i);

            if(i==4) break;
        }
    }
}
