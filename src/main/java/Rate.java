public class Rate {
    private String date;
    private String valute;
    private String name;
    private Double value;

//    public Rate(String date, String valute, String name, Double value) {
//        this.date = date;
//        this.valute = valute;
//        this.name = name;
//        this.value = value;
//    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValute() {
        return valute;
    }

    public void setValute(String valute) {
        this.valute = valute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
