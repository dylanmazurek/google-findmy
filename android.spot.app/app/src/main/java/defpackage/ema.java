package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ema implements elz {
    private final /* synthetic */ int a;
    private final Object b;

    public ema(Account account, int i) {
        this.a = i;
        this.b = account;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [evy, java.lang.Object] */
    @Override // defpackage.elz
    public final void a(ewk ewkVar) {
        if (this.a != 0) {
            this.b.d(ewkVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [evy, java.lang.Object] */
    @Override // defpackage.iaq
    public final Account b() {
        if (this.a != 0) {
            return this.b.b();
        }
        return (Account) this.b;
    }

    public ema(evy evyVar, int i) {
        this.a = i;
        this.b = evyVar;
    }
}
