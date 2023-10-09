package com.teje.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Museum {
    public static void main(String[] args) {
        List<Art> museum = new ArrayList<>();

        Painting painting1 = new Painting("Starry Night", "Vincent van Gogh", "Impressionist masterpiece", "Oil");
        Painting painting2 = new Painting("Mona Lisa", "Leonardo da Vinci", "Portrait of Lisa Gherardini", "Oil");
        Painting painting3 = new Painting("The Persistence of Memory", "Salvador Dali", "Surrealist melting clocks", "Oil");

        Sculpture sculpture1 = new Sculpture("David", "Michelangelo", "Renaissance marble sculpture", "Marble");
        Sculpture sculpture2 = new Sculpture("The Thinker", "Auguste Rodin", "Bronze sculpture", "Bronze");

        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);

        // Shuffle the artworks in the museum
        Collections.shuffle(museum);

        // View all artworks in the museum
        for (Art artwork : museum) {
            artwork.viewArt();
        }
    }
}

