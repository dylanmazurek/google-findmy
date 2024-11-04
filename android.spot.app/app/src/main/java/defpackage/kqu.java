package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kqu implements fxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kqu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.fxi
    public final Object a(fxs fxsVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                Object obj2 = this.b;
                synchronized (obj2) {
                    ((kuv) obj2).b.remove(obj);
                }
                return fxsVar;
            }
            if (fxsVar.i() && fgk.d((Bundle) fxsVar.e())) {
                return ((fgk) this.a).a((Bundle) this.b).c(fgk.a, new fgn(1));
            }
            return fxsVar;
        }
        Object obj3 = this.b;
        Object obj4 = this.a;
        synchronized (obj4) {
            ((kuv) obj4).b.remove(obj3);
        }
        return fxsVar;
    }

    public /* synthetic */ kqu(kuv kuvVar, String str, int i) {
        this.c = i;
        this.b = kuvVar;
        this.a = str;
    }
}
