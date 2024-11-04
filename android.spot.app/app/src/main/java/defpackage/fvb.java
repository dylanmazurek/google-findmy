package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvb extends fma {
    public fvb() {
        super(null);
    }

    @Override // defpackage.fma
    public final /* bridge */ /* synthetic */ fhm a(Context context, Looper looper, fkp fkpVar, Object obj, fhr fhrVar, fhs fhsVar) {
        fvd fvdVar = (fvd) obj;
        fma.aS(fvdVar, "Must provide valid PeopleOptions!");
        return new fvz(context, looper, fhrVar, fhsVar, String.valueOf(fvdVar.b), fkpVar);
    }
}
