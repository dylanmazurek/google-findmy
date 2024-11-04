package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alf implements alb {
    public final boolean a;
    public Object b;
    public aer c;
    public List d;
    private final int e;

    public alf(int i, boolean z, Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void f(abi abiVar) {
        aeu N;
        if (this.a && (N = ((abp) abiVar).N()) != null) {
            N.m();
            if (alg.d(this.c, N)) {
                this.c = N;
                return;
            }
            List list = this.d;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.d = arrayList;
                arrayList.add(N);
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (alg.d((aer) list.get(i), N)) {
                    list.set(i, N);
                    return;
                }
            }
            list.add(N);
        }
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return b((abi) obj, ((Number) obj2).intValue());
    }

    public final Object b(abi abiVar, int i) {
        int c;
        abi b = abiVar.b(this.e);
        f(b);
        if (b.B(this)) {
            c = alg.b(0);
        } else {
            c = alg.c(0);
        }
        int i2 = i | c;
        Object obj = this.b;
        obj.getClass();
        mpp.g(obj, 2);
        Object a = ((mol) obj).a(b, Integer.valueOf(i2));
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new alc(this);
        }
        return a;
    }

    public final Object c(Object obj, abi abiVar, int i) {
        int c;
        abi b = abiVar.b(this.e);
        f(b);
        if (b.B(this)) {
            c = alg.b(1);
        } else {
            c = alg.c(1);
        }
        Object obj2 = this.b;
        obj2.getClass();
        mpp.g(obj2, 3);
        Object a = ((mom) obj2).a(obj, b, Integer.valueOf(c | i));
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new ald(this, obj, i);
        }
        return a;
    }

    public final Object d(Object obj, Object obj2, abi abiVar, int i) {
        int c;
        abi b = abiVar.b(this.e);
        f(b);
        if (b.B(this)) {
            c = alg.b(2);
        } else {
            c = alg.c(2);
        }
        Object obj3 = this.b;
        obj3.getClass();
        mpp.g(obj3, 4);
        Object e = ((mon) obj3).e(obj, obj2, b, Integer.valueOf(c | i));
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new ale(this, obj, obj2, i);
        }
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mon
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.mom
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return c(obj, (abi) obj2, ((Number) obj3).intValue());
    }
}
