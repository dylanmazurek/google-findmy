package defpackage;

import j$.util.Set;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akv extends mlt implements Set, aje {
    public static final akv a;
    private final Object b;
    private final Object c;
    private final ajw d;

    static {
        aky akyVar = aky.a;
        a = new akv(akyVar, akyVar, ajw.a);
    }

    public akv(Object obj, Object obj2, ajw ajwVar) {
        this.b = obj;
        this.c = obj2;
        this.d = ajwVar;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.d.d();
    }

    @Override // defpackage.aje
    public final aje b(Object obj) {
        if (this.d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            ajw ajwVar = this.d;
            aky akyVar = aky.a;
            return new akv(obj, obj, ajwVar.e(obj, new aku(akyVar, akyVar)));
        }
        Object obj2 = this.c;
        Object obj3 = this.d.get(obj2);
        obj3.getClass();
        return new akv(this.b, obj, this.d.e(obj2, ((aku) obj3).a(obj)).e(obj, new aku(obj2, aky.a)));
    }

    @Override // defpackage.aje
    public final aje c(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        aku akuVar = (aku) this.d.get(obj);
        if (akuVar == null) {
            return this;
        }
        ajw ajwVar = this.d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        akn j = ajwVar.b.j(i, obj, 0);
        if (ajwVar.b != j) {
            if (j == null) {
                ajwVar = ajw.a;
            } else {
                ajwVar = new ajw(j, ajwVar.d() - 1);
            }
        }
        if (akuVar.c()) {
            Object obj4 = ajwVar.get(akuVar.a);
            obj4.getClass();
            ajwVar = ajwVar.e(akuVar.a, ((aku) obj4).a(akuVar.b));
        }
        if (akuVar.b()) {
            Object obj5 = ajwVar.get(akuVar.b);
            obj5.getClass();
            ajwVar = ajwVar.e(akuVar.b, new aku(akuVar.a, ((aku) obj5).b));
        }
        if (!akuVar.c()) {
            obj2 = akuVar.b;
        } else {
            obj2 = this.b;
        }
        if (!akuVar.b()) {
            obj3 = akuVar.a;
        } else {
            obj3 = this.c;
        }
        return new akv(obj2, obj3, ajwVar);
    }

    @Override // defpackage.mlj, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.mlt, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new akw(this.b, this.d);
    }
}
