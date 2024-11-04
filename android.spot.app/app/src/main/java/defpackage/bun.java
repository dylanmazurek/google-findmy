package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bun implements bum {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public bun(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.bum
    public final bur a() {
        return new bur(new buq(this));
    }

    @Override // defpackage.bum
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.bum
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.bum
    public final void d(Uri uri) {
        this.d = uri;
    }
}
