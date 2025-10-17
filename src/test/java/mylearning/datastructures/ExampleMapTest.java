package mylearning.datastructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleMapTest {

    /**
     * Tests for the {@code getFrequency} method in the {@code ExampleMap} class.
     */

    @Test
    void testGetFrequency_ValidWordExistsInMap() {
        // Arrange
        Map<String, Integer> freq = new HashMap<>();
        freq.put("apple", 3);
        String word = "apple";

        // Act
        int result = ExampleMap.getFrequency(freq, word);

        // Assert
        assertEquals(3, result);
    }

    @Test
    void testGetFrequency_ValidWordNotInMap() {
        // Arrange
        Map<String, Integer> freq = new HashMap<>();
        freq.put("apple", 3);
        String word = "banana";

        // Act
        int result = ExampleMap.getFrequency(freq, word);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void testGetFrequency_NullMap() {
        // Arrange
        Map<String, Integer> freq = null;
        String word = "apple";

        // Act
        int result = ExampleMap.getFrequency(freq, word);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void testGetFrequency_NullWord() {
        // Arrange
        Map<String, Integer> freq = new HashMap<>();
        freq.put("apple", 3);
        String word = null;

        // Act
        int result = ExampleMap.getFrequency(freq, word);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void testGetFrequency_BlankWord() {
        // Arrange
        Map<String, Integer> freq = new HashMap<>();
        freq.put("apple", 3);
        String word = "   ";

        // Act
        int result = ExampleMap.getFrequency(freq, word);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void testGetFrequency_CaseInsensitiveWord() {
        // Arrange
        Map<String, Integer> freq = new HashMap<>();
        freq.put("apple", 3);
        String word = "APPLE";

        // Act
        int result = ExampleMap.getFrequency(freq, word);

        // Assert
        assertEquals(3, result);
    }

    @Test
    void testCountFrequencies_ValidInput() {
        // Arrange
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "banana");

        // Act
        Map<String, Integer> result = ExampleMap.countFrequencies(words);

        // Assert
        assertEquals(2, result.get("apple"));
        assertEquals(3, result.get("banana"));
        assertEquals(1, result.get("orange"));
    }

    @Test
    void testCountFrequencies_EmptyList() {
        // Arrange
        List<String> words = List.of();

        // Act
        Map<String, Integer> result = ExampleMap.countFrequencies(words);

        // Assert
        assertEquals(0, result.size());
    }

    @Test
    void testCountFrequencies_NullList() {
        // Arrange
        List<String> words = null;

        // Act
        Map<String, Integer> result = ExampleMap.countFrequencies(words);

        // Assert
        assertEquals(0, result.size());
    }

    @Test
    void testCountFrequencies_NullOrBlankWords() {
        // Arrange
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add(null);
        words.add("   ");
        words.add("banana");
        words.add("apple");
        // Act
        Map<String, Integer> result = ExampleMap.countFrequencies(words);

        // Assert
        assertEquals(2, result.get("apple"));
        assertEquals(1, result.get("banana"));
        assertEquals(2, result.size());
    }

    @Test
    void testCountFrequencies_CaseInsensitiveWords() {
        // Arrange
        List<String> words = List.of("apple", "Apple", "APPLE", "banana", "BANANA");

        // Act
        Map<String, Integer> result = ExampleMap.countFrequencies(words);

        // Assert
        assertEquals(3, result.get("apple"));
        assertEquals(2, result.get("banana"));
    }
}