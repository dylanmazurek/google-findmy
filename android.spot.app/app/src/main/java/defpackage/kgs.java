package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgs extends RuntimeException {
    public kgs(String str) {
        super(str);
    }

    public static Object a(kgr kgrVar) {
        try {
            return kgrVar.a();
        } catch (Exception e) {
            throw new kgs(e);
        }
    }

    public kgs(Throwable th) {
        super(th);
    }
}
