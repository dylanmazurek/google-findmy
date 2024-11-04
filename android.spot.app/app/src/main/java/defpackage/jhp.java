package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhp extends jme implements Serializable {
    private static final long serialVersionUID = 0;
    final jiy a;

    public jhp(jiy jiyVar) {
        this.a = jiyVar;
    }

    private final int a(Object obj) {
        Integer num = (Integer) this.a.get(obj);
        if (num != null) {
            return num.intValue();
        }
        throw new jmd(obj);
    }

    @Override // defpackage.jme, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return a(obj) - a(obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj instanceof jhp) {
            return hzc.F(this.a, ((jhp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ordering.explicit(" + this.a.keySet().toString() + ")";
    }
}
