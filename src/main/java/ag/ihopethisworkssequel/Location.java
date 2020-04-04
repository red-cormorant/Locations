package ag.ihopethisworkssequel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Document(collection = "Locations")
public class Location {

    @Id
    private String id;
    private Map<String, List<Places>> places;

    public Location() {
        places = new LinkedHashMap<>();
    }

    public Location(Map<String, List<Places>> places) {
        this.places = places;
    }



    public String getId() {
        return id;
    }

    public Map<String, List<Places>> getPlaces() {
        return places;
    }


}
