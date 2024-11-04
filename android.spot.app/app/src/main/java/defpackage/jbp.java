package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbp extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        ijs.g();
        miv mivVar = new miv((byte[]) null);
        Thread currentThread = Thread.currentThread();
        synchronized (jbu.a) {
            jbu.a.put(currentThread, mivVar);
        }
        return mivVar;
    }
}
