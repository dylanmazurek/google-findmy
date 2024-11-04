package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iam implements lsh {
    private final mko a;
    private final mko b;

    public iam(mko mkoVar, mko mkoVar2) {
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    public static kzx c(ktn ktnVar, iaq iaqVar) {
        String str;
        lal lalVar = lal.s;
        Account b = iaqVar.b();
        kzx kzxVar = (kzx) ((kzx) kzx.b(new kzw(0), ktnVar.a(lalVar))).c(kua.a, kub.a());
        lyr lyrVar = ktt.a;
        if (b != null) {
            str = b.name;
        } else {
            str = "no-account";
        }
        return (kzx) kzxVar.c(lyrVar, new ktt(str));
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kzx a() {
        return c((ktn) this.a.a(), (iaq) this.b.a());
    }
}
