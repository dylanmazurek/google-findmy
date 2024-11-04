package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncj extends nai {
    public final ktf c;

    public ncj(long j, ncj ncjVar, int i) {
        super(j, ncjVar, i);
        this.c = new ktf(nci.f, (byte[]) null);
    }

    @Override // defpackage.nai
    public final int a() {
        return nci.f;
    }

    @Override // defpackage.nai
    public final void l(int i) {
        ktf ktfVar = this.c;
        ktfVar.u(i).c(nci.e);
        s();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
