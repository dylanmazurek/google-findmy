package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgt {
    public int a;
    public Drawable b;
    public int c;
    public String d;
    public int e;
    public View.OnClickListener f;
    public jer g;
    public byte h;

    public hgt() {
        throw null;
    }

    public final void a(int i) {
        this.a = i;
        this.h = (byte) (this.h | 1);
    }

    public final void b(int i) {
        this.e = i;
        this.h = (byte) (this.h | 4);
    }

    public hgt(byte[] bArr) {
        this.g = jdl.a;
    }
}
