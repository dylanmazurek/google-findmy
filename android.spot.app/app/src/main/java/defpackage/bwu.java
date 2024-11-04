package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwu implements mqz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bwu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Iterator, java.lang.Object] */
    @Override // defpackage.mqz
    public final Iterator a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return this.a;
                    }
                    return moz.Q(this.a);
                }
                return this.a.iterator();
            }
            return new bwt((ViewGroup) this.a);
        }
        return new bvo(new bwu(this.a, 1).a(), bas.o);
    }
}
