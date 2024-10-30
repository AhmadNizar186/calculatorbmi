import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String showInfo() {
        return name + " - Rp " + price + ", Kategori: " + category;
    }
}

class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public double itemTotal() {
        return menuItem.getPrice() * quantity;
    }

    public String getItemDetails() {
        return menuItem.getName() + " - " + quantity + " x Rp " + menuItem.getPrice() + " = Rp " + itemTotal();
    }
}

class Order {
    private List<OrderItem> orderItems;

    public Order() {
        orderItems = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem, int quantity) {
        OrderItem orderItem = new OrderItem(menuItem, quantity);
        orderItems.add(orderItem);
    }
    public double calculateTotal() {
        double totalPrice = 0;
                for (OrderItem item : orderItems) {
                    totalPrice += item.itemTotal();
                }
                return totalPrice;
    }

    public void printReceipt() {
        System.out.println("=== Nota Pemesanan ===");
        for (OrderItem item : orderItems) {
            System.out.println(item.getItemDetails());
        }
        System.out.println("Total Harga: Rp " + calculateTotal());
    }
}

public class RestaurantOrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuList = new ArrayList<>();

        // Tambahkan beberapa menu secara manual
        menuList.add(new MenuItem("Nasi Goreng", 20000, "Makanan"));
        menuList.add(new MenuItem("Teh Manis", 5000, "Minuman"));
        menuList.add(new MenuItem("Es Jeruk", 8000, "Minuman"));
        menuList.add(new MenuItem("Ayam Goreng", 25000, "Makanan"));

        // Tampilkan daftar menu
        System.out.println("=== Daftar Menu ===");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + ". " + menuList.get(i).showInfo());
        }

        Order order = new Order();
        String continueOrder;

        // Input dari pengguna untuk memilih menu dan jumlah
        do {
            System.out.print("Pilih nomor menu: ");
            int menuIndex = scanner.nextInt() - 1; // index 0-based
            if (menuIndex >= 0 && menuIndex < menuList.size()) {
                MenuItem selectedItem = menuList.get(menuIndex);
                System.out.print("Masukkan jumlah: ");
                int quantity = scanner.nextInt();
                order.addItem(selectedItem, quantity);
            } else {
                System.out.println("Menu tidak valid.");
            }

            System.out.print("Apakah Anda ingin menambahkan item lain? (y/n): ");
            continueOrder = scanner.next();
        } while (continueOrder.equalsIgnoreCase("y"));

        // Tampilkan nota pesanan
        order.printReceipt();
        scanner.close();
    }
}
