public class Mainshango {
    private static ArrayList<Toy> toyList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Toy");
            System.out.println("2. Get Toy");
            System.out.println("3. Get All Toys");
            System.out.println("4. Update Toy");
            System.out.println("5. Delete Toy");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addToy();
                    break;
                case 2:
                    getToy();
                    break;
                case 3:
                    getAllToys();
                    break;
                case 4:
                    updateToy();
                    break;
                case 5:
                    deleteToy();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }
        } while (choice != 0);
    }



    private static void addToy() {

    }

    private static void getToy() {
    }

    private static void getAllToys() {

    }

    private static void updateToy() {


    private static void deleteToy() {

    }

}

}
