package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class at implements cfa {
    final /* synthetic */ String a;
    final /* synthetic */ bj b;
    final /* synthetic */ cex c;
    final /* synthetic */ be d;

    public at(be beVar, String str, bj bjVar, cex cexVar) {
        this.d = beVar;
        this.a = str;
        this.b = bjVar;
        this.c = cexVar;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        if (cevVar == cev.ON_START) {
            be beVar = this.d;
            Bundle bundle = (Bundle) beVar.h.get(this.a);
            if (bundle != null) {
                this.b.a(this.a, bundle);
                be beVar2 = this.d;
                beVar2.h.remove(this.a);
            }
        }
        if (cevVar == cev.ON_DESTROY) {
            this.c.c(this);
            be beVar3 = this.d;
            beVar3.i.remove(this.a);
        }
    }
}
