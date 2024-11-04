package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrf implements cgn {
    public static final cgt a = new cgc();
    private final Map b;
    private final cgn c;
    private final cgn d;

    public lrf(Map map, cgn cgnVar, dvy dvyVar) {
        this.b = map;
        this.c = cgnVar;
        this.d = new lrj(dvyVar, 1);
    }

    @Override // defpackage.cgn
    public final cgk a(Class cls) {
        if (this.b.containsKey(cls)) {
            return btx.c();
        }
        return this.c.a(cls);
    }

    @Override // defpackage.cgn
    public final cgk b(Class cls, cgu cguVar) {
        if (this.b.containsKey(cls)) {
            return this.d.b(cls, cguVar);
        }
        return this.c.b(cls, cguVar);
    }

    @Override // defpackage.cgn
    public final /* synthetic */ cgk c(mql mqlVar, cgu cguVar) {
        return btx.b(this, mqlVar, cguVar);
    }
}
