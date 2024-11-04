package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heg {
    public int a;
    public Drawable b;
    public int c;
    public int d;
    public View.OnClickListener e;
    public cfn f;
    public byte g;
    private String h;
    private jer i;

    public heg() {
        throw null;
    }

    public final heh a() {
        String str;
        View.OnClickListener onClickListener;
        cfn cfnVar;
        boolean z;
        boolean z2 = true;
        if (this.g == 7 && (str = this.h) != null && (onClickListener = this.e) != null && (cfnVar = this.f) != null) {
            heh hehVar = new heh(this.a, this.b, this.c, str, this.d, onClickListener, cfnVar, this.i);
            int i = hehVar.c;
            if (hehVar.b != null) {
                z = true;
            } else {
                z = false;
            }
            if (i == -1) {
                z2 = false;
            }
            hwx.V(z2 ^ z, "Either icon id or icon drawable must be specified");
            return hehVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" id");
        }
        if ((this.g & 2) == 0) {
            sb.append(" iconResId");
        }
        if (this.h == null) {
            sb.append(" label");
        }
        if ((this.g & 4) == 0) {
            sb.append(" veId");
        }
        if (this.e == null) {
            sb.append(" onClickListener");
        }
        if (this.f == null) {
            sb.append(" trailingTextLiveData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null label");
    }

    public heg(byte[] bArr) {
        this.i = jdl.a;
    }
}
