package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clk extends Property {
    public clk(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        clr clrVar = (clr) obj;
        PointF pointF = (PointF) obj2;
        clrVar.a = Math.round(pointF.x);
        clrVar.b = Math.round(pointF.y);
        int i = clrVar.e + 1;
        clrVar.e = i;
        if (i == clrVar.f) {
            clrVar.a();
        }
    }
}
