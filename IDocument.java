public interface IDocument {
    void SetEncryption(String encryption);
    void SetExtension(String extension);
    Document buildDoc();
}
