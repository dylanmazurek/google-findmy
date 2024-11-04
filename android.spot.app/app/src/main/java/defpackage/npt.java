package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npt extends nnx implements Serializable {
    public static final nnx a = new npt();
    private static final long serialVersionUID = 2656707858124633367L;

    private npt() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.nnx
    public final long a(long j, int i) {
        return moz.ax(j, i);
    }

    @Override // defpackage.nnx
    public final long b(long j, long j2) {
        return moz.ax(j, j2);
    }

    @Override // defpackage.nnx
    public final long c() {
        return 1L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long c = ((nnx) obj).c();
        if (c == 1) {
            return 0;
        }
        if (c > 1) {
            return -1;
        }
        return 1;
    }

    @Override // defpackage.nnx
    public final nnz d() {
        return nnz.l;
    }

    @Override // defpackage.nnx
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof npt) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nnx
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
