package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class enl implements jxd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ enl(ejv ejvVar, lim limVar, lqc lqcVar, jis jisVar, int i, int i2) {
        this.f = i2;
        this.d = ejvVar;
        this.c = limVar;
        this.e = lqcVar;
        this.b = jisVar;
        this.a = i;
    }

    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        if (this.f != 0) {
            lim limVar = (lim) ((iiy) obj).b.e(lim.b);
            lim limVar2 = (lim) this.c;
            if (lop.a(limVar2, limVar)) {
                return ivc.E(jer.i(this.e));
            }
            int i = this.a;
            return ((ejv) this.d).b(limVar2, (jis) this.b, i + 1);
        }
        Object obj2 = this.c;
        if (((String) obj).equals(obj2)) {
            return ivc.E(this.d);
        }
        int i2 = this.a;
        return ((eno) this.b).a((String) obj2, (Account[]) this.e, i2 + 1);
    }

    public /* synthetic */ enl(eno enoVar, String str, Account account, Account[] accountArr, int i, int i2) {
        this.f = i2;
        this.b = enoVar;
        this.c = str;
        this.d = account;
        this.e = accountArr;
        this.a = i;
    }
}
