package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dui extends frx {
    final /* synthetic */ duj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dui(duj dujVar) {
        super(null, null, null);
        this.a = dujVar;
    }

    @Override // defpackage.frx
    public final /* synthetic */ void a(Object obj) {
        duj dujVar = this.a;
        hfl hflVar = (hfl) obj;
        njz njzVar = dujVar.i;
        if (njzVar != null && hflVar != null) {
            Account d = dujVar.d.d();
            if (d != null) {
                if (d.name.equals(hflVar.c)) {
                    return;
                }
            }
            njzVar.q(new dun(hflVar.c));
            njzVar.r();
            duj dujVar2 = this.a;
            if (dujVar2.a != null) {
                dujVar2.g();
            }
        }
    }
}
