import java.util.Scanner;

public class Main {
        private String[] reviews = new String[5];
        private int reviewCount = 0;

        // Function to add a review
        public void addReview(String review) {
            if (reviewCount < reviews.length) {
                reviews[reviewCount] = review;
                reviewCount++;
            } else {
                System.out.println("Cannot add more reviews. Maximum limit reached.");
            }
        }

        // Function to display all reviews
        public void displayReviews() {
            if (reviewCount == 0) {
                System.out.println("No reviews yet.");
            } else {
                System.out.println("Customer Reviews:");
                for (int i = 0; i < reviewCount; i++) {
                    System.out.println((i + 1) + ". " + reviews[i]);
                }
            }
        }

        public void checkReviews(String feedback){
            for( String str: reviews){
                if(str.contains(feedback)){
                    System.out.println(str);
                }
            }
        }

        public static void main(String[] args) {
            Main rr = new Main();
            Scanner sc = new Scanner(System.in);

            // Adding some sample reviews
            rr.addReview("Great food and excellent service!");
            rr.addReview("Good ambiance, but the food was okay.");
            rr.addReview("Loved the dessert options.");
            rr.addReview("Friendly staff and quick service.");
            rr.addReview("A bit pricey, but worth it.");

            // Displaying all reviews
            rr.displayReviews();

            System.out.println("Enter a word that you want to search a review for");

            String str= sc.next();
            rr.checkReviews(str);
        }

}