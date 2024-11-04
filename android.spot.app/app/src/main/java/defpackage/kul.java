package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kul implements cgn {
    private final Context a;

    public kul(Context context) {
        this.a = context;
    }

    @Override // defpackage.cgn
    public final cgk a(Class cls) {
        if (cls.isAssignableFrom(kuk.class)) {
            return new kuk(this.a);
        }
        throw new IllegalStateException("Unknown ViewModel class");
    }

    @Override // defpackage.cgn
    public final /* synthetic */ cgk b(Class cls, cgu cguVar) {
        return btx.d(this, cls);
    }

    @Override // defpackage.cgn
    public final /* synthetic */ cgk c(mql mqlVar, cgu cguVar) {
        return btx.b(this, mqlVar, cguVar);
    }
}
