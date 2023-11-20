import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private static List<MenuItem> menuItems = new ArrayList<>();

    public static void tambahMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public static List<MenuItem> getMenuItems() {
        return menuItems;
    }
}