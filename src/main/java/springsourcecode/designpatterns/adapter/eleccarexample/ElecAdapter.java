package springsourcecode.designpatterns.adapter.eleccarexample;

public class ElecAdapter extends ElectricMotor implements Motor  {
    @Override
    public void drive() {
        System.out.println("电能转换器");
        electricDrive();
    }
}
