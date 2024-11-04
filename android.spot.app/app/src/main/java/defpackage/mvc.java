package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvc {
    public static final ThreadLocal a = new ThreadLocal();

    public static final mto a() {
        ThreadLocal threadLocal = a;
        mto mtoVar = (mto) threadLocal.get();
        if (mtoVar == null) {
            msa msaVar = new msa(Thread.currentThread());
            threadLocal.set(msaVar);
            return msaVar;
        }
        return mtoVar;
    }
}
