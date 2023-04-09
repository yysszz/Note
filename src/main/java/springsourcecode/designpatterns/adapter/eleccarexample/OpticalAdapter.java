package springsourcecode.designpatterns.adapter.eleccarexample;

public class OpticalAdapter extends OpticalMotor implements Motor{
    @Override
    public void drive() {
        System.out.println("电能转换器");
        opticalDrive();
    }
}
