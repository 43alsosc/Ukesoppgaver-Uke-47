package com.example.oppg1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    // Array to store temperatures for each month
    private final Integer[] tempArray = new Integer[]{-3, -2, 2, 7, 12, 16, 18, 17, 12, 7, 3, -2};

    // Endpoint for handling GET requests to "/getTemperature"
    @GetMapping("/getTemperature")
    public Integer getTemperature(@RequestParam String month) {
        // Get the index of the month in the array
        int index = getMonthIndex(month);

        // Check if the month is valid
        if (index != -1) {
            // Return the temperature for the specified month
            return tempArray[index];
        } else {
            // Handle invalid month (not found in the array)
            return null;
        }
    }

    // Helper method to get the index of the month in the array
    private int getMonthIndex(String month) {
        // Convert month to lowercase to handle case-insensitivity
        switch (month.toLowerCase()) {
            case "januar": return 0;
            case "februar": return 1;
            case "mars": return 2;
            case "april": return 3;
            case "mai": return 4;
            case "juni": return 5;
            case "juli": return 6;
            case "august": return 7;
            case "september": return 8;
            case "oktober": return 9;
            case "november": return 10;
            case "desember": return 11;
            default:
                // Return -1 for invalid months
                return -1;
        }
    }
}
