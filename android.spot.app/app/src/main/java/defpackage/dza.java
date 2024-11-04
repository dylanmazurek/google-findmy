package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dza implements dyx {
    private final lqf a;

    public dza(lqf lqfVar) {
        lqfVar.getClass();
        this.a = lqfVar;
    }

    @Override // defpackage.dyx
    public final boolean a(lqd lqdVar, hzc hzcVar) {
        lqdVar.getClass();
        lqf b = lqf.b(lqdVar.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        if (b == this.a && b(lqdVar, hzcVar)) {
            return true;
        }
        return false;
    }

    protected abstract boolean b(lqd lqdVar, hzc hzcVar);
}
