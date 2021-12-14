public class JsonFileAdapter extends JsonFile {

    private File file;

    public JsonFileAdapter(File file){
        this.file = file;
    }

    public String readFile() {
        String xml  = "XML";
        file.setFile(xml);
        return file.getFile();
    }

    public void saveFile() {
        String json = file.getFile();
        this.setFile(json);
    }
}
