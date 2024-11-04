package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdw implements cfa {
    final /* synthetic */ msw a;
    final /* synthetic */ aeg b;
    final /* synthetic */ afn c;
    final /* synthetic */ mpn d;
    final /* synthetic */ View e;

    public bdw(msw mswVar, aeg aegVar, afn afnVar, mpn mpnVar, View view) {
        this.a = mswVar;
        this.b = aegVar;
        this.c = afnVar;
        this.d = mpnVar;
        this.e = view;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        int ordinal = cevVar.ordinal();
        msd msdVar = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        this.c.u();
                        return;
                    }
                    return;
                }
                this.c.v();
                return;
            }
            aeg aegVar = this.b;
            if (aegVar != null) {
                ade adeVar = aegVar.a;
                synchronized (adeVar.a) {
                    if (!adeVar.a()) {
                        List list = adeVar.b;
                        adeVar.b = adeVar.c;
                        adeVar.c = list;
                        adeVar.d = true;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((mmx) list.get(i)).p(mlh.a);
                        }
                        list.clear();
                    }
                }
            }
            afn afnVar = this.c;
            synchronized (afnVar.c) {
                if (afnVar.l) {
                    afnVar.l = false;
                    msdVar = afnVar.t();
                }
            }
            if (msdVar != null) {
                msdVar.p(mlh.a);
                return;
            }
            return;
        }
        mpp.q(this.a, null, 4, new bdv(this.d, this.c, cfcVar, this, this.e, null), 1);
    }
}
