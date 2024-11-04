package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itp extends Property {
    public itp(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = itq.a;
        return Float.valueOf(((itq) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = itq.a;
        ((itq) obj).g = floatValue;
    }
}
