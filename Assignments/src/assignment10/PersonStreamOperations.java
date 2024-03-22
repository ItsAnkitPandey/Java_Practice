package assignment10;

import java.util.*;
import java.util.stream.Collectors;

public class PersonStreamOperations {

    public static Optional<List<String>> getPersonListSortedByNameInUpperCase(List<String> personList) {
        if (personList == null || personList.isEmpty()) {
            return Optional.empty();
        }
        List<String> sortedList = personList.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        return Optional.of(sortedList);
    }

    public static Set<String> getDistinctPersonNamesSortedInDescendingOrder(List<String> personList) {
        if (personList == null || personList.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> distinctSortedSet = personList.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        return distinctSortedSet;
    }

    public static String searchPerson(List<String> personList, String nameToSearch) {
        if (personList == null || nameToSearch == null || nameToSearch.isEmpty()) {
            return "List or name to search cannot be null";
        }
        boolean found = personList.stream()
                .anyMatch(name -> name.equalsIgnoreCase(nameToSearch));
        return found ? "Person found" : "Person not found";
    }

    public static List<String> getPersonListSortedByLengthWithNameLengthGreaterThanFive(List<String> personList) {
        if (personList == null || personList.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> filteredAndSorted = personList.stream()
                .filter(name -> name.length() > 5)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        return filteredAndSorted;
    }

    public static String getPersonByMaxAge(Map<String, Integer> ageMap) {
        if (ageMap == null || ageMap.isEmpty()) {
            return "Give proper input not null";
        }
        Map.Entry<String, Integer> maxEntry = ageMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        if (maxEntry != null) {
            return maxEntry.getKey();
        } else {
            return "No person with maximum age found";
        }
    }

    public static void main(String[] args) {
        // Sample Input and testing methods
        List<String> personList = Arrays.asList("Kamala", "Priyanka", "Gautham", "Moses");
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Gautham", 30);
        ageMap.put("Latha", 56);
        ageMap.put("Punith", 45);
        
        System.out.println("Sample input: " + personList);

        Optional<List<String>> sortedListOptional = getPersonListSortedByNameInUpperCase(personList);
        sortedListOptional.ifPresent(sortedList -> System.out.println("Sorted List: " + sortedList));

        Set<String> distinctSortedSet = getDistinctPersonNamesSortedInDescendingOrder(personList);
        System.out.println("Distinct Sorted Set: " + distinctSortedSet);

        String searchResult = searchPerson(personList, "Gautham");
        System.out.println("Searched for Gautham ");
        System.out.println("Search Result: " + searchResult);

        List<String> filteredList = getPersonListSortedByLengthWithNameLengthGreaterThanFive(personList);
        System.out.println("Filtered and Sorted List: " + filteredList);

        String maxAgePerson = getPersonByMaxAge(ageMap);
        System.out.println("Person Age: " + ageMap);
        System.out.println("Person with Maximum Age: " + maxAgePerson);
    }
}
