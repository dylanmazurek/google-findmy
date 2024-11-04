package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ial implements lsh {
    private final mko a;
    private final mko b;

    public ial(mko mkoVar, mko mkoVar2) {
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kzu a() {
        String str;
        ktn ktnVar = (ktn) this.a.a();
        iaq iaqVar = (iaq) this.b.a();
        lak lakVar = lak.d;
        Account b = iaqVar.b();
        kzu kzuVar = (kzu) ((kzu) kzu.b(new kzw(1), ktnVar.a(lakVar))).c(kua.a, kub.a());
        lyr lyrVar = ktt.a;
        if (b != null) {
            str = b.name;
        } else {
            str = "no-account";
        }
        return (kzu) kzuVar.c(lyrVar, new ktt(str));
    }
}
