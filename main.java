import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class main {

    private static final Set<String> usedNames = new HashSet<String>();

    private final Random r = new Random();
    private String name;

    public String getName() {
        if(this.name == null) {
            byte[] chars = new byte[5];
            do {
                chars[0] = (byte) ('A' + r.nextInt(26));
                chars[1] = (byte) ('A' + r.nextInt(26));
                chars[2] = (byte) ('0' + r.nextInt(10));
                chars[3] = (byte) ('0' + r.nextInt(10));
                chars[4] = (byte) ('0' + r.nextInt(10));
                this.name = new String(chars);
            } while(usedNames.contains(this.name));
            usedNames.add(this.name);
        }
        return this.name;
    }

    public void reset() {
        this.name = null;
    }

}