package part2;

public class NetBeans {
    private String theme;
    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public static void main (String[] args) {
        NetBeans nb1 = new NetBeans();
        NetBeans nb2 = new NetBeans();
        nb1.setTheme(null);
        nb2.setTheme("Darcula");
        System.out.print(nb1.getTheme() + " : " + nb2.getTheme());
    }
}
