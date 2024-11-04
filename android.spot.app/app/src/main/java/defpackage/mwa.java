package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwa extends mwb {
    public final Throwable a;

    public mwa(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mwa) && amr.i(this.a, ((mwa) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.mwb
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}
