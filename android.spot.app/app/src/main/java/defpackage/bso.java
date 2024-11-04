package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import java.lang.reflect.Method;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bso {
    public final Object a;
    public final Object b;
    public final Object c;

    public bso(ag agVar, dhx dhxVar, dhx dhxVar2) {
        this.b = agVar;
        this.a = dhxVar;
        this.c = dhxVar2;
    }

    public static final Boolean e() {
        return true;
    }

    public static final Integer f() {
        return 0;
    }

    public final void a(bmx bmxVar) {
        ((ArrayList) this.c).clear();
        int size = bmxVar.aJ.size();
        for (int i = 0; i < size; i++) {
            bmw bmwVar = (bmw) bmxVar.aJ.get(i);
            if (bmwVar.O() == 3 || bmwVar.P() == 3) {
                ((ArrayList) this.c).add(bmwVar);
            }
        }
        bmxVar.c();
    }

    public final boolean b(bny bnyVar, bmw bmwVar, int i) {
        boolean z;
        boolean z2;
        ((bnf) this.b).i = bmwVar.O();
        ((bnf) this.b).j = bmwVar.P();
        ((bnf) this.b).a = bmwVar.j();
        bnf bnfVar = (bnf) this.b;
        bnfVar.b = bmwVar.h();
        bnfVar.g = false;
        bnfVar.h = i;
        int i2 = bnfVar.i;
        int i3 = bnfVar.j;
        if (i2 == 3 && bmwVar.Y > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == 3 && bmwVar.Y > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && bmwVar.v[0] == 4) {
            bnfVar.i = 1;
        }
        if (z2 && bmwVar.v[1] == 4) {
            bnfVar.j = 1;
        }
        bnyVar.a(bmwVar, bnfVar);
        bmwVar.E(((bnf) this.b).c);
        bmwVar.z(((bnf) this.b).d);
        bnf bnfVar2 = (bnf) this.b;
        bmwVar.G = bnfVar2.f;
        bmwVar.w(bnfVar2.e);
        bnf bnfVar3 = (bnf) this.b;
        bnfVar3.h = 0;
        return bnfVar3.g;
    }

    public final void c(bmx bmxVar, int i, int i2, int i3) {
        int i4 = bmxVar.ad;
        int i5 = bmxVar.ae;
        bmxVar.D(0);
        bmxVar.C(0);
        bmxVar.E(i2);
        bmxVar.z(i3);
        bmxVar.D(i4);
        bmxVar.C(i5);
        Object obj = this.a;
        ((bmx) obj).b = i;
        ((bne) obj).W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, agt] */
    public final boolean d() {
        if (this.b.a() != this.a) {
            return true;
        }
        Object obj = this.c;
        if (obj != null && ((bso) obj).d()) {
            return true;
        }
        return false;
    }

    public final boolean g(Class cls, Class cls2) {
        if (((Class) this.a).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final eld h(Account account) {
        account.getClass();
        return new eld((Context) this.c, account, "oauth2:".concat(String.valueOf(fyo.b((ContentResolver) ((elo) this.a).a, "adm:oauth_scope", "https://www.googleapis.com/auth/android_device_manager"))), (Executor) this.b);
    }

    public bso(Context context, elo eloVar, Executor executor) {
        this.c = context;
        this.a = eloVar;
        this.b = executor;
    }

    public bso(dfy dfyVar) {
        this.a = null;
        this.b = null;
        this.c = dfyVar;
    }

    public bso(dij dijVar, Object obj, div divVar) {
        this.a = dijVar;
        this.b = obj;
        this.c = divVar;
    }

    public bso(ees eesVar, mko mkoVar, dhx dhxVar) {
        this.c = eesVar;
        this.b = mkoVar;
        this.a = dhxVar;
    }

    public bso(Class cls, Class cls2, dix dixVar) {
        this.a = cls;
        this.b = cls2;
        this.c = dixVar;
    }

    public bso(Object obj, dfh dfhVar) {
        this.a = obj;
        this.b = dfhVar;
        this.c = null;
    }

    public bso(Method method, Method method2, Method method3) {
        this.b = method;
        this.c = method2;
        this.a = method3;
    }

    public bso(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
    }

    public bso(Cipher cipher) {
        this.b = cipher;
        this.a = null;
        this.c = null;
    }

    public bso(Mac mac) {
        this.c = mac;
        this.b = null;
        this.a = null;
    }

    public bso(mca mcaVar, mdr mdrVar, mbc mbcVar) {
        this.c = mcaVar;
        this.a = mdrVar;
        this.b = mbcVar;
    }

    public bso(mko mkoVar, mko mkoVar2, mko mkoVar3) {
        this.b = mkoVar;
        this.c = mkoVar2;
        this.a = mkoVar3;
    }

    public bso(ag agVar, bso bsoVar, ddg ddgVar) {
        agVar.getClass();
        ddgVar.getClass();
        this.c = agVar;
        this.b = bsoVar;
        this.a = ddgVar;
    }

    public bso(agt agtVar, bso bsoVar) {
        this.b = agtVar;
        this.c = bsoVar;
        this.a = agtVar.a();
    }

    public bso(Context context, frk frkVar) {
        this.a = new HashMap();
        this.b = context;
        this.c = frkVar;
    }

    public bso(dir dirVar, dje djeVar) {
        List emptyList = Collections.emptyList();
        bsc.q(dirVar);
        this.a = dirVar;
        bsc.q(emptyList);
        this.b = emptyList;
        bsc.q(djeVar);
        this.c = djeVar;
    }

    public bso(Object obj, dbm dbmVar, Object obj2) {
        dbmVar.getClass();
        bco bcoVar = new bco(obj2, 14);
        this.c = obj;
        this.b = dbmVar;
        this.a = bcoVar;
    }

    public bso() {
        this.c = new WeakHashMap();
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
    }

    public bso(bmx bmxVar) {
        this.c = new ArrayList();
        this.b = new bnf();
        this.a = bmxVar;
    }
}
