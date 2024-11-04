package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cll extends Property {
    public cll(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        clr clrVar = (clr) obj;
        PointF pointF = (PointF) obj2;
        clrVar.c = Math.round(pointF.x);
        clrVar.d = Math.round(pointF.y);
        int i = clrVar.f + 1;
        clrVar.f = i;
        if (clrVar.e == i) {
            clrVar.a();
        }
    }
}
