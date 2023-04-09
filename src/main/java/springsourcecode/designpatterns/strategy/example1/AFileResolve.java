package springsourcecode.designpatterns.strategy.example1;

import org.springframework.stereotype.Component;

@Component
public class AFileResolve implements IFileStrategy {
    @Override
    public String gainFileType() {
        return FileTypeResolveEnum.XLS;
    }

    @Override
    public void resolve(Object objectParam) {
        System.out.println("参数:" + objectParam);
        System.out.println("解析A类型文件");
    }
}
