package lab4;

public enum Times {
    Summer(25, "Very hot"){
        @Override
        public String GetDescription(){
            return "Тёплое время года";
        }
    },
    Autumn(7, "Cool, but fine"),
    Winter(-15, "So much"),
    Spring(12, "Not so cold, fine"),
    ;
    private final int Temperature;
    private final String Desc;
    private Times(int Temperature, String Desc) {
        this.Temperature = Temperature;
        this.Desc = Desc;
    }

    public int GetTemperature() {
        return Temperature;
    }

    public String getDesc() {
        return Desc;
    }

    public String GetDescription(){
        return "Холодное время года";
    }
}

