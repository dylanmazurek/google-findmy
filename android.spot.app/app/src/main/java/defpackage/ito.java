package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ito extends Property {
    public ito(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = itq.a;
        return Float.valueOf(((itq) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        itq itqVar = (itq) obj;
        float floatValue = ((Float) obj2).floatValue();
        itqVar.f = floatValue;
        float f = floatValue * 6000.0f;
        ity ityVar = (ity) itqVar.k.get(0);
        float f2 = itqVar.f * 1080.0f;
        int[] iArr = itq.a;
        int length = iArr.length;
        int i2 = 0;
        float f3 = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            f3 += itqVar.c.getInterpolation(itq.f(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        ityVar.g = f2 + f3;
        float interpolation = itqVar.c.getInterpolation(itq.f(i, 0, 3000)) - itqVar.c.getInterpolation(itq.f(i, 3000, 3000));
        ityVar.a = 0.0f;
        float[] fArr = itq.b;
        float i3 = hwx.i(fArr[0], fArr[1], interpolation);
        ityVar.b = i3;
        float f4 = itqVar.g;
        if (f4 > 0.0f) {
            ityVar.b = i3 * (1.0f - f4);
        }
        int i4 = 0;
        while (true) {
            int[] iArr2 = itq.a;
            int length2 = iArr2.length;
            if (i4 >= 4) {
                break;
            }
            float f5 = itq.f(i, iArr2[i4], 100);
            if (f5 >= 0.0f && f5 <= 1.0f) {
                int i5 = i4 + itqVar.e;
                int[] iArr3 = itqVar.d.c;
                int length3 = iArr3.length;
                int i6 = i5 % length3;
                int i7 = (i6 + 1) % length3;
                int i8 = iArr3[i6];
                int i9 = iArr3[i7];
                float interpolation2 = itqVar.c.getInterpolation(f5);
                ((ity) itqVar.k.get(0)).c = ind.a(interpolation2, Integer.valueOf(i8), Integer.valueOf(i9)).intValue();
                break;
            }
            i4++;
        }
        itqVar.j.invalidateSelf();
    }
}
