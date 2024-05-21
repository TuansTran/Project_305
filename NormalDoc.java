public class NormalDoc implements IDocument {
    private String encryption;
    private String extension;
    @Override
    public void SetEncryption(String encryption) {
        this.encryption=encryption;        
    }

    @Override
    public void SetExtension(String extension) {
        this.extension=extension;
    }

    @Override
    public Document buildDoc() {
        return new Document(extension,encryption);
    }
}
