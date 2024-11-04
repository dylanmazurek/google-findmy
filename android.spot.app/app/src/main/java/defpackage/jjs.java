package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjs extends jjp {
    private final Comparator d;

    public jjs(Comparator comparator) {
        comparator.getClass();
        this.d = comparator;
    }

    @Override // defpackage.jjp, defpackage.jig
    public final /* synthetic */ void d(Object obj) {
        super.d(obj);
    }

    @Override // defpackage.jjp
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final jju g() {
        jmp jmpVar;
        Object[] objArr = this.a;
        int i = this.b;
        Comparator comparator = this.d;
        if (i == 0) {
            jmpVar = jju.A(comparator);
        } else {
            hzc.y(objArr, i);
            Arrays.sort(objArr, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < (objArr.length >> 1)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            jmpVar = new jmp(jis.l(objArr, i2), comparator);
        }
        this.b = jmpVar.size();
        this.c = true;
        return jmpVar;
    }

    public final void m(Object obj) {
        super.d(obj);
    }

    public final void n(Object... objArr) {
        super.h(objArr);
    }
}
