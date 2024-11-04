package defpackage;

import android.util.Property;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iui extends Property {
    public iui(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = iuj.a;
        return Float.valueOf(((iuj) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        iuj iujVar = (iuj) obj;
        float floatValue = ((Float) obj2).floatValue();
        iujVar.g = floatValue;
        float f = floatValue * 1800.0f;
        for (int i = 0; i < iujVar.k.size(); i++) {
            int i2 = (int) f;
            ity ityVar = (ity) iujVar.k.get(i);
            int i3 = i + i;
            ityVar.a = bpv.d(iujVar.c[i3].getInterpolation(iuj.f(i2, iuj.b[i3], iuj.a[i3])), 0.0f, 1.0f);
            int i4 = i3 + 1;
            ityVar.b = bpv.d(iujVar.c[i4].getInterpolation(iuj.f(i2, iuj.b[i4], iuj.a[i4])), 0.0f, 1.0f);
        }
        if (iujVar.f) {
            Iterator it = iujVar.k.iterator();
            while (it.hasNext()) {
                ((ity) it.next()).c = iujVar.d.c[iujVar.e];
            }
            iujVar.f = false;
        }
        iujVar.j.invalidateSelf();
    }
}
