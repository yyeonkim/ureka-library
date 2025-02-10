import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;           // 사용자 이름
    private String id;             // 사용자 id

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getId() {
    	return id;
    }
}
