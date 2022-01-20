package enity;

public class DeviceB {
    private int id;
    private String name;
    private String position;
    private String status;
    private String date;
    private String note;

    public DeviceB(int id, String name, String position, String status, String date, String note) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.status = status;
        this.date = date;
        this.note = note;
    }

    public DeviceB() {
    }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
