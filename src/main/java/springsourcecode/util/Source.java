package springsourcecode.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Source {

    private String name;

    private String age;

    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer l;
    private Integer i;
    private Integer j;
    private Integer k;
    private Integer m;
    private Integer n;

    public Source(){
        this.a = 10000;
        this.b = 10000;
        this.c = 10000;
        this.d = 10000;
        this.e = 10000;
        this.f = 10000;
        this.g = 10000;
        this.h = 10000;
        this.i = 10000;
        this.j = 10000;
        this.k = 10000;
        this.l = 10000;
    }

}
