public class Application {

    File jsonFile;
    JsonFileAdapter adapter;

    public Application(){
        jsonFile = new JsonFile();
        adapter= new JsonFileAdapter(jsonFile);
    }
    public void setFile(String json){
        jsonFile.setFile(json);
        adapter.saveFile();
    }
    public String getXml(){
        return adapter.readFile();
    }
    public String getJson(){
        return jsonFile.getFile();
    }
}
