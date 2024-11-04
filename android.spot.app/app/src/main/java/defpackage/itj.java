package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itj extends Property {
    public itj(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = itl.a;
        return Float.valueOf(((itl) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        itl itlVar = (itl) obj;
        float floatValue = ((Float) obj2).floatValue();
        itlVar.g = floatValue;
        float f = floatValue * 5400.0f;
        ity ityVar = (ity) itlVar.k.get(0);
        float f2 = itlVar.g * 1520.0f;
        ityVar.a = (-20.0f) + f2;
        ityVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            ityVar.b += itlVar.d.getInterpolation(itl.f(i, itl.a[i2], 667)) * 250.0f;
            ityVar.a += itlVar.d.getInterpolation(itl.f(i, itl.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f3 = ityVar.a;
        float f4 = ityVar.b;
        float f5 = f3 + ((f4 - f3) * itlVar.h);
        ityVar.a = f5;
        ityVar.a = f5 / 360.0f;
        ityVar.b = f4 / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float f6 = itl.f(i, itl.c[i3], 333);
            if (f6 > 0.0f && f6 < 1.0f) {
                int i4 = i3 + itlVar.f;
                int[] iArr = itlVar.e.c;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((ity) itlVar.k.get(0)).c = ind.a(itlVar.d.getInterpolation(f6), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        itlVar.j.invalidateSelf();
    }
}
