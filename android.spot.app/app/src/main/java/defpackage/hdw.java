package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdw {
    public Drawable a;
    public cfk b;
    private int c;
    private int d;
    private String e;
    private int f;
    private View.OnClickListener g;
    private boolean h;
    private hdv i;
    private jer j;
    private jer k;
    private byte l;

    public hdw() {
        throw null;
    }

    public final hdy a() {
        String str;
        View.OnClickListener onClickListener;
        hdv hdvVar;
        boolean z;
        boolean z2 = true;
        if (this.l == 15 && (str = this.e) != null && (onClickListener = this.g) != null && (hdvVar = this.i) != null) {
            hdy hdyVar = new hdy(this.c, this.a, this.d, str, this.f, onClickListener, this.b, this.h, hdvVar, this.j, this.k);
            int i = hdyVar.c;
            if (hdyVar.b != null) {
                z = true;
            } else {
                z = false;
            }
            if (i == -1) {
                z2 = false;
            }
            hwx.V(z2 ^ z, "Either icon id or icon drawable must be specified");
            return hdyVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.l & 1) == 0) {
            sb.append(" id");
        }
        if ((this.l & 2) == 0) {
            sb.append(" iconResId");
        }
        if (this.e == null) {
            sb.append(" label");
        }
        if ((this.l & 4) == 0) {
            sb.append(" veId");
        }
        if (this.g == null) {
            sb.append(" onClickListener");
        }
        if ((this.l & 8) == 0) {
            sb.append(" visibleOnIncognito");
        }
        if (this.i == null) {
            sb.append(" actionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(hdv hdvVar) {
        if (hdvVar != null) {
            this.i = hdvVar;
            return;
        }
        throw new NullPointerException("Null actionType");
    }

    public final void c(jer jerVar) {
        if (jerVar != null) {
            this.j = jerVar;
            return;
        }
        throw new NullPointerException("Null availabilityChecker");
    }

    public final void d(int i) {
        this.d = i;
        this.l = (byte) (this.l | 2);
    }

    public final void e(int i) {
        this.c = i;
        this.l = (byte) (this.l | 1);
    }

    public final void f(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null label");
    }

    public final void g(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.g = onClickListener;
            return;
        }
        throw new NullPointerException("Null onClickListener");
    }

    public final void h(int i) {
        this.f = i;
        this.l = (byte) (this.l | 4);
    }

    public final void i(boolean z) {
        this.h = z;
        this.l = (byte) (this.l | 8);
    }

    public hdw(hdy hdyVar) {
        jdl jdlVar = jdl.a;
        this.j = jdlVar;
        this.k = jdlVar;
        this.c = hdyVar.a;
        this.a = hdyVar.b;
        this.d = hdyVar.c;
        this.e = hdyVar.d;
        this.f = hdyVar.e;
        this.g = hdyVar.f;
        this.b = hdyVar.g;
        this.h = hdyVar.h;
        this.i = hdyVar.i;
        this.j = hdyVar.j;
        this.k = hdyVar.k;
        this.l = (byte) 15;
    }

    public hdw(byte[] bArr) {
        jdl jdlVar = jdl.a;
        this.j = jdlVar;
        this.k = jdlVar;
    }
}
