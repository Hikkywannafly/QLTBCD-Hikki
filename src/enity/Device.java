package enity;

public class Device {
    private int id;
    private String name;
    private String position;
    private String status;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Device(int id, String name, String position, String status, String note) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.status = status;
        this.note = note;
    }

    public Device() {
    }
}
