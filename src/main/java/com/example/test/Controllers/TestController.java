package com.example.test.Controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.test.models.FilteredProducts;
import com.example.test.models.SortedProducts;

@RestController
public class TestController {

    final String uri = "https://jsonmock.hackerrank.com/api/inventory";

    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);
    JSONObject jsonObject = new JSONObject(result);

    JSONArray data = jsonObject.getJSONArray("data");

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }

    @CrossOrigin
    @GetMapping("/filter/price/{initial_price}/{final_price}")
    public ResponseEntity<List<FilteredProducts>> filtered_books(
            @PathVariable("initial_price") int init_price,
            @PathVariable("final_price") int final_price) {

        /*
         * List<FilteredProducts> filteredProducts = new ArrayList<>();
         * for (int i = 0; i < data.length(); i++) {
         * JSONObject jsonProduct = data.getJSONObject(i);
         * int price = jsonProduct.getInt("price");
         * 
         * if (price >= init_price && price <= final_price) {
         * FilteredProducts fp = new FilteredProducts(
         * jsonProduct.getString("barcode"),
         * jsonProduct.getString("item"),
         * jsonProduct.getString("category"),
         * price,
         * jsonProduct.getInt("discount"),
         * jsonProduct.getInt("available"));
         * 
         * filteredProducts.add(fp);
         * }
         * }
         */

        List<FilteredProducts> filteredProducts = data.toList().stream()
                .map(obj -> new JSONObject((Map<?, ?>) obj))
                .map(jsonProduct -> new FilteredProducts(
                        jsonProduct.getString("barcode"),
                        jsonProduct.getString("item"),
                        jsonProduct.getString("category"),
                        jsonProduct.getInt("price"),
                        jsonProduct.getInt("discount"),
                        jsonProduct.getInt("available")))
                .collect(Collectors.toList());

        if (filteredProducts.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return ResponseEntity.ok(filteredProducts);
    }

    @CrossOrigin
    @GetMapping("/sort/price")
    private ResponseEntity<List<SortedProducts>> sorted_books() {

        try {
            List<SortedProducts> sortedProducts = data.toList().stream()
                    .map(obj -> new JSONObject((Map<?, ?>) obj))
                    .map(jsonProduct -> new SortedProducts(
                            jsonProduct.getString("item"),
                            jsonProduct.getInt("price")))
                    .sorted(Comparator.comparingInt(SortedProducts::getPrice)) // Ordenar por precio ascendente
                    .collect(Collectors.toList());

            if (sortedProducts.isEmpty()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }

            return ResponseEntity.ok(sortedProducts);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
