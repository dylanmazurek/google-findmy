package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdq {
    public static final bdr a = new bdr() { // from class: bdp
        @Override // defpackage.bdr
        public final afn a(View view) {
            mnb mnbVar;
            aeg aegVar;
            mnb mnbVar2;
            bdr bdrVar = bdq.a;
            mnc mncVar = mnc.a;
            mncVar.get(mmy.k);
            mkt mktVar = bbv.a;
            if (qz.h()) {
                mnbVar = bbp.b();
            } else {
                mnbVar = (mnb) bbv.b.get();
                if (mnbVar == null) {
                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            mnb plus = mnbVar.plus(mncVar);
            adk adkVar = (adk) plus.get(adk.e);
            cex cexVar = null;
            if (adkVar != null) {
                aeg aegVar2 = new aeg(adkVar);
                ade adeVar = aegVar2.a;
                synchronized (adeVar.a) {
                    adeVar.d = false;
                }
                aegVar = aegVar2;
            } else {
                aegVar = null;
            }
            mpn mpnVar = new mpn();
            mnb mnbVar3 = (apa) plus.get(apa.a);
            if (mnbVar3 == null) {
                mnbVar3 = new bcv();
                mpnVar.a = mnbVar3;
            }
            if (aegVar != null) {
                mnbVar2 = aegVar;
            } else {
                mnbVar2 = mnc.a;
            }
            mnb plus2 = plus.plus(mnbVar2).plus(mnbVar3);
            afn afnVar = new afn(plus2);
            afnVar.v();
            msw m = msz.m(plus2);
            cfc d = bty.d(view);
            if (d != null) {
                cexVar = d.N();
            }
            if (cexVar != null) {
                view.addOnAttachStateChangeListener(new bdt(view, afnVar, 0));
                cexVar.a(new bdw(m, aegVar, afnVar, mpnVar, view));
                return afnVar;
            }
            Objects.toString(view);
            ll.h("ViewTreeLifecycleOwner not found from ".concat(String.valueOf(view)));
            throw new mks();
        }
    };
}
