package defpackage;

import android.accounts.Account;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dyl implements dyu {
    public final /* synthetic */ dxu a;
    private final /* synthetic */ int b;

    public /* synthetic */ dyl(dxu dxuVar, int i) {
        this.b = i;
        this.a = dxuVar;
    }

    @Override // defpackage.dyu
    public final jyz a(lor lorVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                String str = lorVar.a;
                if (str != null) {
                    dyq dyqVar = (dyq) this.a;
                    ewc ewcVar = dyqVar.c;
                    Account b = dyqVar.b.b();
                    ewcVar.i();
                    dyqVar.b.k(new Account(str, "com.google"));
                    if (Objects.equals(dyqVar.b.b(), b)) {
                        dyqVar.c.p();
                    } else {
                        ((ebf) dyqVar.g.a()).g();
                        dyqVar.g();
                        dyqVar.d.j();
                    }
                }
                return jyv.a;
            }
            return ((dyo) this.a).d(lorVar);
        }
        return ((dyo) this.a).d(lorVar);
    }
}
