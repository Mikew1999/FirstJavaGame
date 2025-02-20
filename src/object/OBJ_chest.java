package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_chest extends SuperObject {

    public OBJ_chest() {
        
        name = "chest";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/chest.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
