package ag.ihopethisworkssequel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Document(collection = "Places")
public class Place {

    private String name;
    private List<SportDetails> sports;

    public Place(String name, List<SportDetails> sports) {
        this.name = name;
        this.sports = sports;
    }

    public Place() {
        this.sports = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SportDetails> getSports() {
        return sports;
    }

    public void setSports(List<SportDetails> sports) {
        this.sports = sports;
    }
}
