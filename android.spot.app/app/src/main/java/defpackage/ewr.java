package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewr {
    public String a;
    public Boolean b;
    public Boolean c;
    public View.OnClickListener d;
    public int e;
    private jer f;
    private int g;
    private byte h;

    public ewr() {
        throw null;
    }

    public final ews a() {
        Boolean bool;
        View.OnClickListener onClickListener;
        int i;
        if (this.h == 1 && (bool = this.c) != null && (onClickListener = this.d) != null && (i = this.e) != 0) {
            return new ews(this.a, this.f, this.g, this.b, bool, onClickListener, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" icon");
        }
        if (this.c == null) {
            sb.append(" showArrow");
        }
        if (this.d == null) {
            sb.append(" onClickListener");
        }
        if (this.e == 0) {
            sb.append(" cardType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.g = i;
        this.h = (byte) 1;
    }

    public final void c(String str) {
        this.f = jer.i(str);
    }

    public ewr(byte[] bArr) {
        this.f = jdl.a;
    }
}
