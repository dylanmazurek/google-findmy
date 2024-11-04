package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmb extends jme implements Serializable {
    public static final jmb a = new jmb();
    private static final long serialVersionUID = 0;
    public transient jme b;

    private jmb() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.jme, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
