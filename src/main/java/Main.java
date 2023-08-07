public class Main {
    public static void main(String[] args) {
        String str = "DH-239. Новый Тикет 20230806-015101 [Open]";
        str = returnString(str, startSymbolToDelete(str), str.length());
        String clearedString = returnString(str, 0, lastSymbolToDelete(str));

        System.out.println(clearedString);

    }

    public static int lastSymbolToDelete(String string) {
        return string.indexOf(".") + 2;
    }

    public static int startSymbolToDelete(String str) {
        return str.indexOf("[") - 1;
    }

    public static String returnString(String string, int start, int stop) {
        StringBuffer sb = new StringBuffer(string);
        sb.delete(start, stop);
        return sb.toString();
    }
}
