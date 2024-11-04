package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dal extends dad {
    public dal(List list) {
        super(list);
    }

    @Override // defpackage.czw
    public final /* bridge */ /* synthetic */ Object f(dfc dfcVar, float f) {
        Object obj;
        float floatValue;
        dbj dbjVar;
        dfe dfeVar = this.d;
        if (dfeVar != null) {
            float f2 = dfcVar.g;
            Float f3 = dfcVar.h;
            if (f3 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f3.floatValue();
            }
            dbj dbjVar2 = (dbj) dfcVar.b;
            Object obj2 = dfcVar.c;
            if (obj2 == null) {
                dbjVar = dbjVar2;
            } else {
                dbjVar = (dbj) obj2;
            }
            return (dbj) dfeVar.b(f2, floatValue, dbjVar2, dbjVar, f, b(), this.c);
        }
        if (f == 1.0f && (obj = dfcVar.c) != null) {
            return (dbj) obj;
        }
        return (dbj) dfcVar.b;
    }

    public final void l(dfe dfeVar) {
        super.k(new dak(new dfd(), dfeVar, new dbj()));
    }
}
