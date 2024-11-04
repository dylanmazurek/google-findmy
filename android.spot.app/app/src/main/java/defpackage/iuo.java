package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuo extends iut {
    private final Typeface a;
    private final iun b;
    private boolean c;

    public iuo(iun iunVar, Typeface typeface) {
        this.a = typeface;
        this.b = iunVar;
    }

    private final void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    @Override // defpackage.iut
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.iut
    public final void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.c = true;
    }
}
