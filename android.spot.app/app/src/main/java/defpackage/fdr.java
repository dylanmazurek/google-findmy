package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdr extends fcl {
    public SharedPreferences a;
    public final fdq b;
    private long d;
    private long e;

    /* JADX INFO: Access modifiers changed from: protected */
    public fdr(fcn fcnVar) {
        super(fcnVar);
        this.e = -1L;
        k();
        this.b = new fdq(this, ((Long) fdh.C.x()).longValue());
    }

    @Override // defpackage.fcl
    protected final void a() {
        this.a = f().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long b() {
        fbm.b();
        H();
        long j = this.d;
        if (j == 0) {
            long j2 = this.a.getLong("first_run", 0L);
            if (j2 != 0) {
                this.d = j2;
                return j2;
            }
            G();
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("first_run", currentTimeMillis);
            if (!edit.commit()) {
                B("Failed to commit first run time");
            }
            this.d = currentTimeMillis;
            return currentTimeMillis;
        }
        return j;
    }

    public final long c() {
        fbm.b();
        H();
        long j = this.e;
        if (j == -1) {
            long j2 = this.a.getLong("last_dispatch", 0L);
            this.e = j2;
            return j2;
        }
        return j;
    }

    public final void d() {
        fbm.b();
        H();
        G();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.a.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.e = currentTimeMillis;
    }
}
