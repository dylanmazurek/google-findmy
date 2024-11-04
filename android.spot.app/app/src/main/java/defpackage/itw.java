package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itw extends Property {
    public itw(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((itx) obj).e());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((itx) obj).h(((Float) obj2).floatValue());
    }
}
