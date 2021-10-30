import java.util.Scanner;

public class ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            chuanHoa(s);
        }
    }
    public static void chuanHoa(String s) {
        s = s.trim();
        String []ds = s.split("\\s+");
        StringBuilder kq = new StringBuilder();
        for (int i = 1; i < ds.length; ++i) {
            ds[i] = ds[i].trim();
            kq.append(Character.toUpperCase(ds[i].charAt(0)));
            for (int j = 1; j < ds[i].length(); ++j) {
                kq.append(Character.toLowerCase(ds[i].charAt(j)));
            }
            kq.append(" ");
        }
        kq.deleteCharAt(kq.length() - 1);
        System.out.println(kq + ", " + ds[0].toUpperCase());
    }
}

