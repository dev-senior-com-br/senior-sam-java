package br.com.senior.sam.portaria.pojos;

public class JsonPatch {
    public static final String REMOVE_OPERATION = "remove";

    private String path;
    private String op;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}
