package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itk extends Property {
    public itk(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = itl.a;
        return Float.valueOf(((itl) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = itl.a;
        ((itl) obj).h = floatValue;
    }
}
