package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dfq implements Comparable {
    public final int a;
    public final String b;
    public final int c;
    public final Object d;
    public dfu e;
    public Integer f;
    public dft g;
    public final boolean h;
    public boolean i;
    public boolean j;
    public final dfh k;
    public dfk l;
    public eld m;

    public dfq(String str, dfu dfuVar) {
        Uri parse;
        String host;
        int i = dfz.a;
        this.d = new Object();
        this.h = true;
        int i2 = 0;
        this.i = false;
        this.j = false;
        this.k = null;
        this.a = 1;
        this.b = str;
        this.e = dfuVar;
        this.l = new dfk(2500, 1);
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.c = i2;
    }

    public final int a() {
        return this.l.a;
    }

    public String b() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final String c() {
        return Integer.toString(1) + "-" + this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dfq dfqVar = (dfq) obj;
        int k = dfqVar.k();
        int k2 = k();
        if (k2 == k) {
            return this.f.intValue() - dfqVar.f.intValue();
        }
        return (k - 1) - (k2 - 1);
    }

    public Map d() {
        return Collections.emptyMap();
    }

    public void e(dfy dfyVar) {
        dfu dfuVar;
        synchronized (this.d) {
            dfuVar = this.e;
        }
        if (dfuVar != null) {
            dfuVar.a(dfyVar);
        }
    }

    public abstract void f(Object obj);

    public final void g() {
        synchronized (this.d) {
            this.j = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        eld eldVar;
        synchronized (this.d) {
            eldVar = this.m;
        }
        if (eldVar != null) {
            eldVar.c(this);
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.d) {
            z = this.i;
        }
        return z;
    }

    public byte[] j() {
        throw null;
    }

    public int k() {
        return 2;
    }

    public final void l() {
        dft dftVar = this.g;
        if (dftVar != null) {
            synchronized (dftVar.a) {
                dftVar.a.remove(this);
            }
            synchronized (dftVar.f) {
                Iterator it = dftVar.f.iterator();
                while (it.hasNext()) {
                    ((dfs) it.next()).a();
                }
            }
            dftVar.b();
        }
        int i = dfz.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        dft dftVar = this.g;
        if (dftVar != null) {
            dftVar.b();
        }
    }

    public final void n(eld eldVar) {
        synchronized (this.d) {
            this.m = eldVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract bso o(hww hwwVar);

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(Integer.toHexString(this.c));
        if (true != i()) {
            str = "[ ] ";
        } else {
            str = "[X] ";
        }
        if (k() != 2) {
            str2 = "HIGH";
        } else {
            str2 = "NORMAL";
        }
        return str + this.b + " " + "0x".concat(valueOf) + " " + str2 + " " + this.f;
    }
}
