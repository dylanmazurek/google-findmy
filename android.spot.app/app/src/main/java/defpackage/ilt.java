package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilt {
    public jer a;
    public imd b;
    public boolean c;
    public byte d;
    private Uri e;
    private lkq f;
    private jis g;

    public ilt() {
        throw null;
    }

    public final ilu a() {
        Uri uri;
        lkq lkqVar;
        imd imdVar;
        if (this.g == null) {
            int i = jis.d;
            this.g = jmi.a;
        }
        if (this.d == 3 && (uri = this.e) != null && (lkqVar = this.f) != null && (imdVar = this.b) != null) {
            return new ilu(uri, lkqVar, this.a, this.g, imdVar, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" uri");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" variantConfig");
        }
        if ((this.d & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.d & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.d = (byte) (this.d | 2);
    }

    public final void c(lkq lkqVar) {
        if (lkqVar != null) {
            this.f = lkqVar;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    public final void d(Uri uri) {
        if (uri != null) {
            this.e = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public ilt(byte[] bArr) {
        this.a = jdl.a;
    }
}
