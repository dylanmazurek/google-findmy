package defpackage;

import j$.util.function.Function$CC;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class evl implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ evl(int i) {
        this.a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        jki jkiVar;
        jmg jmgVar;
        switch (this.a) {
            case 0:
                return jdl.a;
            case 1:
                return ((dya) obj).d;
            case 2:
                return jdl.a;
            case 3:
                return jdl.a;
            case 4:
                return jer.i((lqc) obj);
            case 5:
                return new ArrayList();
            case 6:
                return (hyh) ((Map.Entry) obj).getKey();
            case 7:
                return (kyh) ((AbstractMap.SimpleEntry) obj).getKey();
            case 8:
                jnk jnkVar = iey.a;
                return ((jer) ((AbstractMap.SimpleEntry) obj).getValue()).c();
            case 9:
                jck jckVar = (jck) obj;
                jin jinVar = new jin(jckVar.a.size());
                Collections.sort(jckVar.a, jmf.a);
                Iterator it = jckVar.a.iterator();
                if (it instanceof jki) {
                    jkiVar = (jki) it;
                } else {
                    jkiVar = new jki(it);
                }
                while (jkiVar.hasNext()) {
                    jmg jmgVar2 = (jmg) jkiVar.next();
                    while (jkiVar.hasNext()) {
                        if (!jkiVar.b) {
                            jkiVar.c = jkiVar.a.next();
                            jkiVar.b = true;
                        }
                        jmg jmgVar3 = (jmg) jkiVar.c;
                        jhm jhmVar = jmgVar2.b;
                        jhm jhmVar2 = jmgVar3.c;
                        jhm jhmVar3 = jmgVar3.b;
                        jhm jhmVar4 = jmgVar2.c;
                        int compareTo = jhmVar.compareTo(jhmVar3);
                        int compareTo2 = jhmVar4.compareTo(jhmVar2);
                        if (compareTo >= 0 && compareTo2 <= 0) {
                            jmgVar = jmgVar2;
                        } else {
                            jmgVar = jmgVar3;
                        }
                        hwx.S(jmgVar.b(), "Overlapping ranges not permitted but found %s overlapping %s", jmgVar2, jmgVar3);
                        jmg jmgVar4 = (jmg) jkiVar.next();
                        jhm jhmVar5 = jmgVar2.b;
                        jhm jhmVar6 = jmgVar4.b;
                        jhm jhmVar7 = jmgVar2.c;
                        jhm jhmVar8 = jmgVar4.c;
                    }
                    jinVar.h(jmgVar2);
                }
                jis g = jinVar.g();
                if (g.isEmpty()) {
                    return jjo.a;
                }
                if (((jmi) g).c == 1 && ((jmg) hzc.Y(g)).equals(jmg.a)) {
                    return jjo.b;
                }
                return new jjo(g);
            case 10:
                return ((jin) obj).g();
            case 11:
                return ((jjp) obj).g();
            default:
                return ((jiu) obj).b();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
