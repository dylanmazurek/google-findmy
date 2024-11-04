package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class myc implements mtl {
    public final mye a;
    public final long b;
    public final Object c;
    public final mmx d;

    public myc(mye myeVar, long j, Object obj, mmx mmxVar) {
        this.a = myeVar;
        this.b = j;
        this.c = obj;
        this.d = mmxVar;
    }

    @Override // defpackage.mtl
    public final void dc() {
        mye myeVar = this.a;
        synchronized (myeVar) {
            if (this.b < myeVar.e()) {
                return;
            }
            Object[] objArr = myeVar.a;
            objArr.getClass();
            if (myf.a(objArr, this.b) != this) {
                return;
            }
            myf.b(objArr, this.b, myf.a);
            myeVar.i();
        }
    }
}
