package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrv extends muj {
    public mtl a;
    public final mrr b = new mrr(null, mrs.a);
    final /* synthetic */ mrx c;
    private final msd h;

    public mrv(mrx mrxVar, msd msdVar) {
        this.c = mrxVar;
        this.h = msdVar;
    }

    @Override // defpackage.muc
    public final void b(Throwable th) {
        if (th != null) {
            nbj F = ((mse) this.h).F(new msm(th), null);
            if (F != null) {
                this.h.c(F);
                mrw mrwVar = (mrw) this.b.a;
                if (mrwVar != null) {
                    mrwVar.a();
                    return;
                }
                return;
            }
            return;
        }
        if (((mrp) this.c.b).a() == 0) {
            msd msdVar = this.h;
            mtc[] mtcVarArr = (mtc[]) this.c.a;
            ArrayList arrayList = new ArrayList(mtcVarArr.length);
            for (mtc mtcVar : mtcVarArr) {
                arrayList.add(mtcVar.k());
            }
            msdVar.p(arrayList);
        }
    }
}
