package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mtr implements Runnable, Comparable, mtl, nbn {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public mtr(long j) {
        this.b = j;
    }

    @Override // defpackage.nbn
    public final int b() {
        return this.a;
    }

    @Override // defpackage.nbn
    public final nbm c() {
        Object obj = this._heap;
        if (obj instanceof nbm) {
            return (nbm) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((mtr) obj).b;
        if (j > 0) {
            return 1;
        }
        if (j >= 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.nbn
    public final void d(nbm nbmVar) {
        if (this._heap != mtu.a) {
            this._heap = nbmVar;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.mtl
    public final void dc() {
        mts mtsVar;
        synchronized (this) {
            Object obj = this._heap;
            if (obj == mtu.a) {
                return;
            }
            if (obj instanceof mts) {
                mtsVar = (mts) obj;
            } else {
                mtsVar = null;
            }
            if (mtsVar != null) {
                synchronized (mtsVar) {
                    if (c() != null) {
                        int b = b();
                        boolean z = msy.a;
                        mtsVar.d(b);
                    }
                }
            }
            this._heap = mtu.a;
        }
    }

    @Override // defpackage.nbn
    public final void e(int i) {
        this.a = i;
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
