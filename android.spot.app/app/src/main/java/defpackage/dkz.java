package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkz implements dlf {
    public final boolean a;
    private final dlf b;
    private final dir c;
    private int d;
    private boolean e;
    private final dkt f;

    public dkz(dlf dlfVar, boolean z, dir dirVar, dkt dktVar) {
        bsc.q(dlfVar);
        this.b = dlfVar;
        this.a = z;
        this.c = dirVar;
        bsc.q(dktVar);
        this.f = dktVar;
    }

    @Override // defpackage.dlf
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.dlf
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.dlf
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (!this.e) {
            this.d++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // defpackage.dlf
    public final synchronized void e() {
        if (this.d <= 0) {
            if (!this.e) {
                this.e = true;
                this.b.e();
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.d;
            if (i2 > 0) {
                i = i2 - 1;
                this.d = i;
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (i == 0) {
            dkt dktVar = this.f;
            dir dirVar = this.c;
            dktVar.b.d(dirVar);
            if (this.a) {
                dktVar.c.d(dirVar, this);
            } else {
                dktVar.e.a(this, false);
            }
        }
    }

    public final synchronized String toString() {
        dlf dlfVar;
        dir dirVar;
        dlfVar = this.b;
        dirVar = this.c;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.f.toString() + ", key=" + String.valueOf(dirVar) + ", acquired=" + this.d + ", isRecycled=" + this.e + ", resource=" + dlfVar.toString() + "}";
    }
}
