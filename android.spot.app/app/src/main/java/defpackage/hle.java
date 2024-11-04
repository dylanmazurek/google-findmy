package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hle implements jyj {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ iia d;
    private final String e;
    private final String f;

    public hle(iia iiaVar, int i, boolean z, long j) {
        String str;
        this.c = i;
        this.a = z;
        this.b = j;
        this.d = iiaVar;
        this.e = hog.C(iiaVar.a);
        if (i != 32) {
            if (i != 48) {
                if (i != 64) {
                    if (i != 120) {
                        if (i != 240) {
                            str = "null";
                        } else {
                            str = "X_LARGE";
                        }
                    } else {
                        str = "LARGE";
                    }
                } else {
                    str = "MEDIUM";
                }
            } else {
                str = "SMALL";
            }
        } else {
            str = "TINY";
        }
        if (i != 0) {
            this.f = str;
            return;
        }
        throw null;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        String str = this.f;
        String S = hog.S(th);
        iia iiaVar = this.d;
        ((hri) iiaVar.c).h(this.e, str, S, (String) iiaVar.b, this.a);
        long epochMilli = fma.i().toEpochMilli() - this.b;
        iia iiaVar2 = this.d;
        ((hri) iiaVar2.c).k(epochMilli, this.e, this.f, S, (String) iiaVar2.b, this.a);
    }

    @Override // defpackage.jyj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        if (((Bitmap) obj) != null) {
            str = "OK";
        } else {
            str = "NULL";
        }
        boolean z = this.a;
        iia iiaVar = this.d;
        ((hri) iiaVar.c).h(this.e, this.f, str, (String) iiaVar.b, z);
        long epochMilli = fma.i().toEpochMilli() - this.b;
        boolean z2 = this.a;
        iia iiaVar2 = this.d;
        ((hri) iiaVar2.c).k(epochMilli, this.e, this.f, str, (String) iiaVar2.b, z2);
    }
}
