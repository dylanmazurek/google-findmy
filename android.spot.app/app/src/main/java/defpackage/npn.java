package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class npn extends nnx implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final nnz d;

    /* JADX INFO: Access modifiers changed from: protected */
    public npn(nnz nnzVar) {
        this.d = nnzVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long c = ((nnx) obj).c();
        long c2 = c();
        if (c2 == c) {
            return 0;
        }
        if (c2 < c) {
            return -1;
        }
        return 1;
    }

    @Override // defpackage.nnx
    public final nnz d() {
        return this.d;
    }

    @Override // defpackage.nnx
    public final boolean f() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.d.m + "]";
    }
}
