package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iue extends Property {
    public iue(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = iuf.f;
        return Float.valueOf(((iuf) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        iuf iufVar = (iuf) obj;
        float floatValue = ((Float) obj2).floatValue();
        iufVar.e = floatValue;
        ((ity) iufVar.k.get(0)).a = 0.0f;
        ity ityVar = (ity) iufVar.k.get(0);
        ity ityVar2 = (ity) iufVar.k.get(1);
        ced cedVar = iufVar.a;
        float f = iuf.f((int) (floatValue * 333.0f), 0, 667);
        float interpolation = cedVar.getInterpolation(f);
        ityVar2.a = interpolation;
        ityVar.b = interpolation;
        ity ityVar3 = (ity) iufVar.k.get(1);
        ity ityVar4 = (ity) iufVar.k.get(2);
        float interpolation2 = iufVar.a.getInterpolation(f + 0.49925038f);
        ityVar4.a = interpolation2;
        ityVar3.b = interpolation2;
        ((ity) iufVar.k.get(2)).b = 1.0f;
        if (iufVar.d && ((ity) iufVar.k.get(1)).b < 1.0f) {
            ((ity) iufVar.k.get(2)).c = ((ity) iufVar.k.get(1)).c;
            ((ity) iufVar.k.get(1)).c = ((ity) iufVar.k.get(0)).c;
            ((ity) iufVar.k.get(0)).c = iufVar.b.c[iufVar.c];
            iufVar.d = false;
        }
        iufVar.j.invalidateSelf();
    }
}
