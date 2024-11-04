package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hot {
    public final Object a;

    public hot(Context context, char[] cArr) {
        this.a = context;
    }

    public static jyz d(fxs fxsVar) {
        return jwb.h(fzo.b(fxsVar), fhn.class, new etl(9), jxv.a);
    }

    public final void a(int i, lhn lhnVar) {
        ffb g = ((ffc) this.a).g(lhnVar);
        g.g(i - 1);
        g.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mko, java.lang.Object] */
    public final hto b(float f) {
        Random random = (Random) this.a.a();
        random.getClass();
        return new hto(random, f);
    }

    public final jyz c(String str) {
        str.getClass();
        fjy fjyVar = new fjy();
        fjyVar.a = new fsw(str, 10);
        return d(((fhq) this.a).f(fjyVar.a()));
    }

    public final String e(Uri uri, String str, String str2) {
        ta taVar;
        if (uri != null) {
            taVar = (ta) ((ta) this.a).get(uri.toString());
        } else {
            taVar = null;
        }
        if (taVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(str2);
        }
        return (String) taVar.get(str2);
    }

    public final int f() {
        return (int) lyk.a.a().a((Context) this.a);
    }

    public final igi g(lim limVar) {
        hwx.J(((jiy) this.a).containsKey(limVar));
        igi igiVar = (igi) ((jiy) this.a).get(limVar);
        igiVar.getClass();
        return igiVar;
    }

    public final ihy h(lim limVar) {
        return g(limVar).b;
    }

    public final jjr i() {
        return ((jiy) this.a).keySet();
    }

    public final int j() {
        return (int) lyh.a.a().e((Context) this.a);
    }

    public final long k() {
        return lyh.a.a().b((Context) this.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [mko, java.lang.Object] */
    public final ibh l(kyf kyfVar, kyh kyhVar, idu iduVar) {
        kuv kuvVar = (kuv) this.a;
        jzd jzdVar = (jzd) kuvVar.a.a();
        jzdVar.getClass();
        Object a = kuvVar.b.a();
        kyfVar.getClass();
        kyhVar.getClass();
        return new idw(jzdVar, (kuv) a, kyfVar, kyhVar, iduVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mko, java.lang.Object] */
    public final icv m(idt idtVar, icu icuVar) {
        jzd jzdVar = (jzd) this.a.a();
        jzdVar.getClass();
        return new icv(jzdVar, idtVar, icuVar);
    }

    public final hot n() {
        boolean z;
        Object obj = this.a;
        jmb jmbVar = jmb.a;
        jiu jiuVar = (jiu) obj;
        if (jiuVar.a == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "valueComparator was already set");
        jiuVar.a = jmbVar;
        return new hot(((jiu) this.a).a());
    }

    public hot(Object obj) {
        this.a = obj;
    }

    public hot(mko mkoVar) {
        mkoVar.getClass();
        this.a = mkoVar;
    }

    public hot(mko mkoVar, byte[] bArr, byte[] bArr2) {
        mkoVar.getClass();
        this.a = mkoVar;
    }

    public hot(Context context) {
        this.a = new ffc(context, loj.a.b, null);
    }

    public hot(mko mkoVar, byte[] bArr) {
        mkoVar.getClass();
        this.a = mkoVar;
    }

    public hot() {
        this.a = new jiu();
    }

    public hot(Context context, Account account) {
        this.a = new ffc(context, loj.a.b, account.name);
    }
}
