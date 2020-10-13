public class cellphone {
    private String os;
    private Boolean headphoneJack;
    private float version;

    public cellphone(){};

    public cellphone(String os, Boolean headphoneJack){
        this.os = os;
        this.headphoneJack = headphoneJack;
    }

    public cellphone(String os, Boolean headphoneJack, float version){
        this.os = os;
        this.headphoneJack = headphoneJack;
        this.version = version;
    }

    public String getOperatingSystem(){
        return this.os;
    }
    public Boolean getHeadphoneJackInfo(){
        return this.headphoneJack;
    }
    public float getVersion(){
        return this.version;
    }
}
