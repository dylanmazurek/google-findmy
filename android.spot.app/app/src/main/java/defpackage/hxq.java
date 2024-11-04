package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hxq implements hxr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hxq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [hxr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [hxr, java.lang.Object] */
    @Override // defpackage.hxr
    public final Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return (String) ((Class) this.a).cast(obj);
                        }
                        return (Boolean) ((Class) this.a).cast(obj);
                    }
                    return this.a.a((byte[]) obj);
                }
                return this.a.a(Base64.decode((String) obj, 3));
            }
            return (Long) ((Class) this.a).cast(obj);
        }
        return (Double) ((Class) this.a).cast(obj);
    }
}
