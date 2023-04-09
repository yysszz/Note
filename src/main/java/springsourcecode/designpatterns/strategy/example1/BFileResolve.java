package springsourcecode.designpatterns.strategy.example1;

import org.springframework.stereotype.Component;

@Component
public class BFileResolve implements IFileStrategy {
    @Override
    public String gainFileType() {
        return FileTypeResolveEnum.XML;
    }

    @Override
    public void resolve(Object objectParam) {
        System.out.println("参数:" + objectParam);
        System.out.println("解析B类型文件");
    }
}
