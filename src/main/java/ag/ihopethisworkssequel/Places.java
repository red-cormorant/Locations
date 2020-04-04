package ag.ihopethisworkssequel;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Places")
public class Places {

    @Id
    private String id;
    private List<Place> places;

    public Places() {
        places = new ArrayList<>();
    }

    public Places(List <Place> places) {
        this.places = places;
    }

    public String getId() {
        return id;
    }

    public List<Place> getPlaces() {
        return places;
    }
}
