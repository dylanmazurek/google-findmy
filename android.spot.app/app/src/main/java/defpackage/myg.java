package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myg extends mzc {
    public long a = -1;
    public mmx b;

    @Override // defpackage.mzc
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        mye myeVar = (mye) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = myeVar.b;
        if (j < myeVar.c) {
            myeVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.mzc
    public final /* bridge */ /* synthetic */ mmx[] b(Object obj) {
        boolean z = msy.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((mye) obj).j(j);
    }
}
