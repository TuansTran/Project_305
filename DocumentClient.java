public class DocumentClient {
    public static void main(String[] args) {
        IDocument doc = new NormalDoc();
        doc.SetEncryption("ko biet viet gi");
        doc.SetExtension("ko biet ghi gi");
        // Document document = doc.buildDoc();
        System.out.println(doc.toString());
    }
}
