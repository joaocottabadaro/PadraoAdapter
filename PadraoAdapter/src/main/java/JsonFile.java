public class JsonFile implements  File {
    private String json;

    @Override
    public String getFile() {
        return this.json;
    }

    @Override
    public void setFile(String json) {
        this.json = json;
    }
}
