package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhl extends jhm {
    public static final jhl a = new jhl();
    private static final long serialVersionUID = 0;

    private jhl() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.jhm
    /* renamed from: a */
    public final int compareTo(jhm jhmVar) {
        if (jhmVar == this) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.jhm, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((jhm) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
