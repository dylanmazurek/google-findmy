package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jgo implements BinaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ jgo(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }
                    return BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }
            return BiFunction$CC.$default$andThen(this, function);
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        jiu jiuVar = (jiu) obj;
                        jiu jiuVar2 = (jiu) obj2;
                        jiuVar2.getClass();
                        jiuVar.c(jiuVar.c + jiuVar2.c);
                        Object[] objArr = jiuVar2.b;
                        Object[] objArr2 = jiuVar.b;
                        int i2 = jiuVar.c;
                        int i3 = jiuVar2.c;
                        System.arraycopy(objArr, 0, objArr2, i2 + i2, i3 + i3);
                        jiuVar.c += jiuVar2.c;
                        return jiuVar;
                    }
                    jjp jjpVar = (jjp) obj;
                    jjpVar.k((jjp) obj2);
                    return jjpVar;
                }
                jin jinVar = (jin) obj;
                jin jinVar2 = (jin) obj2;
                jinVar.b(jinVar2.a, jinVar2.b);
                return jinVar;
            }
            return Integer.valueOf(((Integer) obj).intValue() | ((Integer) obj2).intValue());
        }
        jck jckVar = (jck) obj;
        Iterator it = ((jck) obj2).a.iterator();
        while (it.hasNext()) {
            jckVar.b((jmg) it.next());
        }
        return jckVar;
    }
}
