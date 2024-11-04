package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsi implements lsh, lqz {
    public static final lsi a = new lsi(null);
    public final Object b;

    public lsi(Object obj) {
        this.b = obj;
    }

    public static lsh b(Object obj) {
        obj.getClass();
        return new lsi(obj);
    }

    @Override // defpackage.mko, defpackage.mkn
    public final Object a() {
        return this.b;
    }
}
