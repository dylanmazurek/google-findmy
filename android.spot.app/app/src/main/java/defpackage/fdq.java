package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdq {
    public final long a;
    final /* synthetic */ fdr b;
    private final String c;

    public fdq(fdr fdrVar, long j) {
        boolean z;
        this.b = fdrVar;
        fma.aP("monitoring");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        fma.aF(z);
        this.c = "monitoring";
        this.a = j;
    }

    private final String e() {
        return this.c.concat(":start");
    }

    public final long a() {
        return this.b.a.getLong(e(), 0L);
    }

    public final String b() {
        return this.c.concat(":count");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c() {
        return this.c.concat(":value");
    }

    public final void d() {
        this.b.G();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.b.a.edit();
        edit.remove(b());
        edit.remove(c());
        edit.putLong(e(), currentTimeMillis);
        edit.commit();
    }
}
