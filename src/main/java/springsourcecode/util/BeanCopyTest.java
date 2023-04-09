package springsourcecode.util;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanCopier;

public class BeanCopyTest {

    private static DozerBeanMapper dozer = new DozerBeanMapper();

    public static void main(String[] args) {

        BeanCopier beanCopier = BeanCopier.create(Source.class, Target.class, false);
        Source source1 = new Source();
//        source.setName("A");
//        source.setAge("15");
//        source.setA(1000000);
//        source.setB(1000000);
//        source.setC(1000000);
//        source.setD(1000000);
//        source.setE(1000000);
//        source.setF(1000000);
//        source.setG(1000000);
//        source.setH(1000000);
//        source.setI(1000000);
//        source.setJ(1000000);
//        source.setK(1000000);
        Target target1 = new Target();
        long start = System.currentTimeMillis();
        beanCopier.copy(source1, target1, null);
        long end = System.currentTimeMillis();
        System.out.println("beancopier:" + (end - start) + "ms");
        System.out.println(target1.toString());

        Source source2 = new Source();
        Target target2 = new Target();
        long dozerStart = System.currentTimeMillis();
        dozer.map(source2, target2);
        long dozerEnd = System.currentTimeMillis();
        System.out.println("Dozer" + (dozerEnd - dozerStart) + "ms");
        System.out.println(target2.toString());


        Source source3 = new Source();
        Target target3 = new Target();
        long BeancopyStart = System.currentTimeMillis();
        BeanUtils.copyProperties(source3, target3);
        long BeancopyEnd = System.currentTimeMillis();
        System.out.println("BeanCopy" + (BeancopyEnd - BeancopyStart) + "ms");
    }
}
